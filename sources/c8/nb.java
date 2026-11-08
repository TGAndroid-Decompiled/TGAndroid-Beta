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
import org.telegram.messenger.iz;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.vy;
import org.telegram.ui.LaunchActivity;
public abstract class nb {
    public static pg.j f5778a;

    public static void a(LaunchActivity launchActivity, boolean z9, boolean z10) {
        boolean z11;
        pg.j jVar = f5778a;
        if (jVar != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z9 != z11) {
            if (z9) {
                ?? frameLayout = new FrameLayout(launchActivity);
                frameLayout.f53630r = new pg.d(frameLayout, 3);
                frameLayout.E = new ArrayList();
                pg.g gVar = new pg.g(frameLayout);
                frameLayout.f53627e = launchActivity.getSharedPreferences("floating_debug", 0);
                frameLayout.F = ViewConfiguration.get(launchActivity).getScaledTouchSlop();
                vy vyVar = new vy(launchActivity, gVar);
                ((GestureDetector) vyVar.f39747b).setIsLongpressEnabled(false);
                pg.h hVar = new pg.h(frameLayout, launchActivity, vyVar, 0);
                frameLayout.f53624a = hVar;
                ImageView imageView = new ImageView(launchActivity);
                imageView.setImageResource(2131231036);
                org.telegram.ui.ActionBar.r6.t(imageView, org.telegram.ui.ActionBar.k6.O9, null, PorterDuff.Mode.SRC_IN);
                hVar.addView(imageView);
                hVar.setVisibility(8);
                frameLayout.addView(hVar, ha.c(56.0f, 56));
                LinearLayout linearLayout = new LinearLayout(launchActivity);
                frameLayout.f53633x = linearLayout;
                linearLayout.setOrientation(1);
                linearLayout.setVisibility(8);
                TextView textView = new TextView(launchActivity);
                frameLayout.f53634y = textView;
                textView.setTextSize(1, 20.0f);
                textView.setText(org.telegram.messenger.id.M0(2131751647, null));
                textView.setTypeface(org.telegram.messenger.g0.o());
                textView.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(19.0f));
                linearLayout.addView(textView, ha.o(-1, -2));
                pj0 pj0Var = new pj0(launchActivity, null);
                frameLayout.D = pj0Var;
                pj0Var.setLayoutManager(new v4.b0());
                pj0Var.setAdapter(new org.telegram.ui.l4((pg.j) frameLayout, launchActivity));
                pj0Var.setOnItemClickListener(new ai.k(frameLayout, 18));
                linearLayout.addView(pj0Var, ha.l(1.0f, -1, 0));
                frameLayout.addView(linearLayout, ha.d(-1, -1.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
                frameLayout.d();
                frameLayout.setFitsSystemWindows(true);
                frameLayout.setWillNotDraw(false);
                f5778a = frameLayout;
                launchActivity.f41291u0.addView((View) frameLayout, new FrameLayout.LayoutParams(-1, -1));
                pg.j jVar2 = f5778a;
                jVar2.f53624a.setVisibility(0);
                r1.g gVar2 = new r1.g(new r1.f(0.0f));
                gVar2.f54268m = org.telegram.ui.Cells.f1.o(1000.0f, 750.0f, 0.75f);
                gVar2.b(new di.a8(2, jVar2));
                gVar2.h();
            } else {
                jVar.getClass();
                launchActivity.f41291u0.removeView(f5778a);
                f5778a = null;
            }
            if (z10) {
                iz.f23450x1 = z9;
                iz.y();
            }
        }
    }
}
