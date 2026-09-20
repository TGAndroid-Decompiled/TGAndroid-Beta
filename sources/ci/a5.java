package ci;

import android.animation.ValueAnimator;
public final class a5 implements ValueAnimator.AnimatorUpdateListener {
    public final int f4351a;
    public final r6 f4352b;

    public a5(r6 r6Var, int i10) {
        this.f4351a = i10;
        this.f4352b = r6Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f4351a) {
            case 0:
                r6 r6Var = this.f4352b;
                r6Var.getClass();
                r6Var.f5439p2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                r6 r6Var2 = this.f4352b;
                r6Var2.getClass();
                r6Var2.f5439p2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                r6 r6Var3 = this.f4352b;
                r6Var3.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r6Var3.f5412b2 = floatValue;
                r6Var3.Z1.setTransitionProgress(floatValue);
                return;
        }
    }
}
