package ci;

import android.animation.ValueAnimator;
public final class v9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f6160a;
    public final w9 f6161b;

    public v9(w9 w9Var, int i10) {
        this.f6160a = i10;
        this.f6161b = w9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f6160a) {
            case 0:
                w9.a(this.f6161b, valueAnimator);
                return;
            default:
                w9 w9Var = this.f6161b;
                w9Var.getClass();
                w9Var.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
