package defpackage;

import android.os.Handler;
public final class i50 {
    public final Handler a;
    public final h50 b;
    public final j50 c;

    public i50(j50 j50Var) {
        this.c = j50Var;
        Handler q = hac.q(null);
        this.a = q;
        h50 h50Var = new h50(this);
        this.b = h50Var;
        j50Var.a.registerStreamEventCallback(new g50(q, (byte) 0), h50Var);
    }

    public final void a() {
        this.c.a.unregisterStreamEventCallback(this.b);
        this.a.removeCallbacksAndMessages(null);
    }
}
