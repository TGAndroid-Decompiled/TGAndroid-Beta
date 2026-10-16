package ng;

import android.app.Activity;
import android.content.Context;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import m2.t;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.g0;
import org.telegram.messenger.sk;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.i4;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.gp0;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.m5;
import w7.z5;
public final class c implements Runnable {
    public final int f16067a;
    public final i f16068b;

    public c(i iVar, int i10) {
        this.f16067a = i10;
        this.f16068b = iVar;
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
        switch (this.f16067a) {
            case 0:
                m2 R = LaunchActivity.R();
                ?? e3Var = new e3(R.getParentActivity(), false);
                if (R.getFragmentView() instanceof ow0) {
                    e3Var.f37910b = (ow0) R.getFragmentView();
                }
                Activity parentActivity = R.getParentActivity();
                LinearLayout e = g0.e(parentActivity, 1);
                TextView textView = new TextView(parentActivity);
                textView.setText("Saturation " + (m5.f37909c * 5.0f));
                int i17 = g6.f19783n5;
                sk.u(textView, g6.x0(null, i17, false), 1, 16.0f, 1);
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
                e.addView(textView, z5.a(-1.0f, 21.0f, 13.0f, 21.0f, 0.0f, -2, i11 | 48));
                gp0 gp0Var = new gp0(parentActivity);
                gp0Var.setDelegate(new n3.b(e3Var, textView, false, 4));
                gp0Var.setReportChanges(true);
                e.addView(gp0Var, z5.a(38.0f, 5.0f, 4.0f, 5.0f, 0.0f, -1, 0));
                TextView textView2 = new TextView(parentActivity);
                textView2.setText("Alpha " + m5.e);
                sk.u(textView2, g6.x0(null, i17, false), 1, 16.0f, 1);
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
                e.addView(textView2, z5.a(-1.0f, 21.0f, 13.0f, 21.0f, 0.0f, -2, i13 | 48));
                gp0 gp0Var2 = new gp0(parentActivity);
                gp0Var2.setDelegate(new t(e3Var, textView2, false, 10));
                gp0Var2.setReportChanges(true);
                e.addView(gp0Var2, z5.a(38.0f, 5.0f, 4.0f, 5.0f, 0.0f, -1, 0));
                TextView textView3 = new TextView(parentActivity);
                textView3.setText("Blur Radius");
                sk.u(textView3, g6.x0(null, i17, false), 1, 16.0f, 1);
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
                e.addView(textView3, z5.a(-1.0f, 21.0f, 13.0f, 21.0f, 0.0f, -2, i15 | 48));
                gp0 gp0Var3 = new gp0(parentActivity);
                gp0Var3.setDelegate(new org.telegram.ui.g(e3Var, 5));
                gp0Var3.setReportChanges(true);
                e.addView(gp0Var3, z5.a(38.0f, 5.0f, 4.0f, 5.0f, 0.0f, -1, 0));
                e.addOnLayoutChangeListener(new i4(gp0Var, gp0Var3, gp0Var2));
                ScrollView scrollView = new ScrollView(parentActivity);
                scrollView.addView(e);
                e3Var.setCustomView(scrollView);
                e3Var.show();
                this.f16068b.c(false);
                return;
            case 1:
                i iVar = this.f16068b;
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
                ProfileActivity.H4((Activity) this.f16068b.getContext(), false);
                return;
            default:
                i iVar2 = this.f16068b;
                iVar2.f16088n = true;
                try {
                    iVar2.performHapticFeedback(0);
                    return;
                } catch (Exception unused) {
                    return;
                }
        }
    }
}
