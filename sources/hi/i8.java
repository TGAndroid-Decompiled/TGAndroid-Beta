package hi;

import android.animation.ValueAnimator;
public final class i8 implements ValueAnimator.AnimatorUpdateListener {
    public final int f14770a;
    public final j8 f14771b;

    public i8(j8 j8Var, int i7) {
        this.f14770a = i7;
        this.f14771b = j8Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f14770a) {
            case 0:
                j8.a(this.f14771b, valueAnimator);
                return;
            default:
                j8 j8Var = this.f14771b;
                j8Var.getClass();
                j8Var.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
