package hi;

import android.animation.ValueAnimator;
public final class n4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f15008a;
    public final v5 f15009b;

    public n4(v5 v5Var, int i7) {
        this.f15008a = i7;
        this.f15009b = v5Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f15008a) {
            case 0:
                v5 v5Var = this.f15009b;
                v5Var.getClass();
                v5Var.d2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                v5 v5Var2 = this.f15009b;
                v5Var2.getClass();
                v5Var2.d2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                v5 v5Var3 = this.f15009b;
                v5Var3.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                v5Var3.L1 = floatValue;
                v5Var3.J1.setTransitionProgress(floatValue);
                return;
        }
    }
}
