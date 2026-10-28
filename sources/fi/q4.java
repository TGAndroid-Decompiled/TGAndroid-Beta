package fi;

import android.animation.ValueAnimator;
public final class q4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f11483a;
    public final e6 f11484b;

    public q4(e6 e6Var, int i10) {
        this.f11483a = i10;
        this.f11484b = e6Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f11483a) {
            case 0:
                e6 e6Var = this.f11484b;
                e6Var.getClass();
                e6Var.f10786e2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                e6 e6Var2 = this.f11484b;
                e6Var2.getClass();
                e6Var2.f10786e2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                e6 e6Var3 = this.f11484b;
                e6Var3.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e6Var3.Q1 = floatValue;
                e6Var3.O1.setTransitionProgress(floatValue);
                return;
        }
    }
}
