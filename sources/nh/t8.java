package nh;

import android.animation.ValueAnimator;
public final class t8 implements ValueAnimator.AnimatorUpdateListener {
    public final int f15922a;
    public final w8 f15923b;

    public t8(w8 w8Var, int i10) {
        this.f15922a = i10;
        this.f15923b = w8Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f15922a) {
            case 0:
                i9 i9Var = this.f15923b.F0;
                i9Var.U = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i9.k(i9Var);
                return;
            default:
                i9 i9Var2 = this.f15923b.F0;
                i9Var2.T = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i9.k(i9Var2);
                return;
        }
    }
}
