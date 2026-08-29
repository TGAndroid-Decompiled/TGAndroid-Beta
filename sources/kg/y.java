package kg;

import android.animation.ValueAnimator;
public final class y implements ValueAnimator.AnimatorUpdateListener {
    public final int f13886a;
    public final d0 f13887b;

    public y(d0 d0Var, int i10) {
        this.f13886a = i10;
        this.f13887b = d0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f13886a) {
            case 0:
                d0 d0Var = this.f13887b;
                d0Var.getClass();
                d0Var.f13681a.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f13887b.f13681a.invalidate();
                return;
        }
    }
}
