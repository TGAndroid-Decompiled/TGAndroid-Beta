package defpackage;

import android.animation.ValueAnimator;
public final class ak3 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final ck3 b;

    public ak3(ck3 ck3Var, byte b) {
        this.a = b;
        this.b = ck3Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        ck3 ck3Var = this.b;
        switch (b) {
            case 0:
                ck3Var.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ck3Var.requestLayout();
                vs2 vs2Var = ck3Var.c;
                if (vs2Var != null) {
                    vs2Var.accept(Float.valueOf(ck3Var.a));
                    return;
                }
                return;
            default:
                ck3Var.getClass();
                ck3Var.a = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ck3Var.requestLayout();
                vs2 vs2Var2 = ck3Var.c;
                if (vs2Var2 != null) {
                    vs2Var2.accept(Float.valueOf(ck3Var.a));
                    return;
                }
                return;
        }
    }
}
