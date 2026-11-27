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
public abstract class nle {
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
                kj4 kj4Var = new kj4(launchActivity, jl4Var);
                ((GestureDetector) kj4Var.b).setIsLongpressEnabled(false);
                tt ttVar = new tt(frameLayout, launchActivity, kj4Var, (byte) 15);
                frameLayout.a = ttVar;
                ImageView imageView = new ImageView(launchActivity);
                imageView.setImageResource(2131231038);
                yob.s(imageView, aob.O9, null, PorterDuff.Mode.SRC_IN);
                ttVar.addView(imageView);
                ttVar.setVisibility(8);
                frameLayout.addView(ttVar, tre.c(56.0f, 56));
                LinearLayout linearLayout = new LinearLayout(launchActivity);
                frameLayout.x = linearLayout;
                linearLayout.setOrientation(1);
                linearLayout.setVisibility(8);
                TextView textView = new TextView(launchActivity);
                frameLayout.y = textView;
                textView.setTextSize(1, 20.0f);
                textView.setText(ob6.M0(2131751611, null));
                textView.setTypeface(hl.o());
                textView.setPadding(hl.L(24.0f), hl.L(19.0f), hl.L(24.0f), hl.L(19.0f));
                linearLayout.addView(textView, tre.o(-1, -2));
                d79 d79Var = new d79(launchActivity, null);
                frameLayout.E = d79Var;
                d79Var.setLayoutManager(new x46());
                d79Var.setAdapter(new t20((ll4) frameLayout, launchActivity));
                d79Var.setOnItemClickListener(new zg4(frameLayout, (byte) 1));
                linearLayout.addView(d79Var, tre.l(1.0f, -1, 0));
                frameLayout.addView(linearLayout, tre.d(-1, -1.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
                frameLayout.d();
                frameLayout.setFitsSystemWindows(true);
                frameLayout.setWillNotDraw(false);
                a = frameLayout;
                launchActivity.v0.addView((View) frameLayout, new FrameLayout.LayoutParams(-1, -1));
                ll4 ll4Var2 = a;
                ll4Var2.a.setVisibility(0);
                vpa vpaVar = new vpa(new xk4(0.0f));
                vpaVar.m = bp1.j(1000.0f, 750.0f, 0.75f);
                vpaVar.b(new i10(ll4Var2, (byte) 5));
                vpaVar.h();
            } else {
                ll4Var.getClass();
                launchActivity.v0.removeView(a);
                a = null;
            }
            if (z2) {
                xea.t1 = z;
                xea.x();
            }
        }
    }
}
