package bi;

import android.animation.ValueAnimator;
public final class q1 implements ValueAnimator.AnimatorUpdateListener {
    public final int f3291a;
    public final k2 f3292b;

    public q1(k2 k2Var, int i10) {
        this.f3291a = i10;
        this.f3292b = k2Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f3291a) {
            case 0:
                k2 k2Var = this.f3292b;
                k2Var.getClass();
                k2Var.Q0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k2Var.j0();
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k2 k2Var2 = this.f3292b;
                k2Var2.I = floatValue;
                k2Var2.z0();
                k2Var2.P.setTranslationX(org.telegram.messenger.i0.W1(k2Var2.I, k2Var2.G[0] - k2Var2.H[0], 0));
                k2Var2.P.setTranslationY(org.telegram.messenger.i0.W1(k2Var2.I, k2Var2.G[1] - k2Var2.H[1], 0));
                k2Var2.O.invalidate();
                return;
        }
    }
}
