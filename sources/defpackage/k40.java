package defpackage;

import android.os.Handler;
public final class k40 {
    public final Handler a;
    public final j40 b;
    public final l40 c;

    public k40(l40 l40Var) {
        this.c = l40Var;
        Handler q = gcc.q(null);
        this.a = q;
        j40 j40Var = new j40(this);
        this.b = j40Var;
        l40Var.a.registerStreamEventCallback(new i40(q, (byte) 0), j40Var);
    }

    public final void a() {
        this.c.a.unregisterStreamEventCallback(this.b);
        this.a.removeCallbacksAndMessages(null);
    }
}
