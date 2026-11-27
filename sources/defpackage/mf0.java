package defpackage;

import android.animation.ValueAnimator;
public final class mf0 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final pf0 b;

    public mf0(pf0 pf0Var, byte b) {
        this.a = b;
        this.b = pf0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        pf0 pf0Var = this.b;
        switch (b) {
            case 0:
                pf0Var.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pf0Var.I = true;
                pf0Var.invalidate();
                return;
            case 1:
                pf0Var.l0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pf0Var.I = true;
                pf0Var.invalidate();
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                pf0Var.w0 = floatValue;
                pf0Var.u0.setAlpha(floatValue);
                pf0Var.invalidate();
                return;
        }
    }
}
