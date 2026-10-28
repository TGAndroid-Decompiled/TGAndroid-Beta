package k2;

import android.os.Handler;
public final class i0 {
    public final Handler f16171a;
    public final h0 f16172b;
    public final j0 f16173c;

    public i0(j0 j0Var) {
        this.f16173c = j0Var;
        Handler q5 = e2.n0.q(null);
        this.f16171a = q5;
        h0 h0Var = new h0(this);
        this.f16172b = h0Var;
        j0Var.f16176a.registerStreamEventCallback(new i2.h0(q5, 1), h0Var);
    }

    public static void a(i0 i0Var) {
        i0Var.f16173c.f16176a.unregisterStreamEventCallback(i0Var.f16172b);
        i0Var.f16171a.removeCallbacksAndMessages(null);
    }
}
