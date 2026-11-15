package n2;

import android.os.Handler;
public final class f0 {
    public final Handler f20732a;
    public final e0 f20733b;
    public final g0 f20734c;

    public f0(g0 g0Var) {
        this.f20734c = g0Var;
        Handler q10 = h2.l0.q(null);
        this.f20732a = q10;
        e0 e0Var = new e0(this);
        this.f20733b = e0Var;
        g0Var.f20739a.registerStreamEventCallback(new l2.d0(q10, 1), e0Var);
    }

    public static void a(f0 f0Var) {
        f0Var.f20734c.f20739a.unregisterStreamEventCallback(f0Var.f20733b);
        f0Var.f20732a.removeCallbacksAndMessages(null);
    }
}
