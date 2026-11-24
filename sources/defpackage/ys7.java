package defpackage;

import android.animation.ValueAnimator;
public final class ys7 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final wt7 b;

    public ys7(wt7 wt7Var, byte b) {
        this.a = b;
        this.b = wt7Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        wt7 wt7Var = this.b;
        switch (b) {
            case 0:
                wt7Var.j2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                wt7Var.j2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wt7Var.R1 = floatValue;
                wt7Var.P1.setTransitionProgress(floatValue);
                return;
        }
    }
}
