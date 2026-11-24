package defpackage;

import android.animation.ValueAnimator;
public final class gz1 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final x02 b;

    public gz1(x02 x02Var, byte b) {
        this.a = b;
        this.b = x02Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        x02 x02Var = this.b;
        switch (b) {
            case 0:
                x02Var.L1();
                return;
            case 1:
                x02Var.A2.invalidate();
                return;
            case 2:
                x02Var.D0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ww0 ww0Var = x02Var.c;
                if (ww0Var != null) {
                    ww0Var.invalidate();
                    return;
                }
                return;
            case 3:
                x02Var.u1(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 4:
                p02 p02Var = x02Var.v2;
                r32 r32Var = x02Var.q2;
                if (p02Var == r32Var && r32Var != null) {
                    r32Var.invalidate();
                    return;
                }
                return;
            default:
                x02Var.L1();
                return;
        }
    }
}
