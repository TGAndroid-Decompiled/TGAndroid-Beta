package k2;

import android.os.Handler;
public final class h0 {
    public final Handler f14733a;
    public final g0 f14734b;
    public final i0 f14735c;

    public h0(i0 i0Var) {
        this.f14735c = i0Var;
        Handler q6 = e2.m0.q(null);
        this.f14733a = q6;
        g0 g0Var = new g0(this);
        this.f14734b = g0Var;
        i0Var.f14740a.registerStreamEventCallback(new i2.f0(q6, 1), g0Var);
    }

    public static void a(h0 h0Var) {
        h0Var.f14735c.f14740a.unregisterStreamEventCallback(h0Var.f14734b);
        h0Var.f14733a.removeCallbacksAndMessages(null);
    }
}
