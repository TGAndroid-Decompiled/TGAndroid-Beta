package di;

import android.animation.ValueAnimator;
public final class u9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f7902a;
    public final v9 f7903b;

    public u9(v9 v9Var, int i10) {
        this.f7902a = i10;
        this.f7903b = v9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f7902a) {
            case 0:
                v9.a(this.f7903b, valueAnimator);
                return;
            default:
                v9 v9Var = this.f7903b;
                v9Var.getClass();
                v9Var.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
