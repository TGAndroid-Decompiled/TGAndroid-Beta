package defpackage;

import android.animation.ValueAnimator;
public final class hu8 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final ku8 b;

    public hu8(ku8 ku8Var, byte b) {
        this.a = b;
        this.b = ku8Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        ku8 ku8Var = this.b;
        switch (b) {
            case 0:
                ku8Var.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ku8Var.e();
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ku8Var.R = floatValue;
                ku8Var.r.setUseGyroscope(floatValue);
                return;
        }
    }
}
