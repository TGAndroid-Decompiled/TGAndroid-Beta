package defpackage;

import android.animation.ValueAnimator;
public final class jx0 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final lx0 b;

    public jx0(lx0 lx0Var, byte b) {
        this.a = b;
        this.b = lx0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i;
        byte b = this.a;
        lx0 lx0Var = this.b;
        switch (b) {
            case 0:
                nx0 nx0Var = lx0Var.H;
                nx0Var.b.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                nx0Var.e0();
                nx0Var.n0(nx0Var.b.getTranslationY());
                lx0Var.invalidate();
                return;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lx0Var.E = floatValue;
                nx0 nx0Var2 = lx0Var.H;
                nx0Var2.b.setTranslationX(floatValue);
                nx0Var2.c.invalidate();
                return;
            case 2:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lx0Var.E = floatValue2;
                nx0 nx0Var3 = lx0Var.H;
                nx0Var3.b.setTranslationX(floatValue2);
                nx0Var3.c.invalidate();
                return;
            case 3:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                nx0 nx0Var4 = lx0Var.H;
                hc hcVar = nx0Var4.Z;
                if (nx0Var4.p0) {
                    i = (int) (nx0Var4.q0 * floatValue3);
                } else {
                    i = 0;
                }
                hcVar.setAlpha(i);
                return;
            default:
                nx0 nx0Var5 = lx0Var.H;
                ex0 ex0Var = nx0Var5.c;
                if (ex0Var != null) {
                    ex0Var.invalidate();
                }
                nx0Var5.e0();
                return;
        }
    }
}
