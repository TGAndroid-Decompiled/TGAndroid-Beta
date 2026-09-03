package nh;

import android.animation.ValueAnimator;
public final class x1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f16035a;
    public final d4 f16036b;

    public x1(d4 d4Var, int i10) {
        this.f16035a = i10;
        this.f16036b = d4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f16035a) {
            case 0:
                d4 d4Var = this.f16036b;
                d4Var.getClass();
                d4Var.E2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d4Var.invalidate();
                return;
            case 1:
                d4 d4Var2 = this.f16036b;
                d4Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d4Var2.f15210q3 = floatValue;
                d4Var2.f15204o3.setTransitionProgress(floatValue);
                return;
            default:
                d4.Z(this.f16036b, valueAnimator);
                return;
        }
    }
}
