package jh;

import android.animation.ValueAnimator;

public final class t8 implements ValueAnimator.AnimatorUpdateListener {

    public final int f14006a;

    public final w8 f14007b;

    public t8(w8 w8Var, int i10) {
        this.f14006a = i10;
        this.f14007b = w8Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f14006a) {
            case 0:
                i9 i9Var = this.f14007b.E0;
                i9Var.T = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i9.k(i9Var);
                break;
            default:
                i9 i9Var2 = this.f14007b.E0;
                i9Var2.S = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i9.k(i9Var2);
                break;
        }
    }
}
