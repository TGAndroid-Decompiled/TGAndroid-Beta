package bi;

import android.animation.ValueAnimator;
public final class r2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f3647a;
    public final o5 f3648b;

    public r2(o5 o5Var, int i10) {
        this.f3647a = i10;
        this.f3648b = o5Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f3647a) {
            case 0:
                o5 o5Var = this.f3648b;
                o5Var.getClass();
                o5Var.H2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o5Var.invalidate();
                return;
            case 1:
                o5 o5Var2 = this.f3648b;
                o5Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o5Var2.f3489t3 = floatValue;
                o5Var2.f3483r3.setTransitionProgress(floatValue);
                return;
            default:
                o5.Z(this.f3648b, valueAnimator);
                return;
        }
    }
}
