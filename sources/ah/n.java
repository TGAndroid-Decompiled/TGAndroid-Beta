package ah;

import android.animation.ValueAnimator;
public final class n implements ValueAnimator.AnimatorUpdateListener {
    public final int f833a;
    public final a0 f834b;

    public n(a0 a0Var, int i10) {
        this.f833a = i10;
        this.f834b = a0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f833a) {
            case 0:
                a0 a0Var = this.f834b;
                a0Var.f648w.setTranslationY((-((Float) valueAnimator.getAnimatedValue()).floatValue()) * a0Var.f643c.getMeasuredHeight());
                return;
            default:
                a0 a0Var2 = this.f834b;
                a0Var2.f648w.setTranslationY((-(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue())) * a0Var2.f643c.getMeasuredHeight());
                return;
        }
    }
}
