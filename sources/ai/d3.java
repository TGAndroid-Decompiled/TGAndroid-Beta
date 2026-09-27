package ai;

import android.animation.ValueAnimator;
public final class d3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f707a;
    public final e6 f708b;

    public d3(e6 e6Var, int i10) {
        this.f707a = i10;
        this.f708b = e6Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f707a) {
            case 0:
                e6 e6Var = this.f708b;
                e6Var.getClass();
                e6Var.H2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e6Var.invalidate();
                return;
            case 1:
                e6 e6Var2 = this.f708b;
                e6Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e6Var2.f832t3 = floatValue;
                e6Var2.f826r3.setTransitionProgress(floatValue);
                return;
            default:
                e6.Z(this.f708b, valueAnimator);
                return;
        }
    }
}
