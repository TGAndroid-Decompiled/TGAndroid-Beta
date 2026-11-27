package defpackage;

import android.view.ViewConfiguration;
public final class gq7 implements Runnable {
    public byte a;
    public byte b;
    public final hq7 c;

    public gq7(hq7 hq7Var) {
        this.c = hq7Var;
    }

    public final void a() {
        this.b = (byte) 0;
        this.a = (byte) 0;
        hq7 hq7Var = this.c;
        hq7Var.removeCallbacks(this);
        if (hq7Var.p0) {
            hq7Var.p0 = false;
            hq7Var.invalidate(0, hq7Var.o0, hq7Var.getRight(), hq7Var.getBottom());
        }
        hq7Var.q0 = false;
    }

    @Override
    public final void run() {
        byte b = this.b;
        hq7 hq7Var = this.c;
        if (b != 1) {
            if (b == 2) {
                byte b2 = this.a;
                if (b2 != 1) {
                    if (b2 == 2) {
                        if (!hq7Var.q0) {
                            hq7Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        hq7Var.q0 = !hq7Var.q0;
                        hq7Var.invalidate(0, 0, hq7Var.getRight(), hq7Var.n0);
                        return;
                    }
                    return;
                }
                if (!hq7Var.p0) {
                    hq7Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                }
                hq7Var.p0 = !hq7Var.p0;
                hq7Var.invalidate(0, hq7Var.o0, hq7Var.getRight(), hq7Var.getBottom());
                return;
            }
            return;
        }
        byte b3 = this.a;
        if (b3 != 1) {
            if (b3 != 2) {
                return;
            }
            hq7Var.q0 = true;
            hq7Var.invalidate(0, 0, hq7Var.getRight(), hq7Var.n0);
            return;
        }
        hq7Var.p0 = true;
        hq7Var.invalidate(0, hq7Var.o0, hq7Var.getRight(), hq7Var.getBottom());
    }
}
