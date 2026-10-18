package ei;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.nt0;
public final class o4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f9552a;
    public final int f9553b;
    public final Object f9554c;
    public final Object d;

    public o4(nt0 nt0Var, int i10, im0 im0Var) {
        this.f9552a = 1;
        this.f9554c = nt0Var;
        this.f9553b = i10;
        this.d = im0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f9552a) {
            case 0:
                f6 f6Var = (f6) this.f9554c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f6Var.A1.f44645a = i0.a.f(floatValue, ((Integer) this.d).intValue(), this.f9553b);
                b6 b6Var = f6Var.T0;
                if (b6Var != null) {
                    b6Var.invalidate();
                    return;
                }
                return;
            case 1:
                ((nt0) this.f9554c).e.O1.put(this.f9553b, (Float) valueAnimator.getAnimatedValue());
                ((im0) this.d).invalidate();
                return;
            default:
                rg.m0 m0Var = (rg.m0) this.f9554c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.K1.f44645a = i0.a.f(floatValue2, ((Integer) this.d).intValue(), this.f9553b);
                rg.j0 j0Var = m0Var.f45469c1;
                if (j0Var != null) {
                    j0Var.invalidate();
                    return;
                }
                return;
        }
    }

    public o4(kw0 kw0Var, Integer num, int i10, int i11) {
        this.f9552a = i11;
        this.f9554c = kw0Var;
        this.d = num;
        this.f9553b = i10;
    }
}
