package di;

import android.animation.ValueAnimator;
public final class x1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f9922a;
    public final j4 f9923b;

    public x1(j4 j4Var, int i7) {
        this.f9922a = i7;
        this.f9923b = j4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f9922a) {
            case 0:
                j4 j4Var = this.f9923b;
                j4Var.getClass();
                j4Var.f9218q2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j4Var.invalidate();
                return;
            case 1:
                j4 j4Var2 = this.f9923b;
                j4Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j4Var2.f9170c3 = floatValue;
                j4Var2.f9164a3.setTransitionProgress(floatValue);
                return;
            default:
                j4.X(this.f9923b, valueAnimator);
                return;
        }
    }
}
