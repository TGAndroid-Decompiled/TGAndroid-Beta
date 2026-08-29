package bg;

import android.animation.ValueAnimator;
import nh.p5;
import nh.t5;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.ks0;
public final class u implements ValueAnimator.AnimatorUpdateListener {
    public final int f2537a;
    public final Object f2538b;
    public final int f2539c;
    public final Object d;

    public u(ks0 ks0Var, int i10, jl0 jl0Var) {
        this.f2537a = 2;
        this.d = ks0Var;
        this.f2539c = i10;
        this.f2538b = jl0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f2537a) {
            case 0:
                g1 g1Var = (g1) this.d;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g1Var.G1.f571a = i0.a.d(floatValue, ((Integer) this.f2538b).intValue(), this.f2539c);
                b1 b1Var = g1Var.Y0;
                if (b1Var != null) {
                    b1Var.invalidate();
                    return;
                }
                return;
            case 1:
                t5 t5Var = (t5) this.d;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                t5Var.f18665w1.f571a = i0.a.d(floatValue2, ((Integer) this.f2538b).intValue(), this.f2539c);
                p5 p5Var = t5Var.P0;
                if (p5Var != null) {
                    p5Var.invalidate();
                    return;
                }
                return;
            default:
                ((ks0) this.d).f30144e.K1.put(this.f2539c, (Float) valueAnimator.getAnimatedValue());
                ((jl0) this.f2538b).invalidate();
                return;
        }
    }

    public u(iv0 iv0Var, Integer num, int i10, int i11) {
        this.f2537a = i11;
        this.d = iv0Var;
        this.f2538b = num;
        this.f2539c = i10;
    }
}
