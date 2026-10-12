package ci;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.cu0;
import org.telegram.ui.Components.wm0;
import org.telegram.ui.Components.zw0;
public final class v4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f6146a;
    public final int f6147b;
    public final Object f6148c;
    public final Object d;

    public v4(cu0 cu0Var, int i10, wm0 wm0Var) {
        this.f6146a = 1;
        this.f6148c = cu0Var;
        this.f6147b = i10;
        this.d = wm0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f6146a) {
            case 0:
                q6 q6Var = (q6) this.f6148c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q6Var.A1.f45656a = i0.a.d(floatValue, ((Integer) this.d).intValue(), this.f6147b);
                l6 l6Var = q6Var.T0;
                if (l6Var != null) {
                    l6Var.invalidate();
                    return;
                }
                return;
            case 1:
                ((cu0) this.f6148c).f25014e.O1.put(this.f6147b, (Float) valueAnimator.getAnimatedValue());
                ((wm0) this.d).invalidate();
                return;
            default:
                qg.m0 m0Var = (qg.m0) this.f6148c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.K1.f45656a = i0.a.d(floatValue2, ((Integer) this.d).intValue(), this.f6147b);
                qg.k0 k0Var = m0Var.f46308c1;
                if (k0Var != null) {
                    k0Var.invalidate();
                    return;
                }
                return;
        }
    }

    public v4(zw0 zw0Var, Integer num, int i10, int i11) {
        this.f6146a = i11;
        this.f6148c = zw0Var;
        this.d = num;
        this.f6147b = i10;
    }
}
