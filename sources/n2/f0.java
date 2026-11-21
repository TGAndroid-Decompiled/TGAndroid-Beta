package n2;

import android.os.Handler;
public final class f0 {
    public final Handler f21121a;
    public final e0 f21122b;
    public final g0 f21123c;

    public f0(g0 g0Var) {
        this.f21123c = g0Var;
        Handler q10 = h2.l0.q(null);
        this.f21121a = q10;
        e0 e0Var = new e0(this);
        this.f21122b = e0Var;
        g0Var.f21128a.registerStreamEventCallback(new l2.d0(q10, 1), e0Var);
    }

    public static void a(f0 f0Var) {
        f0Var.f21123c.f21128a.unregisterStreamEventCallback(f0Var.f21122b);
        f0Var.f21121a.removeCallbacksAndMessages(null);
    }
}
