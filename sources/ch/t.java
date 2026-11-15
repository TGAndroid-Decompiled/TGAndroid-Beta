package ch;

import android.animation.ValueAnimator;
public final class t implements ValueAnimator.AnimatorUpdateListener {
    public final int f5233a;
    public final b0 f5234b;

    public t(b0 b0Var, int i7) {
        this.f5233a = i7;
        this.f5234b = b0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5233a) {
            case 0:
                b0 b0Var = this.f5234b;
                b0Var.getClass();
                b0Var.f5011a.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f5234b.f5011a.invalidate();
                return;
        }
    }
}
