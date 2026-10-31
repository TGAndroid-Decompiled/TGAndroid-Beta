package jg;

import android.animation.ValueAnimator;
public final class o implements ValueAnimator.AnimatorUpdateListener {
    public final int f10117a;
    public final r0 f10118b;

    public o(r0 r0Var, int i10) {
        this.f10117a = i10;
        this.f10118b = r0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f10117a) {
            case 0:
                r0 r0Var = this.f10118b;
                r0Var.getClass();
                r0Var.O1.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                r0 r0Var2 = this.f10118b;
                r0Var2.getClass();
                r0Var2.O1.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
