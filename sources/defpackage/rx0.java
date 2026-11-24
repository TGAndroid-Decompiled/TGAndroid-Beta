package defpackage;

import android.animation.ValueAnimator;
public final class rx0 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final yx0 b;

    public rx0(yx0 yx0Var, byte b) {
        this.a = b;
        this.b = yx0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        yx0 yx0Var = this.b;
        switch (b) {
            case 0:
                yx0Var.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yx0Var.invalidate();
                return;
            case 1:
                yx0Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            default:
                yx0Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yx0Var.invalidate();
                return;
        }
    }
}
