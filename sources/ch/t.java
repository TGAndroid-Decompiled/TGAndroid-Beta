package ch;

import android.animation.ValueAnimator;
public final class t implements ValueAnimator.AnimatorUpdateListener {
    public final int f6398a;
    public final b0 f6399b;

    public t(b0 b0Var, int i7) {
        this.f6398a = i7;
        this.f6399b = b0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f6398a) {
            case 0:
                b0 b0Var = this.f6399b;
                b0Var.getClass();
                b0Var.f6183a.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f6399b.f6183a.invalidate();
                return;
        }
    }
}
