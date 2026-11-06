package fi;

import android.animation.ValueAnimator;
public final class h4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f12131a;
    public final o5 f12132b;

    public h4(o5 o5Var, int i7) {
        this.f12131a = i7;
        this.f12132b = o5Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f12131a) {
            case 0:
                o5 o5Var = this.f12132b;
                o5Var.getClass();
                o5Var.Y1.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 1:
                o5 o5Var2 = this.f12132b;
                o5Var2.getClass();
                o5Var2.Y1.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                o5 o5Var3 = this.f12132b;
                o5Var3.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o5Var3.K1 = floatValue;
                o5Var3.I1.setTransitionProgress(floatValue);
                return;
        }
    }
}
