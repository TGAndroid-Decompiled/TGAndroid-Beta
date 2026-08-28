package g7;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.Components.i71;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.LaunchActivity;
public abstract class v7 {
    public static uf.h f7389a;

    public static void a(LaunchActivity launchActivity, boolean z10, boolean z11) {
        boolean z12;
        uf.h hVar = f7389a;
        if (hVar != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z10 != z12) {
            if (z10) {
                ?? frameLayout = new FrameLayout(launchActivity);
                frameLayout.f48224r = new uf.c(frameLayout, 3);
                frameLayout.A = new ArrayList();
                uf.f fVar = new uf.f(frameLayout);
                frameLayout.f48221e = launchActivity.getSharedPreferences("floating_debug", 0);
                frameLayout.B = ViewConfiguration.get(launchActivity).getScaledTouchSlop();
                m5.c0 c0Var = new m5.c0(launchActivity, fVar);
                ((GestureDetector) c0Var.f17378b).setIsLongpressEnabled(false);
                fh.v vVar = new fh.v(frameLayout, launchActivity, c0Var, 29);
                frameLayout.f48218a = vVar;
                ImageView imageView = new ImageView(launchActivity);
                imageView.setImageResource(R.drawable.device_phone_android);
                imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, org.telegram.ui.ActionBar.f6.O9, false), PorterDuff.Mode.SRC_IN));
                vVar.addView(imageView);
                vVar.setVisibility(8);
                frameLayout.addView(vVar, e6.c(56.0f, 56));
                LinearLayout linearLayout = new LinearLayout(launchActivity);
                frameLayout.f48226w = linearLayout;
                linearLayout.setOrientation(1);
                linearLayout.setVisibility(8);
                TextView textView = new TextView(launchActivity);
                frameLayout.f48227x = textView;
                textView.setTextSize(1, 20.0f);
                textView.setText(LocaleController.getString(R.string.DebugMenu));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(19.0f));
                linearLayout.addView(textView, e6.n(-1, -2));
                wk0 wk0Var = new wk0(launchActivity, null);
                frameLayout.f48228y = wk0Var;
                wk0Var.setLayoutManager(new f2.m0());
                wk0Var.setAdapter(new i71((uf.h) frameLayout, launchActivity));
                wk0Var.setOnItemClickListener(new eh.j(frameLayout, 20));
                linearLayout.addView(wk0Var, e6.l(1.0f, -1, 0));
                frameLayout.addView(linearLayout, e6.d(-1, -1.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
                frameLayout.d();
                frameLayout.setFitsSystemWindows(true);
                frameLayout.setWillNotDraw(false);
                f7389a = frameLayout;
                launchActivity.f35530s0.addView((View) frameLayout, new FrameLayout.LayoutParams(-1, -1));
                uf.h hVar2 = f7389a;
                hVar2.f48218a.setVisibility(0);
                o1.j jVar = new o1.j(new gb.a(0.0f));
                jVar.f18800u = org.telegram.ui.Cells.j2.i(1000.0f, 750.0f, 0.75f);
                jVar.b(new ih.x7(2, hVar2));
                jVar.f();
            } else {
                hVar.getClass();
                launchActivity.f35530s0.removeView(f7389a);
                f7389a = null;
            }
            if (z11) {
                SharedConfig.isFloatingDebugActive = z10;
                SharedConfig.saveConfig();
            }
        }
    }
}
