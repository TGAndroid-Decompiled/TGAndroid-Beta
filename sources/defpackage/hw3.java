package defpackage;

import android.view.View;
public final class hw3 implements Runnable {
    public final int a;
    public final int b;
    public final kw3 c;

    public hw3(kw3 kw3Var, int i, int i2) {
        this.c = kw3Var;
        this.a = i;
        this.b = i2;
    }

    @Override
    public final void run() {
        rc2 rc2Var;
        yv1 yv1Var;
        kw3 kw3Var = this.c;
        vr1 vr1Var = kw3Var.I;
        if (kw3Var.n) {
            int i = 0;
            while (true) {
                if (i < vr1Var.getChildCount()) {
                    View childAt = vr1Var.getChildAt(i);
                    if (childAt instanceof rc2) {
                        rc2Var = (rc2) childAt;
                        String V1 = rc2Var.getMessageObject().V1();
                        if (V1 == null) {
                            V1 = rc2Var.getMessageObject().k.message;
                        }
                        if (rc2Var.getPhotoImage().E() && V1 != null && rc2Var.getMessageObject().e1() == this.a) {
                            break;
                        }
                    }
                    i++;
                } else {
                    rc2Var = null;
                    break;
                }
            }
            if (rc2Var != null && (yv1Var = kw3Var.a) != null) {
                yv1Var.hb(rc2Var);
                String V12 = rc2Var.getMessageObject().V1();
                if (!zx3.a(V12) && !"🍑".equals(V12) && !"⚰".equals(V12) && !rc2Var.getMessageObject().V3() && !rc2Var.getMessageObject().F2()) {
                    try {
                        rc2Var.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                }
                kw3Var.n(rc2Var, this.b, false, true);
            }
        }
    }
}
