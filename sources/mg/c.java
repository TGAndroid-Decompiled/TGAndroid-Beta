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
import org.telegram.messenger.ai;
import org.telegram.messenger.q;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.i4;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.lp0;
import org.telegram.ui.Components.tw0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.h5;
import w7.x5;
public final class c implements Runnable {
    public final int f16476a;
    public final i f16477b;

    public c(i iVar, int i10) {
        this.f16476a = i10;
        this.f16477b = iVar;
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
        switch (this.f16476a) {
            case 0:
                m2 R = LaunchActivity.R();
                ?? e3Var = new e3(R.getParentActivity(), false);
                if (R.getFragmentView() instanceof tw0) {
                    e3Var.f38330b = (tw0) R.getFragmentView();
                }
                Activity parentActivity = R.getParentActivity();
                LinearLayout e7 = q.e(parentActivity, 1);
                TextView textView = new TextView(parentActivity);
                textView.setText("Saturation " + (h5.f38328c * 5.0f));
                int i17 = h6.f21006n5;
                ai.u(textView, h6.x0(null, i17, false), 1, 16.0f, 1);
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
                e7.addView(textView, x5.a(-1.0f, 21.0f, 13.0f, 21.0f, 0.0f, -2, i11 | 48));
                lp0 lp0Var = new lp0(parentActivity);
                lp0Var.setDelegate(new k(e3Var, textView, false, 3));
                lp0Var.setReportChanges(true);
                e7.addView(lp0Var, x5.a(38.0f, 5.0f, 4.0f, 5.0f, 0.0f, -1, 0));
                TextView textView2 = new TextView(parentActivity);
                textView2.setText("Alpha " + h5.f38329e);
                ai.u(textView2, h6.x0(null, i17, false), 1, 16.0f, 1);
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
                lp0 lp0Var2 = new lp0(parentActivity);
                lp0Var2.setDelegate(new z0(e3Var, textView2, false, 2));
                lp0Var2.setReportChanges(true);
                e7.addView(lp0Var2, x5.a(38.0f, 5.0f, 4.0f, 5.0f, 0.0f, -1, 0));
                TextView textView3 = new TextView(parentActivity);
                textView3.setText("Blur Radius");
                ai.u(textView3, h6.x0(null, i17, false), 1, 16.0f, 1);
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
                e7.addView(textView3, x5.a(-1.0f, 21.0f, 13.0f, 21.0f, 0.0f, -2, i15 | 48));
                lp0 lp0Var3 = new lp0(parentActivity);
                lp0Var3.setDelegate(new org.telegram.ui.g(e3Var, 5));
                lp0Var3.setReportChanges(true);
                e7.addView(lp0Var3, x5.a(38.0f, 5.0f, 4.0f, 5.0f, 0.0f, -1, 0));
                e7.addOnLayoutChangeListener(new i4(lp0Var, lp0Var3, lp0Var2));
                ScrollView scrollView = new ScrollView(parentActivity);
                scrollView.addView(e7);
                e3Var.setCustomView(scrollView);
                e3Var.show();
                this.f16477b.c(false);
                return;
            case 1:
                i iVar = this.f16477b;
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
                ProfileActivity.H4((Activity) this.f16477b.getContext(), false);
                return;
            default:
                i iVar2 = this.f16477b;
                iVar2.f16500n = true;
                try {
                    iVar2.performHapticFeedback(0);
                    return;
                } catch (Exception unused) {
                    return;
                }
        }
    }
}
