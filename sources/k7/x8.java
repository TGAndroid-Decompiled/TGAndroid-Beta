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
import org.telegram.ui.Components.sl0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.yh;
public abstract class x8 {
    public static zf.i f10028a;

    public static void a(LaunchActivity launchActivity, boolean z4, boolean z10) {
        boolean z11;
        zf.i iVar = f10028a;
        if (iVar != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z4 != z11) {
            if (z4) {
                ?? frameLayout = new FrameLayout(launchActivity);
                frameLayout.f47428r = new zf.c(frameLayout, 3);
                frameLayout.B = new ArrayList();
                zf.f fVar = new zf.f(frameLayout);
                frameLayout.e = launchActivity.getSharedPreferences("floating_debug", 0);
                frameLayout.C = ViewConfiguration.get(launchActivity).getScaledTouchSlop();
                org.telegram.ui.Cells.f1 f1Var = new org.telegram.ui.Cells.f1(launchActivity, fVar);
                ((GestureDetector) f1Var.f21045b).setIsLongpressEnabled(false);
                ph.z4 z4Var = new ph.z4(frameLayout, launchActivity, f1Var, 2);
                frameLayout.f47423a = z4Var;
                ImageView imageView = new ImageView(launchActivity);
                imageView.setImageResource(R.drawable.device_phone_android);
                imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.O9, false), PorterDuff.Mode.SRC_IN));
                z4Var.addView(imageView);
                z4Var.setVisibility(8);
                frameLayout.addView(z4Var, b6.c(56.0f, 56));
                LinearLayout linearLayout = new LinearLayout(launchActivity);
                frameLayout.f47430w = linearLayout;
                linearLayout.setOrientation(1);
                linearLayout.setVisibility(8);
                TextView textView = new TextView(launchActivity);
                frameLayout.f47431x = textView;
                textView.setTextSize(1, 20.0f);
                textView.setText(LocaleController.getString(R.string.DebugMenu));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(19.0f));
                linearLayout.addView(textView, b6.n(-1, -2));
                sl0 sl0Var = new sl0(launchActivity, null);
                frameLayout.f47432y = sl0Var;
                sl0Var.setLayoutManager(new f2.i0());
                sl0Var.setAdapter(new g81((zf.i) frameLayout, launchActivity));
                sl0Var.setOnItemClickListener(new dg.n(frameLayout, 24));
                linearLayout.addView(sl0Var, b6.l(1.0f, -1, 0));
                frameLayout.addView(linearLayout, b6.d(-1, -1.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
                frameLayout.d();
                frameLayout.setFitsSystemWindows(true);
                frameLayout.setWillNotDraw(false);
                f10028a = frameLayout;
                launchActivity.f31650t0.addView((View) frameLayout, new FrameLayout.LayoutParams(-1, -1));
                zf.i iVar2 = f10028a;
                iVar2.f47423a.setVisibility(0);
                o1.j jVar = new o1.j(new kb.a(0.0f));
                jVar.f16198u = yh.n(1000.0f, 750.0f, 0.75f);
                jVar.b(new dg.y(3, iVar2));
                jVar.f();
            } else {
                iVar.getClass();
                launchActivity.f31650t0.removeView(f10028a);
                f10028a = null;
            }
            if (z10) {
                SharedConfig.isFloatingDebugActive = z4;
                SharedConfig.saveConfig();
            }
        }
    }
}
