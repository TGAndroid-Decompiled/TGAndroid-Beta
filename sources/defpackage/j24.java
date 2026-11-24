package defpackage;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import java.io.Serializable;
public final class j24 implements ValueAnimator.AnimatorUpdateListener {
    public final byte a;
    public final int b;
    public final Object c;
    public final Object d;

    public j24(pda pdaVar, int i, sca scaVar) {
        this.a = (byte) 3;
        this.c = pdaVar;
        this.b = i;
        this.d = scaVar;
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
                l24 l24Var = (l24) obj2;
                float[] fArr = (float[]) obj;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i2 = 0; i2 < 3; i2++) {
                    float[] fArr2 = l24Var.f;
                    float f2 = fArr[i2];
                    if (i2 == i) {
                        f = 1.0f;
                    } else {
                        f = 0.0f;
                    }
                    fArr2[i2] = gl.R1(f2, f, floatValue);
                }
                l24Var.a();
                return;
            case 1:
                rw5 rw5Var = (rw5) obj2;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                rw5Var.A1.a = bm2.f(floatValue2, ((Integer) obj).intValue(), i);
                ow5 ow5Var = rw5Var.S0;
                if (ow5Var != null) {
                    ow5Var.invalidate();
                    return;
                }
                return;
            case 2:
                wt7 wt7Var = (wt7) obj2;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                wt7Var.q1.a = bm2.f(floatValue3, ((Integer) obj).intValue(), i);
                tt7 tt7Var = wt7Var.J0;
                if (tt7Var != null) {
                    tt7Var.invalidate();
                    return;
                }
                return;
            default:
                ((pda) obj2).e.S1.put(i, (Float) valueAnimator.getAnimatedValue());
                ((sca) obj).invalidate();
                return;
        }
    }

    public j24(ViewGroup viewGroup, Serializable serializable, int i, byte b) {
        this.a = b;
        this.c = viewGroup;
        this.d = serializable;
        this.b = i;
    }
}
