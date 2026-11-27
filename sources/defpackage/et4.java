package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
public final class et4 implements Runnable {
    public final byte a;
    public final it4 b;

    public et4(it4 it4Var, byte b) {
        this.a = b;
        this.b = it4Var;
    }

    @Override
    public final void run() {
        ValueAnimator valueAnimator;
        byte b = this.a;
        it4 it4Var = this.b;
        switch (b) {
            case 0:
                AnimatorSet animatorSet = it4Var.e0;
                if ((animatorSet != null && animatorSet.isRunning()) || ((valueAnimator = it4Var.d0) != null && valueAnimator.isRunning())) {
                    it4Var.j(it4Var.M);
                    return;
                } else {
                    it4Var.n();
                    return;
                }
            default:
                it4Var.l();
                return;
        }
    }
}
