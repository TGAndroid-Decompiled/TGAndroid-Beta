package b6;

import android.os.Bundle;
public abstract class x {
    public Boolean f1657a;
    public boolean f1658b;
    public final g f1659c;
    public final int d;
    public final Bundle e;
    public final g f1660f;

    public x(g gVar, int i10, Bundle bundle) {
        this.f1660f = gVar;
        Boolean bool = Boolean.TRUE;
        this.f1659c = gVar;
        this.f1657a = bool;
        this.f1658b = false;
        this.d = i10;
        this.e = bundle;
    }

    public abstract void a(y5.a aVar);

    public abstract boolean b();

    public final void c() {
        synchronized (this) {
            this.f1657a = null;
        }
    }

    public final void d() {
        c();
        synchronized (this.f1659c.D) {
            this.f1659c.D.remove(this);
        }
    }
}
