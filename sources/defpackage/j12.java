package defpackage;

import android.animation.ValueAnimator;
public final class j12 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final s12 b;

    public j12(s12 s12Var, byte b) {
        this.a = b;
        this.b = s12Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        s12 s12Var = this.b;
        switch (b) {
            case 0:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                gw0 gw0Var = s12Var.n;
                if (gw0Var.getWebView() != null) {
                    gw0Var.getWebView().setScrollY(intValue);
                    return;
                }
                return;
            default:
                s12Var.J.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
