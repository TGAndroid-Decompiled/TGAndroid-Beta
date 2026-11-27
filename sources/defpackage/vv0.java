package defpackage;

import android.animation.ValueAnimator;
public final class vv0 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final xw0 b;

    public vv0(xw0 xw0Var, byte b) {
        this.a = b;
        this.b = xw0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        xw0 xw0Var = this.b;
        switch (b) {
            case 0:
                xw0Var.S0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xw0Var.h();
                return;
            default:
                xw0Var.F.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
