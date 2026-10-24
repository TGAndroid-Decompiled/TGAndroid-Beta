package ei;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.ow0;
import org.telegram.ui.Components.rt0;
public final class o4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f9565a;
    public final int f9566b;
    public final Object f9567c;
    public final Object d;

    public o4(rt0 rt0Var, int i10, lm0 lm0Var) {
        this.f9565a = 1;
        this.f9567c = rt0Var;
        this.f9566b = i10;
        this.d = lm0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f9565a) {
            case 0:
                f6 f6Var = (f6) this.f9567c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f6Var.A1.f45065a = i0.a.f(floatValue, ((Integer) this.d).intValue(), this.f9566b);
                b6 b6Var = f6Var.T0;
                if (b6Var != null) {
                    b6Var.invalidate();
                    return;
                }
                return;
            case 1:
                ((rt0) this.f9567c).e.P1.put(this.f9566b, (Float) valueAnimator.getAnimatedValue());
                ((lm0) this.d).invalidate();
                return;
            default:
                rg.m0 m0Var = (rg.m0) this.f9567c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.K1.f45065a = i0.a.f(floatValue2, ((Integer) this.d).intValue(), this.f9566b);
                rg.k0 k0Var = m0Var.f45885c1;
                if (k0Var != null) {
                    k0Var.invalidate();
                    return;
                }
                return;
        }
    }

    public o4(ow0 ow0Var, Integer num, int i10, int i11) {
        this.f9565a = i11;
        this.f9567c = ow0Var;
        this.d = num;
        this.f9566b = i10;
    }
}
