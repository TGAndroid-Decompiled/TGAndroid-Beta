package ci;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.et0;
import org.telegram.ui.Components.vl0;
public final class x4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f5753a;
    public final int f5754b;
    public final Object f5755c;
    public final Object d;

    public x4(et0 et0Var, int i10, vl0 vl0Var) {
        this.f5753a = 1;
        this.f5755c = et0Var;
        this.f5754b = i10;
        this.d = vl0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5753a) {
            case 0:
                r6 r6Var = (r6) this.f5755c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r6Var.A1.f41283a = i0.a.d(floatValue, ((Integer) this.d).intValue(), this.f5754b);
                m6 m6Var = r6Var.T0;
                if (m6Var != null) {
                    m6Var.invalidate();
                    return;
                }
                return;
            case 1:
                ((et0) this.f5755c).e.O1.put(this.f5754b, (Float) valueAnimator.getAnimatedValue());
                ((vl0) this.d).invalidate();
                return;
            default:
                qg.n0 n0Var = (qg.n0) this.f5755c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n0Var.K1.f41283a = i0.a.d(floatValue2, ((Integer) this.d).intValue(), this.f5754b);
                qg.l0 l0Var = n0Var.f41787c1;
                if (l0Var != null) {
                    l0Var.invalidate();
                    return;
                }
                return;
        }
    }

    public x4(bw0 bw0Var, Integer num, int i10, int i11) {
        this.f5753a = i11;
        this.f5755c = bw0Var;
        this.d = num;
        this.f5754b = i10;
    }
}
