package n9;

import ai.j6;
import android.graphics.PorterDuff;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import b8.mf;
import ei.a8;
import java.util.ArrayList;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.g0;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.Components.y00;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.n4;
import org.telegram.ui.n61;
import u4.b0;
public abstract class b {
    public static qg.h f20286a;

    public static void a(LaunchActivity launchActivity, boolean z10, boolean z11) {
        boolean z12;
        qg.h hVar = f20286a;
        if (hVar != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z10 != z12) {
            if (z10) {
                ?? frameLayout = new FrameLayout(launchActivity);
                frameLayout.f53936r = new qg.c(frameLayout, 3);
                frameLayout.F = new ArrayList();
                qg.f fVar = new qg.f(frameLayout);
                frameLayout.f53933e = launchActivity.getSharedPreferences("floating_debug", 0);
                frameLayout.G = ViewConfiguration.get(launchActivity).getScaledTouchSlop();
                y00 y00Var = new y00(launchActivity, fVar);
                ((GestureDetector) y00Var.f40562a).setIsLongpressEnabled(false);
                n61 n61Var = new n61(frameLayout, launchActivity, y00Var, 3);
                frameLayout.f53930a = n61Var;
                ImageView imageView = new ImageView(launchActivity);
                imageView.setImageResource(2131231036);
                r6.t(imageView, k6.O9, null, PorterDuff.Mode.SRC_IN);
                n61Var.addView(imageView);
                n61Var.setVisibility(8);
                frameLayout.addView(n61Var, mf.c(56.0f, 56));
                LinearLayout linearLayout = new LinearLayout(launchActivity);
                frameLayout.f53939x = linearLayout;
                linearLayout.setOrientation(1);
                linearLayout.setVisibility(8);
                TextView textView = new TextView(launchActivity);
                frameLayout.f53940y = textView;
                textView.setTextSize(1, 20.0f);
                textView.setText(bd.M0(2131751647, null));
                textView.setTypeface(g0.o());
                textView.setPadding(g0.L(24.0f), g0.L(19.0f), g0.L(24.0f), g0.L(19.0f));
                linearLayout.addView(textView, mf.o(-1, -2));
                tj0 tj0Var = new tj0(launchActivity, null);
                frameLayout.E = tj0Var;
                tj0Var.setLayoutManager(new b0());
                tj0Var.setAdapter(new n4((qg.h) frameLayout, launchActivity));
                tj0Var.setOnItemClickListener(new j6(frameLayout, 19));
                linearLayout.addView(tj0Var, mf.l(1.0f, -1, 0));
                frameLayout.addView(linearLayout, mf.d(-1, -1.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
                frameLayout.d();
                frameLayout.setFitsSystemWindows(true);
                frameLayout.setWillNotDraw(false);
                f20286a = frameLayout;
                launchActivity.f41326x0.addView((View) frameLayout, new FrameLayout.LayoutParams(-1, -1));
                qg.h hVar2 = f20286a;
                hVar2.f53930a.setVisibility(0);
                q1.g gVar = new q1.g(new q1.f(0.0f));
                gVar.f53653m = f1.s(1000.0f, 750.0f, 0.75f);
                gVar.b(new a8(2, hVar2));
                gVar.h();
            } else {
                hVar.getClass();
                launchActivity.f41326x0.removeView(f20286a);
                f20286a = null;
            }
            if (z11) {
                az.f21677x1 = z10;
                az.y();
            }
        }
    }
}
