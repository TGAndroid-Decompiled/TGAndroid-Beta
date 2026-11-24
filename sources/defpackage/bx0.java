package defpackage;

import android.animation.ValueAnimator;
public final class bx0 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final dx0 b;

    public bx0(dx0 dx0Var, byte b) {
        this.a = b;
        this.b = dx0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i;
        byte b = this.a;
        dx0 dx0Var = this.b;
        switch (b) {
            case 0:
                fx0 fx0Var = dx0Var.H;
                fx0Var.b.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                fx0Var.e0();
                fx0Var.n0(fx0Var.b.getTranslationY());
                dx0Var.invalidate();
                return;
            case 1:
                fx0 fx0Var2 = dx0Var.H;
                ww0 ww0Var = fx0Var2.c;
                if (ww0Var != null) {
                    ww0Var.invalidate();
                }
                fx0Var2.e0();
                return;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dx0Var.E = floatValue;
                fx0 fx0Var3 = dx0Var.H;
                fx0Var3.b.setTranslationX(floatValue);
                fx0Var3.c.invalidate();
                return;
            case 3:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dx0Var.E = floatValue2;
                fx0 fx0Var4 = dx0Var.H;
                fx0Var4.b.setTranslationX(floatValue2);
                fx0Var4.c.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fx0 fx0Var5 = dx0Var.H;
                gc gcVar = fx0Var5.Z;
                if (fx0Var5.p0) {
                    i = (int) (fx0Var5.q0 * floatValue3);
                } else {
                    i = 0;
                }
                gcVar.setAlpha(i);
                return;
        }
    }
}
