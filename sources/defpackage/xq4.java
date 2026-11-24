package defpackage;

import android.animation.ValueAnimator;
public final class xq4 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final float b;
    public final float c;
    public final float d;
    public final Object e;

    public xq4(Object obj, float f, float f2, float f3, byte b) {
        this.a = b;
        this.e = obj;
        this.b = f;
        this.c = f2;
        this.d = f3;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        float f = this.d;
        float f2 = this.c;
        float f3 = this.b;
        Object obj = this.e;
        switch (b) {
            case 0:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                uq4 uq4Var = ((er4) obj).b;
                uq4Var.d = f3 * floatValue;
                uq4Var.e = f2 * floatValue;
                uq4Var.i = floatValue * f;
                return;
            case 1:
                l95 l95Var = (l95) obj;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l95Var.z0 = tb4.A(1.0f, floatValue2, 1.0f, f3 * floatValue2);
                l95Var.s0 = f2 * floatValue2;
                l95Var.t0 = f * floatValue2;
                l95Var.invalidate();
                return;
            default:
                hgc hgcVar = (hgc) obj;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                hgcVar.f1 = tb4.A(1.0f, floatValue3, 1.0f, f3 * floatValue3);
                hgcVar.Y0 = f2 * floatValue3;
                hgcVar.Z0 = f * floatValue3;
                hgcVar.s.invalidate();
                return;
        }
    }
}
