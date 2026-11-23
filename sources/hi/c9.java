package hi;

import android.animation.ValueAnimator;
public final class c9 implements ValueAnimator.AnimatorUpdateListener {
    public final int f14278a;
    public final d9 f14279b;

    public c9(d9 d9Var, int i7) {
        this.f14278a = i7;
        this.f14279b = d9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f14278a) {
            case 0:
                d9.a(this.f14279b, valueAnimator);
                return;
            default:
                d9 d9Var = this.f14279b;
                d9Var.getClass();
                d9Var.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
