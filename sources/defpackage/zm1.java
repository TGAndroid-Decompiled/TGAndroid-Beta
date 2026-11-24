package defpackage;

import android.animation.ValueAnimator;
public final class zm1 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final yv1 b;
    public final cm1 c;

    public zm1(yv1 yv1Var, cm1 cm1Var, byte b) {
        this.a = b;
        this.b = yv1Var;
        this.c = cm1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        cm1 cm1Var = this.c;
        yv1 yv1Var = this.b;
        switch (b) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yv1Var.X9 = gm.L(30.0f) * floatValue;
                yv1Var.O7();
                cm1Var.setAlpha(floatValue);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yv1Var.X9 = gm.L(30.0f) * floatValue2;
                yv1Var.O7();
                yv1Var.Q7();
                cm1Var.setAlpha(floatValue2);
                return;
        }
    }
}
