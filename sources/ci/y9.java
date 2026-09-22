package ci;

import android.animation.ValueAnimator;
public final class y9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f5838a;
    public final z9 f5839b;

    public y9(z9 z9Var, int i10) {
        this.f5838a = i10;
        this.f5839b = z9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5838a) {
            case 0:
                z9.a(this.f5839b, valueAnimator);
                return;
            default:
                z9 z9Var = this.f5839b;
                z9Var.getClass();
                z9Var.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
