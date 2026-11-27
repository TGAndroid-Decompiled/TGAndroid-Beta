package defpackage;

import android.animation.ValueAnimator;
public final class ng3 implements Runnable {
    public final byte a;
    public final og3 b;

    public ng3(og3 og3Var, byte b) {
        this.a = b;
        this.b = og3Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        og3 og3Var = this.b;
        switch (b) {
            case 0:
                ii3 ii3Var = og3Var.c0;
                ValueAnimator valueAnimator = ii3Var.k0;
                if (valueAnimator != null) {
                    valueAnimator.start();
                }
                ii3Var.l0 = null;
                return;
            default:
                og3Var.x = false;
                og3Var.invalidate();
                return;
        }
    }
}
