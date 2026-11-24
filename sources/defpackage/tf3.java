package defpackage;

import android.animation.ValueAnimator;
public final class tf3 implements Runnable {
    public final byte a;
    public final uf3 b;

    public tf3(uf3 uf3Var, byte b) {
        this.a = b;
        this.b = uf3Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        uf3 uf3Var = this.b;
        switch (b) {
            case 0:
                oh3 oh3Var = uf3Var.c0;
                ValueAnimator valueAnimator = oh3Var.k0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                oh3Var.l0 = null;
                return;
            default:
                uf3Var.x = false;
                uf3Var.invalidate();
                return;
        }
    }
}
