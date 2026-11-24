package defpackage;

import android.animation.ValueAnimator;
public final class gb5 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final jb5 b;

    public gb5(jb5 jb5Var, byte b) {
        this.a = b;
        this.b = jb5Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f;
        byte b = this.a;
        jb5 jb5Var = this.b;
        switch (b) {
            case 0:
                jb5Var.J0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jb5Var.invalidate();
                return;
            default:
                jb5Var.getClass();
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jb5Var.c = floatValue;
                g95 g95Var = jb5Var.k0;
                g95Var.u3.setAlpha(1.0f - floatValue);
                a85 a85Var = g95Var.H1;
                if (a85Var.getTag() != null) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                a85Var.setAlpha((1.0f - g95Var.T3.c) * f);
                g95Var.y1(g95Var.s2);
                jb5Var.j();
                return;
        }
    }
}
