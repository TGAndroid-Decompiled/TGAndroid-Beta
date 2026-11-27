package defpackage;

import android.animation.ValueAnimator;
public final class dy8 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final ey8 b;

    public dy8(ey8 ey8Var, byte b) {
        this.a = b;
        this.b = ey8Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        ey8 ey8Var = this.b;
        switch (b) {
            case 0:
                ey8Var.p = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                of3 of3Var = ey8Var.H;
                if (of3Var != null) {
                    of3Var.invalidate();
                    return;
                }
                return;
            case 1:
                ey8Var.o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                of3 of3Var2 = ey8Var.H;
                if (of3Var2 != null) {
                    of3Var2.invalidate();
                    return;
                }
                return;
            case 2:
                ey8Var.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                of3 of3Var3 = ey8Var.H;
                if (of3Var3 != null) {
                    of3Var3.invalidate();
                    return;
                }
                return;
            case 3:
                ey8Var.getClass();
                ey8Var.e(((Float) valueAnimator.getAnimatedValue()).floatValue());
                of3 of3Var4 = ey8Var.H;
                if (of3Var4 != null) {
                    of3Var4.invalidate();
                    return;
                }
                return;
            case 4:
                ey8Var.getClass();
                ey8Var.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ey8Var.F = true;
                of3 of3Var5 = ey8Var.H;
                if (of3Var5 != null) {
                    of3Var5.invalidate();
                    return;
                }
                return;
            case 5:
                ey8Var.getClass();
                ey8Var.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ey8Var.F = false;
                of3 of3Var6 = ey8Var.H;
                if (of3Var6 != null) {
                    of3Var6.invalidate();
                    return;
                }
                return;
            case 6:
                ey8Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                of3 of3Var7 = ey8Var.H;
                if (of3Var7 != null) {
                    of3Var7.invalidate();
                }
                sl0 sl0Var = ey8Var.I;
                if (sl0Var != null) {
                    sl0Var.invalidate();
                    return;
                }
                return;
            default:
                ey8Var.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                of3 of3Var8 = ey8Var.H;
                if (of3Var8 != null) {
                    of3Var8.invalidate();
                }
                sl0 sl0Var2 = ey8Var.I;
                if (sl0Var2 != null) {
                    sl0Var2.invalidate();
                    return;
                }
                return;
        }
    }
}
