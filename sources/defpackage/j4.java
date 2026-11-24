package defpackage;

import android.animation.ValueAnimator;
public final class j4 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final n4 b;

    public j4(n4 n4Var, byte b) {
        this.a = b;
        this.b = n4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        n4 n4Var = this.b;
        switch (b) {
            case 0:
                n4Var.K = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n4Var.invalidate();
                n4Var.P = null;
                return;
            case 1:
                n4Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n4Var.invalidate();
                n4Var.Q = null;
                return;
            default:
                n4Var.a0.b(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
        }
    }
}
