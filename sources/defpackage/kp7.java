package defpackage;

import android.view.ViewConfiguration;
public final class kp7 implements Runnable {
    public byte a;
    public byte b;
    public final lp7 c;

    public kp7(lp7 lp7Var) {
        this.c = lp7Var;
    }

    public final void a() {
        this.b = (byte) 0;
        this.a = (byte) 0;
        lp7 lp7Var = this.c;
        lp7Var.removeCallbacks(this);
        if (lp7Var.p0) {
            lp7Var.p0 = false;
            lp7Var.invalidate(0, lp7Var.o0, lp7Var.getRight(), lp7Var.getBottom());
        }
        lp7Var.q0 = false;
    }

    @Override
    public final void run() {
        byte b = this.b;
        lp7 lp7Var = this.c;
        if (b != 1) {
            if (b == 2) {
                byte b2 = this.a;
                if (b2 != 1) {
                    if (b2 == 2) {
                        if (!lp7Var.q0) {
                            lp7Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        lp7Var.q0 = (byte) (!lp7Var.q0 ? 1 : 0);
                        lp7Var.invalidate(0, 0, lp7Var.getRight(), lp7Var.n0);
                        return;
                    }
                    return;
                }
                if (!lp7Var.p0) {
                    lp7Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                }
                lp7Var.p0 = (byte) (!lp7Var.p0 ? 1 : 0);
                lp7Var.invalidate(0, lp7Var.o0, lp7Var.getRight(), lp7Var.getBottom());
                return;
            }
            return;
        }
        byte b3 = this.a;
        if (b3 != 1) {
            if (b3 != 2) {
                return;
            }
            lp7Var.q0 = true;
            lp7Var.invalidate(0, 0, lp7Var.getRight(), lp7Var.n0);
            return;
        }
        lp7Var.p0 = true;
        lp7Var.invalidate(0, lp7Var.o0, lp7Var.getRight(), lp7Var.getBottom());
    }
}
