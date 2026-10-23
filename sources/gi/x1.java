package gi;

import android.animation.ValueAnimator;
public final class x1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f11568a;
    public final d3 f11569b;

    public x1(d3 d3Var, int i10) {
        this.f11568a = i10;
        this.f11569b = d3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f11568a) {
            case 0:
                d3 d3Var = this.f11569b;
                d3Var.getClass();
                d3Var.R0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d3Var.h();
                return;
            default:
                this.f11569b.E.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
