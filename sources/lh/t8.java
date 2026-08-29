package lh;

import android.animation.ValueAnimator;
public final class t8 implements ValueAnimator.AnimatorUpdateListener {
    public final int f16273a;
    public final w8 f16274b;

    public t8(w8 w8Var, int i10) {
        this.f16273a = i10;
        this.f16274b = w8Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f16273a) {
            case 0:
                i9 i9Var = this.f16274b.E0;
                i9Var.T = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i9.k(i9Var);
                return;
            default:
                i9 i9Var2 = this.f16274b.E0;
                i9Var2.S = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i9.k(i9Var2);
                return;
        }
    }
}
