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
public final class cj4 implements Runnable {
    public final byte a;
    public final hj4 b;

    public cj4(hj4 hj4Var, byte b) {
        this.a = b;
        this.b = hj4Var;
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
        hj4 hj4Var = this.b;
        switch (b) {
            case 0:
                d Q = LaunchActivity.Q();
                ?? fx0Var = new fx0(Q.getParentActivity(), false);
                if (Q.getFragmentView() instanceof cja) {
                    fx0Var.l1 = (cja) Q.getFragmentView();
                }
                Activity parentActivity = Q.getParentActivity();
                LinearLayout m = ir2.m(parentActivity, 1);
                TextView textView = new TextView(parentActivity);
                textView.setText("Saturation " + (xk0.m1 * 5.0f));
                int i7 = bkb.m5;
                zkb.X(textView, i7, null);
                ug8.w(textView, 1, 16.0f, 1, 1);
                textView.setSingleLine(true);
                int i8 = 5;
                if (k96.a0) {
                    i = 3;
                } else {
                    i = 5;
                }
                textView.setGravity(i | 48);
                if (k96.a0) {
                    i2 = 3;
                } else {
                    i2 = 5;
                }
                m.addView(textView, nme.d(-2, -1.0f, i2 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                av9 av9Var = new av9(parentActivity);
                av9Var.setDelegate(new lv6((Object) fx0Var, textView, (byte) 8));
                av9Var.setReportChanges(true);
                m.addView(av9Var, nme.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView2 = new TextView(parentActivity);
                textView2.setText("Alpha " + xk0.o1);
                zkb.X(textView2, i7, null);
                ug8.w(textView2, 1, 16.0f, 1, 1);
                textView2.setSingleLine(true);
                if (k96.a0) {
                    i3 = 3;
                } else {
                    i3 = 5;
                }
                textView2.setGravity(i3 | 48);
                if (k96.a0) {
                    i4 = 3;
                } else {
                    i4 = 5;
                }
                m.addView(textView2, nme.d(-2, -1.0f, i4 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                av9 av9Var2 = new av9(parentActivity);
                av9Var2.setDelegate(new tg2(fx0Var, textView2, false, (byte) 10));
                av9Var2.setReportChanges(true);
                m.addView(av9Var2, nme.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                TextView textView3 = new TextView(parentActivity);
                textView3.setText("Blur Radius");
                zkb.X(textView3, i7, null);
                ug8.w(textView3, 1, 16.0f, 1, 1);
                textView3.setSingleLine(true);
                if (k96.a0) {
                    i5 = 3;
                } else {
                    i5 = 5;
                }
                textView3.setGravity(i5 | 48);
                if (k96.a0) {
                    i8 = 3;
                }
                m.addView(textView3, nme.d(-2, -1.0f, i8 | 48, 21.0f, 13.0f, 21.0f, 0.0f));
                av9 av9Var3 = new av9(parentActivity);
                av9Var3.setDelegate(new l69(fx0Var, (byte) 11));
                av9Var3.setReportChanges(true);
                m.addView(av9Var3, nme.d(-1, 38.0f, 0, 5.0f, 4.0f, 5.0f, 0.0f));
                m.addOnLayoutChangeListener(new wk0(av9Var, av9Var3, av9Var2));
                ScrollView scrollView = new ScrollView(parentActivity);
                scrollView.addView(m);
                fx0Var.O = scrollView;
                fx0Var.show();
                hj4Var.c(false);
                return;
            case 1:
                gba.J();
                Context context = hj4Var.getContext();
                if (gba.F0) {
                    i6 = 2131751606;
                } else {
                    i6 = 2131751607;
                }
                Toast.makeText(context, k96.M0(i6, null), 0).show();
                return;
            case 2:
                ProfileActivity.l3((Activity) hj4Var.getContext(), false);
                return;
            default:
                hj4Var.n = true;
                try {
                    hj4Var.performHapticFeedback(0);
                    return;
                } catch (Exception unused) {
                    return;
                }
        }
    }
}
