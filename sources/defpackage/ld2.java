package defpackage;

import android.animation.ValueAnimator;
public final class ld2 implements ValueAnimator.AnimatorUpdateListener {
    public boolean a = false;
    public final umb b;
    public final float c;
    public final boolean d;
    public final xd2 e;

    public ld2(xd2 xd2Var, umb umbVar, float f, boolean z) {
        this.e = xd2Var;
        this.b = umbVar;
        this.c = f;
        this.d = z;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        xd2 xd2Var = this.e;
        xd2Var.L1 = floatValue;
        if (!this.d) {
            floatValue = 1.0f - floatValue;
        }
        this.b.setRadius(this.c * floatValue);
        if (!this.a && xd2Var.L1 > 0.5f) {
            this.a = true;
        }
    }
}
