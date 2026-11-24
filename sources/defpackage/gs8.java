package defpackage;

import android.animation.ValueAnimator;
public final class gs8 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final js8 b;

    public gs8(js8 js8Var, byte b) {
        this.a = b;
        this.b = js8Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        js8 js8Var = this.b;
        switch (b) {
            case 0:
                js8Var.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                js8Var.e();
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                js8Var.R = floatValue;
                js8Var.r.setUseGyroscope(floatValue);
                return;
        }
    }
}
