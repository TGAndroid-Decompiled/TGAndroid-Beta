package ei;

import android.animation.ValueAnimator;
public final class d2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f8292a;
    public final k3 f8293b;

    public d2(k3 k3Var, int i10) {
        this.f8292a = i10;
        this.f8293b = k3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f8292a) {
            case 0:
                k3 k3Var = this.f8293b;
                k3Var.getClass();
                k3Var.N0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k3Var.h();
                return;
            default:
                this.f8293b.f8452y.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
