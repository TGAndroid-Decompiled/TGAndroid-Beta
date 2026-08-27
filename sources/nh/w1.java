package nh;

import android.animation.ValueAnimator;

public final class w1 implements ValueAnimator.AnimatorUpdateListener {

    public final int f19019a;

    public final b3 f19020b;

    public w1(b3 b3Var, int i10) {
        this.f19019a = i10;
        this.f19020b = b3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f19019a) {
            case 0:
                b3 b3Var = this.f19020b;
                b3Var.getClass();
                b3Var.J0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b3Var.h();
                break;
            default:
                this.f19020b.f18601y.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
        }
    }
}
