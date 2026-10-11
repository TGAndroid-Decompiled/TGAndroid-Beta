package ci;

import android.animation.ValueAnimator;
public final class y4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f6349a;
    public final q6 f6350b;

    public y4(q6 q6Var, int i10) {
        this.f6349a = i10;
        this.f6350b = q6Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f6349a) {
            case 0:
                q6 q6Var = this.f6350b;
                q6Var.getClass();
                q6Var.f5818p2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                q6 q6Var2 = this.f6350b;
                q6Var2.getClass();
                q6Var2.f5818p2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                q6 q6Var3 = this.f6350b;
                q6Var3.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q6Var3.f5791b2 = floatValue;
                q6Var3.Z1.setTransitionProgress(floatValue);
                return;
        }
    }
}
