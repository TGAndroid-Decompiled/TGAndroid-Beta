package ei;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.kw0;
import org.telegram.ui.Components.nt0;
public final class o4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f9553a;
    public final int f9554b;
    public final Object f9555c;
    public final Object d;

    public o4(nt0 nt0Var, int i10, im0 im0Var) {
        this.f9553a = 1;
        this.f9555c = nt0Var;
        this.f9554b = i10;
        this.d = im0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f9553a) {
            case 0:
                f6 f6Var = (f6) this.f9555c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f6Var.A1.f44667a = i0.b.f(floatValue, ((Integer) this.d).intValue(), this.f9554b);
                b6 b6Var = f6Var.T0;
                if (b6Var != null) {
                    b6Var.invalidate();
                    return;
                }
                return;
            case 1:
                ((nt0) this.f9555c).e.O1.put(this.f9554b, (Float) valueAnimator.getAnimatedValue());
                ((im0) this.d).invalidate();
                return;
            default:
                rg.m0 m0Var = (rg.m0) this.f9555c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.K1.f44667a = i0.b.f(floatValue2, ((Integer) this.d).intValue(), this.f9554b);
                rg.j0 j0Var = m0Var.f45495c1;
                if (j0Var != null) {
                    j0Var.invalidate();
                    return;
                }
                return;
        }
    }

    public o4(kw0 kw0Var, Integer num, int i10, int i11) {
        this.f9553a = i11;
        this.f9555c = kw0Var;
        this.d = num;
        this.f9554b = i10;
    }
}
