package k2;

import android.os.Handler;
public final class i0 {
    public final Handler f10664a;
    public final h0 f10665b;
    public final j0 f10666c;

    public i0(j0 j0Var) {
        this.f10666c = j0Var;
        Handler q6 = e2.l0.q(null);
        this.f10664a = q6;
        h0 h0Var = new h0(this);
        this.f10665b = h0Var;
        j0Var.f10674a.registerStreamEventCallback(new i2.g0(q6, 1), h0Var);
    }

    public static void a(i0 i0Var) {
        i0Var.f10666c.f10674a.unregisterStreamEventCallback(i0Var.f10665b);
        i0Var.f10664a.removeCallbacksAndMessages(null);
    }
}
