package hi;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import java.io.Serializable;
import org.telegram.ui.Components.ar0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.nx;
public final class a4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f13871a;
    public final int f13872b;
    public final Object f13873c;
    public final Object d;

    public a4(ViewGroup viewGroup, Serializable serializable, int i7, int i10) {
        this.f13871a = i10;
        this.f13873c = viewGroup;
        this.d = serializable;
        this.f13872b = i7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        switch (this.f13871a) {
            case 0:
                m5 m5Var = (m5) this.f13873c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m5Var.f14676k1.f56644a = i0.a.f(floatValue, ((Integer) this.d).intValue(), this.f13872b);
                i5 i5Var = m5Var.D0;
                if (i5Var != null) {
                    i5Var.invalidate();
                    return;
                }
                return;
            case 1:
                ((ar0) this.f13873c).f33050e.S1.put(this.f13872b, (Float) valueAnimator.getAnimatedValue());
                ((uj0) this.d).invalidate();
                return;
            case 2:
                nx nxVar = (nx) this.f13873c;
                float[] fArr = (float[]) this.d;
                nxVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i7 = 0; i7 < 3; i7++) {
                    float[] fArr2 = nxVar.f49702f;
                    float f11 = fArr[i7];
                    if (i7 == this.f13872b) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    fArr2[i7] = org.telegram.messenger.g0.T1(f11, f10, floatValue2);
                }
                nxVar.a();
                return;
            default:
                tg.g0 g0Var = (tg.g0) this.f13873c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g0Var.f57306u1.f56644a = i0.a.f(floatValue3, ((Integer) this.d).intValue(), this.f13872b);
                tg.e0 e0Var = g0Var.M0;
                if (e0Var != null) {
                    e0Var.invalidate();
                    return;
                }
                return;
        }
    }

    public a4(ar0 ar0Var, int i7, uj0 uj0Var) {
        this.f13871a = 1;
        this.f13873c = ar0Var;
        this.f13872b = i7;
        this.d = uj0Var;
    }
}
