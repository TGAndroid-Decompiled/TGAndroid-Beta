package n2;

import android.os.Handler;
public final class f0 {
    public final Handler f21090a;
    public final e0 f21091b;
    public final g0 f21092c;

    public f0(g0 g0Var) {
        this.f21092c = g0Var;
        Handler q10 = h2.l0.q(null);
        this.f21090a = q10;
        e0 e0Var = new e0(this);
        this.f21091b = e0Var;
        g0Var.f21097a.registerStreamEventCallback(new l2.d0(q10, 1), e0Var);
    }

    public static void a(f0 f0Var) {
        f0Var.f21092c.f21097a.unregisterStreamEventCallback(f0Var.f21091b);
        f0Var.f21090a.removeCallbacksAndMessages(null);
    }
}
