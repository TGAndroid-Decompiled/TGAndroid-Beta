package defpackage;

import android.animation.ValueAnimator;
public final class uu8 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final vu8 b;

    public uu8(vu8 vu8Var, byte b) {
        this.a = b;
        this.b = vu8Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        vu8 vu8Var = this.b;
        switch (b) {
            case 0:
                vu8Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ue3 ue3Var = vu8Var.H;
                if (ue3Var != null) {
                    ue3Var.invalidate();
                }
                rl0 rl0Var = vu8Var.I;
                if (rl0Var != null) {
                    rl0Var.invalidate();
                    return;
                }
                return;
            case 1:
                vu8Var.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ue3 ue3Var2 = vu8Var.H;
                if (ue3Var2 != null) {
                    ue3Var2.invalidate();
                }
                rl0 rl0Var2 = vu8Var.I;
                if (rl0Var2 != null) {
                    rl0Var2.invalidate();
                    return;
                }
                return;
            case 2:
                vu8Var.p = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ue3 ue3Var3 = vu8Var.H;
                if (ue3Var3 != null) {
                    ue3Var3.invalidate();
                    return;
                }
                return;
            case 3:
                vu8Var.o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ue3 ue3Var4 = vu8Var.H;
                if (ue3Var4 != null) {
                    ue3Var4.invalidate();
                    return;
                }
                return;
            case 4:
                vu8Var.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ue3 ue3Var5 = vu8Var.H;
                if (ue3Var5 != null) {
                    ue3Var5.invalidate();
                    return;
                }
                return;
            case 5:
                vu8Var.getClass();
                vu8Var.e(((Float) valueAnimator.getAnimatedValue()).floatValue());
                ue3 ue3Var6 = vu8Var.H;
                if (ue3Var6 != null) {
                    ue3Var6.invalidate();
                    return;
                }
                return;
            case 6:
                vu8Var.getClass();
                vu8Var.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vu8Var.F = true;
                ue3 ue3Var7 = vu8Var.H;
                if (ue3Var7 != null) {
                    ue3Var7.invalidate();
                    return;
                }
                return;
            default:
                vu8Var.getClass();
                vu8Var.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                vu8Var.F = false;
                ue3 ue3Var8 = vu8Var.H;
                if (ue3Var8 != null) {
                    ue3Var8.invalidate();
                    return;
                }
                return;
        }
    }
}
