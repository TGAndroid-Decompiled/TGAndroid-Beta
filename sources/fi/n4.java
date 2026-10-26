package fi;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.ww0;
import org.telegram.ui.Components.zt0;
public final class n4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f11299a;
    public final int f11300b;
    public final Object f11301c;
    public final Object d;

    public n4(zt0 zt0Var, int i10, mm0 mm0Var) {
        this.f11299a = 1;
        this.f11301c = zt0Var;
        this.f11300b = i10;
        this.d = mm0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f11299a) {
            case 0:
                e6 e6Var = (e6) this.f11301c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e6Var.f10807p1.f47525a = i0.a.f(floatValue, ((Integer) this.d).intValue(), this.f11300b);
                a6 a6Var = e6Var.I0;
                if (a6Var != null) {
                    a6Var.invalidate();
                    return;
                }
                return;
            case 1:
                ((zt0) this.f11301c).e.R1.put(this.f11300b, (Float) valueAnimator.getAnimatedValue());
                ((mm0) this.d).invalidate();
                return;
            default:
                sg.n0 n0Var = (sg.n0) this.f11301c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n0Var.f48369z1.f47525a = i0.a.f(floatValue2, ((Integer) this.d).intValue(), this.f11300b);
                sg.l0 l0Var = n0Var.R0;
                if (l0Var != null) {
                    l0Var.invalidate();
                    return;
                }
                return;
        }
    }

    public n4(ww0 ww0Var, Integer num, int i10, int i11) {
        this.f11299a = i11;
        this.f11301c = ww0Var;
        this.d = num;
        this.f11300b = i10;
    }
}
