package kh;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.yu0;
import org.telegram.ui.Components.zr0;
public final class p4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f15833a;
    public final int f15834b;
    public final Object f15835c;
    public final Object d;

    public p4(zr0 zr0Var, int i9, wk0 wk0Var) {
        this.f15833a = 1;
        this.f15835c = zr0Var;
        this.f15834b = i9;
        this.d = wk0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f15833a) {
            case 0:
                g6 g6Var = (g6) this.f15835c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g6Var.f15310w1.f49333a = i0.a.d(floatValue, ((Integer) this.d).intValue(), this.f15834b);
                c6 c6Var = g6Var.P0;
                if (c6Var != null) {
                    c6Var.invalidate();
                    return;
                }
                return;
            case 1:
                ((zr0) this.f15835c).f35368e.K1.put(this.f15834b, (Float) valueAnimator.getAnimatedValue());
                ((wk0) this.d).invalidate();
                return;
            default:
                yf.l0 l0Var = (yf.l0) this.f15835c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                l0Var.G1.f49333a = i0.a.d(floatValue2, ((Integer) this.d).intValue(), this.f15834b);
                yf.j0 j0Var = l0Var.Y0;
                if (j0Var != null) {
                    j0Var.invalidate();
                    return;
                }
                return;
        }
    }

    public p4(yu0 yu0Var, Integer num, int i9, int i10) {
        this.f15833a = i10;
        this.f15835c = yu0Var;
        this.d = num;
        this.f15834b = i9;
    }
}
