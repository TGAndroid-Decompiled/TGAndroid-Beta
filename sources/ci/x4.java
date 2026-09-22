package ci;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.dw0;
import org.telegram.ui.Components.gt0;
import org.telegram.ui.Components.yl0;
public final class x4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f5751a;
    public final int f5752b;
    public final Object f5753c;
    public final Object d;

    public x4(gt0 gt0Var, int i10, yl0 yl0Var) {
        this.f5751a = 1;
        this.f5753c = gt0Var;
        this.f5752b = i10;
        this.d = yl0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5751a) {
            case 0:
                r6 r6Var = (r6) this.f5753c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r6Var.A1.f41314a = i0.a.d(floatValue, ((Integer) this.d).intValue(), this.f5752b);
                m6 m6Var = r6Var.T0;
                if (m6Var != null) {
                    m6Var.invalidate();
                    return;
                }
                return;
            case 1:
                ((gt0) this.f5753c).e.O1.put(this.f5752b, (Float) valueAnimator.getAnimatedValue());
                ((yl0) this.d).invalidate();
                return;
            default:
                qg.n0 n0Var = (qg.n0) this.f5753c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n0Var.K1.f41314a = i0.a.d(floatValue2, ((Integer) this.d).intValue(), this.f5752b);
                qg.l0 l0Var = n0Var.f41808c1;
                if (l0Var != null) {
                    l0Var.invalidate();
                    return;
                }
                return;
        }
    }

    public x4(dw0 dw0Var, Integer num, int i10, int i11) {
        this.f5751a = i11;
        this.f5753c = dw0Var;
        this.d = num;
        this.f5752b = i10;
    }
}
