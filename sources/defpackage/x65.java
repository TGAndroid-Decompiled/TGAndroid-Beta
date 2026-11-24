package defpackage;

import android.animation.ValueAnimator;
import java.util.HashSet;
public final class x65 extends gb3 {
    public float F;
    public ValueAnimator G;
    public final HashSet H = new HashSet();
    public final HashSet I = new HashSet();
    public float J;
    public float K;
    public final h75 L;

    public x65(h75 h75Var) {
        this.L = h75Var;
    }

    @Override
    public final void g() {
        super.g();
        this.I.clear();
        this.H.clear();
        this.K = Float.MAX_VALUE;
        this.L.J1.invalidate();
    }

    @Override
    public final void m() {
        boolean isEmpty = this.p.isEmpty();
        boolean isEmpty2 = this.r.isEmpty();
        boolean isEmpty3 = this.q.isEmpty();
        ValueAnimator valueAnimator = this.G;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.G = null;
        }
        if (!isEmpty || !isEmpty2 || !isEmpty3) {
            this.F = 0.0f;
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.G = ofFloat;
            ofFloat.addUpdateListener(new ni4(this, (byte) 5));
            this.G.addListener(new im2(this, (byte) 28));
            this.G.setDuration(350L);
            this.G.setInterpolator(s33.f);
            this.G.start();
            h75 h75Var = this.L;
            h75Var.J1.invalidate();
            h75Var.T3.invalidate();
        }
        super.m();
    }
}
