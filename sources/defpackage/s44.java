package defpackage;

import android.animation.ValueAnimator;
import org.telegram.messenger.Utilities;
public final class s44 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final w44 b;

    public s44(w44 w44Var, byte b) {
        this.a = b;
        this.b = w44Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        w44 w44Var = this.b;
        switch (b) {
            case 0:
                w44Var.g(gm.Z1(w44Var.N, w44Var.k0, w44Var.S.getAnimatedFraction()));
                return;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w44Var.p0 = floatValue;
                w44Var.setAlpha(floatValue);
                v44 v44Var = w44Var.J;
                if (v44Var != null) {
                    v44Var.setScaleX(Utilities.i(w44Var.p0 * 1.25f, 1.0f, 0.0f) * gm.R1(0.9f, 1.0f, w44Var.l0));
                    w44Var.J.setScaleY(Utilities.i(w44Var.p0 * 1.25f, 1.0f, 0.0f) * gm.R1(0.9f, 1.0f, w44Var.l0));
                    w44Var.J.setAlpha(Math.max(0.0f, w44Var.p0 - 0.8f) * w44Var.l0 * 5.0f);
                }
                w44Var.invalidate();
                return;
            case 2:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w44Var.l0 = floatValue2;
                v44 v44Var2 = w44Var.J;
                if (v44Var2 != null) {
                    v44Var2.setScaleX(Utilities.i(w44Var.p0 * 1.25f, 1.0f, 0.0f) * gm.R1(0.9f, 1.0f, floatValue2));
                    w44Var.J.setScaleY(Utilities.i(w44Var.p0 * 1.25f, 1.0f, 0.0f) * gm.R1(0.9f, 1.0f, w44Var.l0));
                    w44Var.J.setAlpha(Math.max(0.0f, w44Var.p0 - 0.8f) * w44Var.l0 * 5.0f);
                    return;
                }
                return;
            case 3:
                w44Var.k();
                return;
            case 4:
                w44Var.k();
                return;
            default:
                float Z1 = gm.Z1(w44Var.k0, w44Var.N, valueAnimator.getAnimatedFraction());
                w44Var.Q = Z1;
                w44Var.g(Z1);
                return;
        }
    }
}
