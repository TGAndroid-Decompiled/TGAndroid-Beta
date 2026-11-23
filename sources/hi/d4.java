package hi;

import android.animation.ValueAnimator;
public final class d4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f14354a;
    public final l5 f14355b;

    public d4(l5 l5Var, int i7) {
        this.f14354a = i7;
        this.f14355b = l5Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f14354a) {
            case 0:
                l5 l5Var = this.f14355b;
                l5Var.getClass();
                l5Var.Z1.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                l5 l5Var2 = this.f14355b;
                l5Var2.getClass();
                l5Var2.Z1.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                l5 l5Var3 = this.f14355b;
                l5Var3.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l5Var3.L1 = floatValue;
                l5Var3.J1.setTransitionProgress(floatValue);
                return;
        }
    }
}
