package ei;

import android.animation.ValueAnimator;
public final class b2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f10117a;
    public final j4 f10118b;

    public b2(j4 j4Var, int i3) {
        this.f10117a = i3;
        this.f10118b = j4Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f10117a) {
            case 0:
                j4 j4Var = this.f10118b;
                j4Var.getClass();
                j4Var.f10500r2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j4Var.invalidate();
                return;
            case 1:
                j4 j4Var2 = this.f10118b;
                j4Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                j4Var2.f10451d3 = floatValue;
                j4Var2.f10446b3.setTransitionProgress(floatValue);
                return;
            default:
                j4.X(this.f10118b, valueAnimator);
                return;
        }
    }
}
