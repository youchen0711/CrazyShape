package tw.edu.pu.csim.s1081692.example.crazyshape

import android.content.Intent
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.ImageView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.annotation.GlideModule
import com.bumptech.glide.module.AppGlideModule
import kotlinx.android.synthetic.main.activity_game.*
import kotlinx.android.synthetic.main.activity_main.*

@GlideModule
public final class MyAppGlideModule : AppGlideModule()



class MainActivity : AppCompatActivity(){
    var counter: Int = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Toast.makeText(baseContext, "作者：賴侑辰", Toast.LENGTH_LONG).show()
        rndShape()


        GlideApp.with(this)
            .load(R.drawable.cover)
            .override(800, 600)
            .into(imgTitle)



        imgNext.setOnClickListener(object:View.OnClickListener{
            override fun onClick(p0: View?) {
                rndShape()
            }
        })
    }

    fun rndShape(){
        counter = (1..4).random()
        when (counter){
            1->imgNext.setImageResource(R.drawable.circle)
            2->imgNext.setImageResource(R.drawable.square)
            3->imgNext.setImageResource(R.drawable.star)
            4->imgNext.setImageResource(R.drawable.triangle)
        }
    }

}
