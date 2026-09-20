package ci;

import android.animation.ValueAnimator;
public final class y9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f5840a;
    public final z9 f5841b;

    public y9(z9 z9Var, int i10) {
        this.f5840a = i10;
        this.f5841b = z9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5840a) {
            case 0:
                z9.a(this.f5841b, valueAnimator);
                return;
            default:
                z9 z9Var = this.f5841b;
                z9Var.getClass();
                z9Var.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
