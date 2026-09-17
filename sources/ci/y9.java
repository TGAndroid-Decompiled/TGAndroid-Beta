package ci;

import android.animation.ValueAnimator;
public final class y9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f5839a;
    public final z9 f5840b;

    public y9(z9 z9Var, int i10) {
        this.f5839a = i10;
        this.f5840b = z9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5839a) {
            case 0:
                z9.a(this.f5840b, valueAnimator);
                return;
            default:
                z9 z9Var = this.f5840b;
                z9Var.getClass();
                z9Var.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
