package oi;

import android.animation.ValueAnimator;
public final class i1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f22129a;
    public final a2 f22130b;

    public i1(a2 a2Var, int i7) {
        this.f22129a = i7;
        this.f22130b = a2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f22129a) {
            case 0:
                a2 a2Var = this.f22130b;
                a2Var.getClass();
                a2Var.R0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a2Var.k0();
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a2 a2Var2 = this.f22130b;
                a2Var2.J = floatValue;
                a2Var2.A0();
                a2Var2.Q.setTranslationX(org.telegram.messenger.g0.W1(a2Var2.J, a2Var2.H[0] - a2Var2.I[0], 0));
                a2Var2.Q.setTranslationY(org.telegram.messenger.g0.W1(a2Var2.J, a2Var2.H[1] - a2Var2.I[1], 0));
                a2Var2.P.invalidate();
                return;
        }
    }
}
