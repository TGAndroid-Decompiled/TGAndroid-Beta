package lh;

import android.animation.ValueAnimator;

public final class q4 implements ValueAnimator.AnimatorUpdateListener {

    public final int f16555a;

    public final f6 f16556b;

    public q4(f6 f6Var, int i10) {
        this.f16555a = i10;
        this.f16556b = f6Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f16555a) {
            case 0:
                f6 f6Var = this.f16556b;
                f6Var.getClass();
                f6Var.f15979l2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            case 1:
                f6 f6Var2 = this.f16556b;
                f6Var2.getClass();
                f6Var2.f15979l2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                break;
            default:
                f6 f6Var3 = this.f16556b;
                f6Var3.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f6Var3.X1 = fFloatValue;
                f6Var3.V1.setTransitionProgress(fFloatValue);
                break;
        }
    }
}
