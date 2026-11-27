package defpackage;

import android.animation.ValueAnimator;
public final class rk3 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final tk3 b;

    public rk3(tk3 tk3Var, byte b) {
        this.a = b;
        this.b = tk3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        tk3 tk3Var = this.b;
        switch (b) {
            case 0:
                tk3Var.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tk3Var.requestLayout();
                pt2 pt2Var = tk3Var.c;
                if (pt2Var != null) {
                    pt2Var.accept(Float.valueOf(tk3Var.a));
                    return;
                }
                return;
            default:
                tk3Var.getClass();
                tk3Var.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                tk3Var.requestLayout();
                pt2 pt2Var2 = tk3Var.c;
                if (pt2Var2 != null) {
                    pt2Var2.accept(Float.valueOf(tk3Var.a));
                    return;
                }
                return;
        }
    }
}
