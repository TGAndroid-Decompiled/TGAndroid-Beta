package ci;

import android.animation.ValueAnimator;
public final class y9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f5836a;
    public final z9 f5837b;

    public y9(z9 z9Var, int i10) {
        this.f5836a = i10;
        this.f5837b = z9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5836a) {
            case 0:
                z9.a(this.f5837b, valueAnimator);
                return;
            default:
                z9 z9Var = this.f5837b;
                z9Var.getClass();
                z9Var.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
