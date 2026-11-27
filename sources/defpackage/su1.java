package defpackage;

import android.animation.ValueAnimator;
public final class su1 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final hh7 b;

    public su1(hh7 hh7Var, byte b) {
        this.a = b;
        this.b = hh7Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        hh7 hh7Var = this.b;
        switch (b) {
            case 0:
                hh7Var.q(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                hh7Var.q(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                hh7Var.q(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
