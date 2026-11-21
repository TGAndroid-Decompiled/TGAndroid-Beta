package ch;

import android.animation.ValueAnimator;
public final class u implements ValueAnimator.AnimatorUpdateListener {
    public final int f5548a;
    public final b0 f5549b;

    public u(b0 b0Var, int i7) {
        this.f5548a = i7;
        this.f5549b = b0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5548a) {
            case 0:
                b0 b0Var = this.f5549b;
                b0Var.getClass();
                b0Var.f5323a.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f5549b.f5323a.invalidate();
                return;
        }
    }
}
