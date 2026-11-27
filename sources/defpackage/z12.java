package defpackage;

import android.animation.ValueAnimator;
public final class z12 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final j22 b;

    public z12(j22 j22Var, byte b) {
        this.a = b;
        this.b = j22Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        j22 j22Var = this.b;
        switch (b) {
            case 0:
                j22Var.J.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            default:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                pw0 pw0Var = j22Var.n;
                if (pw0Var.getWebView() != null) {
                    pw0Var.getWebView().setScrollY(intValue);
                    return;
                }
                return;
        }
    }
}
