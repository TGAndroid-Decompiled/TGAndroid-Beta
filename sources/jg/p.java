package jg;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import java.io.Serializable;
import org.telegram.ui.Components.as0;
import org.telegram.ui.Components.uk0;
import org.telegram.ui.oy;
import vh.b4;
import vh.y3;
public final class p implements ValueAnimator.AnimatorUpdateListener {
    public final int f10128a;
    public final int f10129b;
    public final Object f10130c;
    public final Object d;

    public p(ViewGroup viewGroup, Serializable serializable, int i10, int i11) {
        this.f10128a = i11;
        this.f10130c = viewGroup;
        this.d = serializable;
        this.f10129b = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        switch (this.f10128a) {
            case 0:
                r0 r0Var = (r0) this.f10130c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r0Var.f10192t1.f8433a = i0.b.f(floatValue, ((Integer) this.d).intValue(), this.f10129b);
                n0 n0Var = r0Var.L0;
                if (n0Var != null) {
                    n0Var.invalidate();
                    return;
                }
                return;
            case 1:
                ((as0) this.f10130c).e.R1.put(this.f10129b, (Float) valueAnimator.getAnimatedValue());
                ((uk0) this.d).invalidate();
                return;
            case 2:
                oy oyVar = (oy) this.f10130c;
                float[] fArr = (float[]) this.d;
                oyVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i10 = 0; i10 < 3; i10++) {
                    float[] fArr2 = oyVar.f40289f;
                    float f10 = fArr[i10];
                    if (i10 == this.f10129b) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    fArr2[i10] = org.telegram.messenger.i0.T1(f10, f7, floatValue2);
                }
                oyVar.a();
                return;
            default:
                b4 b4Var = (b4) this.f10130c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b4Var.f50978j1.f8433a = i0.b.f(floatValue3, ((Integer) this.d).intValue(), this.f10129b);
                y3 y3Var = b4Var.C0;
                if (y3Var != null) {
                    y3Var.invalidate();
                    return;
                }
                return;
        }
    }

    public p(as0 as0Var, int i10, uk0 uk0Var) {
        this.f10128a = 1;
        this.f10130c = as0Var;
        this.f10129b = i10;
        this.d = uk0Var;
    }
}
