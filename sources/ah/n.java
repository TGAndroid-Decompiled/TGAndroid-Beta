package ah;

import android.animation.ValueAnimator;
public final class n implements ValueAnimator.AnimatorUpdateListener {
    public final int f642a;
    public final b0 f643b;

    public n(b0 b0Var, int i10) {
        this.f642a = i10;
        this.f643b = b0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f642a) {
            case 0:
                b0 b0Var = this.f643b;
                b0Var.f451w.setTranslationY((-((Float) valueAnimator.getAnimatedValue()).floatValue()) * b0Var.f445c.getMeasuredHeight());
                return;
            default:
                b0 b0Var2 = this.f643b;
                b0Var2.f451w.setTranslationY((-(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue())) * b0Var2.f445c.getMeasuredHeight());
                return;
        }
    }
}
