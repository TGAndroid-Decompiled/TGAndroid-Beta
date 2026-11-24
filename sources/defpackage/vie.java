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
public abstract class vie {
    public static ll4 a;

    public static void a(LaunchActivity launchActivity, boolean z, boolean z2) {
        boolean z3;
        ll4 ll4Var = a;
        if (ll4Var != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z != z3) {
            if (z) {
                ?? frameLayout = new FrameLayout(launchActivity);
                frameLayout.r = new gl4(frameLayout, (byte) 3);
                frameLayout.F = new ArrayList();
                jl4 jl4Var = new jl4(frameLayout);
                frameLayout.e = launchActivity.getSharedPreferences("floating_debug", 0);
                frameLayout.G = ViewConfiguration.get(launchActivity).getScaledTouchSlop();
                lj4 lj4Var = new lj4(launchActivity, jl4Var);
                ((GestureDetector) lj4Var.a).setIsLongpressEnabled(false);
                su suVar = new su(frameLayout, launchActivity, lj4Var, (byte) 15);
                frameLayout.a = suVar;
                ImageView imageView = new ImageView(launchActivity);
                imageView.setImageResource(2131231039);
                anb.s(imageView, cmb.N9, null, PorterDuff.Mode.SRC_IN);
                suVar.addView(imageView);
                suVar.setVisibility(8);
                frameLayout.addView(suVar, qoe.c(56.0f, 56));
                LinearLayout linearLayout = new LinearLayout(launchActivity);
                frameLayout.x = linearLayout;
                linearLayout.setOrientation(1);
                linearLayout.setVisibility(8);
                TextView textView = new TextView(launchActivity);
                frameLayout.y = textView;
                textView.setTextSize(1, 20.0f);
                textView.setText(jb6.M0(2131751583, null));
                textView.setTypeface(gm.o());
                textView.setPadding(gm.L(24.0f), gm.L(19.0f), gm.L(24.0f), gm.L(19.0f));
                linearLayout.addView(textView, qoe.o(-1, -2));
                r59 r59Var = new r59(launchActivity, null);
                frameLayout.E = r59Var;
                r59Var.setLayoutManager(new u46());
                r59Var.setAdapter(new s30((ll4) frameLayout, launchActivity));
                r59Var.setOnItemClickListener(new kg4(frameLayout, (byte) 2));
                linearLayout.addView(r59Var, qoe.l(1.0f, -1, 0));
                frameLayout.addView(linearLayout, qoe.d(-1, -1.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
                frameLayout.d();
                frameLayout.setFitsSystemWindows(true);
                frameLayout.setWillNotDraw(false);
                a = frameLayout;
                launchActivity.v0.addView((View) frameLayout, new FrameLayout.LayoutParams(-1, -1));
                ll4 ll4Var2 = a;
                ll4Var2.a.setVisibility(0);
                zna znaVar = new zna(new xk4(0.0f));
                znaVar.m = aq1.j(1000.0f, 750.0f, 0.75f);
                znaVar.b(new h20(ll4Var2, (byte) 5));
                znaVar.h();
            } else {
                ll4Var.getClass();
                launchActivity.v0.removeView(a);
                a = null;
            }
            if (z2) {
                gda.t1 = z;
                gda.x();
            }
        }
    }
}
