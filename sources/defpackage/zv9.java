package defpackage;

import android.animation.ValueAnimator;
public final class zv9 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final tx9 b;
    public final boolean c;

    public zv9(tx9 tx9Var, boolean z, byte b) {
        this.a = b;
        this.b = tx9Var;
        this.c = z;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        boolean z = this.c;
        tx9 tx9Var = this.b;
        switch (b) {
            case 0:
                rw9 rw9Var = tx9Var.i0;
                hw9 hw9Var = tx9Var.j0;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!z) {
                    floatValue = 1.0f - floatValue;
                }
                float f = 1.0f - floatValue;
                rw9Var.setAlpha(f);
                rw9Var.setTranslationY(gl.L(8.0f) * floatValue);
                hw9Var.setAlpha(floatValue);
                hw9Var.setTranslationY(gl.L(8.0f) * f);
                tx9Var.k0.setAlpha(hw9Var.getAlpha() * floatValue);
                return;
            default:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (!z) {
                    floatValue2 = 1.0f - floatValue2;
                }
                tx9Var.k0.setAlpha(tx9Var.j0.getAlpha() * floatValue2);
                return;
        }
    }
}
