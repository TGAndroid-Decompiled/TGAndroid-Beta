package defpackage;

import android.animation.ValueAnimator;
public final class ao8 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final fo8 b;

    public ao8(fo8 fo8Var, byte b) {
        this.a = b;
        this.b = fo8Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        fo8 fo8Var = this.b;
        switch (b) {
            case 0:
                fo8Var.G = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fo8Var.invalidate();
                return;
            case 1:
                fo8Var.E = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float L = fo8Var.J + hl.L(28.0f);
                float L2 = fo8Var.K + hl.L(52.0f);
                float f = fo8Var.E;
                fo8Var.H = L - (L * f);
                fo8Var.I = L2 - (f * L2);
                fo8Var.invalidate();
                return;
            case 2:
                fo8Var.F = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                int L3 = (hl.q.x - hl.L(36.0f)) - hl.L(52.0f);
                do8 do8Var = fo8Var.c;
                do8Var.getLayoutParams().width = hl.L(52.0f) + ((int) (L3 * fo8Var.F));
                do8Var.requestLayout();
                return;
            default:
                fo8Var.s = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                fo8Var.e();
                return;
        }
    }
}
