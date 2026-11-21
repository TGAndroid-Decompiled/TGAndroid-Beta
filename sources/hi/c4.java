package hi;

import android.animation.ValueAnimator;
public final class c4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f14327a;
    public final k5 f14328b;

    public c4(k5 k5Var, int i7) {
        this.f14327a = i7;
        this.f14328b = k5Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f14327a) {
            case 0:
                k5 k5Var = this.f14328b;
                k5Var.getClass();
                k5Var.Z1.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                k5 k5Var2 = this.f14328b;
                k5Var2.getClass();
                k5Var2.Z1.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                k5 k5Var3 = this.f14328b;
                k5Var3.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k5Var3.L1 = floatValue;
                k5Var3.J1.setTransitionProgress(floatValue);
                return;
        }
    }
}
