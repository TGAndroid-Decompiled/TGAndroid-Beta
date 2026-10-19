package ei;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.lw0;
import org.telegram.ui.Components.ot0;
public final class o4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f9553a;
    public final int f9554b;
    public final Object f9555c;
    public final Object d;

    public o4(ot0 ot0Var, int i10, im0 im0Var) {
        this.f9553a = 1;
        this.f9555c = ot0Var;
        this.f9554b = i10;
        this.d = im0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f9553a) {
            case 0:
                f6 f6Var = (f6) this.f9555c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f6Var.A1.f44647a = i0.a.f(floatValue, ((Integer) this.d).intValue(), this.f9554b);
                b6 b6Var = f6Var.T0;
                if (b6Var != null) {
                    b6Var.invalidate();
                    return;
                }
                return;
            case 1:
                ((ot0) this.f9555c).e.O1.put(this.f9554b, (Float) valueAnimator.getAnimatedValue());
                ((im0) this.d).invalidate();
                return;
            default:
                rg.m0 m0Var = (rg.m0) this.f9555c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.K1.f44647a = i0.a.f(floatValue2, ((Integer) this.d).intValue(), this.f9554b);
                rg.j0 j0Var = m0Var.f45466c1;
                if (j0Var != null) {
                    j0Var.invalidate();
                    return;
                }
                return;
        }
    }

    public o4(lw0 lw0Var, Integer num, int i10, int i11) {
        this.f9553a = i11;
        this.f9555c = lw0Var;
        this.d = num;
        this.f9554b = i10;
    }
}
