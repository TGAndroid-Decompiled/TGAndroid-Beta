package bi;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.ct0;
import org.telegram.ui.Components.vl0;
public final class s5 implements ValueAnimator.AnimatorUpdateListener {
    public final int f3644a;
    public final int f3645b;
    public final Object f3646c;
    public final Object d;

    public s5(ct0 ct0Var, int i10, vl0 vl0Var) {
        this.f3644a = 1;
        this.f3646c = ct0Var;
        this.f3645b = i10;
        this.d = vl0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f3644a) {
            case 0:
                r7 r7Var = (r7) this.f3646c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r7Var.A1.f14534a = i0.a.d(floatValue, ((Integer) this.d).intValue(), this.f3645b);
                l7 l7Var = r7Var.T0;
                if (l7Var != null) {
                    l7Var.invalidate();
                    return;
                }
                return;
            case 1:
                ((ct0) this.f3646c).e.O1.put(this.f3645b, (Float) valueAnimator.getAnimatedValue());
                ((vl0) this.d).invalidate();
                return;
            default:
                pg.m0 m0Var = (pg.m0) this.f3646c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.K1.f14534a = i0.a.d(floatValue2, ((Integer) this.d).intValue(), this.f3645b);
                pg.k0 k0Var = m0Var.f40126c1;
                if (k0Var != null) {
                    k0Var.invalidate();
                    return;
                }
                return;
        }
    }

    public s5(bw0 bw0Var, Integer num, int i10, int i11) {
        this.f3644a = i11;
        this.f3646c = bw0Var;
        this.d = num;
        this.f3645b = i10;
    }
}
