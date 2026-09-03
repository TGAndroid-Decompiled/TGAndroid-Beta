package k7;

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
import org.telegram.ui.Components.g81;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.zz;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ai;
public abstract class x8 {
    public static zf.h f10008a;

    public static void a(LaunchActivity launchActivity, boolean z4, boolean z10) {
        boolean z11;
        zf.h hVar = f10008a;
        if (hVar != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z4 != z11) {
            if (z4) {
                ?? frameLayout = new FrameLayout(launchActivity);
                frameLayout.f47499r = new zf.c(frameLayout, 3);
                frameLayout.B = new ArrayList();
                zf.f fVar = new zf.f(frameLayout);
                frameLayout.e = launchActivity.getSharedPreferences("floating_debug", 0);
                frameLayout.C = ViewConfiguration.get(launchActivity).getScaledTouchSlop();
                zz zzVar = new zz(launchActivity, fVar);
                ((GestureDetector) zzVar.f31508b).setIsLongpressEnabled(false);
                ph.z4 z4Var = new ph.z4(frameLayout, launchActivity, zzVar, 2);
                frameLayout.f47494a = z4Var;
                ImageView imageView = new ImageView(launchActivity);
                imageView.setImageResource(R.drawable.device_phone_android);
                imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.O9, false), PorterDuff.Mode.SRC_IN));
                z4Var.addView(imageView);
                z4Var.setVisibility(8);
                frameLayout.addView(z4Var, b6.c(56.0f, 56));
                LinearLayout linearLayout = new LinearLayout(launchActivity);
                frameLayout.f47501w = linearLayout;
                linearLayout.setOrientation(1);
                linearLayout.setVisibility(8);
                TextView textView = new TextView(launchActivity);
                frameLayout.f47502x = textView;
                textView.setTextSize(1, 20.0f);
                textView.setText(LocaleController.getString(R.string.DebugMenu));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(19.0f));
                linearLayout.addView(textView, b6.n(-1, -2));
                rl0 rl0Var = new rl0(launchActivity, null);
                frameLayout.f47503y = rl0Var;
                rl0Var.setLayoutManager(new f2.i0());
                rl0Var.setAdapter(new g81((zf.h) frameLayout, launchActivity));
                rl0Var.setOnItemClickListener(new dg.n(frameLayout, 24));
                linearLayout.addView(rl0Var, b6.l(1.0f, -1, 0));
                frameLayout.addView(linearLayout, b6.d(-1, -1.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
                frameLayout.d();
                frameLayout.setFitsSystemWindows(true);
                frameLayout.setWillNotDraw(false);
                f10008a = frameLayout;
                launchActivity.f31624t0.addView((View) frameLayout, new FrameLayout.LayoutParams(-1, -1));
                zf.h hVar2 = f10008a;
                hVar2.f47494a.setVisibility(0);
                o1.j jVar = new o1.j(new kb.a(0.0f));
                jVar.f16178u = ai.m(1000.0f, 750.0f, 0.75f);
                jVar.b(new dg.y(3, hVar2));
                jVar.f();
            } else {
                hVar.getClass();
                launchActivity.f31624t0.removeView(f10008a);
                f10008a = null;
            }
            if (z10) {
                SharedConfig.isFloatingDebugActive = z4;
                SharedConfig.saveConfig();
            }
        }
    }
}
