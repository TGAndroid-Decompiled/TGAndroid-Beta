package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
public final class bt4 implements Runnable {
    public final byte a;
    public final ft4 b;

    public bt4(ft4 ft4Var, byte b) {
        this.a = b;
        this.b = ft4Var;
    }

    @Override
    public final void run() {
        ValueAnimator valueAnimator;
        byte b = this.a;
        ft4 ft4Var = this.b;
        switch (b) {
            case 0:
                AnimatorSet animatorSet = ft4Var.e0;
                if ((animatorSet != null && animatorSet.isRunning()) || ((valueAnimator = ft4Var.d0) != null && valueAnimator.isRunning())) {
                    ft4Var.j(ft4Var.M);
                    return;
                } else {
                    ft4Var.n();
                    return;
                }
            default:
                ft4Var.l();
                return;
        }
    }
}
