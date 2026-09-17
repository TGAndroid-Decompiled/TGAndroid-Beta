package fi;

import android.animation.ValueAnimator;
public final class d2 implements ValueAnimator.AnimatorUpdateListener {
    public final int f9619a;
    public final k3 f9620b;

    public d2(k3 k3Var, int i10) {
        this.f9619a = i10;
        this.f9620b = k3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f9619a) {
            case 0:
                k3 k3Var = this.f9620b;
                k3Var.getClass();
                k3Var.N0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k3Var.h();
                return;
            default:
                this.f9620b.f9791y.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
