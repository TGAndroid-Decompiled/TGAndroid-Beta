package defpackage;

import android.animation.ValueAnimator;
public final class cy5 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final wy5 b;

    public cy5(wy5 wy5Var, byte b) {
        this.a = b;
        this.b = wy5Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        wy5 wy5Var = this.b;
        switch (b) {
            case 0:
                wy5Var.T1.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                wy5Var.T1.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
