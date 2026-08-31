package ag;

import android.app.Activity;
import android.content.Context;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import k7.c6;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.m4;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.lo0;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.k5;
import org.telegram.ui.l5;
public final class g implements Runnable {
    public final int f198a;
    public final o f199b;

    public g(o oVar, int i10) {
        this.f198a = i10;
        this.f199b = oVar;
    }

    @Override
    public final void run() {
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        switch (this.f198a) {
            case 0:
                p2 R = LaunchActivity.R();
                ?? h3Var = new h3(R.getParentActivity(), false);
                if (R.getFragmentView() instanceof qv0) {
                    h3Var.f38639b = (qv0) R.getFragmentView();
                }
                Activity parentActivity = R.getParentActivity();
                LinearLayout h = l.d.h(parentActivity, 1);
                TextView textView = new TextView(parentActivity);
                textView.setText("Saturation " + (l5.f38637c * 5.0f));
                int i16 = k6.f21838n5;
                org.telegram.ui.b.q(textView, k6.w0(null, i16, false), 1, 16.0f, 1);
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
                h.addView(textView, c6.d(-2, -1.0f, i11 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                lo0 lo0Var = new lo0(parentActivity);
                lo0Var.setDelegate(new k5(h3Var, textView, 0));
                lo0Var.setReportChanges(true);
                h.addView(lo0Var, c6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView2 = new TextView(parentActivity);
                textView2.setText("Alpha " + l5.f38638e);
                org.telegram.ui.b.q(textView2, k6.w0(null, i16, false), 1, 16.0f, 1);
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
                h.addView(textView2, c6.d(-2, -1.0f, i13 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                lo0 lo0Var2 = new lo0(parentActivity);
                lo0Var2.setDelegate(new k5(h3Var, textView2, 1));
                lo0Var2.setReportChanges(true);
                h.addView(lo0Var2, c6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView3 = new TextView(parentActivity);
                textView3.setText("Blur Radius");
                org.telegram.ui.b.q(textView3, k6.w0(null, i16, false), 1, 16.0f, 1);
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
                h.addView(textView3, c6.d(-2, -1.0f, i17 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                lo0 lo0Var3 = new lo0(parentActivity);
                lo0Var3.setDelegate(new org.telegram.ui.h(h3Var, 5));
                lo0Var3.setReportChanges(true);
                h.addView(lo0Var3, c6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                h.addOnLayoutChangeListener(new m4(lo0Var, lo0Var3, lo0Var2));
                ScrollView scrollView = new ScrollView(parentActivity);
                scrollView.addView(h);
                h3Var.setCustomView(scrollView);
                h3Var.show();
                this.f199b.c(false);
                return;
            case 1:
                o oVar = this.f199b;
                oVar.getClass();
                SharedConfig.toggleDebugWebView();
                Context context = oVar.getContext();
                if (SharedConfig.debugWebView) {
                    i15 = R.string.DebugMenuWebViewDebugEnabled;
                } else {
                    i15 = R.string.DebugMenuWebViewDebugDisabled;
                }
                Toast.makeText(context, LocaleController.getString(i15), 0).show();
                return;
            case 2:
                ProfileActivity.H4((Activity) this.f199b.getContext(), false);
                return;
            default:
                o oVar2 = this.f199b;
                oVar2.f227n = true;
                try {
                    oVar2.performHapticFeedback(0);
                    return;
                } catch (Exception unused) {
                    return;
                }
        }
    }
}
