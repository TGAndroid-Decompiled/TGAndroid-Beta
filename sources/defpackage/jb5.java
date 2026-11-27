package defpackage;

import android.animation.ValueAnimator;
public final class jb5 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final mb5 b;

    public jb5(mb5 mb5Var, byte b) {
        this.a = b;
        this.b = mb5Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f;
        byte b = this.a;
        mb5 mb5Var = this.b;
        switch (b) {
            case 0:
                mb5Var.J0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mb5Var.invalidate();
                return;
            default:
                mb5Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                mb5Var.c = floatValue;
                j95 j95Var = mb5Var.k0;
                j95Var.u3.setAlpha(1.0f - floatValue);
                e85 e85Var = j95Var.H1;
                if (e85Var.getTag() != null) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                e85Var.setAlpha((1.0f - j95Var.T3.c) * f);
                j95Var.z1(j95Var.s2);
                mb5Var.j();
                return;
        }
    }
}
