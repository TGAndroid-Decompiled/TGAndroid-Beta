package mi;

import android.animation.ValueAnimator;
public final class k1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f19719a;
    public final c2 f19720b;

    public k1(c2 c2Var, int i3) {
        this.f19719a = i3;
        this.f19720b = c2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f19719a) {
            case 0:
                c2 c2Var = this.f19720b;
                c2Var.getClass();
                c2Var.R0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c2Var.k0();
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c2 c2Var2 = this.f19720b;
                c2Var2.J = floatValue;
                c2Var2.A0();
                c2Var2.Q.setTranslationX(org.telegram.messenger.g0.W1(c2Var2.J, c2Var2.H[0] - c2Var2.I[0], 0));
                c2Var2.Q.setTranslationY(org.telegram.messenger.g0.W1(c2Var2.J, c2Var2.H[1] - c2Var2.I[1], 0));
                c2Var2.P.invalidate();
                return;
        }
    }
}
