package ei;

import android.animation.ValueAnimator;
public final class d2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f8280a;
    public final k3 f8281b;

    public d2(k3 k3Var, int i10) {
        this.f8280a = i10;
        this.f8281b = k3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f8280a) {
            case 0:
                k3 k3Var = this.f8281b;
                k3Var.getClass();
                k3Var.N0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k3Var.h();
                return;
            default:
                this.f8281b.f8440y.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
