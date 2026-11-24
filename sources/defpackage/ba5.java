package defpackage;

import android.animation.ValueAnimator;
public final class ba5 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final ha5 b;

    public ba5(ha5 ha5Var, byte b) {
        this.a = b;
        this.b = ha5Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        boolean z;
        byte b = this.a;
        ha5 ha5Var = this.b;
        switch (b) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ha5Var.a0 = floatValue;
                ha5Var.b0.setAlpha(floatValue);
                ha5Var.a.invalidate();
                return;
            default:
                da5 da5Var = ha5Var.a;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (floatValue2 < 0.5f) {
                    z = false;
                } else {
                    floatValue2 -= 1.0f;
                    z = true;
                }
                if (z && !ha5Var.I0) {
                    ha5Var.x0.setAlpha(1.0f);
                    ha5Var.I0 = true;
                    da5Var.d.clearImage();
                }
                float f = floatValue2 * 180.0f;
                ha5Var.x0.setRotationY(f);
                da5Var.d.setRotationY(f);
                return;
        }
    }
}
