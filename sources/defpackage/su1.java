package defpackage;

import android.animation.ValueAnimator;
public final class su1 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final ih7 b;

    public su1(ih7 ih7Var, byte b) {
        this.a = b;
        this.b = ih7Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        ih7 ih7Var = this.b;
        switch (b) {
            case 0:
                ih7Var.q(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                ih7Var.q(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                ih7Var.q(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
