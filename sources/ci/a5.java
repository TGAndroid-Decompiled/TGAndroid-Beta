package ci;

import android.animation.ValueAnimator;
public final class a5 implements ValueAnimator.AnimatorUpdateListener {
    public final int f4349a;
    public final r6 f4350b;

    public a5(r6 r6Var, int i10) {
        this.f4349a = i10;
        this.f4350b = r6Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f4349a) {
            case 0:
                r6 r6Var = this.f4350b;
                r6Var.getClass();
                r6Var.f5437p2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                r6 r6Var2 = this.f4350b;
                r6Var2.getClass();
                r6Var2.f5437p2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                r6 r6Var3 = this.f4350b;
                r6Var3.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r6Var3.f5410b2 = floatValue;
                r6Var3.Z1.setTransitionProgress(floatValue);
                return;
        }
    }
}
