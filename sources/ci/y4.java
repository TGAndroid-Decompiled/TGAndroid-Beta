package ci;

import android.animation.ValueAnimator;
public final class y4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f6350a;
    public final q6 f6351b;

    public y4(q6 q6Var, int i10) {
        this.f6350a = i10;
        this.f6351b = q6Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f6350a) {
            case 0:
                q6 q6Var = this.f6351b;
                q6Var.getClass();
                q6Var.f5819p2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                q6 q6Var2 = this.f6351b;
                q6Var2.getClass();
                q6Var2.f5819p2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                q6 q6Var3 = this.f6351b;
                q6Var3.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q6Var3.f5792b2 = floatValue;
                q6Var3.Z1.setTransitionProgress(floatValue);
                return;
        }
    }
}
