package ci;

import android.animation.ValueAnimator;
public final class u9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f6077a;
    public final v9 f6078b;

    public u9(v9 v9Var, int i10) {
        this.f6077a = i10;
        this.f6078b = v9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f6077a) {
            case 0:
                v9.a(this.f6078b, valueAnimator);
                return;
            default:
                v9 v9Var = this.f6078b;
                v9Var.getClass();
                v9Var.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
