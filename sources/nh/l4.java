package nh;

import android.animation.ValueAnimator;
public final class l4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f18042a;
    public final t5 f18043b;

    public l4(t5 t5Var, int i10) {
        this.f18042a = i10;
        this.f18043b = t5Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f18042a) {
            case 0:
                t5 t5Var = this.f18043b;
                t5Var.getClass();
                t5Var.f18644l2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                t5 t5Var2 = this.f18043b;
                t5Var2.getClass();
                t5Var2.f18644l2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                t5 t5Var3 = this.f18043b;
                t5Var3.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t5Var3.X1 = floatValue;
                t5Var3.V1.setTransitionProgress(floatValue);
                return;
        }
    }
}
