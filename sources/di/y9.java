package di;

import android.animation.ValueAnimator;
public final class y9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f8512a;
    public final z9 f8513b;

    public y9(z9 z9Var, int i10) {
        this.f8512a = i10;
        this.f8513b = z9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f8512a) {
            case 0:
                z9.a(this.f8513b, valueAnimator);
                return;
            default:
                z9 z9Var = this.f8513b;
                z9Var.getClass();
                z9Var.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
