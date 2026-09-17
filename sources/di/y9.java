package di;

import android.animation.ValueAnimator;
public final class y9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f8484a;
    public final z9 f8485b;

    public y9(z9 z9Var, int i10) {
        this.f8484a = i10;
        this.f8485b = z9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f8484a) {
            case 0:
                z9.a(this.f8485b, valueAnimator);
                return;
            default:
                z9 z9Var = this.f8485b;
                z9Var.getClass();
                z9Var.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
