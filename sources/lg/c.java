package lg;

import android.app.Activity;
import android.content.Context;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import n7.a1;
import og.u0;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.SharedConfig;
import org.telegram.messenger.a2;
import org.telegram.messenger.em;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.ActionBar.m4;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.aw0;
import org.telegram.ui.Components.oo0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.i5;
import w7.a6;
public final class c implements Runnable {
    public final int f12936a;
    public final i f12937b;

    public c(i iVar, int i10) {
        this.f12936a = i10;
        this.f12937b = iVar;
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
        switch (this.f12936a) {
            case 0:
                p2 R = LaunchActivity.R();
                ?? h3Var = new h3(R.getParentActivity(), false);
                if (R.getFragmentView() instanceof aw0) {
                    h3Var.f33536b = (aw0) R.getFragmentView();
                }
                Activity parentActivity = R.getParentActivity();
                LinearLayout f7 = a2.f(parentActivity, 1);
                TextView textView = new TextView(parentActivity);
                textView.setText("Saturation " + (i5.f33535c * 5.0f));
                int i17 = j6.f18109n5;
                em.r(textView, j6.w0(null, i17, false), 1, 16.0f, 1);
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
                f7.addView(textView, a6.d(-2, -1.0f, i11 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                oo0 oo0Var = new oo0(parentActivity);
                oo0Var.setDelegate(new a1(h3Var, textView, false, 3));
                oo0Var.setReportChanges(true);
                f7.addView(oo0Var, a6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView2 = new TextView(parentActivity);
                textView2.setText("Alpha " + i5.e);
                em.r(textView2, j6.w0(null, i17, false), 1, 16.0f, 1);
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
                f7.addView(textView2, a6.d(-2, -1.0f, i13 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                oo0 oo0Var2 = new oo0(parentActivity);
                oo0Var2.setDelegate(new u0(h3Var, textView2, false, 2));
                oo0Var2.setReportChanges(true);
                f7.addView(oo0Var2, a6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView3 = new TextView(parentActivity);
                textView3.setText("Blur Radius");
                em.r(textView3, j6.w0(null, i17, false), 1, 16.0f, 1);
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
                f7.addView(textView3, a6.d(-2, -1.0f, i15 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                oo0 oo0Var3 = new oo0(parentActivity);
                oo0Var3.setDelegate(new org.telegram.ui.g(h3Var, 5));
                oo0Var3.setReportChanges(true);
                f7.addView(oo0Var3, a6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                f7.addOnLayoutChangeListener(new m4(oo0Var, oo0Var3, oo0Var2));
                ScrollView scrollView = new ScrollView(parentActivity);
                scrollView.addView(f7);
                h3Var.setCustomView(scrollView);
                h3Var.show();
                this.f12937b.c(false);
                return;
            case 1:
                i iVar = this.f12937b;
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
                ProfileActivity.H4((Activity) this.f12937b.getContext(), false);
                return;
            default:
                i iVar2 = this.f12937b;
                iVar2.f12957n = true;
                try {
                    iVar2.performHapticFeedback(0);
                    return;
                } catch (Exception unused) {
                    return;
                }
        }
    }
}
