package ch;

import android.animation.ValueAnimator;
public final class t implements ValueAnimator.AnimatorUpdateListener {
    public final int f6396a;
    public final b0 f6397b;

    public t(b0 b0Var, int i7) {
        this.f6396a = i7;
        this.f6397b = b0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f6396a) {
            case 0:
                b0 b0Var = this.f6397b;
                b0Var.getClass();
                b0Var.f6181a.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f6397b.f6181a.invalidate();
                return;
        }
    }
}
