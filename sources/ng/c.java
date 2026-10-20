package ng;

import android.app.Activity;
import android.content.Context;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import mi.q;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.g0;
import org.telegram.messenger.mk;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.k4;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.dp0;
import org.telegram.ui.Components.lw0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.n5;
import w7.z5;
public final class c implements Runnable {
    public final int f17447a;
    public final i f17448b;

    public c(i iVar, int i10) {
        this.f17447a = i10;
        this.f17448b = iVar;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        switch (this.f17447a) {
            case 0:
                n2 R = LaunchActivity.R();
                ?? f3Var = new f3(R.getParentActivity(), false);
                if (R.getFragmentView() instanceof lw0) {
                    f3Var.f39413b = (lw0) R.getFragmentView();
                }
                Activity parentActivity = R.getParentActivity();
                LinearLayout e = g0.e(parentActivity, 1);
                TextView textView = new TextView(parentActivity);
                textView.setText("Saturation " + (n5.f39412c * 5.0f));
                int i17 = h6.f21172n5;
                mk.u(textView, h6.x0(null, i17, false), 1, 16.0f, 1);
                textView.setMaxLines(1);
                textView.setSingleLine(true);
                if (LocaleController.isRTL) {
                    i10 = 3;
                } else {
                    i10 = 5;
                }
                textView.setGravity(i10 | 48);
                if (LocaleController.isRTL) {
                    i11 = 3;
                } else {
                    i11 = 5;
                }
                e.addView(textView, z5.d(-2, -1.0f, i11 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                dp0 dp0Var = new dp0(parentActivity);
                dp0Var.setDelegate(new n2.e(f3Var, textView, false, 5));
                dp0Var.setReportChanges(true);
                e.addView(dp0Var, z5.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView2 = new TextView(parentActivity);
                textView2.setText("Alpha " + n5.e);
                mk.u(textView2, h6.x0(null, i17, false), 1, 16.0f, 1);
                textView2.setMaxLines(1);
                textView2.setSingleLine(true);
                if (LocaleController.isRTL) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                textView2.setGravity(i12 | 48);
                if (LocaleController.isRTL) {
                    i13 = 3;
                } else {
                    i13 = 5;
                }
                e.addView(textView2, z5.d(-2, -1.0f, i13 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                dp0 dp0Var2 = new dp0(parentActivity);
                dp0Var2.setDelegate(new q(f3Var, textView2, false, 8));
                dp0Var2.setReportChanges(true);
                e.addView(dp0Var2, z5.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView3 = new TextView(parentActivity);
                textView3.setText("Blur Radius");
                mk.u(textView3, h6.x0(null, i17, false), 1, 16.0f, 1);
                textView3.setMaxLines(1);
                textView3.setSingleLine(true);
                if (LocaleController.isRTL) {
                    i14 = 3;
                } else {
                    i14 = 5;
                }
                textView3.setGravity(i14 | 48);
                if (LocaleController.isRTL) {
                    i15 = 3;
                } else {
                    i15 = 5;
                }
                e.addView(textView3, z5.d(-2, -1.0f, i15 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                dp0 dp0Var3 = new dp0(parentActivity);
                dp0Var3.setDelegate(new org.telegram.ui.g(f3Var, 5));
                dp0Var3.setReportChanges(true);
                e.addView(dp0Var3, z5.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                e.addOnLayoutChangeListener(new k4(dp0Var, dp0Var3, dp0Var2));
                ScrollView scrollView = new ScrollView(parentActivity);
                scrollView.addView(e);
                f3Var.setCustomView(scrollView);
                f3Var.show();
                this.f17448b.c(false);
                return;
            case 1:
                i iVar = this.f17448b;
                iVar.getClass();
                SharedConfig.toggleDebugWebView();
                Context context = iVar.getContext();
                if (SharedConfig.debugWebView) {
                    i16 = R.string.DebugMenuWebViewDebugEnabled;
                } else {
                    i16 = R.string.DebugMenuWebViewDebugDisabled;
                }
                Toast.makeText(context, LocaleController.getString(i16), 0).show();
                return;
            case 2:
                ProfileActivity.H4((Activity) this.f17448b.getContext(), false);
                return;
            default:
                i iVar2 = this.f17448b;
                iVar2.f17468n = true;
                try {
                    iVar2.performHapticFeedback(0);
                    return;
                } catch (Exception unused) {
                    return;
                }
        }
    }
}
