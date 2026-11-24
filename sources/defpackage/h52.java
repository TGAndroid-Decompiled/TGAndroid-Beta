package defpackage;

import android.animation.ValueAnimator;
public final class h52 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final l52 b;

    public h52(l52 l52Var, byte b) {
        this.a = b;
        this.b = l52Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        l52 l52Var = this.b;
        switch (b) {
            case 0:
                l52Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l52Var.invalidate();
                return;
            default:
                l52Var.H = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l52Var.invalidate();
                return;
        }
    }
}
