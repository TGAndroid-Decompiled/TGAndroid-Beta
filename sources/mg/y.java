package mg;

import android.animation.ValueAnimator;
public final class y implements ValueAnimator.AnimatorUpdateListener {
    public final int f14153a;
    public final d0 f14154b;

    public y(d0 d0Var, int i10) {
        this.f14153a = i10;
        this.f14154b = d0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f14153a) {
            case 0:
                d0 d0Var = this.f14154b;
                d0Var.getClass();
                d0Var.f13960a.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                this.f14154b.f13960a.invalidate();
                return;
        }
    }
}
