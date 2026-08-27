package h7;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.view.GestureDetector;
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
import org.telegram.ui.Components.k71;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.LaunchActivity;

public abstract class y7 {

    public static vf.i f8587a;

    public static void a(LaunchActivity launchActivity, boolean z10, boolean z11) {
        vf.i iVar = f8587a;
        if (z10 == (iVar != null)) {
            return;
        }
        if (z10) {
            vf.i iVar2 = new vf.i(launchActivity);
            iVar2.f48912r = new vf.c(iVar2, 3);
            iVar2.A = new ArrayList();
            vf.f fVar = new vf.f(iVar2);
            iVar2.f48909e = launchActivity.getSharedPreferences("floating_debug", 0);
            iVar2.B = ViewConfiguration.get(launchActivity).getScaledTouchSlop();
            m5.o oVar = new m5.o(launchActivity, fVar);
            ((GestureDetector) oVar.f17823b).setIsLongpressEnabled(false);
            vf.g gVar = new vf.g(iVar2, launchActivity, oVar);
            iVar2.f48906a = gVar;
            ImageView imageView = new ImageView(launchActivity);
            imageView.setImageResource(R.drawable.device_phone_android);
            imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.O9, false), PorterDuff.Mode.SRC_IN));
            gVar.addView(imageView);
            gVar.setVisibility(8);
            iVar2.addView(gVar, z5.c(56.0f, 56));
            LinearLayout linearLayout = new LinearLayout(launchActivity);
            iVar2.f48914w = linearLayout;
            linearLayout.setOrientation(1);
            linearLayout.setVisibility(8);
            TextView textView = new TextView(launchActivity);
            iVar2.f48915x = textView;
            textView.setTextSize(1, 20.0f);
            textView.setText(LocaleController.getString(R.string.DebugMenu));
            textView.setTypeface(AndroidUtilities.bold());
            textView.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(19.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(19.0f));
            linearLayout.addView(textView, z5.n(-1, -2));
            zk0 zk0Var = new zk0(launchActivity, null);
            iVar2.f48916y = zk0Var;
            zk0Var.setLayoutManager(new f2.k0());
            zk0Var.setAdapter(new k71(iVar2, launchActivity));
            zk0Var.setOnItemClickListener(new ag.p0(iVar2, 22));
            linearLayout.addView(zk0Var, z5.l(1.0f, -1, 0));
            iVar2.addView(linearLayout, z5.d(-1, -1.0f, 0, 8.0f, 8.0f, 8.0f, 8.0f));
            iVar2.d();
            iVar2.setFitsSystemWindows(true);
            iVar2.setWillNotDraw(false);
            f8587a = iVar2;
            launchActivity.f35533s0.addView(iVar2, new FrameLayout.LayoutParams(-1, -1));
            vf.i iVar3 = f8587a;
            iVar3.f48906a.setVisibility(0);
            o1.j jVar = new o1.j(new hb.a(0.0f));
            jVar.f19147u = org.telegram.ui.Cells.pa.k(1000.0f, 750.0f, 0.75f);
            jVar.b(new jh.t7(2, iVar3));
            jVar.f();
        } else {
            iVar.getClass();
            launchActivity.f35533s0.removeView(f8587a);
            f8587a = null;
        }
        if (z11) {
            SharedConfig.isFloatingDebugActive = z10;
            SharedConfig.saveConfig();
        }
    }
}
