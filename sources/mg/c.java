package mg;

import android.app.Activity;
import android.content.Context;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import n6.k;
import n7.z0;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.am;
import org.telegram.messenger.v0;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.i4;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.qp0;
import org.telegram.ui.Components.yw0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.l5;
import w7.w5;
public final class c implements Runnable {
    public final int f16163a;
    public final i f16164b;

    public c(i iVar, int i10) {
        this.f16163a = i10;
        this.f16164b = iVar;
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
        switch (this.f16163a) {
            case 0:
                m2 R = LaunchActivity.R();
                ?? e3Var = new e3(R.getParentActivity(), false);
                if (R.getFragmentView() instanceof yw0) {
                    e3Var.f39638b = (yw0) R.getFragmentView();
                }
                Activity parentActivity = R.getParentActivity();
                LinearLayout f7 = v0.f(parentActivity, 1);
                TextView textView = new TextView(parentActivity);
                textView.setText("Saturation " + (l5.f39636c * 5.0f));
                int i17 = h6.f20744n5;
                am.u(textView, h6.x0(null, i17, false), 1, 16.0f, 1);
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
                f7.addView(textView, w5.a(-1.0f, 21.0f, 13.0f, 21.0f, 0.0f, -2, i11 | 48));
                qp0 qp0Var = new qp0(parentActivity);
                qp0Var.setDelegate(new k(e3Var, textView, false, 3));
                qp0Var.setReportChanges(true);
                f7.addView(qp0Var, w5.a(38.0f, 5.0f, 4.0f, 5.0f, 0.0f, -1, 0));
                TextView textView2 = new TextView(parentActivity);
                textView2.setText("Alpha " + l5.f39637e);
                am.u(textView2, h6.x0(null, i17, false), 1, 16.0f, 1);
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
                f7.addView(textView2, w5.a(-1.0f, 21.0f, 13.0f, 21.0f, 0.0f, -2, i13 | 48));
                qp0 qp0Var2 = new qp0(parentActivity);
                qp0Var2.setDelegate(new z0(e3Var, textView2, false, 2));
                qp0Var2.setReportChanges(true);
                f7.addView(qp0Var2, w5.a(38.0f, 5.0f, 4.0f, 5.0f, 0.0f, -1, 0));
                TextView textView3 = new TextView(parentActivity);
                textView3.setText("Blur Radius");
                am.u(textView3, h6.x0(null, i17, false), 1, 16.0f, 1);
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
                f7.addView(textView3, w5.a(-1.0f, 21.0f, 13.0f, 21.0f, 0.0f, -2, i15 | 48));
                qp0 qp0Var3 = new qp0(parentActivity);
                qp0Var3.setDelegate(new org.telegram.ui.g(e3Var, 5));
                qp0Var3.setReportChanges(true);
                f7.addView(qp0Var3, w5.a(38.0f, 5.0f, 4.0f, 5.0f, 0.0f, -1, 0));
                f7.addOnLayoutChangeListener(new i4(qp0Var, qp0Var3, qp0Var2));
                ScrollView scrollView = new ScrollView(parentActivity);
                scrollView.addView(f7);
                e3Var.setCustomView(scrollView);
                e3Var.show();
                this.f16164b.c(false);
                return;
            case 1:
                i iVar = this.f16164b;
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
                ProfileActivity.H4((Activity) this.f16164b.getContext(), false);
                return;
            default:
                i iVar2 = this.f16164b;
                iVar2.f16187n = true;
                try {
                    iVar2.performHapticFeedback(0);
                    return;
                } catch (Exception unused) {
                    return;
                }
        }
    }
}
