package defpackage;

import android.animation.ValueAnimator;
import org.telegram.messenger.Utilities;
public final class h34 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final l34 b;

    public h34(l34 l34Var, byte b) {
        this.a = b;
        this.b = l34Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        l34 l34Var = this.b;
        switch (b) {
            case 0:
                l34Var.g(gl.Z1(l34Var.N, l34Var.k0, l34Var.S.getAnimatedFraction()));
                return;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l34Var.p0 = floatValue;
                l34Var.setAlpha(floatValue);
                k34 k34Var = l34Var.J;
                if (k34Var != null) {
                    k34Var.setScaleX(Utilities.i(l34Var.p0 * 1.25f, 1.0f, 0.0f) * gl.R1(0.9f, 1.0f, l34Var.l0));
                    l34Var.J.setScaleY(Utilities.i(l34Var.p0 * 1.25f, 1.0f, 0.0f) * gl.R1(0.9f, 1.0f, l34Var.l0));
                    l34Var.J.setAlpha(Math.max(0.0f, l34Var.p0 - 0.8f) * l34Var.l0 * 5.0f);
                }
                l34Var.invalidate();
                return;
            case 2:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l34Var.l0 = floatValue2;
                k34 k34Var2 = l34Var.J;
                if (k34Var2 != null) {
                    k34Var2.setScaleX(Utilities.i(l34Var.p0 * 1.25f, 1.0f, 0.0f) * gl.R1(0.9f, 1.0f, floatValue2));
                    l34Var.J.setScaleY(Utilities.i(l34Var.p0 * 1.25f, 1.0f, 0.0f) * gl.R1(0.9f, 1.0f, l34Var.l0));
                    l34Var.J.setAlpha(Math.max(0.0f, l34Var.p0 - 0.8f) * l34Var.l0 * 5.0f);
                    return;
                }
                return;
            case 3:
                l34Var.k();
                return;
            case 4:
                l34Var.k();
                return;
            default:
                float Z1 = gl.Z1(l34Var.k0, l34Var.N, valueAnimator.getAnimatedFraction());
                l34Var.Q = Z1;
                l34Var.g(Z1);
                return;
        }
    }
}
