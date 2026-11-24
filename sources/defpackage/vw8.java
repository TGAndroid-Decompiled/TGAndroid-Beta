package defpackage;

import android.animation.ValueAnimator;
public final class vw8 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final ww8 b;

    public vw8(ww8 ww8Var, byte b) {
        this.a = b;
        this.b = ww8Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        ww8 ww8Var = this.b;
        switch (b) {
            case 0:
                ww8Var.v = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hg3 hg3Var = ww8Var.H;
                if (hg3Var != null) {
                    hg3Var.invalidate();
                }
                rm0 rm0Var = ww8Var.I;
                if (rm0Var != null) {
                    rm0Var.invalidate();
                    return;
                }
                return;
            case 1:
                ww8Var.w = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hg3 hg3Var2 = ww8Var.H;
                if (hg3Var2 != null) {
                    hg3Var2.invalidate();
                }
                rm0 rm0Var2 = ww8Var.I;
                if (rm0Var2 != null) {
                    rm0Var2.invalidate();
                    return;
                }
                return;
            case 2:
                ww8Var.p = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hg3 hg3Var3 = ww8Var.H;
                if (hg3Var3 != null) {
                    hg3Var3.invalidate();
                    return;
                }
                return;
            case 3:
                ww8Var.o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hg3 hg3Var4 = ww8Var.H;
                if (hg3Var4 != null) {
                    hg3Var4.invalidate();
                    return;
                }
                return;
            case 4:
                ww8Var.x = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hg3 hg3Var5 = ww8Var.H;
                if (hg3Var5 != null) {
                    hg3Var5.invalidate();
                    return;
                }
                return;
            case 5:
                ww8Var.getClass();
                ww8Var.e(((Float) valueAnimator.getAnimatedValue()).floatValue());
                hg3 hg3Var6 = ww8Var.H;
                if (hg3Var6 != null) {
                    hg3Var6.invalidate();
                    return;
                }
                return;
            case 6:
                ww8Var.getClass();
                ww8Var.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ww8Var.F = true;
                hg3 hg3Var7 = ww8Var.H;
                if (hg3Var7 != null) {
                    hg3Var7.invalidate();
                    return;
                }
                return;
            default:
                ww8Var.getClass();
                ww8Var.D = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ww8Var.F = false;
                hg3 hg3Var8 = ww8Var.H;
                if (hg3Var8 != null) {
                    hg3Var8.invalidate();
                    return;
                }
                return;
        }
    }
}
