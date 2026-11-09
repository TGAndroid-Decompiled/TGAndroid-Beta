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
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.vy;
import org.telegram.ui.LaunchActivity;
public abstract class nb {
    public static pg.j f5776a;

    public static void a(LaunchActivity launchActivity, boolean z9, boolean z10) {
        boolean z11;
        pg.j jVar = f5776a;
        if (jVar != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z9 != z11) {
            if (z9) {
                ?? frameLayout = new FrameLayout(launchActivity);
                frameLayout.f53642r = new pg.d(frameLayout, 3);
                frameLayout.E = new ArrayList();
                pg.g gVar = new pg.g(frameLayout);
                frameLayout.f53639e = launchActivity.getSharedPreferences("floating_debug", 0);
                frameLayout.F = ViewConfiguration.get(launchActivity).getScaledTouchSlop();
                vy vyVar = new vy(launchActivity, gVar);
                ((GestureDetector) vyVar.f39835b).setIsLongpressEnabled(false);
                pg.h hVar = new pg.h(frameLayout, launchActivity, vyVar, 0);
                frameLayout.f53636a = hVar;
                ImageView imageView = new ImageView(launchActivity);
                imageView.setImageResource(2131231036);
                org.telegram.ui.ActionBar.s6.s(imageView, org.telegram.ui.ActionBar.l6.O9, null, PorterDuff.Mode.SRC_IN);
                hVar.addView(imageView);
                hVar.setVisibility(8);
                frameLayout.addView(hVar, ha.c(56.0f, 56));
                LinearLayout linearLayout = new LinearLayout(launchActivity);
                frameLayout.f53645x = linearLayout;
                linearLayout.setOrientation(1);
                linearLayout.setVisibility(8);
                TextView textView = new TextView(launchActivity);
                frameLayout.f53646y = textView;
                textView.setTextSize(1, 20.0f);
                textView.setText(org.telegram.messenger.id.M0(2131751646, null));
                textView.setTypeface(org.telegram.messenger.g0.o());
                textView.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(19.0f));
                linearLayout.addView(textView, ha.o(-1, -2));
                qj0 qj0Var = new qj0(launchActivity, null);
                frameLayout.D = qj0Var;
                qj0Var.setLayoutManager(new v4.b0());
                qj0Var.setAdapter(new org.telegram.ui.l4((pg.j) frameLayout, launchActivity));
                qj0Var.setOnItemClickListener(new ai.k(frameLayout, 18));
                linearLayout.addView(qj0Var, ha.l(1.0f, -1, 0));
                frameLayout.addView(linearLayout, ha.d(-1, -1.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
                frameLayout.d();
                frameLayout.setFitsSystemWindows(true);
                frameLayout.setWillNotDraw(false);
                f5776a = frameLayout;
                launchActivity.f41298u0.addView((View) frameLayout, new FrameLayout.LayoutParams(-1, -1));
                pg.j jVar2 = f5776a;
                jVar2.f53636a.setVisibility(0);
                r1.g gVar2 = new r1.g(new r1.f(0.0f));
                gVar2.f54280m = org.telegram.ui.Cells.f1.o(1000.0f, 750.0f, 0.75f);
                gVar2.b(new di.a8(2, jVar2));
                gVar2.h();
            } else {
                jVar.getClass();
                launchActivity.f41298u0.removeView(f5776a);
                f5776a = null;
            }
            if (z10) {
                iz.f23450x1 = z9;
                iz.y();
            }
        }
    }
}
