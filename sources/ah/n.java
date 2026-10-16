package ah;

import android.animation.ValueAnimator;
public final class n implements ValueAnimator.AnimatorUpdateListener {
    public final int f831a;
    public final a0 f832b;

    public n(a0 a0Var, int i10) {
        this.f831a = i10;
        this.f832b = a0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f831a) {
            case 0:
                a0 a0Var = this.f832b;
                a0Var.f646w.setTranslationY((-((Float) valueAnimator.getAnimatedValue()).floatValue()) * a0Var.f641c.getMeasuredHeight());
                return;
            default:
                a0 a0Var2 = this.f832b;
                a0Var2.f646w.setTranslationY((-(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue())) * a0Var2.f641c.getMeasuredHeight());
                return;
        }
    }
}
