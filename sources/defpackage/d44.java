package defpackage;

import android.animation.ValueAnimator;
import org.telegram.messenger.Utilities;
public final class d44 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final h44 b;

    public d44(h44 h44Var, byte b) {
        this.a = b;
        this.b = h44Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        h44 h44Var = this.b;
        switch (b) {
            case 0:
                h44Var.g(hl.Z1(h44Var.N, h44Var.k0, h44Var.S.getAnimatedFraction()));
                return;
            case 1:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h44Var.p0 = floatValue;
                h44Var.setAlpha(floatValue);
                g44 g44Var = h44Var.J;
                if (g44Var != null) {
                    g44Var.setScaleX(Utilities.i(h44Var.p0 * 1.25f, 1.0f, 0.0f) * hl.R1(0.9f, 1.0f, h44Var.l0));
                    h44Var.J.setScaleY(Utilities.i(h44Var.p0 * 1.25f, 1.0f, 0.0f) * hl.R1(0.9f, 1.0f, h44Var.l0));
                    h44Var.J.setAlpha(Math.max(0.0f, h44Var.p0 - 0.8f) * h44Var.l0 * 5.0f);
                }
                h44Var.invalidate();
                return;
            case 2:
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h44Var.l0 = floatValue2;
                g44 g44Var2 = h44Var.J;
                if (g44Var2 != null) {
                    g44Var2.setScaleX(Utilities.i(h44Var.p0 * 1.25f, 1.0f, 0.0f) * hl.R1(0.9f, 1.0f, floatValue2));
                    h44Var.J.setScaleY(Utilities.i(h44Var.p0 * 1.25f, 1.0f, 0.0f) * hl.R1(0.9f, 1.0f, h44Var.l0));
                    h44Var.J.setAlpha(Math.max(0.0f, h44Var.p0 - 0.8f) * h44Var.l0 * 5.0f);
                    return;
                }
                return;
            case 3:
                h44Var.k();
                return;
            case 4:
                h44Var.k();
                return;
            default:
                float Z1 = hl.Z1(h44Var.k0, h44Var.N, valueAnimator.getAnimatedFraction());
                h44Var.Q = Z1;
                h44Var.g(Z1);
                return;
        }
    }
}
