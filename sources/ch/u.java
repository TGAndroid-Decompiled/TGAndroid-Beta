package ch;

import android.animation.ValueAnimator;
public final class u implements ValueAnimator.AnimatorUpdateListener {
    public final int f5514a;
    public final b0 f5515b;

    public u(b0 b0Var, int i7) {
        this.f5514a = i7;
        this.f5515b = b0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5514a) {
            case 0:
                b0 b0Var = this.f5515b;
                b0Var.getClass();
                b0Var.f5289a.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f5515b.f5289a.invalidate();
                return;
        }
    }
}
