package defpackage;

import android.animation.ValueAnimator;
public final class nh8 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final wh8 b;

    public nh8(wh8 wh8Var, byte b) {
        this.a = b;
        this.b = wh8Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        wh8 wh8Var = this.b;
        switch (b) {
            case 0:
                wh8Var.S.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                wh8Var.S.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
