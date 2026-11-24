package defpackage;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import java.io.Serializable;
public final class u34 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final int b;
    public final Object c;
    public final Object d;

    public u34(pfa pfaVar, int i, sea seaVar) {
        this.a = (byte) 3;
        this.c = pfaVar;
        this.b = i;
        this.d = seaVar;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f;
        byte b = this.a;
        Object obj = this.d;
        int i = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                w34 w34Var = (w34) obj2;
                float[] fArr = (float[]) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i2 = 0; i2 < 3; i2++) {
                    float[] fArr2 = w34Var.f;
                    float f2 = fArr[i2];
                    if (i2 == i) {
                        f = 1.0f;
                    } else {
                        f = 0.0f;
                    }
                    fArr2[i2] = gm.R1(f2, f, floatValue);
                }
                w34Var.a();
                return;
            case 1:
                ry5 ry5Var = (ry5) obj2;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                ry5Var.A1.a = on2.f(floatValue2, ((Integer) obj).intValue(), i);
                oy5 oy5Var = ry5Var.S0;
                if (oy5Var != null) {
                    oy5Var.invalidate();
                    return;
                }
                return;
            case 2:
                xv7 xv7Var = (xv7) obj2;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xv7Var.q1.a = on2.f(floatValue3, ((Integer) obj).intValue(), i);
                uv7 uv7Var = xv7Var.J0;
                if (uv7Var != null) {
                    uv7Var.invalidate();
                    return;
                }
                return;
            default:
                ((pfa) obj2).e.S1.put(i, (Float) valueAnimator.getAnimatedValue());
                ((sea) obj).invalidate();
                return;
        }
    }

    public u34(ViewGroup viewGroup, Serializable serializable, int i, byte b) {
        this.a = b;
        this.c = viewGroup;
        this.d = serializable;
        this.b = i;
    }
}
