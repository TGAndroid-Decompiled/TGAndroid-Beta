package defpackage;

import android.animation.ValueAnimator;
public final class rv1 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final ah7 b;

    public rv1(ah7 ah7Var, byte b) {
        this.a = b;
        this.b = ah7Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        ah7 ah7Var = this.b;
        switch (b) {
            case 0:
                ah7Var.q(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                ah7Var.q(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                ah7Var.q(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
