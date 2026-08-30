package mg;

import android.animation.ValueAnimator;
public final class y implements ValueAnimator.AnimatorUpdateListener {
    public final int f14165a;
    public final d0 f14166b;

    public y(d0 d0Var, int i10) {
        this.f14165a = i10;
        this.f14166b = d0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f14165a) {
            case 0:
                d0 d0Var = this.f14166b;
                d0Var.getClass();
                d0Var.f13972a.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f14166b.f13972a.invalidate();
                return;
        }
    }
}
