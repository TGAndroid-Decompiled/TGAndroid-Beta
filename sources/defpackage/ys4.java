package defpackage;

import android.animation.ValueAnimator;
public final class ys4 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final float b;
    public final float c;
    public final float d;
    public final Object e;

    public ys4(Object obj, float f, float f2, float f3, byte b) {
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
                vs4 vs4Var = ((ft4) obj).b;
                vs4Var.d = f3 * floatValue;
                vs4Var.e = f2 * floatValue;
                vs4Var.i = floatValue * f;
                return;
            case 1:
                jb5 jb5Var = (jb5) obj;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                jb5Var.z0 = td4.A(1.0f, floatValue2, 1.0f, f3 * floatValue2);
                jb5Var.s0 = f2 * floatValue2;
                jb5Var.t0 = f * floatValue2;
                jb5Var.invalidate();
                return;
            default:
                iic iicVar = (iic) obj;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                iicVar.f1 = td4.A(1.0f, floatValue3, 1.0f, f3 * floatValue3);
                iicVar.Y0 = f2 * floatValue3;
                iicVar.Z0 = f * floatValue3;
                iicVar.s.invalidate();
                return;
        }
    }
}
