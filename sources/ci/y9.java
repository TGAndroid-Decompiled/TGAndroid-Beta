package ci;

import android.animation.ValueAnimator;
public final class y9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f5834a;
    public final z9 f5835b;

    public y9(z9 z9Var, int i10) {
        this.f5834a = i10;
        this.f5835b = z9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5834a) {
            case 0:
                z9.a(this.f5835b, valueAnimator);
                return;
            default:
                z9 z9Var = this.f5835b;
                z9Var.getClass();
                z9Var.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
