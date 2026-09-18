package ci;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.cw0;
import org.telegram.ui.Components.ft0;
import org.telegram.ui.Components.wl0;
public final class x4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f5752a;
    public final int f5753b;
    public final Object f5754c;
    public final Object d;

    public x4(ft0 ft0Var, int i10, wl0 wl0Var) {
        this.f5752a = 1;
        this.f5754c = ft0Var;
        this.f5753b = i10;
        this.d = wl0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5752a) {
            case 0:
                r6 r6Var = (r6) this.f5754c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r6Var.A1.f41242a = i0.a.d(floatValue, ((Integer) this.d).intValue(), this.f5753b);
                m6 m6Var = r6Var.T0;
                if (m6Var != null) {
                    m6Var.invalidate();
                    return;
                }
                return;
            case 1:
                ((ft0) this.f5754c).e.O1.put(this.f5753b, (Float) valueAnimator.getAnimatedValue());
                ((wl0) this.d).invalidate();
                return;
            default:
                qg.m0 m0Var = (qg.m0) this.f5754c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.K1.f41242a = i0.a.d(floatValue2, ((Integer) this.d).intValue(), this.f5753b);
                qg.k0 k0Var = m0Var.f41740c1;
                if (k0Var != null) {
                    k0Var.invalidate();
                    return;
                }
                return;
        }
    }

    public x4(cw0 cw0Var, Integer num, int i10, int i11) {
        this.f5752a = i11;
        this.f5754c = cw0Var;
        this.d = num;
        this.f5753b = i10;
    }
}
