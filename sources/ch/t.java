package ch;

import android.animation.ValueAnimator;
public final class t implements ValueAnimator.AnimatorUpdateListener {
    public final int f5230a;
    public final b0 f5231b;

    public t(b0 b0Var, int i7) {
        this.f5230a = i7;
        this.f5231b = b0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5230a) {
            case 0:
                b0 b0Var = this.f5231b;
                b0Var.getClass();
                b0Var.f5008a.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f5231b.f5008a.invalidate();
                return;
        }
    }
}
