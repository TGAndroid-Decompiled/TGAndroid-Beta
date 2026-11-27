package defpackage;

import android.animation.ValueAnimator;
public final class ql1 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final zu1 b;

    public ql1(zu1 zu1Var, byte b) {
        this.a = b;
        this.b = zu1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        zu1 zu1Var = this.b;
        switch (b) {
            case 0:
                zu1Var.x3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zu1Var.Tc();
                return;
            case 1:
                zu1Var.bb = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zu1Var.O7();
                return;
            case 2:
                zu1Var.bb = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zu1Var.O7();
                return;
            case 3:
                zu1Var.x3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zu1Var.Tc();
                return;
            default:
                zu1Var.a9 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nt1 nt1Var = zu1Var.m1;
                if (nt1Var != null) {
                    nt1Var.invalidate();
                    zu1Var.A0.invalidate();
                    return;
                }
                return;
        }
    }
}
