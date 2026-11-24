package defpackage;

import android.animation.ValueAnimator;
public final class k85 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final o85 b;

    public k85(o85 o85Var, byte b) {
        this.a = b;
        this.b = o85Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        o85 o85Var = this.b;
        switch (b) {
            case 0:
                o85Var.s.x = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o85Var.i();
                m85 m85Var = o85Var.a;
                if (m85Var.getParent() != null) {
                    o85Var.n.updateViewLayout(m85Var, o85Var.s);
                    return;
                }
                return;
            default:
                o85Var.s.y = (int) ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m85 m85Var2 = o85Var.a;
                if (m85Var2.getParent() != null) {
                    o85Var.n.updateViewLayout(m85Var2, o85Var.s);
                    return;
                }
                return;
        }
    }
}
