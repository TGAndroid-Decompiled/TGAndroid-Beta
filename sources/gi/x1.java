package gi;

import android.animation.ValueAnimator;
public final class x1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f11543a;
    public final d3 f11544b;

    public x1(d3 d3Var, int i10) {
        this.f11543a = i10;
        this.f11544b = d3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f11543a) {
            case 0:
                d3 d3Var = this.f11544b;
                d3Var.getClass();
                d3Var.N0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                d3Var.h();
                return;
            default:
                this.f11544b.f11168y.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
