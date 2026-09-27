package ci;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.dw0;
import org.telegram.ui.Components.gt0;
import org.telegram.ui.Components.yl0;
public final class w4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f5782a;
    public final int f5783b;
    public final Object f5784c;
    public final Object d;

    public w4(gt0 gt0Var, int i10, yl0 yl0Var) {
        this.f5782a = 1;
        this.f5784c = gt0Var;
        this.f5783b = i10;
        this.d = yl0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5782a) {
            case 0:
                q6 q6Var = (q6) this.f5784c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q6Var.A1.f41263a = i0.a.d(floatValue, ((Integer) this.d).intValue(), this.f5783b);
                l6 l6Var = q6Var.T0;
                if (l6Var != null) {
                    l6Var.invalidate();
                    return;
                }
                return;
            case 1:
                ((gt0) this.f5784c).e.O1.put(this.f5783b, (Float) valueAnimator.getAnimatedValue());
                ((yl0) this.d).invalidate();
                return;
            default:
                qg.m0 m0Var = (qg.m0) this.f5784c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m0Var.K1.f41263a = i0.a.d(floatValue2, ((Integer) this.d).intValue(), this.f5783b);
                qg.k0 k0Var = m0Var.f41798c1;
                if (k0Var != null) {
                    k0Var.invalidate();
                    return;
                }
                return;
        }
    }

    public w4(dw0 dw0Var, Integer num, int i10, int i11) {
        this.f5782a = i11;
        this.f5784c = dw0Var;
        this.d = num;
        this.f5783b = i10;
    }
}
