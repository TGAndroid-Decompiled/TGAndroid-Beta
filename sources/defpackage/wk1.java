package defpackage;

import android.animation.ValueAnimator;
public final class wk1 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final mu1 b;

    public wk1(mu1 mu1Var, byte b) {
        this.a = b;
        this.b = mu1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        mu1 mu1Var = this.b;
        switch (b) {
            case 0:
                mu1Var.a9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                at1 at1Var = mu1Var.m1;
                if (at1Var != null) {
                    at1Var.invalidate();
                    mu1Var.A0.invalidate();
                    return;
                }
                return;
            case 1:
                mu1Var.x3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mu1Var.Fc();
                return;
            case 2:
                mu1Var.x3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mu1Var.Fc();
                return;
            case 3:
                mu1Var.bb = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mu1Var.E7();
                return;
            default:
                mu1Var.bb = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mu1Var.E7();
                return;
        }
    }
}
