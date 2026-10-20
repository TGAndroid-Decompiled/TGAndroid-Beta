package ei;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.jm0;
import org.telegram.ui.Components.mw0;
import org.telegram.ui.Components.pt0;
public final class o4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f9551a;
    public final int f9552b;
    public final Object f9553c;
    public final Object d;

    public o4(pt0 pt0Var, int i10, jm0 jm0Var) {
        this.f9551a = 1;
        this.f9553c = pt0Var;
        this.f9552b = i10;
        this.d = jm0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f9551a) {
            case 0:
                f6 f6Var = (f6) this.f9553c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                f6Var.A1.f44657a = i0.a.f(floatValue, ((Integer) this.d).intValue(), this.f9552b);
                b6 b6Var = f6Var.T0;
                if (b6Var != null) {
                    b6Var.invalidate();
                    return;
                }
                return;
            case 1:
                ((pt0) this.f9553c).e.O1.put(this.f9552b, (Float) valueAnimator.getAnimatedValue());
                ((jm0) this.d).invalidate();
                return;
            default:
                rg.m0 m0Var = (rg.m0) this.f9553c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.K1.f44657a = i0.a.f(floatValue2, ((Integer) this.d).intValue(), this.f9552b);
                rg.j0 j0Var = m0Var.f45476c1;
                if (j0Var != null) {
                    j0Var.invalidate();
                    return;
                }
                return;
        }
    }

    public o4(mw0 mw0Var, Integer num, int i10, int i11) {
        this.f9551a = i11;
        this.f9553c = mw0Var;
        this.d = num;
        this.f9552b = i10;
    }
}
