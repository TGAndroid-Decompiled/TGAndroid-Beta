package i7;

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
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.u71;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.th;
public abstract class o8 {
    public static xf.j f8470a;

    public static void a(LaunchActivity launchActivity, boolean z10, boolean z11) {
        boolean z12;
        xf.j jVar = f8470a;
        if (jVar != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z10 != z12) {
            if (z10) {
                ?? frameLayout = new FrameLayout(launchActivity);
                frameLayout.f50147r = new xf.d(frameLayout, 3);
                frameLayout.A = new ArrayList();
                xf.g gVar = new xf.g(frameLayout);
                frameLayout.f50144e = launchActivity.getSharedPreferences("floating_debug", 0);
                frameLayout.B = ViewConfiguration.get(launchActivity).getScaledTouchSlop();
                o4.g gVar2 = new o4.g(launchActivity, gVar);
                ((GestureDetector) gVar2.f19159b).setIsLongpressEnabled(false);
                rf.d dVar = new rf.d(frameLayout, launchActivity, gVar2, 1);
                frameLayout.f50141a = dVar;
                ImageView imageView = new ImageView(launchActivity);
                imageView.setImageResource(R.drawable.device_phone_android);
                imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.O9, false), PorterDuff.Mode.SRC_IN));
                dVar.addView(imageView);
                dVar.setVisibility(8);
                frameLayout.addView(dVar, f6.c(56.0f, 56));
                LinearLayout linearLayout = new LinearLayout(launchActivity);
                frameLayout.f50149w = linearLayout;
                linearLayout.setOrientation(1);
                linearLayout.setVisibility(8);
                TextView textView = new TextView(launchActivity);
                frameLayout.f50150x = textView;
                textView.setTextSize(1, 20.0f);
                textView.setText(LocaleController.getString(R.string.DebugMenu));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(19.0f));
                linearLayout.addView(textView, f6.n(-1, -2));
                jl0 jl0Var = new jl0(launchActivity, null);
                frameLayout.f50151y = jl0Var;
                jl0Var.setLayoutManager(new f2.j0());
                jl0Var.setAdapter(new u71((xf.j) frameLayout, launchActivity));
                jl0Var.setOnItemClickListener(new bg.o(frameLayout, 24));
                linearLayout.addView(jl0Var, f6.l(1.0f, -1, 0));
                frameLayout.addView(linearLayout, f6.d(-1, -1.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
                frameLayout.d();
                frameLayout.setFitsSystemWindows(true);
                frameLayout.setWillNotDraw(false);
                f8470a = frameLayout;
                launchActivity.f35597s0.addView((View) frameLayout, new FrameLayout.LayoutParams(-1, -1));
                xf.j jVar2 = f8470a;
                jVar2.f50141a.setVisibility(0);
                o1.k kVar = new o1.k(new ib.a(0.0f));
                kVar.f19045u = th.l(1000.0f, 750.0f, 0.75f);
                kVar.b(new bg.z(3, jVar2));
                kVar.f();
            } else {
                jVar.getClass();
                launchActivity.f35597s0.removeView(f8470a);
                f8470a = null;
            }
            if (z11) {
                SharedConfig.isFloatingDebugActive = z10;
                SharedConfig.saveConfig();
            }
        }
    }
}
