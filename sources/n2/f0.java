package n2;

import android.os.Handler;
public final class f0 {
    public final Handler f21093a;
    public final e0 f21094b;
    public final g0 f21095c;

    public f0(g0 g0Var) {
        this.f21095c = g0Var;
        Handler q10 = h2.l0.q(null);
        this.f21093a = q10;
        e0 e0Var = new e0(this);
        this.f21094b = e0Var;
        g0Var.f21100a.registerStreamEventCallback(new l2.d0(q10, 1), e0Var);
    }

    public static void a(f0 f0Var) {
        f0Var.f21095c.f21100a.unregisterStreamEventCallback(f0Var.f21094b);
        f0Var.f21093a.removeCallbacksAndMessages(null);
    }
}
