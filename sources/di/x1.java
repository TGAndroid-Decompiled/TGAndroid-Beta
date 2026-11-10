package di;

import android.animation.ValueAnimator;
public final class x1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f9927a;
    public final j4 f9928b;

    public x1(j4 j4Var, int i7) {
        this.f9927a = i7;
        this.f9928b = j4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f9927a) {
            case 0:
                j4 j4Var = this.f9928b;
                j4Var.getClass();
                j4Var.f9223q2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j4Var.invalidate();
                return;
            case 1:
                j4 j4Var2 = this.f9928b;
                j4Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j4Var2.f9175c3 = floatValue;
                j4Var2.f9169a3.setTransitionProgress(floatValue);
                return;
            default:
                j4.X(this.f9928b, valueAnimator);
                return;
        }
    }
}
