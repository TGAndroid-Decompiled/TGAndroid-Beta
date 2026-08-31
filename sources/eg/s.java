package eg;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.sv0;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.ts0;
import qh.b5;
import qh.y4;
public final class s implements ValueAnimator.AnimatorUpdateListener {
    public final int f5467a;
    public final int f5468b;
    public final Object f5469c;
    public final Object d;

    public s(ts0 ts0Var, int i10, tl0 tl0Var) {
        this.f5467a = 1;
        this.f5469c = ts0Var;
        this.f5468b = i10;
        this.d = tl0Var;
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
                ((ts0) this.f5469c).f31450e.L1.put(this.f5468b, (Float) valueAnimator.getAnimatedValue());
                ((tl0) this.d).invalidate();
                return;
            default:
                b5 b5Var = (b5) this.f5469c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                b5Var.f44989x1.f4524a = i0.a.d(floatValue2, ((Integer) this.d).intValue(), this.f5468b);
                y4 y4Var = b5Var.Q0;
                if (y4Var != null) {
                    y4Var.invalidate();
                    return;
                }
                return;
        }
    }

    public s(sv0 sv0Var, Integer num, int i10, int i11) {
        this.f5467a = i11;
        this.f5469c = sv0Var;
        this.d = num;
        this.f5468b = i10;
    }
}
