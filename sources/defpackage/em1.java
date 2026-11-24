package defpackage;

import android.animation.ValueAnimator;
public final class em1 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final yv1 b;

    public em1(yv1 yv1Var, byte b) {
        this.a = b;
        this.b = yv1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        yv1 yv1Var = this.b;
        switch (b) {
            case 0:
                yv1Var.a9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mu1 mu1Var = yv1Var.m1;
                if (mu1Var != null) {
                    mu1Var.invalidate();
                    yv1Var.A0.invalidate();
                    return;
                }
                return;
            case 1:
                yv1Var.x3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yv1Var.Tc();
                return;
            case 2:
                yv1Var.x3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yv1Var.Tc();
                return;
            case 3:
                yv1Var.bb = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yv1Var.O7();
                return;
            default:
                yv1Var.bb = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yv1Var.O7();
                return;
        }
    }
}
