package k2;

import android.os.Handler;
public final class g0 {
    public final Handler f13883a;
    public final f0 f13884b;
    public final h0 f13885c;

    public g0(h0 h0Var) {
        this.f13885c = h0Var;
        Handler q6 = e2.m0.q(null);
        this.f13883a = q6;
        f0 f0Var = new f0(this);
        this.f13884b = f0Var;
        h0Var.f13890a.registerStreamEventCallback(new i2.f0(q6, 1), f0Var);
    }

    public static void a(g0 g0Var) {
        g0Var.f13885c.f13890a.unregisterStreamEventCallback(g0Var.f13884b);
        g0Var.f13883a.removeCallbacksAndMessages(null);
    }
}
