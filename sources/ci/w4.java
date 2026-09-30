package ci;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.dw0;
import org.telegram.ui.Components.gt0;
import org.telegram.ui.Components.yl0;
public final class w4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f5723a;
    public final int f5724b;
    public final Object f5725c;
    public final Object d;

    public w4(gt0 gt0Var, int i10, yl0 yl0Var) {
        this.f5723a = 1;
        this.f5725c = gt0Var;
        this.f5724b = i10;
        this.d = yl0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5723a) {
            case 0:
                q6 q6Var = (q6) this.f5725c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q6Var.A1.f41267a = i0.a.d(floatValue, ((Integer) this.d).intValue(), this.f5724b);
                l6 l6Var = q6Var.T0;
                if (l6Var != null) {
                    l6Var.invalidate();
                    return;
                }
                return;
            case 1:
                ((gt0) this.f5725c).e.O1.put(this.f5724b, (Float) valueAnimator.getAnimatedValue());
                ((yl0) this.d).invalidate();
                return;
            default:
                qg.n0 n0Var = (qg.n0) this.f5725c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n0Var.K1.f41267a = i0.a.d(floatValue2, ((Integer) this.d).intValue(), this.f5724b);
                qg.l0 l0Var = n0Var.f41775c1;
                if (l0Var != null) {
                    l0Var.invalidate();
                    return;
                }
                return;
        }
    }

    public w4(dw0 dw0Var, Integer num, int i10, int i11) {
        this.f5723a = i11;
        this.f5725c = dw0Var;
        this.d = num;
        this.f5724b = i10;
    }
}
