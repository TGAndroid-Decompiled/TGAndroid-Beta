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
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.j4;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.lw0;
import org.telegram.ui.Components.yo0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.j5;
import w7.z5;
public final class c implements Runnable {
    public final int f16401a;
    public final i f16402b;

    public c(i iVar, int i10) {
        this.f16401a = i10;
        this.f16402b = iVar;
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
        switch (this.f16401a) {
            case 0:
                n2 R = LaunchActivity.R();
                ?? f3Var = new f3(R.getParentActivity(), false);
                if (R.getFragmentView() instanceof lw0) {
                    f3Var.f37581b = (lw0) R.getFragmentView();
                }
                Activity parentActivity = R.getParentActivity();
                LinearLayout e7 = f0.e(parentActivity, 1);
                TextView textView = new TextView(parentActivity);
                textView.setText("Saturation " + (j5.f37579c * 5.0f));
                int i17 = i6.f21003n5;
                ok.t(textView, i6.w0(null, i17, false), 1, 16.0f, 1);
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
                e7.addView(textView, z5.d(-2, -1.0f, i11 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                yo0 yo0Var = new yo0(parentActivity);
                yo0Var.setDelegate(new o0.a(f3Var, textView, false, 1));
                yo0Var.setReportChanges(true);
                e7.addView(yo0Var, z5.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView2 = new TextView(parentActivity);
                textView2.setText("Alpha " + j5.f37580e);
                ok.t(textView2, i6.w0(null, i17, false), 1, 16.0f, 1);
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
                e7.addView(textView2, z5.d(-2, -1.0f, i13 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                yo0 yo0Var2 = new yo0(parentActivity);
                yo0Var2.setDelegate(new z0(f3Var, textView2, false, 2));
                yo0Var2.setReportChanges(true);
                e7.addView(yo0Var2, z5.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView3 = new TextView(parentActivity);
                textView3.setText("Blur Radius");
                ok.t(textView3, i6.w0(null, i17, false), 1, 16.0f, 1);
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
                e7.addView(textView3, z5.d(-2, -1.0f, i15 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                yo0 yo0Var3 = new yo0(parentActivity);
                yo0Var3.setDelegate(new org.telegram.ui.g(f3Var, 5));
                yo0Var3.setReportChanges(true);
                e7.addView(yo0Var3, z5.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                e7.addOnLayoutChangeListener(new j4(yo0Var, yo0Var3, yo0Var2));
                ScrollView scrollView = new ScrollView(parentActivity);
                scrollView.addView(e7);
                f3Var.setCustomView(scrollView);
                f3Var.show();
                this.f16402b.c(false);
                return;
            case 1:
                i iVar = this.f16402b;
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
                ProfileActivity.H4((Activity) this.f16402b.getContext(), false);
                return;
            default:
                i iVar2 = this.f16402b;
                iVar2.f16425n = true;
                try {
                    iVar2.performHapticFeedback(0);
                    return;
                } catch (Exception unused) {
                    return;
                }
        }
    }
}
