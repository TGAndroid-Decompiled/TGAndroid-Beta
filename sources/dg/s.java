package dg;

import android.animation.ValueAnimator;
public final class s implements ValueAnimator.AnimatorUpdateListener {
    public final int f4784a;
    public final e1 f4785b;

    public s(e1 e1Var, int i10) {
        this.f4784a = i10;
        this.f4785b = e1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f4784a) {
            case 0:
                e1 e1Var = this.f4785b;
                e1Var.getClass();
                e1Var.f4468c2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                e1 e1Var2 = this.f4785b;
                e1Var2.getClass();
                e1Var2.f4468c2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
