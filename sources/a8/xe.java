package a8;

import android.graphics.PorterDuff;
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
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.LaunchActivity;
public abstract class xe {
    public static og.i f986a;

    public static void a(LaunchActivity launchActivity, boolean z10, boolean z11) {
        boolean z12;
        og.i iVar = f986a;
        if (iVar != null) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (z10 != z12) {
            if (z10) {
                ?? frameLayout = new FrameLayout(launchActivity);
                frameLayout.f19413r = new og.c(frameLayout, 3);
                frameLayout.E = new ArrayList();
                og.f fVar = new og.f(frameLayout);
                frameLayout.e = launchActivity.getSharedPreferences("floating_debug", 0);
                frameLayout.F = ViewConfiguration.get(launchActivity).getScaledTouchSlop();
                jg.s0 s0Var = new jg.s0(launchActivity, fVar);
                ((GestureDetector) s0Var.f15828b).setIsLongpressEnabled(false);
                bh.p pVar = new bh.p(frameLayout, launchActivity, s0Var, 5);
                frameLayout.f19408a = pVar;
                ImageView imageView = new ImageView(launchActivity);
                imageView.setImageResource(R.drawable.device_phone_android);
                org.telegram.ui.ActionBar.f7.t(imageView, org.telegram.ui.ActionBar.y6.O9, null, PorterDuff.Mode.SRC_IN);
                pVar.addView(imageView);
                pVar.setVisibility(8);
                frameLayout.addView(pVar, gb1.g(56.0f, 56));
                LinearLayout linearLayout = new LinearLayout(launchActivity);
                frameLayout.f19415w = linearLayout;
                linearLayout.setOrientation(1);
                linearLayout.setVisibility(8);
                TextView textView = new TextView(launchActivity);
                frameLayout.f19416x = textView;
                textView.setTextSize(1, 20.0f);
                textView.setText(LocaleController.getString(R.string.DebugMenu));
                textView.setTypeface(AndroidUtilities.bold());
                textView.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(19.0f));
                linearLayout.addView(textView, gb1.r(-1, -2));
                mm0 mm0Var = new mm0(launchActivity, null);
                frameLayout.f19417y = mm0Var;
                mm0Var.setLayoutManager(new s4.c0());
                mm0Var.setAdapter(new og.g((og.i) frameLayout, launchActivity));
                mm0Var.setOnItemClickListener(new ai.k(frameLayout, 18));
                linearLayout.addView(mm0Var, gb1.p(1.0f, -1, 0));
                frameLayout.addView(linearLayout, gb1.h(-1, -1.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
                frameLayout.d();
                frameLayout.setFitsSystemWindows(true);
                frameLayout.setWillNotDraw(false);
                f986a = frameLayout;
                launchActivity.f35565w0.addView((View) frameLayout, new FrameLayout.LayoutParams(-1, -1));
                og.i iVar2 = f986a;
                iVar2.f19408a.setVisibility(0);
                o1.j jVar = new o1.j(new ac.a(0.0f));
                jVar.f18969u = org.telegram.ui.d3.l(1000.0f, 750.0f, 0.75f);
                jVar.b(new di.i8(2, iVar2));
                jVar.h();
            } else {
                iVar.getClass();
                launchActivity.f35565w0.removeView(f986a);
                f986a = null;
            }
            if (z11) {
                SharedConfig.isFloatingDebugActive = z10;
                SharedConfig.saveConfig();
            }
        }
    }
}
