package ei;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.pw0;
import org.telegram.ui.Components.st0;
public final class o4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f9565a;
    public final int f9566b;
    public final Object f9567c;
    public final Object d;

    public o4(st0 st0Var, int i10, mm0 mm0Var) {
        this.f9565a = 1;
        this.f9567c = st0Var;
        this.f9566b = i10;
        this.d = mm0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f9565a) {
            case 0:
                f6 f6Var = (f6) this.f9567c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f6Var.A1.f45066a = i0.a.f(floatValue, ((Integer) this.d).intValue(), this.f9566b);
                b6 b6Var = f6Var.T0;
                if (b6Var != null) {
                    b6Var.invalidate();
                    return;
                }
                return;
            case 1:
                ((st0) this.f9567c).e.P1.put(this.f9566b, (Float) valueAnimator.getAnimatedValue());
                ((mm0) this.d).invalidate();
                return;
            default:
                rg.m0 m0Var = (rg.m0) this.f9567c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.K1.f45066a = i0.a.f(floatValue2, ((Integer) this.d).intValue(), this.f9566b);
                rg.k0 k0Var = m0Var.f45886c1;
                if (k0Var != null) {
                    k0Var.invalidate();
                    return;
                }
                return;
        }
    }

    public o4(pw0 pw0Var, Integer num, int i10, int i11) {
        this.f9565a = i11;
        this.f9567c = pw0Var;
        this.d = num;
        this.f9566b = i10;
    }
}
