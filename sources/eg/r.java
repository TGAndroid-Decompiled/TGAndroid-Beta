package eg;

import android.animation.ValueAnimator;
public final class r implements ValueAnimator.AnimatorUpdateListener {
    public final int f5449a;
    public final c1 f5450b;

    public r(c1 c1Var, int i10) {
        this.f5449a = i10;
        this.f5450b = c1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5449a) {
            case 0:
                c1 c1Var = this.f5450b;
                c1Var.getClass();
                c1Var.f5105c2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                c1 c1Var2 = this.f5450b;
                c1Var2.getClass();
                c1Var2.f5105c2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
