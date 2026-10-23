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
import org.telegram.messenger.sl;
import org.telegram.messenger.v0;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.ActionBar.n4;
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.ActionBar.r6;
import org.telegram.ui.Components.hp0;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.m5;
import w7.z5;
public final class c implements Runnable {
    public final int f17510a;
    public final i f17511b;

    public c(i iVar, int i10) {
        this.f17510a = i10;
        this.f17511b = iVar;
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
        switch (this.f17510a) {
            case 0:
                o2 R = LaunchActivity.R();
                ?? h3Var = new h3(R.getParentActivity(), false);
                if (R.getFragmentView() instanceof ow0) {
                    h3Var.f39376b = (ow0) R.getFragmentView();
                }
                Activity parentActivity = R.getParentActivity();
                LinearLayout f7 = v0.f(parentActivity, 1);
                TextView textView = new TextView(parentActivity);
                textView.setText("Saturation " + (m5.f39375c * 5.0f));
                int i17 = k6.f21365n5;
                r6.W(textView, i17, null);
                sl.u(textView, 1, 16.0f, 1, 1);
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
                f7.addView(textView, z5.d(-2, -1.0f, i11 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                hp0 hp0Var = new hp0(parentActivity);
                hp0Var.setDelegate(new q(h3Var, textView, false, 7));
                hp0Var.setReportChanges(true);
                f7.addView(hp0Var, z5.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView2 = new TextView(parentActivity);
                textView2.setText("Alpha " + m5.e);
                r6.W(textView2, i17, null);
                sl.u(textView2, 1, 16.0f, 1, 1);
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
                f7.addView(textView2, z5.d(-2, -1.0f, i13 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                hp0 hp0Var2 = new hp0(parentActivity);
                hp0Var2.setDelegate(new n2.e(h3Var, textView2, false, 5));
                hp0Var2.setReportChanges(true);
                f7.addView(hp0Var2, z5.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView3 = new TextView(parentActivity);
                textView3.setText("Blur Radius");
                r6.W(textView3, i17, null);
                sl.u(textView3, 1, 16.0f, 1, 1);
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
                f7.addView(textView3, z5.d(-2, -1.0f, i15 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                hp0 hp0Var3 = new hp0(parentActivity);
                hp0Var3.setDelegate(new org.telegram.ui.f(h3Var, 5));
                hp0Var3.setReportChanges(true);
                f7.addView(hp0Var3, z5.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                f7.addOnLayoutChangeListener(new n4(hp0Var, hp0Var3, hp0Var2));
                ScrollView scrollView = new ScrollView(parentActivity);
                scrollView.addView(f7);
                h3Var.setCustomView(scrollView);
                h3Var.show();
                this.f17511b.c(false);
                return;
            case 1:
                i iVar = this.f17511b;
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
                ProfileActivity.J4((Activity) this.f17511b.getContext(), false);
                return;
            default:
                i iVar2 = this.f17511b;
                iVar2.f17531n = true;
                try {
                    iVar2.performHapticFeedback(0);
                    return;
                } catch (Exception unused) {
                    return;
                }
        }
    }
}
