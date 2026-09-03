package bb;

import ag.g;
import ag.h;
import ag.k;
import ag.l;
import ag.m;
import ag.o;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import f2.j0;
import java.util.ArrayList;
import k7.c6;
import o1.j;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.yh;
public abstract class a {
    public static o f1908a;

    public static void a(LaunchActivity launchActivity, boolean z4, boolean z10) {
        boolean z11;
        o oVar = f1908a;
        if (oVar != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (z4 != z11) {
            if (z4) {
                ?? frameLayout = new FrameLayout(launchActivity);
                frameLayout.f228r = new g(frameLayout, 3);
                frameLayout.B = new ArrayList();
                k kVar = new k(frameLayout);
                frameLayout.f225e = launchActivity.getSharedPreferences("floating_debug", 0);
                frameLayout.C = ViewConfiguration.get(launchActivity).getScaledTouchSlop();
                f1 f1Var = new f1(launchActivity, kVar);
                ((GestureDetector) f1Var.f22790b).setIsLongpressEnabled(false);
                l lVar = new l(frameLayout, launchActivity, f1Var, 0);
                frameLayout.f222a = lVar;
                ImageView imageView = new ImageView(launchActivity);
                imageView.setImageResource(R.drawable.device_phone_android);
                imageView.setColorFilter(new PorterDuffColorFilter(k6.w0(null, k6.O9, false), PorterDuff.Mode.SRC_IN));
                lVar.addView(imageView);
                lVar.setVisibility(8);
                frameLayout.addView(lVar, c6.c(56.0f, 56));
                LinearLayout linearLayout = new LinearLayout(launchActivity);
                frameLayout.f230w = linearLayout;
                linearLayout.setOrientation(1);
                linearLayout.setVisibility(8);
                TextView textView = new TextView(launchActivity);
                frameLayout.f231x = textView;
                textView.setTextSize(1, 20.0f);
                textView.setText(LocaleController.getString(R.string.DebugMenu));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(19.0f));
                linearLayout.addView(textView, c6.n(-1, -2));
                sl0 sl0Var = new sl0(launchActivity, null);
                frameLayout.f232y = sl0Var;
                sl0Var.setLayoutManager(new j0());
                sl0Var.setAdapter(new m((o) frameLayout, launchActivity));
                sl0Var.setOnItemClickListener(new h(frameLayout, 0));
                linearLayout.addView(sl0Var, c6.l(1.0f, -1, 0));
                frameLayout.addView(linearLayout, c6.d(-1, -1.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
                frameLayout.d();
                frameLayout.setFitsSystemWindows(true);
                frameLayout.setWillNotDraw(false);
                f1908a = frameLayout;
                launchActivity.f34172t0.addView((View) frameLayout, new FrameLayout.LayoutParams(-1, -1));
                o oVar2 = f1908a;
                oVar2.f222a.setVisibility(0);
                j jVar = new j(new kb.a(0.0f));
                jVar.f16338u = yh.n(1000.0f, 750.0f, 0.75f);
                jVar.b(new ag.c(0, oVar2));
                jVar.f();
            } else {
                oVar.getClass();
                launchActivity.f34172t0.removeView(f1908a);
                f1908a = null;
            }
            if (z10) {
                SharedConfig.isFloatingDebugActive = z4;
                SharedConfig.saveConfig();
            }
        }
    }
}
