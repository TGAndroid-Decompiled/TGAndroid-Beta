package defpackage;

import android.animation.ValueAnimator;
public final class o43 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final u43 b;
    public final float c;
    public final float[] d;
    public final float e;
    public final float f;

    public o43(u43 u43Var, float f, float[] fArr, float f2, float f3, byte b) {
        this.a = b;
        this.b = u43Var;
        this.c = f;
        this.d = fArr;
        this.e = f2;
        this.f = f3;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        byte b = this.a;
        float f = this.f;
        float f2 = this.e;
        float[] fArr = this.d;
        float f3 = this.c;
        u43 u43Var = this.b;
        switch (b) {
            case 0:
                float A = td4.A(f3, 1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
                float f4 = fArr[0];
                float f5 = A / f4;
                fArr[0] = f4 * f5;
                u43Var.M.f(f5, f2, f);
                u43Var.r(false);
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f6 = fArr[1];
                float f7 = (f3 * floatValue) - f6;
                fArr[1] = f6 + f7;
                float f8 = fArr[2];
                float f9 = (f2 * floatValue) - f8;
                fArr[2] = f8 + f9;
                s43 s43Var = u43Var.M;
                float f10 = fArr[0];
                s43Var.g(f7 * f10, f9 * f10);
                float f11 = fArr[0];
                float f12 = (((f - 1.0f) * floatValue) + 1.0f) / f11;
                fArr[0] = f11 * f12;
                u43Var.M.f(f12, 0.0f, 0.0f);
                u43Var.r(false);
                return;
        }
    }
}
