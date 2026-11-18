package oi;

import android.animation.ValueAnimator;
public final class h1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f22080a;
    public final z1 f22081b;

    public h1(z1 z1Var, int i7) {
        this.f22080a = i7;
        this.f22081b = z1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f22080a) {
            case 0:
                z1 z1Var = this.f22081b;
                z1Var.getClass();
                z1Var.R0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z1Var.k0();
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                z1 z1Var2 = this.f22081b;
                z1Var2.J = floatValue;
                z1Var2.A0();
                z1Var2.Q.setTranslationX(org.telegram.messenger.g0.W1(z1Var2.J, z1Var2.H[0] - z1Var2.I[0], 0));
                z1Var2.Q.setTranslationY(org.telegram.messenger.g0.W1(z1Var2.J, z1Var2.H[1] - z1Var2.I[1], 0));
                z1Var2.P.invalidate();
                return;
        }
    }
}
