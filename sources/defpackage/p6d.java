package defpackage;

import android.os.Bundle;
public abstract class p6d {
    public Boolean a;
    public boolean b;
    public final hh0 c;
    public final int d;
    public final Bundle e;
    public final hh0 f;

    public p6d(hh0 hh0Var, int i, Bundle bundle) {
        this.f = hh0Var;
        Boolean bool = Boolean.TRUE;
        this.c = hh0Var;
        this.a = bool;
        this.b = false;
        this.d = i;
        this.e = bundle;
    }

    public abstract boolean a();

    public abstract void b(ot2 ot2Var);

    public final void c() {
        d();
        hh0 hh0Var = this.c;
        synchronized (hh0Var.q) {
            hh0Var.q.remove(this);
        }
    }

    public final void d() {
        synchronized (this) {
            this.a = null;
        }
    }
}
