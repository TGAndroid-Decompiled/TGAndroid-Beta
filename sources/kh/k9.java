package kh;

import android.animation.ValueAnimator;
public final class k9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f15550a;
    public final l9 f15551b;

    public k9(l9 l9Var, int i9) {
        this.f15550a = i9;
        this.f15551b = l9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f15550a) {
            case 0:
                l9.a(this.f15551b, valueAnimator);
                return;
            default:
                l9 l9Var = this.f15551b;
                l9Var.getClass();
                l9Var.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
