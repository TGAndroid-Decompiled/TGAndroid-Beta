package defpackage;

import android.animation.ValueAnimator;
public final class ph3 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final nk3 b;

    public ph3(nk3 nk3Var, byte b) {
        this.a = b;
        this.b = nk3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        nk3 nk3Var = this.b;
        switch (b) {
            case 0:
                nk3Var.X4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                nk3Var.Z4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                nk3Var.T4(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
