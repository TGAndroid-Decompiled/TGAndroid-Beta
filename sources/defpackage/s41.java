package defpackage;

import android.animation.ValueAnimator;
public final class s41 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final u41 b;

    public s41(u41 u41Var, byte b) {
        this.a = b;
        this.b = u41Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        u41 u41Var = this.b;
        switch (b) {
            case 0:
                u41Var.U = Math.max(1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue());
                u41Var.invalidate();
                return;
            case 1:
                u41Var.d0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u41Var.invalidate();
                return;
            case 2:
                u41Var.Q = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u41Var.invalidate();
                return;
            case 3:
                u41Var.getClass();
                u41Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u41Var.invalidate();
                return;
            default:
                u41Var.getClass();
                u41Var.L = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                u41Var.invalidate();
                return;
        }
    }
}
