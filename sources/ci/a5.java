package ci;

import android.animation.ValueAnimator;
public final class a5 implements ValueAnimator.AnimatorUpdateListener {
    public final int f4345a;
    public final r6 f4346b;

    public a5(r6 r6Var, int i10) {
        this.f4345a = i10;
        this.f4346b = r6Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f4345a) {
            case 0:
                r6 r6Var = this.f4346b;
                r6Var.getClass();
                r6Var.f5433p2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                r6 r6Var2 = this.f4346b;
                r6Var2.getClass();
                r6Var2.f5433p2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                r6 r6Var3 = this.f4346b;
                r6Var3.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r6Var3.f5406b2 = floatValue;
                r6Var3.Z1.setTransitionProgress(floatValue);
                return;
        }
    }
}
