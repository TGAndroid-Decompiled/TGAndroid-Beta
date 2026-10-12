package di;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.pw0;
import org.telegram.ui.Components.st0;
public final class v4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f7996a;
    public final int f7997b;
    public final Object f7998c;
    public final Object d;

    public v4(st0 st0Var, int i10, mm0 mm0Var) {
        this.f7996a = 1;
        this.f7998c = st0Var;
        this.f7997b = i10;
        this.d = mm0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f7996a) {
            case 0:
                o6 o6Var = (o6) this.f7998c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o6Var.A1.f43543a = i0.a.d(floatValue, ((Integer) this.d).intValue(), this.f7997b);
                k6 k6Var = o6Var.T0;
                if (k6Var != null) {
                    k6Var.invalidate();
                    return;
                }
                return;
            case 1:
                ((st0) this.f7998c).e.O1.put(this.f7997b, (Float) valueAnimator.getAnimatedValue());
                ((mm0) this.d).invalidate();
                return;
            default:
                rg.o0 o0Var = (rg.o0) this.f7998c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                o0Var.K1.f43543a = i0.a.d(floatValue2, ((Integer) this.d).intValue(), this.f7997b);
                rg.l0 l0Var = o0Var.f44403c1;
                if (l0Var != null) {
                    l0Var.invalidate();
                    return;
                }
                return;
        }
    }

    public v4(pw0 pw0Var, Integer num, int i10, int i11) {
        this.f7996a = i11;
        this.f7998c = pw0Var;
        this.d = num;
        this.f7997b = i10;
    }
}
