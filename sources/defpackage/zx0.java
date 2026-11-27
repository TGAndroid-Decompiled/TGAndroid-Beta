package defpackage;

import android.animation.ValueAnimator;
public final class zx0 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final gy0 b;

    public zx0(gy0 gy0Var, byte b) {
        this.a = b;
        this.b = gy0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        gy0 gy0Var = this.b;
        switch (b) {
            case 0:
                gy0Var.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gy0Var.invalidate();
                return;
            case 1:
                gy0Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            default:
                gy0Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                gy0Var.invalidate();
                return;
        }
    }
}
