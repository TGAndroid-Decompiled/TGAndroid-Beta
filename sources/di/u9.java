package di;

import android.animation.ValueAnimator;
public final class u9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f7905a;
    public final v9 f7906b;

    public u9(v9 v9Var, int i10) {
        this.f7905a = i10;
        this.f7906b = v9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f7905a) {
            case 0:
                v9.a(this.f7906b, valueAnimator);
                return;
            default:
                v9 v9Var = this.f7906b;
                v9Var.getClass();
                v9Var.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
