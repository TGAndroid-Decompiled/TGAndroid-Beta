package defpackage;

import android.animation.ValueAnimator;
public final class u22 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final e32 b;

    public u22(e32 e32Var, byte b) {
        this.a = b;
        this.b = e32Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        e32 e32Var = this.b;
        switch (b) {
            case 0:
                int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ox0 ox0Var = e32Var.n;
                if (ox0Var.getWebView() != null) {
                    ox0Var.getWebView().setScrollY(intValue);
                    return;
                }
                return;
            default:
                e32Var.J.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
        }
    }
}
