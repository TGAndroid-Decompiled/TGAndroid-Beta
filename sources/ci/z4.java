package ci;

import android.animation.ValueAnimator;
public final class z4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f5922a;
    public final q6 f5923b;

    public z4(q6 q6Var, int i10) {
        this.f5922a = i10;
        this.f5923b = q6Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5922a) {
            case 0:
                q6 q6Var = this.f5923b;
                q6Var.getClass();
                q6Var.f5369p2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                q6 q6Var2 = this.f5923b;
                q6Var2.getClass();
                q6Var2.f5369p2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                q6 q6Var3 = this.f5923b;
                q6Var3.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q6Var3.f5342b2 = floatValue;
                q6Var3.Z1.setTransitionProgress(floatValue);
                return;
        }
    }
}
