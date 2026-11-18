package ch;

import android.animation.ValueAnimator;
public final class u implements ValueAnimator.AnimatorUpdateListener {
    public final int f5522a;
    public final b0 f5523b;

    public u(b0 b0Var, int i7) {
        this.f5522a = i7;
        this.f5523b = b0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5522a) {
            case 0:
                b0 b0Var = this.f5523b;
                b0Var.getClass();
                b0Var.f5297a.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f5523b.f5297a.invalidate();
                return;
        }
    }
}
