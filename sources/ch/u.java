package ch;

import android.animation.ValueAnimator;
public final class u implements ValueAnimator.AnimatorUpdateListener {
    public final int f5519a;
    public final b0 f5520b;

    public u(b0 b0Var, int i7) {
        this.f5519a = i7;
        this.f5520b = b0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5519a) {
            case 0:
                b0 b0Var = this.f5520b;
                b0Var.getClass();
                b0Var.f5294a.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f5520b.f5294a.invalidate();
                return;
        }
    }
}
