package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
public final class ar4 implements Runnable {
    public final byte a;
    public final er4 b;

    public ar4(er4 er4Var, byte b) {
        this.a = b;
        this.b = er4Var;
    }

    @Override
    public final void run() {
        ValueAnimator valueAnimator;
        byte b = this.a;
        er4 er4Var = this.b;
        switch (b) {
            case 0:
                AnimatorSet animatorSet = er4Var.e0;
                if ((animatorSet != null && animatorSet.isRunning()) || ((valueAnimator = er4Var.d0) != null && valueAnimator.isRunning())) {
                    er4Var.j(er4Var.M);
                    return;
                } else {
                    er4Var.n();
                    return;
                }
            default:
                er4Var.l();
                return;
        }
    }
}
