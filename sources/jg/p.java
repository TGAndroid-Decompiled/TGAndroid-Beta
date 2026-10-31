package jg;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import java.io.Serializable;
import org.telegram.ui.Components.tk0;
import org.telegram.ui.Components.zr0;
import org.telegram.ui.py;
import vh.b4;
import vh.y3;
public final class p implements ValueAnimator.AnimatorUpdateListener {
    public final int f10127a;
    public final int f10128b;
    public final Object f10129c;
    public final Object d;

    public p(ViewGroup viewGroup, Serializable serializable, int i10, int i11) {
        this.f10127a = i11;
        this.f10129c = viewGroup;
        this.d = serializable;
        this.f10128b = i10;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f7;
        switch (this.f10127a) {
            case 0:
                r0 r0Var = (r0) this.f10129c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r0Var.f10191t1.f8432a = i0.b.f(floatValue, ((Integer) this.d).intValue(), this.f10128b);
                n0 n0Var = r0Var.L0;
                if (n0Var != null) {
                    n0Var.invalidate();
                    return;
                }
                return;
            case 1:
                ((zr0) this.f10129c).e.R1.put(this.f10128b, (Float) valueAnimator.getAnimatedValue());
                ((tk0) this.d).invalidate();
                return;
            case 2:
                py pyVar = (py) this.f10129c;
                float[] fArr = (float[]) this.d;
                pyVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i10 = 0; i10 < 3; i10++) {
                    float[] fArr2 = pyVar.f40808f;
                    float f10 = fArr[i10];
                    if (i10 == this.f10128b) {
                        f7 = 1.0f;
                    } else {
                        f7 = 0.0f;
                    }
                    fArr2[i10] = org.telegram.messenger.i0.T1(f10, f7, floatValue2);
                }
                pyVar.a();
                return;
            default:
                b4 b4Var = (b4) this.f10129c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b4Var.f50971j1.f8432a = i0.b.f(floatValue3, ((Integer) this.d).intValue(), this.f10128b);
                y3 y3Var = b4Var.C0;
                if (y3Var != null) {
                    y3Var.invalidate();
                    return;
                }
                return;
        }
    }

    public p(zr0 zr0Var, int i10, tk0 tk0Var) {
        this.f10127a = 1;
        this.f10129c = zr0Var;
        this.f10128b = i10;
        this.d = tk0Var;
    }
}
