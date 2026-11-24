package defpackage;

import android.graphics.PorterDuff;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.ui.LaunchActivity;
public abstract class uge {
    public static hj4 a;

    public static void a(LaunchActivity launchActivity, boolean z, boolean z2) {
        boolean z3;
        hj4 hj4Var = a;
        if (hj4Var != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z != z3) {
            if (z) {
                ?? frameLayout = new FrameLayout(launchActivity);
                frameLayout.r = new cj4(frameLayout, (byte) 3);
                frameLayout.F = new ArrayList();
                fj4 fj4Var = new fj4(frameLayout);
                frameLayout.e = launchActivity.getSharedPreferences("floating_debug", 0);
                frameLayout.G = ViewConfiguration.get(launchActivity).getScaledTouchSlop();
                gi3 gi3Var = new gi3(launchActivity, fj4Var);
                ((GestureDetector) gi3Var.a).setIsLongpressEnabled(false);
                st stVar = new st(frameLayout, launchActivity, gi3Var, (byte) 14);
                frameLayout.a = stVar;
                ImageView imageView = new ImageView(launchActivity);
                imageView.setImageResource(2131231038);
                zkb.s(imageView, bkb.N9, null, PorterDuff.Mode.SRC_IN);
                stVar.addView(imageView);
                stVar.setVisibility(8);
                frameLayout.addView(stVar, nme.c(56.0f, 56));
                LinearLayout linearLayout = new LinearLayout(launchActivity);
                frameLayout.x = linearLayout;
                linearLayout.setOrientation(1);
                linearLayout.setVisibility(8);
                TextView textView = new TextView(launchActivity);
                frameLayout.y = textView;
                textView.setTextSize(1, 20.0f);
                textView.setText(k96.M0(2131751634, null));
                textView.setTypeface(gl.o());
                textView.setPadding(gl.L(24.0f), gl.L(19.0f), gl.L(24.0f), gl.L(19.0f));
                linearLayout.addView(textView, nme.o(-1, -2));
                o39 o39Var = new o39(launchActivity, null);
                frameLayout.E = o39Var;
                o39Var.setLayoutManager(new t26());
                o39Var.setAdapter(new s20((hj4) frameLayout, launchActivity));
                o39Var.setOnItemClickListener(new bf4(frameLayout, (byte) 1));
                linearLayout.addView(o39Var, nme.l(1.0f, -1, 0));
                frameLayout.addView(linearLayout, nme.d(-1, -1.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
                frameLayout.d();
                frameLayout.setFitsSystemWindows(true);
                frameLayout.setWillNotDraw(false);
                a = frameLayout;
                launchActivity.v0.addView((View) frameLayout, new FrameLayout.LayoutParams(-1, -1));
                hj4 hj4Var2 = a;
                hj4Var2.a.setVisibility(0);
                yla ylaVar = new yla(new ti4(0.0f));
                ylaVar.m = oo1.j(1000.0f, 750.0f, 0.75f);
                ylaVar.b(new h10(hj4Var2, (byte) 5));
                ylaVar.h();
            } else {
                hj4Var.getClass();
                launchActivity.v0.removeView(a);
                a = null;
            }
            if (z2) {
                gba.u1 = z;
                gba.x();
            }
        }
    }
}
