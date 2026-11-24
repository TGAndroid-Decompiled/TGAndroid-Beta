package defpackage;

import android.animation.ValueAnimator;
public final class kg0 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final ng0 b;

    public kg0(ng0 ng0Var, byte b) {
        this.a = b;
        this.b = ng0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        ng0 ng0Var = this.b;
        switch (b) {
            case 0:
                ng0Var.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ng0Var.I = true;
                ng0Var.invalidate();
                return;
            case 1:
                ng0Var.l0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ng0Var.I = true;
                ng0Var.invalidate();
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ng0Var.w0 = floatValue;
                ng0Var.u0.setAlpha(floatValue);
                ng0Var.invalidate();
                return;
        }
    }
}
