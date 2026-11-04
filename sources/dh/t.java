package dh;

import android.animation.ValueAnimator;
public final class t implements ValueAnimator.AnimatorUpdateListener {
    public final int f9153a;
    public final a0 f9154b;

    public t(a0 a0Var, int i3) {
        this.f9153a = i3;
        this.f9154b = a0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f9153a) {
            case 0:
                a0 a0Var = this.f9154b;
                a0Var.getClass();
                a0Var.f8931a.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f9154b.f8931a.invalidate();
                return;
        }
    }
}
