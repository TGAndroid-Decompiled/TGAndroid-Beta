package defpackage;

import android.animation.ValueAnimator;
public final class ug3 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final uj3 b;

    public ug3(uj3 uj3Var, byte b) {
        this.a = b;
        this.b = uj3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        uj3 uj3Var = this.b;
        switch (b) {
            case 0:
                uj3Var.T4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                uj3Var.Z4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                uj3Var.X4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
