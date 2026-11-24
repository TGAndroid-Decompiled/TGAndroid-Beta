package defpackage;

import android.animation.ValueAnimator;
public final class pl1 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final mu1 b;
    public final uk1 c;

    public pl1(mu1 mu1Var, uk1 uk1Var, byte b) {
        this.a = b;
        this.b = mu1Var;
        this.c = uk1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        uk1 uk1Var = this.c;
        mu1 mu1Var = this.b;
        switch (b) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mu1Var.X9 = gl.L(30.0f) * floatValue;
                mu1Var.E7();
                uk1Var.setAlpha(floatValue);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mu1Var.X9 = gl.L(30.0f) * floatValue2;
                mu1Var.E7();
                mu1Var.G7();
                uk1Var.setAlpha(floatValue2);
                return;
        }
    }
}
