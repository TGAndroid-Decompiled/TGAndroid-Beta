package m2;

import android.os.Handler;
public final class g0 {
    public final Handler f18861a;
    public final f0 f18862b;
    public final h0 f18863c;

    public g0(h0 h0Var) {
        this.f18863c = h0Var;
        Handler q10 = g2.n0.q(null);
        this.f18861a = q10;
        f0 f0Var = new f0(this);
        this.f18862b = f0Var;
        h0Var.f18866a.registerStreamEventCallback(new k2.g0(q10, 1), f0Var);
    }

    public static void a(g0 g0Var) {
        g0Var.f18863c.f18866a.unregisterStreamEventCallback(g0Var.f18862b);
        g0Var.f18861a.removeCallbacksAndMessages(null);
    }
}
