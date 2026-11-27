package defpackage;

import android.animation.ValueAnimator;
public final class ce2 implements ValueAnimator.AnimatorUpdateListener {
    public boolean a = false;
    public final tqb b;
    public final float c;
    public final boolean d;
    public final oe2 e;

    public ce2(oe2 oe2Var, tqb tqbVar, float f, boolean z) {
        this.e = oe2Var;
        this.b = tqbVar;
        this.c = f;
        this.d = z;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        oe2 oe2Var = this.e;
        oe2Var.L1 = floatValue;
        if (!this.d) {
            floatValue = 1.0f - floatValue;
        }
        this.b.setRadius(this.c * floatValue);
        if (!this.a && oe2Var.L1 > 0.5f) {
            this.a = true;
        }
    }
}
