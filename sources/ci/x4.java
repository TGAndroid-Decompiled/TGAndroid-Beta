package ci;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.rv0;
import org.telegram.ui.Components.us0;
public final class x4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f5752a;
    public final int f5753b;
    public final Object f5754c;
    public final Object d;

    public x4(us0 us0Var, int i10, ml0 ml0Var) {
        this.f5752a = 1;
        this.f5754c = us0Var;
        this.f5753b = i10;
        this.d = ml0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5752a) {
            case 0:
                r6 r6Var = (r6) this.f5754c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r6Var.A1.f40997a = i0.a.d(floatValue, ((Integer) this.d).intValue(), this.f5753b);
                m6 m6Var = r6Var.T0;
                if (m6Var != null) {
                    m6Var.invalidate();
                    return;
                }
                return;
            case 1:
                ((us0) this.f5754c).e.O1.put(this.f5753b, (Float) valueAnimator.getAnimatedValue());
                ((ml0) this.d).invalidate();
                return;
            default:
                qg.p0 p0Var = (qg.p0) this.f5754c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p0Var.K1.f40997a = i0.a.d(floatValue2, ((Integer) this.d).intValue(), this.f5753b);
                qg.m0 m0Var = p0Var.f41545c1;
                if (m0Var != null) {
                    m0Var.invalidate();
                    return;
                }
                return;
        }
    }

    public x4(rv0 rv0Var, Integer num, int i10, int i11) {
        this.f5752a = i11;
        this.f5754c = rv0Var;
        this.d = num;
        this.f5753b = i10;
    }
}
