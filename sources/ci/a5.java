package ci;

import android.animation.ValueAnimator;
public final class a5 implements ValueAnimator.AnimatorUpdateListener {
    public final int f4350a;
    public final r6 f4351b;

    public a5(r6 r6Var, int i10) {
        this.f4350a = i10;
        this.f4351b = r6Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f4350a) {
            case 0:
                r6 r6Var = this.f4351b;
                r6Var.getClass();
                r6Var.f5438p2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                r6 r6Var2 = this.f4351b;
                r6Var2.getClass();
                r6Var2.f5438p2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                r6 r6Var3 = this.f4351b;
                r6Var3.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r6Var3.f5411b2 = floatValue;
                r6Var3.Z1.setTransitionProgress(floatValue);
                return;
        }
    }
}
