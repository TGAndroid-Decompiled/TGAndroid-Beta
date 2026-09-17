package di;

import android.animation.ValueAnimator;
public final class a5 implements ValueAnimator.AnimatorUpdateListener {
    public final int f6902a;
    public final q6 f6903b;

    public a5(q6 q6Var, int i10) {
        this.f6902a = i10;
        this.f6903b = q6Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f6902a) {
            case 0:
                q6 q6Var = this.f6903b;
                q6Var.getClass();
                q6Var.f7982p2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                q6 q6Var2 = this.f6903b;
                q6Var2.getClass();
                q6Var2.f7982p2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                q6 q6Var3 = this.f6903b;
                q6Var3.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q6Var3.f7955b2 = floatValue;
                q6Var3.Z1.setTransitionProgress(floatValue);
                return;
        }
    }
}
