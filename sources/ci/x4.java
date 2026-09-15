package ci;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.ts0;
public final class x4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f5747a;
    public final int f5748b;
    public final Object f5749c;
    public final Object d;

    public x4(ts0 ts0Var, int i10, ll0 ll0Var) {
        this.f5747a = 1;
        this.f5749c = ts0Var;
        this.f5748b = i10;
        this.d = ll0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5747a) {
            case 0:
                r6 r6Var = (r6) this.f5749c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                r6Var.A1.f40970a = i0.a.d(floatValue, ((Integer) this.d).intValue(), this.f5748b);
                m6 m6Var = r6Var.T0;
                if (m6Var != null) {
                    m6Var.invalidate();
                    return;
                }
                return;
            case 1:
                ((ts0) this.f5749c).e.O1.put(this.f5748b, (Float) valueAnimator.getAnimatedValue());
                ((ll0) this.d).invalidate();
                return;
            default:
                qg.p0 p0Var = (qg.p0) this.f5749c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p0Var.K1.f40970a = i0.a.d(floatValue2, ((Integer) this.d).intValue(), this.f5748b);
                qg.m0 m0Var = p0Var.f41518c1;
                if (m0Var != null) {
                    m0Var.invalidate();
                    return;
                }
                return;
        }
    }

    public x4(qv0 qv0Var, Integer num, int i10, int i11) {
        this.f5747a = i11;
        this.f5749c = qv0Var;
        this.d = num;
        this.f5748b = i10;
    }
}
