package defpackage;

import android.animation.ValueAnimator;
public final class iy0 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final ky0 b;

    public iy0(ky0 ky0Var, byte b) {
        this.a = b;
        this.b = ky0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i;
        byte b = this.a;
        ky0 ky0Var = this.b;
        switch (b) {
            case 0:
                my0 my0Var = ky0Var.H;
                my0Var.b.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                my0Var.e0();
                my0Var.n0(my0Var.b.getTranslationY());
                ky0Var.invalidate();
                return;
            case 1:
                my0 my0Var2 = ky0Var.H;
                dy0 dy0Var = my0Var2.c;
                if (dy0Var != null) {
                    dy0Var.invalidate();
                }
                my0Var2.e0();
                return;
            case 2:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ky0Var.E = floatValue;
                my0 my0Var3 = ky0Var.H;
                my0Var3.b.setTranslationX(floatValue);
                my0Var3.c.invalidate();
                return;
            case 3:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ky0Var.E = floatValue2;
                my0 my0Var4 = ky0Var.H;
                my0Var4.b.setTranslationX(floatValue2);
                my0Var4.c.invalidate();
                return;
            default:
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                my0 my0Var5 = ky0Var.H;
                hd hdVar = my0Var5.Z;
                if (my0Var5.p0) {
                    i = (int) (my0Var5.q0 * floatValue3);
                } else {
                    i = 0;
                }
                hdVar.setAlpha(i);
                return;
        }
    }
}
