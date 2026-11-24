package defpackage;

import android.animation.ValueAnimator;
public final class zd8 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final ie8 b;

    public zd8(ie8 ie8Var, byte b) {
        this.a = b;
        this.b = ie8Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        ie8 ie8Var = this.b;
        switch (b) {
            case 0:
                ie8Var.S.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                ie8Var.S.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
