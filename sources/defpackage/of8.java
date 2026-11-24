package defpackage;

import android.animation.ValueAnimator;
public final class of8 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final rf8 b;

    public of8(rf8 rf8Var, byte b) {
        this.a = b;
        this.b = rf8Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        rf8 rf8Var = this.b;
        switch (b) {
            case 0:
                rf8Var.b = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rf8Var.c(true);
                return;
            default:
                rf8Var.getClass();
                rf8Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rf8Var.c(true);
                return;
        }
    }
}
