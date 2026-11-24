package defpackage;

import android.animation.ValueAnimator;
public final class cg3 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final cj3 b;

    public cg3(cj3 cj3Var, byte b) {
        this.a = b;
        this.b = cj3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        cj3 cj3Var = this.b;
        switch (b) {
            case 0:
                cj3Var.T4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                cj3Var.V4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                cj3Var.P4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
