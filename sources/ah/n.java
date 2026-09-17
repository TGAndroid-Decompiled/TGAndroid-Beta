package ah;

import android.animation.ValueAnimator;
public final class n implements ValueAnimator.AnimatorUpdateListener {
    public final int f654a;
    public final b0 f655b;

    public n(b0 b0Var, int i10) {
        this.f654a = i10;
        this.f655b = b0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f654a) {
            case 0:
                b0 b0Var = this.f655b;
                b0Var.f463w.setTranslationY((-((Float) valueAnimator.getAnimatedValue()).floatValue()) * b0Var.f457c.getMeasuredHeight());
                return;
            default:
                b0 b0Var2 = this.f655b;
                b0Var2.f463w.setTranslationY((-(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue())) * b0Var2.f457c.getMeasuredHeight());
                return;
        }
    }
}
