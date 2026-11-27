package defpackage;

import android.animation.ValueAnimator;
public final class nv8 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final sv8 b;

    public nv8(sv8 sv8Var, byte b) {
        this.a = b;
        this.b = sv8Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        sv8 sv8Var = this.b;
        switch (b) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sv8Var.R = floatValue;
                sv8Var.r.setUseGyroscope(floatValue);
                return;
            default:
                sv8Var.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sv8Var.e();
                return;
        }
    }
}
