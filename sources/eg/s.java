package eg;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.rv0;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.ss0;
import qh.a5;
import qh.x4;
public final class s implements ValueAnimator.AnimatorUpdateListener {
    public final int f5467a;
    public final int f5468b;
    public final Object f5469c;
    public final Object d;

    public s(ss0 ss0Var, int i10, sl0 sl0Var) {
        this.f5467a = 1;
        this.f5469c = ss0Var;
        this.f5468b = i10;
        this.d = sl0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5467a) {
            case 0:
                c1 c1Var = (c1) this.f5469c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c1Var.H1.f4524a = i0.a.d(floatValue, ((Integer) this.d).intValue(), this.f5468b);
                y0 y0Var = c1Var.Z0;
                if (y0Var != null) {
                    y0Var.invalidate();
                    return;
                }
                return;
            case 1:
                ((ss0) this.f5469c).f31171e.L1.put(this.f5468b, (Float) valueAnimator.getAnimatedValue());
                ((sl0) this.d).invalidate();
                return;
            default:
                a5 a5Var = (a5) this.f5469c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                a5Var.f44966x1.f4524a = i0.a.d(floatValue2, ((Integer) this.d).intValue(), this.f5468b);
                x4 x4Var = a5Var.Q0;
                if (x4Var != null) {
                    x4Var.invalidate();
                    return;
                }
                return;
        }
    }

    public s(rv0 rv0Var, Integer num, int i10, int i11) {
        this.f5467a = i11;
        this.f5469c = rv0Var;
        this.d = num;
        this.f5468b = i10;
    }
}
