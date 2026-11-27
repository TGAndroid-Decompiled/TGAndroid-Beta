package defpackage;

import android.animation.ValueAnimator;
public final class bx0 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final nx0 b;

    public bx0(nx0 nx0Var, byte b) {
        this.a = b;
        this.b = nx0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        nx0 nx0Var = this.b;
        switch (b) {
            case 0:
                nx0Var.D0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ex0 ex0Var = nx0Var.c;
                if (ex0Var != null) {
                    ex0Var.invalidate();
                    return;
                }
                return;
            case 1:
                nx0Var.e0();
                return;
            case 2:
                nx0Var.D0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ex0 ex0Var2 = nx0Var.c;
                if (ex0Var2 != null) {
                    ex0Var2.invalidate();
                    return;
                }
                return;
            case 3:
                nx0Var.e0();
                return;
            case 4:
                nx0Var.e0();
                return;
            case 5:
                nx0Var.e0();
                return;
            default:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                nx0Var.x0(nx0Var.Y.intValue(), intValue, intValue);
                return;
        }
    }
}
