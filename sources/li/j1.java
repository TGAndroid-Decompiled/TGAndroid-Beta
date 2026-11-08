package li;

import android.animation.ValueAnimator;
public final class j1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f18654a;
    public final b2 f18655b;

    public j1(b2 b2Var, int i7) {
        this.f18654a = i7;
        this.f18655b = b2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f18654a) {
            case 0:
                b2 b2Var = this.f18655b;
                b2Var.getClass();
                b2Var.Q0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b2Var.k0();
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b2 b2Var2 = this.f18655b;
                b2Var2.I = floatValue;
                b2Var2.A0();
                b2Var2.P.setTranslationX(org.telegram.messenger.g0.W1(b2Var2.I, b2Var2.G[0] - b2Var2.H[0], 0));
                b2Var2.P.setTranslationY(org.telegram.messenger.g0.W1(b2Var2.I, b2Var2.G[1] - b2Var2.H[1], 0));
                b2Var2.O.invalidate();
                return;
        }
    }
}
