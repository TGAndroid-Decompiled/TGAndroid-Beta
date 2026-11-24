package defpackage;

import android.animation.ValueAnimator;
public final class gh3 implements Runnable {
    public final byte a;
    public final hh3 b;

    public gh3(hh3 hh3Var, byte b) {
        this.a = b;
        this.b = hh3Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        hh3 hh3Var = this.b;
        switch (b) {
            case 0:
                aj3 aj3Var = hh3Var.c0;
                ValueAnimator valueAnimator = aj3Var.k0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                aj3Var.l0 = null;
                return;
            default:
                hh3Var.x = false;
                hh3Var.invalidate();
                return;
        }
    }
}
