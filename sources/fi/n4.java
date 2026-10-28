package fi;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.au0;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.xw0;
public final class n4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f11298a;
    public final int f11299b;
    public final Object f11300c;
    public final Object d;

    public n4(au0 au0Var, int i10, nm0 nm0Var) {
        this.f11298a = 1;
        this.f11300c = au0Var;
        this.f11299b = i10;
        this.d = nm0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f11298a) {
            case 0:
                e6 e6Var = (e6) this.f11300c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e6Var.f10806p1.f47560a = i0.a.f(floatValue, ((Integer) this.d).intValue(), this.f11299b);
                a6 a6Var = e6Var.I0;
                if (a6Var != null) {
                    a6Var.invalidate();
                    return;
                }
                return;
            case 1:
                ((au0) this.f11300c).e.R1.put(this.f11299b, (Float) valueAnimator.getAnimatedValue());
                ((nm0) this.d).invalidate();
                return;
            default:
                sg.m0 m0Var = (sg.m0) this.f11300c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.f48395z1.f47560a = i0.a.f(floatValue2, ((Integer) this.d).intValue(), this.f11299b);
                sg.k0 k0Var = m0Var.R0;
                if (k0Var != null) {
                    k0Var.invalidate();
                    return;
                }
                return;
        }
    }

    public n4(xw0 xw0Var, Integer num, int i10, int i11) {
        this.f11298a = i11;
        this.f11300c = xw0Var;
        this.d = num;
        this.f11299b = i10;
    }
}
