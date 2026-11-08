package n2;

import android.os.Handler;
public final class e0 {
    public final Handler f20154a;
    public final d0 f20155b;
    public final f0 f20156c;

    public e0(f0 f0Var) {
        this.f20156c = f0Var;
        Handler q10 = h2.m0.q(null);
        this.f20154a = q10;
        d0 d0Var = new d0(this);
        this.f20155b = d0Var;
        f0Var.f20162a.registerStreamEventCallback(new l2.g0(q10, 1), d0Var);
    }

    public static void a(e0 e0Var) {
        e0Var.f20156c.f20162a.unregisterStreamEventCallback(e0Var.f20155b);
        e0Var.f20154a.removeCallbacksAndMessages(null);
    }
}
