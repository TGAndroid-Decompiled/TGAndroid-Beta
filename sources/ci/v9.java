package ci;

import android.animation.ValueAnimator;
public final class v9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f5680a;
    public final w9 f5681b;

    public v9(w9 w9Var, int i10) {
        this.f5680a = i10;
        this.f5681b = w9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5680a) {
            case 0:
                w9.a(this.f5681b, valueAnimator);
                return;
            default:
                w9 w9Var = this.f5681b;
                w9Var.getClass();
                w9Var.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
