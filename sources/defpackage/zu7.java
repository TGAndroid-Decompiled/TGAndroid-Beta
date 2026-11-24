package defpackage;

import android.animation.ValueAnimator;
public final class zu7 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final xv7 b;

    public zu7(xv7 xv7Var, byte b) {
        this.a = b;
        this.b = xv7Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        xv7 xv7Var = this.b;
        switch (b) {
            case 0:
                xv7Var.j2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                xv7Var.j2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xv7Var.R1 = floatValue;
                xv7Var.P1.setTransitionProgress(floatValue);
                return;
        }
    }
}
