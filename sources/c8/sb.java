package c8;

import android.graphics.PorterDuff;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.bz;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.jn;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.y61;
public abstract class sb {
    public static pg.i f4983a;

    public static void a(LaunchActivity launchActivity, boolean z10, boolean z11) {
        boolean z12;
        pg.i iVar = f4983a;
        if (iVar != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z10 != z12) {
            if (z10) {
                ?? frameLayout = new FrameLayout(launchActivity);
                frameLayout.f55663r = new pg.d(frameLayout, 3);
                frameLayout.F = new ArrayList();
                pg.g gVar = new pg.g(frameLayout);
                frameLayout.f55660e = launchActivity.getSharedPreferences("floating_debug", 0);
                frameLayout.G = ViewConfiguration.get(launchActivity).getScaledTouchSlop();
                jn jnVar = new jn(launchActivity, gVar);
                ((GestureDetector) jnVar.f36572b).setIsLongpressEnabled(false);
                y61 y61Var = new y61(frameLayout, launchActivity, jnVar, 3);
                frameLayout.f55657a = y61Var;
                ImageView imageView = new ImageView(launchActivity);
                imageView.setImageResource(2131231036);
                org.telegram.ui.ActionBar.t6.s(imageView, org.telegram.ui.ActionBar.m6.O9, null, PorterDuff.Mode.SRC_IN);
                y61Var.addView(imageView);
                y61Var.setVisibility(8);
                frameLayout.addView(y61Var, ma.c(56.0f, 56));
                LinearLayout linearLayout = new LinearLayout(launchActivity);
                frameLayout.f55666x = linearLayout;
                linearLayout.setOrientation(1);
                linearLayout.setVisibility(8);
                TextView textView = new TextView(launchActivity);
                frameLayout.f55667y = textView;
                textView.setTextSize(1, 20.0f);
                textView.setText(org.telegram.messenger.gd.N0(2131751634, null));
                textView.setTypeface(org.telegram.messenger.g0.o());
                textView.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(19.0f));
                linearLayout.addView(textView, ma.o(-1, -2));
                ek0 ek0Var = new ek0(launchActivity, null);
                frameLayout.E = ek0Var;
                ek0Var.setLayoutManager(new v4.c0());
                ek0Var.setAdapter(new org.telegram.ui.l4((pg.i) frameLayout, launchActivity));
                ek0Var.setOnItemClickListener(new bi.l8(frameLayout, 19));
                linearLayout.addView(ek0Var, ma.l(1.0f, -1, 0));
                frameLayout.addView(linearLayout, ma.d(-1, -1.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
                frameLayout.d();
                frameLayout.setFitsSystemWindows(true);
                frameLayout.setWillNotDraw(false);
                f4983a = frameLayout;
                launchActivity.f43147v0.addView((View) frameLayout, new FrameLayout.LayoutParams(-1, -1));
                pg.i iVar2 = f4983a;
                iVar2.f55657a.setVisibility(0);
                r1.g gVar2 = new r1.g(new r1.f(0.0f));
                gVar2.f56364m = org.telegram.ui.Cells.c0.p(1000.0f, 750.0f, 0.75f);
                gVar2.b(new fi.q7(2, iVar2));
                gVar2.h();
            } else {
                iVar.getClass();
                launchActivity.f43147v0.removeView(f4983a);
                f4983a = null;
            }
            if (z11) {
                bz.f23238x1 = z10;
                bz.y();
            }
        }
    }
}
