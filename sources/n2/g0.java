package n2;

import android.os.Handler;
public final class g0 {
    public final Handler f21192a;
    public final f0 f21193b;
    public final h0 f21194c;

    public g0(h0 h0Var) {
        this.f21194c = h0Var;
        Handler q10 = h2.l0.q(null);
        this.f21192a = q10;
        f0 f0Var = new f0(this);
        this.f21193b = f0Var;
        h0Var.f21197a.registerStreamEventCallback(new l2.e0(q10, 1), f0Var);
    }

    public static void a(g0 g0Var) {
        g0Var.f21194c.f21197a.unregisterStreamEventCallback(g0Var.f21193b);
        g0Var.f21192a.removeCallbacksAndMessages(null);
    }
}
