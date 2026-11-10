package ch;

import android.animation.ValueAnimator;
public final class t implements ValueAnimator.AnimatorUpdateListener {
    public final int f6401a;
    public final b0 f6402b;

    public t(b0 b0Var, int i7) {
        this.f6401a = i7;
        this.f6402b = b0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f6401a) {
            case 0:
                b0 b0Var = this.f6402b;
                b0Var.getClass();
                b0Var.f6186a.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f6402b.f6186a.invalidate();
                return;
        }
    }
}
