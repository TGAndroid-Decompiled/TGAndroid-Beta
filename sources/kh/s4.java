package kh;

import android.animation.ValueAnimator;
public final class s4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f16029a;
    public final g6 f16030b;

    public s4(g6 g6Var, int i9) {
        this.f16029a = i9;
        this.f16030b = g6Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f16029a) {
            case 0:
                g6 g6Var = this.f16030b;
                g6Var.getClass();
                g6Var.f15289l2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                g6 g6Var2 = this.f16030b;
                g6Var2.getClass();
                g6Var2.f15289l2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                g6 g6Var3 = this.f16030b;
                g6Var3.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g6Var3.X1 = floatValue;
                g6Var3.V1.setTransitionProgress(floatValue);
                return;
        }
    }
}
