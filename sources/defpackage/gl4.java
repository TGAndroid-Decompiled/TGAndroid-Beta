package defpackage;

import android.app.Activity;
import android.content.Context;
import android.widget.LinearLayout;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;
import org.telegram.ui.ActionBar.d;
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
        int i7;
        byte b = this.a;
        ll4 ll4Var = this.b;
        switch (b) {
            case 0:
                d Q = LaunchActivity.Q();
                ?? my0Var = new my0(Q.getParentActivity(), false);
                if (Q.getFragmentView() instanceof ela) {
                    my0Var.l1 = (ela) Q.getFragmentView();
                }
                Activity parentActivity = Q.getParentActivity();
                LinearLayout l = td4.l(parentActivity, 1);
                TextView textView = new TextView(parentActivity);
                textView.setText("Saturation " + (xl0.m1 * 5.0f));
                int i8 = cmb.m5;
                anb.X(textView, i8, null);
                wi8.w(textView, 1, 16.0f, 1, 1);
                textView.setSingleLine(true);
                if (jb6.a0) {
                    i = 3;
                } else {
                    i = 5;
                }
                textView.setGravity(i | 48);
                if (jb6.a0) {
                    i2 = 3;
                } else {
                    i2 = 5;
                }
                l.addView(textView, qoe.d(-2, -1.0f, i2 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                dx9 dx9Var = new dx9(parentActivity);
                dx9Var.setDelegate(new hi2(my0Var, textView, false, (byte) 10));
                dx9Var.setReportChanges(true);
                l.addView(dx9Var, qoe.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView2 = new TextView(parentActivity);
                textView2.setText("Alpha " + xl0.o1);
                anb.X(textView2, i8, null);
                wi8.w(textView2, 1, 16.0f, 1, 1);
                textView2.setSingleLine(true);
                if (jb6.a0) {
                    i3 = 3;
                } else {
                    i3 = 5;
                }
                textView2.setGravity(i3 | 48);
                if (jb6.a0) {
                    i4 = 3;
                } else {
                    i4 = 5;
                }
                l.addView(textView2, qoe.d(-2, -1.0f, i4 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                dx9 dx9Var2 = new dx9(parentActivity);
                dx9Var2.setDelegate(new lx6(my0Var, textView2, false, (byte) 9));
                dx9Var2.setReportChanges(true);
                l.addView(dx9Var2, qoe.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView3 = new TextView(parentActivity);
                textView3.setText("Blur Radius");
                anb.X(textView3, i8, null);
                wi8.w(textView3, 1, 16.0f, 1, 1);
                textView3.setSingleLine(true);
                if (jb6.a0) {
                    i5 = 3;
                } else {
                    i5 = 5;
                }
                textView3.setGravity(i5 | 48);
                if (jb6.a0) {
                    i6 = 3;
                } else {
                    i6 = 5;
                }
                l.addView(textView3, qoe.d(-2, -1.0f, i6 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                dx9 dx9Var3 = new dx9(parentActivity);
                dx9Var3.setDelegate(new ni6(my0Var, (byte) 10));
                dx9Var3.setReportChanges(true);
                l.addView(dx9Var3, qoe.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                l.addOnLayoutChangeListener(new wl0(dx9Var, dx9Var3, dx9Var2));
                ScrollView scrollView = new ScrollView(parentActivity);
                scrollView.addView(l);
                my0Var.O = scrollView;
                my0Var.show();
                ll4Var.c(false);
                return;
            case 1:
                gda.J();
                Context context = ll4Var.getContext();
                if (gda.F0) {
                    i7 = 2131751555;
                } else {
                    i7 = 2131751556;
                }
                Toast.makeText(context, jb6.M0(i7, null), 0).show();
                return;
            case 2:
                ProfileActivity.p3((Activity) ll4Var.getContext(), false);
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
