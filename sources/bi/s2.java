package bi;

import android.animation.ValueAnimator;
public final class s2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f3626a;
    public final q5 f3627b;

    public s2(q5 q5Var, int i10) {
        this.f3626a = i10;
        this.f3627b = q5Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f3626a) {
            case 0:
                q5 q5Var = this.f3627b;
                q5Var.getClass();
                q5Var.H2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q5Var.invalidate();
                return;
            case 1:
                q5 q5Var2 = this.f3627b;
                q5Var2.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q5Var2.f3565t3 = floatValue;
                q5Var2.f3559r3.setTransitionProgress(floatValue);
                return;
            default:
                q5.Z(this.f3627b, valueAnimator);
                return;
        }
    }
}
