package ci;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.rm0;
import org.telegram.ui.Components.uw0;
import org.telegram.ui.Components.xt0;
public final class v4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f6148a;
    public final int f6149b;
    public final Object f6150c;
    public final Object d;

    public v4(xt0 xt0Var, int i10, rm0 rm0Var) {
        this.f6148a = 1;
        this.f6150c = xt0Var;
        this.f6149b = i10;
        this.d = rm0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f6148a) {
            case 0:
                q6 q6Var = (q6) this.f6150c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q6Var.A1.f45822a = i0.a.d(floatValue, ((Integer) this.d).intValue(), this.f6149b);
                l6 l6Var = q6Var.T0;
                if (l6Var != null) {
                    l6Var.invalidate();
                    return;
                }
                return;
            case 1:
                ((xt0) this.f6150c).f33031e.O1.put(this.f6149b, (Float) valueAnimator.getAnimatedValue());
                ((rm0) this.d).invalidate();
                return;
            default:
                qg.m0 m0Var = (qg.m0) this.f6150c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.K1.f45822a = i0.a.d(floatValue2, ((Integer) this.d).intValue(), this.f6149b);
                qg.k0 k0Var = m0Var.f46407c1;
                if (k0Var != null) {
                    k0Var.invalidate();
                    return;
                }
                return;
        }
    }

    public v4(uw0 uw0Var, Integer num, int i10, int i11) {
        this.f6148a = i11;
        this.f6150c = uw0Var;
        this.d = num;
        this.f6149b = i10;
    }
}
