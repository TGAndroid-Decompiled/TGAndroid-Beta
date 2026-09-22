package mg;

import android.app.Activity;
import android.content.Context;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import n4.y;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.l0;
import org.telegram.messenger.rk;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.k4;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.cw0;
import org.telegram.ui.Components.uo0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.i5;
import w7.y5;
public final class c implements Runnable {
    public final int f15043a;
    public final i f15044b;

    public c(i iVar, int i10) {
        this.f15043a = i10;
        this.f15044b = iVar;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        switch (this.f15043a) {
            case 0:
                n2 R = LaunchActivity.R();
                ?? f3Var = new f3(R.getParentActivity(), false);
                if (R.getFragmentView() instanceof cw0) {
                    f3Var.f34375b = (cw0) R.getFragmentView();
                }
                Activity parentActivity = R.getParentActivity();
                LinearLayout e = l0.e(parentActivity, 1);
                TextView textView = new TextView(parentActivity);
                textView.setText("Saturation " + (i5.f34374c * 5.0f));
                int i16 = j6.f19293n5;
                rk.t(textView, j6.w0(null, i16, false), 1, 16.0f, 1);
                textView.setMaxLines(1);
                textView.setSingleLine(true);
                int i17 = 5;
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
                e.addView(textView, y5.d(-2, -1.0f, i11 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                uo0 uo0Var = new uo0(parentActivity);
                uo0Var.setDelegate(new m5.e(f3Var, textView, false, 5));
                uo0Var.setReportChanges(true);
                e.addView(uo0Var, y5.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView2 = new TextView(parentActivity);
                textView2.setText("Alpha " + i5.e);
                rk.t(textView2, j6.w0(null, i16, false), 1, 16.0f, 1);
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
                e.addView(textView2, y5.d(-2, -1.0f, i13 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                uo0 uo0Var2 = new uo0(parentActivity);
                uo0Var2.setDelegate(new y(f3Var, textView2, false));
                uo0Var2.setReportChanges(true);
                e.addView(uo0Var2, y5.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView3 = new TextView(parentActivity);
                textView3.setText("Blur Radius");
                rk.t(textView3, j6.w0(null, i16, false), 1, 16.0f, 1);
                textView3.setMaxLines(1);
                textView3.setSingleLine(true);
                if (LocaleController.isRTL) {
                    i14 = 3;
                } else {
                    i14 = 5;
                }
                textView3.setGravity(i14 | 48);
                if (LocaleController.isRTL) {
                    i17 = 3;
                }
                e.addView(textView3, y5.d(-2, -1.0f, i17 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                uo0 uo0Var3 = new uo0(parentActivity);
                uo0Var3.setDelegate(new org.telegram.ui.g(f3Var, 5));
                uo0Var3.setReportChanges(true);
                e.addView(uo0Var3, y5.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                e.addOnLayoutChangeListener(new k4(uo0Var, uo0Var3, uo0Var2));
                ScrollView scrollView = new ScrollView(parentActivity);
                scrollView.addView(e);
                f3Var.setCustomView(scrollView);
                f3Var.show();
                this.f15044b.c(false);
                return;
            case 1:
                i iVar = this.f15044b;
                iVar.getClass();
                SharedConfig.toggleDebugWebView();
                Context context = iVar.getContext();
                if (SharedConfig.debugWebView) {
                    i15 = R.string.DebugMenuWebViewDebugEnabled;
                } else {
                    i15 = R.string.DebugMenuWebViewDebugDisabled;
                }
                Toast.makeText(context, LocaleController.getString(i15), 0).show();
                return;
            case 2:
                ProfileActivity.H4((Activity) this.f15044b.getContext(), false);
                return;
            default:
                i iVar2 = this.f15044b;
                iVar2.f15064n = true;
                try {
                    iVar2.performHapticFeedback(0);
                    return;
                } catch (Exception unused) {
                    return;
                }
        }
    }
}
