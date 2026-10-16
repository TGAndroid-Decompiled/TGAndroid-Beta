package bi;

import android.animation.ValueAnimator;
public final class s2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f3630a;
    public final q5 f3631b;

    public s2(q5 q5Var, int i10) {
        this.f3630a = i10;
        this.f3631b = q5Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f3630a) {
            case 0:
                q5 q5Var = this.f3631b;
                q5Var.getClass();
                q5Var.H2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q5Var.invalidate();
                return;
            case 1:
                q5 q5Var2 = this.f3631b;
                q5Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q5Var2.f3569t3 = floatValue;
                q5Var2.f3563r3.setTransitionProgress(floatValue);
                return;
            default:
                q5.Z(this.f3631b, valueAnimator);
                return;
        }
    }
}
