package defpackage;

import android.animation.ValueAnimator;
public final class t02 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final i22 b;

    public t02(i22 i22Var, byte b) {
        this.a = b;
        this.b = i22Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        i22 i22Var = this.b;
        switch (b) {
            case 0:
                i22Var.L1();
                return;
            case 1:
                i22Var.A2.invalidate();
                return;
            case 2:
                i22Var.D0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dy0 dy0Var = i22Var.c;
                if (dy0Var != null) {
                    dy0Var.invalidate();
                    return;
                }
                return;
            case 3:
                i22Var.u1(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                a22 a22Var = i22Var.v2;
                c52 c52Var = i22Var.q2;
                if (a22Var == c52Var && c52Var != null) {
                    c52Var.invalidate();
                    return;
                }
                return;
            default:
                i22Var.L1();
                return;
        }
    }
}
