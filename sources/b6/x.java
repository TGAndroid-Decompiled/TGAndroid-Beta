package b6;

import android.os.Bundle;
public abstract class x {
    public Boolean f1793a;
    public boolean f1794b;
    public final g f1795c;
    public final int d;
    public final Bundle f1796e;
    public final g f1797f;

    public x(g gVar, int i10, Bundle bundle) {
        this.f1797f = gVar;
        Boolean bool = Boolean.TRUE;
        this.f1795c = gVar;
        this.f1793a = bool;
        this.f1794b = false;
        this.d = i10;
        this.f1796e = bundle;
    }

    public abstract void a(y5.a aVar);

    public abstract boolean b();

    public final void c() {
        synchronized (this) {
            this.f1793a = null;
        }
    }

    public final void d() {
        c();
        synchronized (this.f1795c.D) {
            this.f1795c.D.remove(this);
        }
    }
}
