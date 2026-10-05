package ci;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.lt0;
import org.telegram.ui.Components.nw0;
import org.telegram.ui.Components.zl0;
public final class w4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f6228a;
    public final int f6229b;
    public final Object f6230c;
    public final Object d;

    public w4(lt0 lt0Var, int i10, zl0 zl0Var) {
        this.f6228a = 1;
        this.f6230c = lt0Var;
        this.f6229b = i10;
        this.d = zl0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f6228a) {
            case 0:
                q6 q6Var = (q6) this.f6230c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q6Var.A1.f44645a = i0.a.d(floatValue, ((Integer) this.d).intValue(), this.f6229b);
                l6 l6Var = q6Var.T0;
                if (l6Var != null) {
                    l6Var.invalidate();
                    return;
                }
                return;
            case 1:
                ((lt0) this.f6230c).f28539e.O1.put(this.f6229b, (Float) valueAnimator.getAnimatedValue());
                ((zl0) this.d).invalidate();
                return;
            default:
                qg.m0 m0Var = (qg.m0) this.f6230c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.K1.f44645a = i0.a.d(floatValue2, ((Integer) this.d).intValue(), this.f6229b);
                qg.k0 k0Var = m0Var.f45173c1;
                if (k0Var != null) {
                    k0Var.invalidate();
                    return;
                }
                return;
        }
    }

    public w4(nw0 nw0Var, Integer num, int i10, int i11) {
        this.f6228a = i11;
        this.f6230c = nw0Var;
        this.d = num;
        this.f6229b = i10;
    }
}
