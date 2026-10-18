package gi;

import android.animation.ValueAnimator;
public final class x1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f11542a;
    public final d3 f11543b;

    public x1(d3 d3Var, int i10) {
        this.f11542a = i10;
        this.f11543b = d3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f11542a) {
            case 0:
                d3 d3Var = this.f11543b;
                d3Var.getClass();
                d3Var.N0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d3Var.h();
                return;
            default:
                this.f11543b.f11167y.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
