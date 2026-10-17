package k2;

import android.os.Handler;
public final class h0 {
    public final Handler f14684a;
    public final g0 f14685b;
    public final i0 f14686c;

    public h0(i0 i0Var) {
        this.f14686c = i0Var;
        Handler q6 = e2.m0.q(null);
        this.f14684a = q6;
        g0 g0Var = new g0(this);
        this.f14685b = g0Var;
        i0Var.f14689a.registerStreamEventCallback(new i2.e0(q6, 1), g0Var);
    }

    public static void a(h0 h0Var) {
        h0Var.f14686c.f14689a.unregisterStreamEventCallback(h0Var.f14685b);
        h0Var.f14684a.removeCallbacksAndMessages(null);
    }
}
