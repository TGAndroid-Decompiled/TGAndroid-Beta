package ci;

import android.animation.ValueAnimator;
public final class v9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f6161a;
    public final w9 f6162b;

    public v9(w9 w9Var, int i10) {
        this.f6161a = i10;
        this.f6162b = w9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f6161a) {
            case 0:
                w9.a(this.f6162b, valueAnimator);
                return;
            default:
                w9 w9Var = this.f6162b;
                w9Var.getClass();
                w9Var.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
