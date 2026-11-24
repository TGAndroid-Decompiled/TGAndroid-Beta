package defpackage;

import android.animation.ValueAnimator;
public final class fb1 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final lb1 b;

    public fb1(lb1 lb1Var, byte b) {
        this.a = b;
        this.b = lb1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        lb1 lb1Var = this.b;
        switch (b) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                lb1Var.Z = floatValue;
                lb1Var.b.setAlpha(1.0f - floatValue);
                if (lb1Var.X == 3) {
                    lb1Var.c.setAlpha(1.0f - lb1Var.Z);
                }
                lb1Var.s.setAlpha(1.0f - lb1Var.Z);
                lb1Var.x = (lb1Var.Z * 0.25f) + 0.5f;
                lb1Var.fragmentView.invalidate();
                return;
            default:
                lb1Var.s.invalidate();
                return;
        }
    }
}
