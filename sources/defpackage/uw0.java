package defpackage;

import android.animation.ValueAnimator;
public final class uw0 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final wx0 b;

    public uw0(wx0 wx0Var, byte b) {
        this.a = b;
        this.b = wx0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        wx0 wx0Var = this.b;
        switch (b) {
            case 0:
                wx0Var.S0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wx0Var.h();
                return;
            default:
                wx0Var.F.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
