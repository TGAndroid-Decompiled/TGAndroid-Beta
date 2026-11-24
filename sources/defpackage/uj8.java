package defpackage;

import android.animation.ValueAnimator;
public final class uj8 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final yj8 b;

    public uj8(yj8 yj8Var, byte b) {
        this.a = b;
        this.b = yj8Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        yj8 yj8Var = this.b;
        switch (b) {
            case 0:
                yj8Var.B2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yj8Var.c.invalidate();
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yj8Var.I2.getLayoutParams().height = gm.U1(floatValue, yj8Var.J2[0].getHeight(), yj8Var.J2[1].getHeight());
                yj8Var.I2.requestLayout();
                return;
        }
    }
}
