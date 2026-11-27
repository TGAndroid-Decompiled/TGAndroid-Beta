package defpackage;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import java.io.Serializable;
public final class e34 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final int b;
    public final Object c;
    public final Object d;

    public e34(gha ghaVar, int i, jga jgaVar) {
        this.a = (byte) 3;
        this.c = ghaVar;
        this.b = i;
        this.d = jgaVar;
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
                g34 g34Var = (g34) obj2;
                float[] fArr = (float[]) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i2 = 0; i2 < 3; i2++) {
                    float[] fArr2 = g34Var.f;
                    float f2 = fArr[i2];
                    if (i2 == i) {
                        f = 1.0f;
                    } else {
                        f = 0.0f;
                    }
                    fArr2[i2] = hl.R1(f2, f, floatValue);
                }
                g34Var.a();
                return;
            case 1:
                wy5 wy5Var = (wy5) obj2;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wy5Var.u1.a = vm2.f(floatValue2, ((Integer) obj).intValue(), i);
                ty5 ty5Var = wy5Var.M0;
                if (ty5Var != null) {
                    ty5Var.invalidate();
                    return;
                }
                return;
            case 2:
                dx7 dx7Var = (dx7) obj2;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                dx7Var.k1.a = vm2.f(floatValue3, ((Integer) obj).intValue(), i);
                ax7 ax7Var = dx7Var.D0;
                if (ax7Var != null) {
                    ax7Var.invalidate();
                    return;
                }
                return;
            default:
                ((gha) obj2).e.S1.put(i, (Float) valueAnimator.getAnimatedValue());
                ((jga) obj).invalidate();
                return;
        }
    }

    public e34(ViewGroup viewGroup, Serializable serializable, int i, byte b) {
        this.a = b;
        this.c = viewGroup;
        this.d = serializable;
        this.b = i;
    }
}
