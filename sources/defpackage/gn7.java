package defpackage;

import android.view.ViewConfiguration;
public final class gn7 implements Runnable {
    public byte a;
    public byte b;
    public final hn7 c;

    public gn7(hn7 hn7Var) {
        this.c = hn7Var;
    }

    public final void a() {
        this.b = (byte) 0;
        this.a = (byte) 0;
        hn7 hn7Var = this.c;
        hn7Var.removeCallbacks(this);
        if (hn7Var.p0) {
            hn7Var.p0 = false;
            hn7Var.invalidate(0, hn7Var.o0, hn7Var.getRight(), hn7Var.getBottom());
        }
        hn7Var.q0 = false;
    }

    @Override
    public final void run() {
        byte b = this.b;
        hn7 hn7Var = this.c;
        if (b != 1) {
            if (b == 2) {
                byte b2 = this.a;
                if (b2 != 1) {
                    if (b2 == 2) {
                        if (!hn7Var.q0) {
                            hn7Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                        }
                        hn7Var.q0 = (byte) (!hn7Var.q0 ? 1 : 0);
                        hn7Var.invalidate(0, 0, hn7Var.getRight(), hn7Var.n0);
                        return;
                    }
                    return;
                }
                if (!hn7Var.p0) {
                    hn7Var.postDelayed(this, ViewConfiguration.getPressedStateDuration());
                }
                hn7Var.p0 = (byte) (!hn7Var.p0 ? 1 : 0);
                hn7Var.invalidate(0, hn7Var.o0, hn7Var.getRight(), hn7Var.getBottom());
                return;
            }
            return;
        }
        byte b3 = this.a;
        if (b3 != 1) {
            if (b3 != 2) {
                return;
            }
            hn7Var.q0 = true;
            hn7Var.invalidate(0, 0, hn7Var.getRight(), hn7Var.n0);
            return;
        }
        hn7Var.p0 = true;
        hn7Var.invalidate(0, hn7Var.o0, hn7Var.getRight(), hn7Var.getBottom());
    }
}
