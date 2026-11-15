package fi;

import android.animation.ValueAnimator;
public final class t8 implements ValueAnimator.AnimatorUpdateListener {
    public final int f12372a;
    public final w8 f12373b;

    public t8(w8 w8Var, int i7) {
        this.f12372a = i7;
        this.f12373b = w8Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f12372a) {
            case 0:
                i9 i9Var = this.f12373b.f12486s0;
                i9Var.Y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i9.i(i9Var);
                return;
            default:
                i9 i9Var2 = this.f12373b.f12486s0;
                i9Var2.X = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                i9.i(i9Var2);
                return;
        }
    }
}
