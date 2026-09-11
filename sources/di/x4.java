package di;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.pv0;
import org.telegram.ui.Components.ss0;
public final class x4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f8382a;
    public final int f8383b;
    public final Object f8384c;
    public final Object d;

    public x4(ss0 ss0Var, int i10, ll0 ll0Var) {
        this.f8382a = 1;
        this.f8384c = ss0Var;
        this.f8383b = i10;
        this.d = ll0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f8382a) {
            case 0:
                q6 q6Var = (q6) this.f8384c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q6Var.A1.f44541a = i0.a.d(floatValue, ((Integer) this.d).intValue(), this.f8383b);
                m6 m6Var = q6Var.T0;
                if (m6Var != null) {
                    m6Var.invalidate();
                    return;
                }
                return;
            case 1:
                ((ss0) this.f8384c).f30411e.O1.put(this.f8383b, (Float) valueAnimator.getAnimatedValue());
                ((ll0) this.d).invalidate();
                return;
            default:
                rg.o0 o0Var = (rg.o0) this.f8384c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o0Var.K1.f44541a = i0.a.d(floatValue2, ((Integer) this.d).intValue(), this.f8383b);
                rg.m0 m0Var = o0Var.f45341c1;
                if (m0Var != null) {
                    m0Var.invalidate();
                    return;
                }
                return;
        }
    }

    public x4(pv0 pv0Var, Integer num, int i10, int i11) {
        this.f8382a = i11;
        this.f8384c = pv0Var;
        this.d = num;
        this.f8383b = i10;
    }
}
