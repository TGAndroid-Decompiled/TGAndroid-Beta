package defpackage;

import android.animation.ValueAnimator;
public final class w91 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final da1 b;

    public w91(da1 da1Var, byte b) {
        this.a = b;
        this.b = da1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        da1 da1Var = this.b;
        switch (b) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                da1Var.Z = floatValue;
                da1Var.b.setAlpha(1.0f - floatValue);
                if (da1Var.X == 3) {
                    da1Var.c.setAlpha(1.0f - da1Var.Z);
                }
                da1Var.s.setAlpha(1.0f - da1Var.Z);
                da1Var.x = (da1Var.Z * 0.25f) + 0.5f;
                da1Var.fragmentView.invalidate();
                return;
            default:
                da1Var.s.invalidate();
                return;
        }
    }
}
