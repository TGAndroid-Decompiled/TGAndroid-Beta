package mg;

import android.app.Activity;
import android.content.Context;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import n7.z0;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.l0;
import org.telegram.messenger.qk;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.k4;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.cw0;
import org.telegram.ui.Components.to0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.k5;
import w7.y5;
public final class c implements Runnable {
    public final int f15059a;
    public final i f15060b;

    public c(i iVar, int i10) {
        this.f15059a = i10;
        this.f15060b = iVar;
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
        switch (this.f15059a) {
            case 0:
                o2 R = LaunchActivity.R();
                ?? g3Var = new g3(R.getParentActivity(), false);
                if (R.getFragmentView() instanceof cw0) {
                    g3Var.f34910b = (cw0) R.getFragmentView();
                }
                Activity parentActivity = R.getParentActivity();
                LinearLayout e = l0.e(parentActivity, 1);
                TextView textView = new TextView(parentActivity);
                textView.setText("Saturation " + (k5.f34909c * 5.0f));
                int i17 = i6.f19241n5;
                qk.t(textView, i6.w0(null, i17, false), 1, 16.0f, 1);
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
                e.addView(textView, y5.d(-2, -1.0f, i11 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                to0 to0Var = new to0(parentActivity);
                to0Var.setDelegate(new o0.a(g3Var, textView, false, 1));
                to0Var.setReportChanges(true);
                e.addView(to0Var, y5.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView2 = new TextView(parentActivity);
                textView2.setText("Alpha " + k5.e);
                qk.t(textView2, i6.w0(null, i17, false), 1, 16.0f, 1);
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
                to0 to0Var2 = new to0(parentActivity);
                to0Var2.setDelegate(new z0(g3Var, textView2, false, 2));
                to0Var2.setReportChanges(true);
                e.addView(to0Var2, y5.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView3 = new TextView(parentActivity);
                textView3.setText("Blur Radius");
                qk.t(textView3, i6.w0(null, i17, false), 1, 16.0f, 1);
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
                e.addView(textView3, y5.d(-2, -1.0f, i15 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                to0 to0Var3 = new to0(parentActivity);
                to0Var3.setDelegate(new org.telegram.ui.g(g3Var, 5));
                to0Var3.setReportChanges(true);
                e.addView(to0Var3, y5.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                e.addOnLayoutChangeListener(new k4(to0Var, to0Var3, to0Var2));
                ScrollView scrollView = new ScrollView(parentActivity);
                scrollView.addView(e);
                g3Var.setCustomView(scrollView);
                g3Var.show();
                this.f15060b.c(false);
                return;
            case 1:
                i iVar = this.f15060b;
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
                ProfileActivity.H4((Activity) this.f15060b.getContext(), false);
                return;
            default:
                i iVar2 = this.f15060b;
                iVar2.f15080n = true;
                try {
                    iVar2.performHapticFeedback(0);
                    return;
                } catch (Exception unused) {
                    return;
                }
        }
    }
}
