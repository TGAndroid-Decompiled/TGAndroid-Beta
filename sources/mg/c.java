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
import org.telegram.messenger.f0;
import org.telegram.messenger.ok;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.i4;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.to0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.i5;
import w7.y5;
public final class c implements Runnable {
    public final int f15032a;
    public final i f15033b;

    public c(i iVar, int i10) {
        this.f15032a = i10;
        this.f15033b = iVar;
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
        switch (this.f15032a) {
            case 0:
                m2 R = LaunchActivity.R();
                ?? e3Var = new e3(R.getParentActivity(), false);
                if (R.getFragmentView() instanceof bw0) {
                    e3Var.f34413b = (bw0) R.getFragmentView();
                }
                Activity parentActivity = R.getParentActivity();
                LinearLayout e = f0.e(parentActivity, 1);
                TextView textView = new TextView(parentActivity);
                textView.setText("Saturation " + (i5.f34412c * 5.0f));
                int i17 = h6.f19242n5;
                ok.t(textView, h6.w0(null, i17, false), 1, 16.0f, 1);
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
                to0Var.setDelegate(new o0.a(e3Var, textView, false, 1));
                to0Var.setReportChanges(true);
                e.addView(to0Var, y5.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView2 = new TextView(parentActivity);
                textView2.setText("Alpha " + i5.e);
                ok.t(textView2, h6.w0(null, i17, false), 1, 16.0f, 1);
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
                to0Var2.setDelegate(new z0(e3Var, textView2, false, 2));
                to0Var2.setReportChanges(true);
                e.addView(to0Var2, y5.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView3 = new TextView(parentActivity);
                textView3.setText("Blur Radius");
                ok.t(textView3, h6.w0(null, i17, false), 1, 16.0f, 1);
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
                to0Var3.setDelegate(new org.telegram.ui.g(e3Var, 5));
                to0Var3.setReportChanges(true);
                e.addView(to0Var3, y5.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                e.addOnLayoutChangeListener(new i4(to0Var, to0Var3, to0Var2));
                ScrollView scrollView = new ScrollView(parentActivity);
                scrollView.addView(e);
                e3Var.setCustomView(scrollView);
                e3Var.show();
                this.f15033b.c(false);
                return;
            case 1:
                i iVar = this.f15033b;
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
                ProfileActivity.H4((Activity) this.f15033b.getContext(), false);
                return;
            default:
                i iVar2 = this.f15033b;
                iVar2.f15053n = true;
                try {
                    iVar2.performHapticFeedback(0);
                    return;
                } catch (Exception unused) {
                    return;
                }
        }
    }
}
