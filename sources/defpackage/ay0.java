package defpackage;

import android.animation.ValueAnimator;
public final class ay0 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final my0 b;

    public ay0(my0 my0Var, byte b) {
        this.a = b;
        this.b = my0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        my0 my0Var = this.b;
        switch (b) {
            case 0:
                my0Var.D0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dy0 dy0Var = my0Var.c;
                if (dy0Var != null) {
                    dy0Var.invalidate();
                    return;
                }
                return;
            case 1:
                my0Var.e0();
                return;
            case 2:
                my0Var.e0();
                return;
            case 3:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                my0Var.w0(my0Var.Y.intValue(), intValue, intValue);
                return;
            case 4:
                my0Var.D0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dy0 dy0Var2 = my0Var.c;
                if (dy0Var2 != null) {
                    dy0Var2.invalidate();
                    return;
                }
                return;
            case 5:
                my0Var.e0();
                return;
            default:
                my0Var.e0();
                return;
        }
    }
}
