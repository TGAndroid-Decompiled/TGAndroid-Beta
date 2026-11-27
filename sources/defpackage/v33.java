package defpackage;

import android.animation.ValueAnimator;
public final class v33 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final b43 b;
    public final float c;
    public final float[] d;
    public final float e;
    public final float f;

    public v33(b43 b43Var, float f, float[] fArr, float f2, float f3, byte b) {
        this.a = b;
        this.b = b43Var;
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
        b43 b43Var = this.b;
        switch (b) {
            case 0:
                float A = qd4.A(f3, 1.0f, ((Float) valueAnimator.getAnimatedValue()).floatValue(), 1.0f);
                float f4 = fArr[0];
                float f5 = A / f4;
                fArr[0] = f4 * f5;
                b43Var.M.f(f5, f2, f);
                b43Var.r(false);
                return;
            default:
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                float f6 = fArr[1];
                float f7 = (f3 * floatValue) - f6;
                fArr[1] = f6 + f7;
                float f8 = fArr[2];
                float f9 = (f2 * floatValue) - f8;
                fArr[2] = f8 + f9;
                z33 z33Var = b43Var.M;
                float f10 = fArr[0];
                z33Var.g(f7 * f10, f9 * f10);
                float f11 = fArr[0];
                float f12 = (((f - 1.0f) * floatValue) + 1.0f) / f11;
                fArr[0] = f11 * f12;
                b43Var.M.f(f12, 0.0f, 0.0f);
                b43Var.r(false);
                return;
        }
    }
}
