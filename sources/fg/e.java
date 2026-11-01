package fg;

import android.app.Activity;
import android.content.Context;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import org.telegram.messenger.a30;
import org.telegram.messenger.dd;
import org.telegram.messenger.m5;
import org.telegram.messenger.uz;
import org.telegram.ui.ActionBar.a7;
import org.telegram.ui.ActionBar.f4;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.ActionBar.z2;
import org.telegram.ui.Components.on0;
import org.telegram.ui.Components.vu0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.g5;
import w7.b6;
public final class e implements Runnable {
    public final int f7066a;
    public final l f7067b;

    public e(l lVar, int i10) {
        this.f7066a = i10;
        this.f7067b = lVar;
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
        int i17 = this.f7066a;
        l lVar = this.f7067b;
        switch (i17) {
            case 0:
                k2 Q = LaunchActivity.Q();
                ?? z2Var = new z2(Q.getParentActivity(), false);
                if (Q.getFragmentView() instanceof vu0) {
                    z2Var.f37353i1 = (vu0) Q.getFragmentView();
                }
                Activity parentActivity = Q.getParentActivity();
                LinearLayout e = m5.e(parentActivity, 1);
                TextView textView = new TextView(parentActivity);
                textView.setText("Saturation " + (g5.f37351j1 * 5.0f));
                int i18 = t6.f21115n5;
                a7.V(textView, i18, null);
                a30.o(textView, 1, 16.0f, 1, 1);
                textView.setSingleLine(true);
                if (dd.X) {
                    i10 = 3;
                } else {
                    i10 = 5;
                }
                textView.setGravity(i10 | 48);
                if (dd.X) {
                    i11 = 3;
                } else {
                    i11 = 5;
                }
                e.addView(textView, b6.d(-2, -1.0f, i11 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                on0 on0Var = new on0(parentActivity);
                on0Var.setDelegate(new m4.c(12, z2Var, textView));
                on0Var.setReportChanges(true);
                e.addView(on0Var, b6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView2 = new TextView(parentActivity);
                textView2.setText("Alpha " + g5.l1);
                a7.V(textView2, i18, null);
                a30.o(textView2, 1, 16.0f, 1, 1);
                textView2.setSingleLine(true);
                if (dd.X) {
                    i12 = 3;
                } else {
                    i12 = 5;
                }
                textView2.setGravity(i12 | 48);
                if (dd.X) {
                    i13 = 3;
                } else {
                    i13 = 5;
                }
                e.addView(textView2, b6.d(-2, -1.0f, i13 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                on0 on0Var2 = new on0(parentActivity);
                on0Var2.setDelegate(new m5.e(z2Var, textView2, false, 9));
                on0Var2.setReportChanges(true);
                e.addView(on0Var2, b6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView3 = new TextView(parentActivity);
                textView3.setText("Blur Radius");
                a7.V(textView3, i18, null);
                a30.o(textView3, 1, 16.0f, 1, 1);
                textView3.setSingleLine(true);
                if (dd.X) {
                    i14 = 3;
                } else {
                    i14 = 5;
                }
                textView3.setGravity(i14 | 48);
                if (dd.X) {
                    i15 = 3;
                } else {
                    i15 = 5;
                }
                e.addView(textView3, b6.d(-2, -1.0f, i15 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                on0 on0Var3 = new on0(parentActivity);
                on0Var3.setDelegate(new org.telegram.ui.e(z2Var, 5));
                on0Var3.setReportChanges(true);
                e.addView(on0Var3, b6.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                e.addOnLayoutChangeListener(new f4(on0Var, on0Var3, on0Var2));
                ScrollView scrollView = new ScrollView(parentActivity);
                scrollView.addView(e);
                z2Var.N = scrollView;
                z2Var.show();
                lVar.c(false);
                return;
            case 1:
                lVar.getClass();
                uz.K();
                Context context = lVar.getContext();
                if (uz.J0) {
                    i16 = 2131751619;
                } else {
                    i16 = 2131751620;
                }
                Toast.makeText(context, dd.L0(i16, null), 0).show();
                return;
            case 2:
                ProfileActivity.V4((Activity) lVar.getContext(), false);
                return;
            default:
                lVar.f7090n = true;
                try {
                    lVar.performHapticFeedback(0);
                    return;
                } catch (Exception unused) {
                    return;
                }
        }
    }
}
