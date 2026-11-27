package defpackage;

import android.animation.ValueAnimator;
public final class ea1 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final la1 b;

    public ea1(la1 la1Var, byte b) {
        this.a = b;
        this.b = la1Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        la1 la1Var = this.b;
        switch (b) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                la1Var.Z = floatValue;
                la1Var.b.setAlpha(1.0f - floatValue);
                if (la1Var.X == 3) {
                    la1Var.c.setAlpha(1.0f - la1Var.Z);
                }
                la1Var.s.setAlpha(1.0f - la1Var.Z);
                la1Var.x = (la1Var.Z * 0.25f) + 0.5f;
                la1Var.fragmentView.invalidate();
                return;
            default:
                la1Var.s.invalidate();
                return;
        }
    }
}
