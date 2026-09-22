package ai;

import android.animation.ValueAnimator;
public final class d3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f695a;
    public final f6 f696b;

    public d3(f6 f6Var, int i10) {
        this.f695a = i10;
        this.f696b = f6Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f695a) {
            case 0:
                f6 f6Var = this.f696b;
                f6Var.getClass();
                f6Var.H2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f6Var.invalidate();
                return;
            case 1:
                f6 f6Var2 = this.f696b;
                f6Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f6Var2.f853t3 = floatValue;
                f6Var2.f847r3.setTransitionProgress(floatValue);
                return;
            default:
                f6.Z(this.f696b, valueAnimator);
                return;
        }
    }
}
