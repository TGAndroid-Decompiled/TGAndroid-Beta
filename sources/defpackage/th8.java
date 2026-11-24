package defpackage;

import android.animation.ValueAnimator;
public final class th8 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final xh8 b;

    public th8(xh8 xh8Var, byte b) {
        this.a = b;
        this.b = xh8Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        xh8 xh8Var = this.b;
        switch (b) {
            case 0:
                xh8Var.B2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xh8Var.c.invalidate();
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xh8Var.I2.getLayoutParams().height = gl.U1(floatValue, xh8Var.J2[0].getHeight(), xh8Var.J2[1].getHeight());
                xh8Var.I2.requestLayout();
                return;
        }
    }
}
