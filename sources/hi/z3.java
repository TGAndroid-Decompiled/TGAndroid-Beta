package hi;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import java.io.Serializable;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.kr0;
import org.telegram.ui.qx;
public final class z3 implements ValueAnimator.AnimatorUpdateListener {
    public final int f15851a;
    public final int f15852b;
    public final Object f15853c;
    public final Object d;

    public z3(ViewGroup viewGroup, Serializable serializable, int i7, int i10) {
        this.f15851a = i10;
        this.f15853c = viewGroup;
        this.d = serializable;
        this.f15852b = i7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        switch (this.f15851a) {
            case 0:
                k5 k5Var = (k5) this.f15853c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                k5Var.f14890k1.f57263a = i0.a.f(floatValue, ((Integer) this.d).intValue(), this.f15852b);
                g5 g5Var = k5Var.D0;
                if (g5Var != null) {
                    g5Var.invalidate();
                    return;
                }
                return;
            case 1:
                ((kr0) this.f15853c).f36963e.S1.put(this.f15852b, (Float) valueAnimator.getAnimatedValue());
                ((ek0) this.d).invalidate();
                return;
            case 2:
                qx qxVar = (qx) this.f15853c;
                float[] fArr = (float[]) this.d;
                qxVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i7 = 0; i7 < 3; i7++) {
                    float[] fArr2 = qxVar.f51371f;
                    float f11 = fArr[i7];
                    if (i7 == this.f15852b) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    fArr2[i7] = org.telegram.messenger.g0.T1(f11, f10, floatValue2);
                }
                qxVar.a();
                return;
            default:
                tg.h0 h0Var = (tg.h0) this.f15853c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h0Var.f57936u1.f57263a = i0.a.f(floatValue3, ((Integer) this.d).intValue(), this.f15852b);
                tg.f0 f0Var = h0Var.M0;
                if (f0Var != null) {
                    f0Var.invalidate();
                    return;
                }
                return;
        }
    }

    public z3(kr0 kr0Var, int i7, ek0 ek0Var) {
        this.f15851a = 1;
        this.f15853c = kr0Var;
        this.f15852b = i7;
        this.d = ek0Var;
    }
}
