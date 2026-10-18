package k2;

import android.os.Handler;
public final class h0 {
    public final Handler f14689a;
    public final g0 f14690b;
    public final i0 f14691c;

    public h0(i0 i0Var) {
        this.f14691c = i0Var;
        Handler q6 = e2.m0.q(null);
        this.f14689a = q6;
        g0 g0Var = new g0(this);
        this.f14690b = g0Var;
        i0Var.f14694a.registerStreamEventCallback(new i2.f0(q6, 1), g0Var);
    }

    public static void a(h0 h0Var) {
        h0Var.f14691c.f14694a.unregisterStreamEventCallback(h0Var.f14690b);
        h0Var.f14689a.removeCallbacksAndMessages(null);
    }
}
