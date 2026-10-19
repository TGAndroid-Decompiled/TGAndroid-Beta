package k2;

import android.os.Handler;
public final class h0 {
    public final Handler f14691a;
    public final g0 f14692b;
    public final i0 f14693c;

    public h0(i0 i0Var) {
        this.f14693c = i0Var;
        Handler q6 = e2.m0.q(null);
        this.f14691a = q6;
        g0 g0Var = new g0(this);
        this.f14692b = g0Var;
        i0Var.f14696a.registerStreamEventCallback(new i2.g0(q6, 1), g0Var);
    }

    public static void a(h0 h0Var) {
        h0Var.f14693c.f14696a.unregisterStreamEventCallback(h0Var.f14692b);
        h0Var.f14691a.removeCallbacksAndMessages(null);
    }
}
