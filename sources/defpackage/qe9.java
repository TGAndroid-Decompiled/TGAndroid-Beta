package defpackage;

import android.animation.ValueAnimator;
public final class qe9 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final jf9 b;

    public qe9(jf9 jf9Var, byte b) {
        this.a = b;
        this.b = jf9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        jf9 jf9Var = this.b;
        switch (b) {
            case 0:
                jf9Var.R0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jf9Var.c0();
                return;
            default:
                jf9Var.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jf9Var.A0();
                jf9Var.Q.setTranslationX(gm.U1(jf9Var.J, jf9Var.H[0] - jf9Var.I[0], 0));
                jf9Var.Q.setTranslationY(gm.U1(jf9Var.J, jf9Var.H[1] - jf9Var.I[1], 0));
                jf9Var.P.invalidate();
                return;
        }
    }
}
