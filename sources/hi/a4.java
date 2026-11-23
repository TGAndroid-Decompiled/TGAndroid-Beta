package hi;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import java.io.Serializable;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.kr0;
import org.telegram.ui.qx;
public final class a4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f14180a;
    public final int f14181b;
    public final Object f14182c;
    public final Object d;

    public a4(ViewGroup viewGroup, Serializable serializable, int i7, int i10) {
        this.f14180a = i10;
        this.f14182c = viewGroup;
        this.d = serializable;
        this.f14181b = i7;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        float f10;
        switch (this.f14180a) {
            case 0:
                l5 l5Var = (l5) this.f14182c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l5Var.f14902k1.f57228a = i0.a.f(floatValue, ((Integer) this.d).intValue(), this.f14181b);
                h5 h5Var = l5Var.D0;
                if (h5Var != null) {
                    h5Var.invalidate();
                    return;
                }
                return;
            case 1:
                ((kr0) this.f14182c).f36931e.S1.put(this.f14181b, (Float) valueAnimator.getAnimatedValue());
                ((ek0) this.d).invalidate();
                return;
            case 2:
                qx qxVar = (qx) this.f14182c;
                float[] fArr = (float[]) this.d;
                qxVar.getClass();
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                for (int i7 = 0; i7 < 3; i7++) {
                    float[] fArr2 = qxVar.f51337f;
                    float f11 = fArr[i7];
                    if (i7 == this.f14181b) {
                        f10 = 1.0f;
                    } else {
                        f10 = 0.0f;
                    }
                    fArr2[i7] = org.telegram.messenger.g0.T1(f11, f10, floatValue2);
                }
                qxVar.a();
                return;
            default:
                tg.h0 h0Var = (tg.h0) this.f14182c;
                float floatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                h0Var.f57901u1.f57228a = i0.a.f(floatValue3, ((Integer) this.d).intValue(), this.f14181b);
                tg.f0 f0Var = h0Var.M0;
                if (f0Var != null) {
                    f0Var.invalidate();
                    return;
                }
                return;
        }
    }

    public a4(kr0 kr0Var, int i7, ek0 ek0Var) {
        this.f14180a = 1;
        this.f14182c = kr0Var;
        this.f14181b = i7;
        this.d = ek0Var;
    }
}
