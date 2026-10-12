package ah;

import android.animation.ValueAnimator;
public final class n implements ValueAnimator.AnimatorUpdateListener {
    public final int f827a;
    public final a0 f828b;

    public n(a0 a0Var, int i10) {
        this.f827a = i10;
        this.f828b = a0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f827a) {
            case 0:
                a0 a0Var = this.f828b;
                a0Var.f642w.setTranslationY((-((Float) valueAnimator.getAnimatedValue()).floatValue()) * a0Var.f637c.getMeasuredHeight());
                return;
            default:
                a0 a0Var2 = this.f828b;
                a0Var2.f642w.setTranslationY((-(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue())) * a0Var2.f637c.getMeasuredHeight());
                return;
        }
    }
}
