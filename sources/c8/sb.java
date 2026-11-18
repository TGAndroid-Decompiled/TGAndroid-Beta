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
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.hn;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.y61;
public abstract class sb {
    public static pg.i f4954a;

    public static void a(LaunchActivity launchActivity, boolean z10, boolean z11) {
        boolean z12;
        pg.i iVar = f4954a;
        if (iVar != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z10 != z12) {
            if (z10) {
                ?? frameLayout = new FrameLayout(launchActivity);
                frameLayout.f55622r = new pg.d(frameLayout, 3);
                frameLayout.F = new ArrayList();
                pg.g gVar = new pg.g(frameLayout);
                frameLayout.f55619e = launchActivity.getSharedPreferences("floating_debug", 0);
                frameLayout.G = ViewConfiguration.get(launchActivity).getScaledTouchSlop();
                hn hnVar = new hn(launchActivity, gVar);
                ((GestureDetector) hnVar.f35933b).setIsLongpressEnabled(false);
                y61 y61Var = new y61(frameLayout, launchActivity, hnVar, 3);
                frameLayout.f55616a = y61Var;
                ImageView imageView = new ImageView(launchActivity);
                imageView.setImageResource(2131231036);
                org.telegram.ui.ActionBar.u6.s(imageView, org.telegram.ui.ActionBar.n6.O9, null, PorterDuff.Mode.SRC_IN);
                y61Var.addView(imageView);
                y61Var.setVisibility(8);
                frameLayout.addView(y61Var, ma.c(56.0f, 56));
                LinearLayout linearLayout = new LinearLayout(launchActivity);
                frameLayout.f55625x = linearLayout;
                linearLayout.setOrientation(1);
                linearLayout.setVisibility(8);
                TextView textView = new TextView(launchActivity);
                frameLayout.f55626y = textView;
                textView.setTextSize(1, 20.0f);
                textView.setText(org.telegram.messenger.gd.M0(2131751635, null));
                textView.setTypeface(org.telegram.messenger.g0.o());
                textView.setPadding(org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(19.0f), org.telegram.messenger.g0.L(24.0f), org.telegram.messenger.g0.L(19.0f));
                linearLayout.addView(textView, ma.o(-1, -2));
                ck0 ck0Var = new ck0(launchActivity, null);
                frameLayout.E = ck0Var;
                ck0Var.setLayoutManager(new v4.c0());
                ck0Var.setAdapter(new org.telegram.ui.l4((pg.i) frameLayout, launchActivity));
                ck0Var.setOnItemClickListener(new bi.h8(frameLayout, 19));
                linearLayout.addView(ck0Var, ma.l(1.0f, -1, 0));
                frameLayout.addView(linearLayout, ma.d(-1, -1.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
                frameLayout.d();
                frameLayout.setFitsSystemWindows(true);
                frameLayout.setWillNotDraw(false);
                f4954a = frameLayout;
                launchActivity.f43106v0.addView((View) frameLayout, new FrameLayout.LayoutParams(-1, -1));
                pg.i iVar2 = f4954a;
                iVar2.f55616a.setVisibility(0);
                r1.g gVar2 = new r1.g(new r1.f(0.0f));
                gVar2.f56323m = org.telegram.ui.Cells.c0.p(1000.0f, 750.0f, 0.75f);
                gVar2.b(new fi.q7(2, iVar2));
                gVar2.h();
            } else {
                iVar.getClass();
                launchActivity.f43106v0.removeView(f4954a);
                f4954a = null;
            }
            if (z11) {
                bz.f23210x1 = z10;
                bz.y();
            }
        }
    }
}
