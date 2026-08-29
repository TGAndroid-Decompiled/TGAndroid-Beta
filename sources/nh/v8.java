package nh;

import android.animation.ValueAnimator;
public final class v8 implements ValueAnimator.AnimatorUpdateListener {
    public final int f18761a;
    public final w8 f18762b;

    public v8(w8 w8Var, int i10) {
        this.f18761a = i10;
        this.f18762b = w8Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f18761a) {
            case 0:
                w8.a(this.f18762b, valueAnimator);
                return;
            default:
                w8 w8Var = this.f18762b;
                w8Var.getClass();
                w8Var.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
