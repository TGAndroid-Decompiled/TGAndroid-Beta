package defpackage;

import android.animation.ValueAnimator;
public final class ef3 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final of3 b;

    public ef3(of3 of3Var, byte b) {
        this.a = b;
        this.b = of3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        of3 of3Var = this.b;
        switch (b) {
            case 0:
                of3Var.W3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                of3Var.invalidate();
                return;
            case 1:
                of3Var.X3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                of3Var.invalidate();
                return;
            default:
                of3Var.z4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                of3Var.invalidate();
                return;
        }
    }
}
