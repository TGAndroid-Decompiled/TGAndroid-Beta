package defpackage;

import android.animation.ValueAnimator;
public final class ml1 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final zu1 b;
    public final dl1 c;

    public ml1(zu1 zu1Var, dl1 dl1Var, byte b) {
        this.a = b;
        this.b = zu1Var;
        this.c = dl1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        dl1 dl1Var = this.c;
        zu1 zu1Var = this.b;
        switch (b) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zu1Var.X9 = hl.L(30.0f) * floatValue;
                zu1Var.O7();
                dl1Var.setAlpha(floatValue);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                zu1Var.X9 = hl.L(30.0f) * floatValue2;
                zu1Var.O7();
                zu1Var.Q7();
                dl1Var.setAlpha(floatValue2);
                return;
        }
    }
}
