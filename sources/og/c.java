package og;

import android.app.Activity;
import android.content.Context;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import m4.w1;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.t;
import org.telegram.messenger.vh;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.k3;
import org.telegram.ui.ActionBar.p4;
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.lp0;
import org.telegram.ui.Components.vw0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.l5;
public final class c implements Runnable {
    public final int f19391a;
    public final i f19392b;

    public c(i iVar, int i10) {
        this.f19391a = i10;
        this.f19392b = iVar;
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
        switch (this.f19391a) {
            case 0:
                r2 R = LaunchActivity.R();
                ?? k3Var = new k3(R.getParentActivity(), false);
                if (R.getFragmentView() instanceof vw0) {
                    k3Var.f41137b = (vw0) R.getFragmentView();
                }
                Activity parentActivity = R.getParentActivity();
                LinearLayout f7 = t.f(parentActivity, 1);
                TextView textView = new TextView(parentActivity);
                textView.setText("Saturation " + (l5.f41136c * 5.0f));
                int i17 = y6.f23537n5;
                f7.V(textView, i17, null);
                vh.r(textView, 1, 16.0f, 1, 1);
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
                f7.addView(textView, gb1.h(-2, -1.0f, i11 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                lp0 lp0Var = new lp0(parentActivity);
                lp0Var.setDelegate(new m4.c(k3Var, textView, false, 7));
                lp0Var.setReportChanges(true);
                f7.addView(lp0Var, gb1.h(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView2 = new TextView(parentActivity);
                textView2.setText("Alpha " + l5.e);
                f7.V(textView2, i17, null);
                vh.r(textView2, 1, 16.0f, 1, 1);
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
                f7.addView(textView2, gb1.h(-2, -1.0f, i13 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                lp0 lp0Var2 = new lp0(parentActivity);
                lp0Var2.setDelegate(new w1(k3Var, textView2, false, 9));
                lp0Var2.setReportChanges(true);
                f7.addView(lp0Var2, gb1.h(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView3 = new TextView(parentActivity);
                textView3.setText("Blur Radius");
                f7.V(textView3, i17, null);
                vh.r(textView3, 1, 16.0f, 1, 1);
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
                f7.addView(textView3, gb1.h(-2, -1.0f, i15 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                lp0 lp0Var3 = new lp0(parentActivity);
                lp0Var3.setDelegate(new org.telegram.ui.f(k3Var, 5));
                lp0Var3.setReportChanges(true);
                f7.addView(lp0Var3, gb1.h(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                f7.addOnLayoutChangeListener(new p4(lp0Var, lp0Var3, lp0Var2));
                ScrollView scrollView = new ScrollView(parentActivity);
                scrollView.addView(f7);
                k3Var.setCustomView(scrollView);
                k3Var.show();
                this.f19392b.c(false);
                return;
            case 1:
                i iVar = this.f19392b;
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
                ProfileActivity.P4((Activity) this.f19392b.getContext(), false);
                return;
            default:
                i iVar2 = this.f19392b;
                iVar2.f19412n = true;
                try {
                    iVar2.performHapticFeedback(0);
                    return;
                } catch (Exception unused) {
                    return;
                }
        }
    }
}
