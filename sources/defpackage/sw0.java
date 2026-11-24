package defpackage;

import android.animation.ValueAnimator;
public final class sw0 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final fx0 b;

    public sw0(fx0 fx0Var, byte b) {
        this.a = b;
        this.b = fx0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        fx0 fx0Var = this.b;
        switch (b) {
            case 0:
                fx0Var.D0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ww0 ww0Var = fx0Var.c;
                if (ww0Var != null) {
                    ww0Var.invalidate();
                    return;
                }
                return;
            case 1:
                fx0Var.e0();
                return;
            case 2:
                fx0Var.e0();
                return;
            case 3:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                fx0Var.w0(fx0Var.Y.intValue(), intValue, intValue);
                return;
            case 4:
                fx0Var.D0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ww0 ww0Var2 = fx0Var.c;
                if (ww0Var2 != null) {
                    ww0Var2.invalidate();
                    return;
                }
                return;
            case 5:
                fx0Var.e0();
                return;
            default:
                fx0Var.e0();
                return;
        }
    }
}
