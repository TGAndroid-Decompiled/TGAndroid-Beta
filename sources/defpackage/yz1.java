package defpackage;

import android.animation.ValueAnimator;
public final class yz1 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final n12 b;

    public yz1(n12 n12Var, byte b) {
        this.a = b;
        this.b = n12Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        n12 n12Var = this.b;
        switch (b) {
            case 0:
                n12Var.M1();
                return;
            case 1:
                n12Var.A2.invalidate();
                return;
            case 2:
                f12 f12Var = n12Var.v2;
                h42 h42Var = n12Var.q2;
                if (f12Var == h42Var && h42Var != null) {
                    h42Var.invalidate();
                    return;
                }
                return;
            case 3:
                n12Var.D0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ex0 ex0Var = n12Var.c;
                if (ex0Var != null) {
                    ex0Var.invalidate();
                    return;
                }
                return;
            case 4:
                n12Var.v1(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                n12Var.M1();
                return;
        }
    }
}
