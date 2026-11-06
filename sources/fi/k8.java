package fi;

import android.animation.ValueAnimator;
public final class k8 implements ValueAnimator.AnimatorUpdateListener {
    public final int f12276a;
    public final l8 f12277b;

    public k8(l8 l8Var, int i7) {
        this.f12276a = i7;
        this.f12277b = l8Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f12276a) {
            case 0:
                l8.a(this.f12277b, valueAnimator);
                return;
            default:
                l8 l8Var = this.f12277b;
                l8Var.getClass();
                l8Var.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
