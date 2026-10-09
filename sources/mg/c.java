package mg;

import android.app.Activity;
import android.content.Context;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import n6.t;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.bi;
import org.telegram.messenger.q;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.j4;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.kp0;
import org.telegram.ui.Components.sw0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.i5;
import w7.x5;
public final class c implements Runnable {
    public final int f16414a;
    public final i f16415b;

    public c(i iVar, int i10) {
        this.f16414a = i10;
        this.f16415b = iVar;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        switch (this.f16414a) {
            case 0:
                n2 R = LaunchActivity.R();
                ?? f3Var = new f3(R.getParentActivity(), false);
                if (R.getFragmentView() instanceof sw0) {
                    f3Var.f38527b = (sw0) R.getFragmentView();
                }
                Activity parentActivity = R.getParentActivity();
                LinearLayout e7 = q.e(parentActivity, 1);
                TextView textView = new TextView(parentActivity);
                textView.setText("Saturation " + (i5.f38525c * 5.0f));
                int i16 = i6.f20981n5;
                bi.u(textView, i6.x0(null, i16, false), 1, 16.0f, 1);
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
                e7.addView(textView, x5.a(-1.0f, 21.0f, 13.0f, 21.0f, 0.0f, -2, i11 | 48));
                kp0 kp0Var = new kp0(parentActivity);
                kp0Var.setDelegate(new t(f3Var, textView, false, 2));
                kp0Var.setReportChanges(true);
                e7.addView(kp0Var, x5.a(38.0f, 5.0f, 4.0f, 5.0f, 0.0f, -1, 0));
                TextView textView2 = new TextView(parentActivity);
                textView2.setText("Alpha " + i5.f38526e);
                bi.u(textView2, i6.x0(null, i16, false), 1, 16.0f, 1);
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
                e7.addView(textView2, x5.a(-1.0f, 21.0f, 13.0f, 21.0f, 0.0f, -2, i13 | 48));
                kp0 kp0Var2 = new kp0(parentActivity);
                kp0Var2.setDelegate(new b5(1, (Object) f3Var, textView2));
                kp0Var2.setReportChanges(true);
                e7.addView(kp0Var2, x5.a(38.0f, 5.0f, 4.0f, 5.0f, 0.0f, -1, 0));
                TextView textView3 = new TextView(parentActivity);
                textView3.setText("Blur Radius");
                bi.u(textView3, i6.x0(null, i16, false), 1, 16.0f, 1);
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
                e7.addView(textView3, x5.a(-1.0f, 21.0f, 13.0f, 21.0f, 0.0f, -2, i17 | 48));
                kp0 kp0Var3 = new kp0(parentActivity);
                kp0Var3.setDelegate(new org.telegram.ui.g(f3Var, 5));
                kp0Var3.setReportChanges(true);
                e7.addView(kp0Var3, x5.a(38.0f, 5.0f, 4.0f, 5.0f, 0.0f, -1, 0));
                e7.addOnLayoutChangeListener(new j4(kp0Var, kp0Var3, kp0Var2));
                ScrollView scrollView = new ScrollView(parentActivity);
                scrollView.addView(e7);
                f3Var.setCustomView(scrollView);
                f3Var.show();
                this.f16415b.c(false);
                return;
            case 1:
                i iVar = this.f16415b;
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
                ProfileActivity.H4((Activity) this.f16415b.getContext(), false);
                return;
            default:
                i iVar2 = this.f16415b;
                iVar2.f16438n = true;
                try {
                    iVar2.performHapticFeedback(0);
                    return;
                } catch (Exception unused) {
                    return;
                }
        }
    }
}
