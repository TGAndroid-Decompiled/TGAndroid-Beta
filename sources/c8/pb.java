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
import org.telegram.messenger.gz;
import org.telegram.messenger.ou;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.w61;
public abstract class pb {
    public static pg.i f4634a;

    public static void a(LaunchActivity launchActivity, boolean z10, boolean z11) {
        boolean z12;
        pg.i iVar = f4634a;
        if (iVar != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z10 != z12) {
            if (z10) {
                ?? frameLayout = new FrameLayout(launchActivity);
                frameLayout.f55046r = new pg.d(frameLayout, 3);
                frameLayout.F = new ArrayList();
                pg.g gVar = new pg.g(frameLayout);
                frameLayout.f55043e = launchActivity.getSharedPreferences("floating_debug", 0);
                frameLayout.G = ViewConfiguration.get(launchActivity).getScaledTouchSlop();
                ou ouVar = new ou(launchActivity, gVar);
                ((GestureDetector) ouVar.f25806b).setIsLongpressEnabled(false);
                w61 w61Var = new w61(frameLayout, launchActivity, ouVar, 2);
                frameLayout.f55040a = w61Var;
                ImageView imageView = new ImageView(launchActivity);
                imageView.setImageResource(2131231036);
                org.telegram.ui.ActionBar.q6.s(imageView, org.telegram.ui.ActionBar.j6.O9, null, PorterDuff.Mode.SRC_IN);
                w61Var.addView(imageView);
                w61Var.setVisibility(8);
                frameLayout.addView(w61Var, ja.c(56.0f, 56));
                LinearLayout linearLayout = new LinearLayout(launchActivity);
                frameLayout.f55049x = linearLayout;
                linearLayout.setOrientation(1);
                linearLayout.setVisibility(8);
                TextView textView = new TextView(launchActivity);
                frameLayout.f55050y = textView;
                textView.setTextSize(1, 20.0f);
                textView.setText(org.telegram.messenger.hd.M0(2131751646, null));
                textView.setTypeface(org.telegram.messenger.g0.o());
                textView.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(19.0f));
                linearLayout.addView(textView, ja.o(-1, -2));
                uj0 uj0Var = new uj0(launchActivity, null);
                frameLayout.E = uj0Var;
                uj0Var.setLayoutManager(new v4.b0());
                uj0Var.setAdapter(new org.telegram.ui.l4((pg.i) frameLayout, launchActivity));
                uj0Var.setOnItemClickListener(new bi.b6(frameLayout, 19));
                linearLayout.addView(uj0Var, ja.l(1.0f, -1, 0));
                frameLayout.addView(linearLayout, ja.d(-1, -1.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
                frameLayout.d();
                frameLayout.setFitsSystemWindows(true);
                frameLayout.setWillNotDraw(false);
                f4634a = frameLayout;
                launchActivity.f42661v0.addView((View) frameLayout, new FrameLayout.LayoutParams(-1, -1));
                pg.i iVar2 = f4634a;
                iVar2.f55040a.setVisibility(0);
                r1.g gVar2 = new r1.g(new r1.f(0.0f));
                gVar2.f55748m = org.telegram.ui.Cells.y0.n(1000.0f, 750.0f, 0.75f);
                gVar2.b(new fi.t7(2, iVar2));
                gVar2.h();
            } else {
                iVar.getClass();
                launchActivity.f42661v0.removeView(f4634a);
                f4634a = null;
            }
            if (z11) {
                gz.f23997x1 = z10;
                gz.y();
            }
        }
    }
}
