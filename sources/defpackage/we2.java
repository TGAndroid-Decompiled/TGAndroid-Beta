package defpackage;

import android.animation.ValueAnimator;
public final class we2 implements ValueAnimator.AnimatorUpdateListener {
    public boolean a = false;
    public final vob b;
    public final float c;
    public final boolean d;
    public final if2 e;

    public we2(if2 if2Var, vob vobVar, float f, boolean z) {
        this.e = if2Var;
        this.b = vobVar;
        this.c = f;
        this.d = z;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
        if2 if2Var = this.e;
        if2Var.L1 = floatValue;
        if (!this.d) {
            floatValue = 1.0f - floatValue;
        }
        this.b.setRadius(this.c * floatValue);
        if (!this.a && if2Var.L1 > 0.5f) {
            this.a = true;
        }
    }
}
