package defpackage;

import android.animation.ValueAnimator;
public final class gl8 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final kl8 b;

    public gl8(kl8 kl8Var, byte b) {
        this.a = b;
        this.b = kl8Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        kl8 kl8Var = this.b;
        switch (b) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kl8Var.I2.getLayoutParams().height = hl.U1(floatValue, kl8Var.J2[0].getHeight(), kl8Var.J2[1].getHeight());
                kl8Var.I2.requestLayout();
                return;
            default:
                kl8Var.B2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                kl8Var.c.invalidate();
                return;
        }
    }
}
