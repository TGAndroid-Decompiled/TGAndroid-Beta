package defpackage;

import android.animation.ValueAnimator;
public final class yy0 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final fz0 b;

    public yy0(fz0 fz0Var, byte b) {
        this.a = b;
        this.b = fz0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        fz0 fz0Var = this.b;
        switch (b) {
            case 0:
                fz0Var.W = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fz0Var.invalidate();
                return;
            case 1:
                fz0Var.M = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                return;
            default:
                fz0Var.e = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fz0Var.invalidate();
                return;
        }
    }
}
