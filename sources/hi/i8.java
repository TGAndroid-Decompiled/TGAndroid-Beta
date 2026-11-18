package hi;

import android.animation.ValueAnimator;
public final class i8 implements ValueAnimator.AnimatorUpdateListener {
    public final int f14773a;
    public final j8 f14774b;

    public i8(j8 j8Var, int i7) {
        this.f14773a = i7;
        this.f14774b = j8Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f14773a) {
            case 0:
                j8.a(this.f14774b, valueAnimator);
                return;
            default:
                j8 j8Var = this.f14774b;
                j8Var.getClass();
                j8Var.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
