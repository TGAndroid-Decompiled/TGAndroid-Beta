package dg;

import android.animation.ValueAnimator;
public final class s implements ValueAnimator.AnimatorUpdateListener {
    public final int f4778a;
    public final e1 f4779b;

    public s(e1 e1Var, int i10) {
        this.f4778a = i10;
        this.f4779b = e1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f4778a) {
            case 0:
                e1 e1Var = this.f4779b;
                e1Var.getClass();
                e1Var.f4462c2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                e1 e1Var2 = this.f4779b;
                e1Var2.getClass();
                e1Var2.f4462c2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
