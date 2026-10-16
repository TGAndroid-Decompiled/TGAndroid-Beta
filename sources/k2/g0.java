package k2;

import android.os.Handler;
public final class g0 {
    public final Handler f13886a;
    public final f0 f13887b;
    public final h0 f13888c;

    public g0(h0 h0Var) {
        this.f13888c = h0Var;
        Handler q6 = e2.m0.q(null);
        this.f13886a = q6;
        f0 f0Var = new f0(this);
        this.f13887b = f0Var;
        h0Var.f13893a.registerStreamEventCallback(new i2.f0(q6, 1), f0Var);
    }

    public static void a(g0 g0Var) {
        g0Var.f13888c.f13893a.unregisterStreamEventCallback(g0Var.f13887b);
        g0Var.f13886a.removeCallbacksAndMessages(null);
    }
}
