package defpackage;

import android.animation.ValueAnimator;
public final class ka5 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final oa5 b;

    public ka5(oa5 oa5Var, byte b) {
        this.a = b;
        this.b = oa5Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        oa5 oa5Var = this.b;
        switch (b) {
            case 0:
                oa5Var.s.x = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                oa5Var.i();
                ma5 ma5Var = oa5Var.a;
                if (ma5Var.getParent() != null) {
                    oa5Var.n.updateViewLayout(ma5Var, oa5Var.s);
                    return;
                }
                return;
            default:
                oa5Var.s.y = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ma5 ma5Var2 = oa5Var.a;
                if (ma5Var2.getParent() != null) {
                    oa5Var.n.updateViewLayout(ma5Var2, oa5Var.s);
                    return;
                }
                return;
        }
    }
}
