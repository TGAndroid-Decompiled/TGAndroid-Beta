package defpackage;

import android.animation.ValueAnimator;
public final class h43 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final m43 b;

    public h43(m43 m43Var, byte b) {
        this.a = b;
        this.b = m43Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        m43 m43Var = this.b;
        switch (b) {
            case 0:
                m43Var.getClass();
                m43Var.a.setAlpha(1.0f - ((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                m43Var.a.invalidate();
                return;
        }
    }
}
