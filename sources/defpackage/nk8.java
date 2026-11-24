package defpackage;

import android.animation.ValueAnimator;
public final class nk8 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final sk8 b;

    public nk8(sk8 sk8Var, byte b) {
        this.a = b;
        this.b = sk8Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        sk8 sk8Var = this.b;
        switch (b) {
            case 0:
                sk8Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sk8Var.invalidate();
                return;
            case 1:
                sk8Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float L = sk8Var.J + gl.L(28.0f);
                float L2 = sk8Var.K + gl.L(52.0f);
                float f = sk8Var.E;
                sk8Var.H = L - (L * f);
                sk8Var.I = L2 - (f * L2);
                sk8Var.invalidate();
                return;
            case 2:
                sk8Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int L3 = (gl.q.x - gl.L(36.0f)) - gl.L(52.0f);
                qk8 qk8Var = sk8Var.c;
                qk8Var.getLayoutParams().width = gl.L(52.0f) + ((int) (L3 * sk8Var.F));
                qk8Var.requestLayout();
                return;
            default:
                sk8Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                sk8Var.e();
                return;
        }
    }
}
