package ci;

import android.animation.ValueAnimator;
public final class u9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f5645a;
    public final v9 f5646b;

    public u9(v9 v9Var, int i10) {
        this.f5645a = i10;
        this.f5646b = v9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5645a) {
            case 0:
                v9.a(this.f5646b, valueAnimator);
                return;
            default:
                v9 v9Var = this.f5646b;
                v9Var.getClass();
                v9Var.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
