package ci;

import android.animation.ValueAnimator;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.ts0;
public final class w4 implements ValueAnimator.AnimatorUpdateListener {
    public final int f5723a;
    public final int f5724b;
    public final Object f5725c;
    public final Object d;

    public w4(ts0 ts0Var, int i10, ml0 ml0Var) {
        this.f5723a = 1;
        this.f5725c = ts0Var;
        this.f5724b = i10;
        this.d = ml0Var;
    }

    @Override
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f5723a) {
            case 0:
                q6 q6Var = (q6) this.f5725c;
                float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q6Var.A1.f40927a = i0.a.d(floatValue, ((Integer) this.d).intValue(), this.f5724b);
                l6 l6Var = q6Var.T0;
                if (l6Var != null) {
                    l6Var.invalidate();
                    return;
                }
                return;
            case 1:
                ((ts0) this.f5725c).e.O1.put(this.f5724b, (Float) valueAnimator.getAnimatedValue());
                ((ml0) this.d).invalidate();
                return;
            default:
                qg.p0 p0Var = (qg.p0) this.f5725c;
                float floatValue2 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                p0Var.K1.f40927a = i0.a.d(floatValue2, ((Integer) this.d).intValue(), this.f5724b);
                qg.m0 m0Var = p0Var.f41470c1;
                if (m0Var != null) {
                    m0Var.invalidate();
                    return;
                }
                return;
        }
    }

    public w4(qv0 qv0Var, Integer num, int i10, int i11) {
        this.f5723a = i11;
        this.f5725c = qv0Var;
        this.d = num;
        this.f5724b = i10;
    }
}
