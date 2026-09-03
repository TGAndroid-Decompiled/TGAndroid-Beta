package ng;

import android.animation.ValueAnimator;
public final class y implements ValueAnimator.AnimatorUpdateListener {
    public final int f16241a;
    public final d0 f16242b;

    public y(d0 d0Var, int i10) {
        this.f16241a = i10;
        this.f16242b = d0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f16241a) {
            case 0:
                d0 d0Var = this.f16242b;
                d0Var.getClass();
                d0Var.f16035a.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f16242b.f16035a.invalidate();
                return;
        }
    }
}
