package dg;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.rv0;
import org.telegram.ui.Components.ss0;
import ph.c5;
import ph.y4;
public final class t implements ValueAnimator.AnimatorUpdateListener {
    public final int f4791a;
    public final int f4792b;
    public final Object f4793c;
    public final Object d;

    public t(ss0 ss0Var, int i10, rl0 rl0Var) {
        this.f4791a = 1;
        this.f4793c = ss0Var;
        this.f4792b = i10;
        this.d = rl0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f4791a) {
            case 0:
                e1 e1Var = (e1) this.f4793c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e1Var.H1.f2384a = i0.a.d(floatValue, ((Integer) this.d).intValue(), this.f4792b);
                a1 a1Var = e1Var.Z0;
                if (a1Var != null) {
                    a1Var.invalidate();
                    return;
                }
                return;
            case 1:
                ((ss0) this.f4793c).e.L1.put(this.f4792b, (Float) valueAnimator.getAnimatedValue());
                ((rl0) this.d).invalidate();
                return;
            default:
                c5 c5Var = (c5) this.f4793c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c5Var.f41410x1.f2384a = i0.a.d(floatValue2, ((Integer) this.d).intValue(), this.f4792b);
                y4 y4Var = c5Var.Q0;
                if (y4Var != null) {
                    y4Var.invalidate();
                    return;
                }
                return;
        }
    }

    public t(rv0 rv0Var, Integer num, int i10, int i11) {
        this.f4791a = i11;
        this.f4793c = rv0Var;
        this.d = num;
        this.f4792b = i10;
    }
}
