package defpackage;

import android.animation.ValueAnimator;
public final class pc9 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final hd9 b;

    public pc9(hd9 hd9Var, byte b) {
        this.a = b;
        this.b = hd9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        hd9 hd9Var = this.b;
        switch (b) {
            case 0:
                hd9Var.R0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hd9Var.b0();
                return;
            default:
                hd9Var.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hd9Var.z0();
                hd9Var.Q.setTranslationX(gl.U1(hd9Var.J, hd9Var.H[0] - hd9Var.I[0], 0));
                hd9Var.Q.setTranslationY(gl.U1(hd9Var.J, hd9Var.H[1] - hd9Var.I[1], 0));
                hd9Var.P.invalidate();
                return;
        }
    }
}
