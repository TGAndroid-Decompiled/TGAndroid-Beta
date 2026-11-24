package defpackage;

import android.animation.ValueAnimator;
public final class xx5 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final ry5 b;

    public xx5(ry5 ry5Var, byte b) {
        this.a = b;
        this.b = ry5Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        ry5 ry5Var = this.b;
        switch (b) {
            case 0:
                ry5Var.Z1.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                ry5Var.Z1.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
