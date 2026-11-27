package defpackage;

import android.animation.ValueAnimator;
public final class ig9 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final yg9 b;

    public ig9(yg9 yg9Var, byte b) {
        this.a = b;
        this.b = yg9Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        yg9 yg9Var = this.b;
        switch (b) {
            case 0:
                yg9Var.J = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yg9Var.A0();
                yg9Var.Q.setTranslationX(hl.U1(yg9Var.J, yg9Var.H[0] - yg9Var.I[0], 0));
                yg9Var.Q.setTranslationY(hl.U1(yg9Var.J, yg9Var.H[1] - yg9Var.I[1], 0));
                yg9Var.P.invalidate();
                return;
            default:
                yg9Var.R0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                yg9Var.b0();
                return;
        }
    }
}
