package dg;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.rv0;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.ss0;
import ph.c5;
import ph.y4;
public final class t implements ValueAnimator.AnimatorUpdateListener {
    public final int f4785a;
    public final int f4786b;
    public final Object f4787c;
    public final Object d;

    public t(ss0 ss0Var, int i10, sl0 sl0Var) {
        this.f4785a = 1;
        this.f4787c = ss0Var;
        this.f4786b = i10;
        this.d = sl0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f4785a) {
            case 0:
                e1 e1Var = (e1) this.f4787c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                e1Var.H1.f2401a = i0.a.d(floatValue, ((Integer) this.d).intValue(), this.f4786b);
                a1 a1Var = e1Var.Z0;
                if (a1Var != null) {
                    a1Var.invalidate();
                    return;
                }
                return;
            case 1:
                ((ss0) this.f4787c).e.L1.put(this.f4786b, (Float) valueAnimator.getAnimatedValue());
                ((sl0) this.d).invalidate();
                return;
            default:
                c5 c5Var = (c5) this.f4787c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c5Var.f41370x1.f2401a = i0.a.d(floatValue2, ((Integer) this.d).intValue(), this.f4786b);
                y4 y4Var = c5Var.Q0;
                if (y4Var != null) {
                    y4Var.invalidate();
                    return;
                }
                return;
        }
    }

    public t(rv0 rv0Var, Integer num, int i10, int i11) {
        this.f4785a = i11;
        this.f4787c = rv0Var;
        this.d = num;
        this.f4786b = i10;
    }
}
