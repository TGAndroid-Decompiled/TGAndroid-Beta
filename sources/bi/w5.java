package bi;

import android.animation.ValueAnimator;
public final class w5 implements ValueAnimator.AnimatorUpdateListener {
    public final int f3827a;
    public final r7 f3828b;

    public w5(r7 r7Var, int i10) {
        this.f3827a = i10;
        this.f3828b = r7Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f3827a) {
            case 0:
                r7 r7Var = this.f3828b;
                r7Var.getClass();
                r7Var.f3529p2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                r7 r7Var2 = this.f3828b;
                r7Var2.getClass();
                r7Var2.f3529p2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                r7 r7Var3 = this.f3828b;
                r7Var3.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r7Var3.f3502b2 = floatValue;
                r7Var3.Z1.setTransitionProgress(floatValue);
                return;
        }
    }
}
