package defpackage;

import android.os.Bundle;
public abstract class e9d {
    public Boolean a;
    public boolean b;
    public final hg0 c;
    public final int d;
    public final Bundle e;
    public final hg0 f;

    public e9d(hg0 hg0Var, int i, Bundle bundle) {
        this.f = hg0Var;
        Boolean bool = Boolean.TRUE;
        this.c = hg0Var;
        this.a = bool;
        this.b = false;
        this.d = i;
        this.e = bundle;
    }

    public abstract boolean a();

    public abstract void b(ws2 ws2Var);

    public final void c() {
        d();
        hg0 hg0Var = this.c;
        synchronized (hg0Var.q) {
            hg0Var.q.remove(this);
        }
    }

    public final void d() {
        synchronized (this) {
            this.a = null;
        }
    }
}
