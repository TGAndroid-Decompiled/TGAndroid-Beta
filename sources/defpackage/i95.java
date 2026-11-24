package defpackage;

import android.animation.ValueAnimator;
public final class i95 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final l95 b;

    public i95(l95 l95Var, byte b) {
        this.a = b;
        this.b = l95Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f;
        byte b = this.a;
        l95 l95Var = this.b;
        switch (b) {
            case 0:
                l95Var.J0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l95Var.invalidate();
                return;
            default:
                l95Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l95Var.c = floatValue;
                h75 h75Var = l95Var.k0;
                h75Var.u3.setAlpha(1.0f - floatValue);
                c65 c65Var = h75Var.H1;
                if (c65Var.getTag() != null) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                c65Var.setAlpha((1.0f - h75Var.T3.c) * f);
                h75Var.y1(h75Var.s2);
                l95Var.j();
                return;
        }
    }
}
