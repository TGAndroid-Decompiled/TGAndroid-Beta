package defpackage;

import android.animation.ValueAnimator;
public final class kf0 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final nf0 b;

    public kf0(nf0 nf0Var, byte b) {
        this.a = b;
        this.b = nf0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        nf0 nf0Var = this.b;
        switch (b) {
            case 0:
                nf0Var.k0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nf0Var.I = true;
                nf0Var.invalidate();
                return;
            case 1:
                nf0Var.l0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nf0Var.I = true;
                nf0Var.invalidate();
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nf0Var.w0 = floatValue;
                nf0Var.u0.setAlpha(floatValue);
                nf0Var.invalidate();
                return;
        }
    }
}
