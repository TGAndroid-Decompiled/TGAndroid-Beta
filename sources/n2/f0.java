package n2;

import android.os.Handler;
public final class f0 {
    public final Handler f21096a;
    public final e0 f21097b;
    public final g0 f21098c;

    public f0(g0 g0Var) {
        this.f21098c = g0Var;
        Handler q10 = h2.l0.q(null);
        this.f21096a = q10;
        e0 e0Var = new e0(this);
        this.f21097b = e0Var;
        g0Var.f21103a.registerStreamEventCallback(new l2.d0(q10, 1), e0Var);
    }

    public static void a(f0 f0Var) {
        f0Var.f21098c.f21103a.unregisterStreamEventCallback(f0Var.f21097b);
        f0Var.f21096a.removeCallbacksAndMessages(null);
    }
}
