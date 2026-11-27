package defpackage;

import android.animation.ValueAnimator;
public final class aw7 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final dx7 b;

    public aw7(dx7 dx7Var, byte b) {
        this.a = b;
        this.b = dx7Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        dx7 dx7Var = this.b;
        switch (b) {
            case 0:
                dx7Var.d2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                dx7Var.d2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dx7Var.L1 = floatValue;
                dx7Var.J1.setTransitionProgress(floatValue);
                return;
        }
    }
}
