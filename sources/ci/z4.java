package ci;

import android.animation.ValueAnimator;
public final class z4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f6369a;
    public final q6 f6370b;

    public z4(q6 q6Var, int i10) {
        this.f6369a = i10;
        this.f6370b = q6Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f6369a) {
            case 0:
                q6 q6Var = this.f6370b;
                q6Var.getClass();
                q6Var.f5774p2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                q6 q6Var2 = this.f6370b;
                q6Var2.getClass();
                q6Var2.f5774p2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                q6 q6Var3 = this.f6370b;
                q6Var3.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q6Var3.f5747b2 = floatValue;
                q6Var3.Z1.setTransitionProgress(floatValue);
                return;
        }
    }
}
