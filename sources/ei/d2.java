package ei;

import android.animation.ValueAnimator;
public final class d2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f8282a;
    public final k3 f8283b;

    public d2(k3 k3Var, int i10) {
        this.f8282a = i10;
        this.f8283b = k3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f8282a) {
            case 0:
                k3 k3Var = this.f8283b;
                k3Var.getClass();
                k3Var.N0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k3Var.h();
                return;
            default:
                this.f8283b.f8442y.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
