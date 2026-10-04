package ci;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.kt0;
import org.telegram.ui.Components.mw0;
import org.telegram.ui.Components.zl0;
public final class w4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f6227a;
    public final int f6228b;
    public final Object f6229c;
    public final Object d;

    public w4(kt0 kt0Var, int i10, zl0 zl0Var) {
        this.f6227a = 1;
        this.f6229c = kt0Var;
        this.f6228b = i10;
        this.d = zl0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f6227a) {
            case 0:
                q6 q6Var = (q6) this.f6229c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q6Var.A1.f44631a = i0.a.d(floatValue, ((Integer) this.d).intValue(), this.f6228b);
                l6 l6Var = q6Var.T0;
                if (l6Var != null) {
                    l6Var.invalidate();
                    return;
                }
                return;
            case 1:
                ((kt0) this.f6229c).f28198e.O1.put(this.f6228b, (Float) valueAnimator.getAnimatedValue());
                ((zl0) this.d).invalidate();
                return;
            default:
                qg.m0 m0Var = (qg.m0) this.f6229c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.K1.f44631a = i0.a.d(floatValue2, ((Integer) this.d).intValue(), this.f6228b);
                qg.k0 k0Var = m0Var.f45159c1;
                if (k0Var != null) {
                    k0Var.invalidate();
                    return;
                }
                return;
        }
    }

    public w4(mw0 mw0Var, Integer num, int i10, int i11) {
        this.f6227a = i11;
        this.f6229c = mw0Var;
        this.d = num;
        this.f6228b = i10;
    }
}
