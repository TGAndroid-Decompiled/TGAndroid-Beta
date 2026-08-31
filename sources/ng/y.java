package ng;

import android.animation.ValueAnimator;
public final class y implements ValueAnimator.AnimatorUpdateListener {
    public final int f16239a;
    public final d0 f16240b;

    public y(d0 d0Var, int i10) {
        this.f16239a = i10;
        this.f16240b = d0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f16239a) {
            case 0:
                d0 d0Var = this.f16240b;
                d0Var.getClass();
                d0Var.f16033a.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f16240b.f16033a.invalidate();
                return;
        }
    }
}
