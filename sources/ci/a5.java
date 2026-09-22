package ci;

import android.animation.ValueAnimator;
public final class a5 implements ValueAnimator.AnimatorUpdateListener {
    public final int f4347a;
    public final r6 f4348b;

    public a5(r6 r6Var, int i10) {
        this.f4347a = i10;
        this.f4348b = r6Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f4347a) {
            case 0:
                r6 r6Var = this.f4348b;
                r6Var.getClass();
                r6Var.f5435p2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                r6 r6Var2 = this.f4348b;
                r6Var2.getClass();
                r6Var2.f5435p2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                r6 r6Var3 = this.f4348b;
                r6Var3.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r6Var3.f5408b2 = floatValue;
                r6Var3.Z1.setTransitionProgress(floatValue);
                return;
        }
    }
}
