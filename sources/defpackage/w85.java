package defpackage;

import android.animation.ValueAnimator;
import java.util.HashSet;
public final class w85 extends sc3 {
    public float F;
    public ValueAnimator G;
    public final HashSet H = new HashSet();
    public final HashSet I = new HashSet();
    public float J;
    public float K;
    public final g95 L;

    public w85(g95 g95Var) {
        this.L = g95Var;
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
            ofFloat.addUpdateListener(new fh4(this, (byte) 7));
            this.G.addListener(new v85(this, (byte) 0));
            this.G.setDuration(350L);
            this.G.setInterpolator(d53.f);
            this.G.start();
            g95 g95Var = this.L;
            g95Var.J1.invalidate();
            g95Var.T3.invalidate();
        }
        super.m();
    }
}
