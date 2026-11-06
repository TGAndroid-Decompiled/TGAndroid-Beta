package n2;

import android.os.Handler;
public final class e0 {
    public final Handler f20151a;
    public final d0 f20152b;
    public final f0 f20153c;

    public e0(f0 f0Var) {
        this.f20153c = f0Var;
        Handler q10 = h2.m0.q(null);
        this.f20151a = q10;
        d0 d0Var = new d0(this);
        this.f20152b = d0Var;
        f0Var.f20159a.registerStreamEventCallback(new l2.g0(q10, 1), d0Var);
    }

    public static void a(e0 e0Var) {
        e0Var.f20153c.f20159a.unregisterStreamEventCallback(e0Var.f20152b);
        e0Var.f20151a.removeCallbacksAndMessages(null);
    }
}
