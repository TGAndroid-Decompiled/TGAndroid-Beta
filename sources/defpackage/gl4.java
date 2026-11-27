package defpackage;

import android.app.Activity;
import android.content.Context;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
public final class gl4 implements Runnable {
    public final byte a;
    public final ll4 b;

    public gl4(ll4 ll4Var, byte b) {
        this.a = b;
        this.b = ll4Var;
    }

    @Override
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        byte b = this.a;
        ll4 ll4Var = this.b;
        switch (b) {
            case 0:
                e Q = LaunchActivity.Q();
                ?? nx0Var = new nx0(Q.getParentActivity(), false);
                if (Q.getFragmentView() instanceof wma) {
                    nx0Var.l1 = (wma) Q.getFragmentView();
                }
                Activity parentActivity = Q.getParentActivity();
                LinearLayout m = bs2.m(parentActivity, 1);
                TextView textView = new TextView(parentActivity);
                textView.setText("Saturation " + (yk0.m1 * 5.0f));
                int i7 = aob.n5;
                yob.X(textView, i7, null);
                ik8.w(textView, 1, 16.0f, 1, 1);
                textView.setSingleLine(true);
                int i8 = 5;
                if (ob6.a0) {
                    i = 3;
                } else {
                    i = 5;
                }
                textView.setGravity(i | 48);
                if (ob6.a0) {
                    i2 = 3;
                } else {
                    i2 = 5;
                }
                m.addView(textView, tre.d(-2, -1.0f, i2 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                uy9 uy9Var = new uy9(parentActivity);
                uy9Var.setDelegate(new qx6((Object) nx0Var, textView, (byte) 8));
                uy9Var.setReportChanges(true);
                m.addView(uy9Var, tre.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView2 = new TextView(parentActivity);
                textView2.setText("Alpha " + yk0.o1);
                yob.X(textView2, i7, null);
                ik8.w(textView2, 1, 16.0f, 1, 1);
                textView2.setSingleLine(true);
                if (ob6.a0) {
                    i3 = 3;
                } else {
                    i3 = 5;
                }
                textView2.setGravity(i3 | 48);
                if (ob6.a0) {
                    i4 = 3;
                } else {
                    i4 = 5;
                }
                m.addView(textView2, tre.d(-2, -1.0f, i4 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                uy9 uy9Var2 = new uy9(parentActivity);
                uy9Var2.setDelegate(new lh2(nx0Var, textView2, false, (byte) 10));
                uy9Var2.setReportChanges(true);
                m.addView(uy9Var2, tre.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView3 = new TextView(parentActivity);
                textView3.setText("Blur Radius");
                yob.X(textView3, i7, null);
                ik8.w(textView3, 1, 16.0f, 1, 1);
                textView3.setSingleLine(true);
                if (ob6.a0) {
                    i5 = 3;
                } else {
                    i5 = 5;
                }
                textView3.setGravity(i5 | 48);
                if (ob6.a0) {
                    i8 = 3;
                }
                m.addView(textView3, tre.d(-2, -1.0f, i8 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                uy9 uy9Var3 = new uy9(parentActivity);
                uy9Var3.setDelegate(new ri6(nx0Var, (byte) 10));
                uy9Var3.setReportChanges(true);
                m.addView(uy9Var3, tre.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                m.addOnLayoutChangeListener(new xk0(uy9Var, uy9Var3, uy9Var2));
                ScrollView scrollView = new ScrollView(parentActivity);
                scrollView.addView(m);
                nx0Var.O = scrollView;
                nx0Var.show();
                ll4Var.c(false);
                return;
            case 1:
                xea.J();
                Context context = ll4Var.getContext();
                if (xea.F0) {
                    i6 = 2131751583;
                } else {
                    i6 = 2131751584;
                }
                Toast.makeText(context, ob6.M0(i6, null), 0).show();
                return;
            case 2:
                ProfileActivity.m3((Activity) ll4Var.getContext(), false);
                return;
            default:
                ll4Var.n = true;
                try {
                    ll4Var.performHapticFeedback(0);
                    return;
                } catch (Exception unused) {
                    return;
                }
        }
    }
}
