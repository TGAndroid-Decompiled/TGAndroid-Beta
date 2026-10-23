package ah;

import android.animation.ValueAnimator;
public final class n implements ValueAnimator.AnimatorUpdateListener {
    public final int f832a;
    public final a0 f833b;

    public n(a0 a0Var, int i10) {
        this.f832a = i10;
        this.f833b = a0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f832a) {
            case 0:
                a0 a0Var = this.f833b;
                a0Var.f646w.setTranslationY((-((Float) valueAnimator.getAnimatedValue()).floatValue()) * a0Var.f641c.getMeasuredHeight());
                return;
            default:
                a0 a0Var2 = this.f833b;
                a0Var2.f646w.setTranslationY((-(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue())) * a0Var2.f641c.getMeasuredHeight());
                return;
        }
    }
}
