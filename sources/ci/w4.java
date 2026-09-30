package ci;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.ew0;
import org.telegram.ui.Components.ht0;
import org.telegram.ui.Components.zl0;
public final class w4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f5735a;
    public final int f5736b;
    public final Object f5737c;
    public final Object d;

    public w4(ht0 ht0Var, int i10, zl0 zl0Var) {
        this.f5735a = 1;
        this.f5737c = ht0Var;
        this.f5736b = i10;
        this.d = zl0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5735a) {
            case 0:
                q6 q6Var = (q6) this.f5737c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q6Var.A1.f41364a = i0.a.d(floatValue, ((Integer) this.d).intValue(), this.f5736b);
                l6 l6Var = q6Var.T0;
                if (l6Var != null) {
                    l6Var.invalidate();
                    return;
                }
                return;
            case 1:
                ((ht0) this.f5737c).e.O1.put(this.f5736b, (Float) valueAnimator.getAnimatedValue());
                ((zl0) this.d).invalidate();
                return;
            default:
                qg.n0 n0Var = (qg.n0) this.f5737c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                n0Var.K1.f41364a = i0.a.d(floatValue2, ((Integer) this.d).intValue(), this.f5736b);
                qg.l0 l0Var = n0Var.f41874c1;
                if (l0Var != null) {
                    l0Var.invalidate();
                    return;
                }
                return;
        }
    }

    public w4(ew0 ew0Var, Integer num, int i10, int i11) {
        this.f5735a = i11;
        this.f5737c = ew0Var;
        this.d = num;
        this.f5736b = i10;
    }
}
