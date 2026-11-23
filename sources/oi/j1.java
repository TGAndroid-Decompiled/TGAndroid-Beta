package oi;

import android.animation.ValueAnimator;
public final class j1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f22260a;
    public final b2 f22261b;

    public j1(b2 b2Var, int i7) {
        this.f22260a = i7;
        this.f22261b = b2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f22260a) {
            case 0:
                b2 b2Var = this.f22261b;
                b2Var.getClass();
                b2Var.R0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b2Var.k0();
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b2 b2Var2 = this.f22261b;
                b2Var2.J = floatValue;
                b2Var2.A0();
                b2Var2.Q.setTranslationX(org.telegram.messenger.g0.W1(b2Var2.J, b2Var2.H[0] - b2Var2.I[0], 0));
                b2Var2.Q.setTranslationY(org.telegram.messenger.g0.W1(b2Var2.J, b2Var2.H[1] - b2Var2.I[1], 0));
                b2Var2.P.invalidate();
                return;
        }
    }
}
