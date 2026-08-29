package bg;

import android.animation.ValueAnimator;
public final class t implements ValueAnimator.AnimatorUpdateListener {
    public final int f2529a;
    public final g1 f2530b;

    public t(g1 g1Var, int i10) {
        this.f2529a = i10;
        this.f2530b = g1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f2529a) {
            case 0:
                g1 g1Var = this.f2530b;
                g1Var.getClass();
                g1Var.f2226b2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                g1 g1Var2 = this.f2530b;
                g1Var2.getClass();
                g1Var2.f2226b2.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
