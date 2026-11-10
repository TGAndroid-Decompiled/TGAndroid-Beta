package n2;

import android.os.Handler;
public final class e0 {
    public final Handler f20159a;
    public final d0 f20160b;
    public final f0 f20161c;

    public e0(f0 f0Var) {
        this.f20161c = f0Var;
        Handler q10 = h2.m0.q(null);
        this.f20159a = q10;
        d0 d0Var = new d0(this);
        this.f20160b = d0Var;
        f0Var.f20167a.registerStreamEventCallback(new l2.g0(q10, 1), d0Var);
    }

    public static void a(e0 e0Var) {
        e0Var.f20161c.f20167a.unregisterStreamEventCallback(e0Var.f20160b);
        e0Var.f20159a.removeCallbacksAndMessages(null);
    }
}
