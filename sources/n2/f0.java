package n2;

import android.os.Handler;
public final class f0 {
    public final Handler f21124a;
    public final e0 f21125b;
    public final g0 f21126c;

    public f0(g0 g0Var) {
        this.f21126c = g0Var;
        Handler q10 = h2.l0.q(null);
        this.f21124a = q10;
        e0 e0Var = new e0(this);
        this.f21125b = e0Var;
        g0Var.f21131a.registerStreamEventCallback(new l2.d0(q10, 1), e0Var);
    }

    public static void a(f0 f0Var) {
        f0Var.f21126c.f21131a.unregisterStreamEventCallback(f0Var.f21125b);
        f0Var.f21124a.removeCallbacksAndMessages(null);
    }
}
