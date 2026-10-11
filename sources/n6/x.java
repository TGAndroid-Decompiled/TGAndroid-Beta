package n6;

import android.os.Bundle;
public abstract class x {
    public Boolean f16811a;
    public boolean f16812b;
    public final g f16813c;
    public final int d;
    public final Bundle f16814e;
    public final g f16815f;

    public x(g gVar, int i10, Bundle bundle) {
        this.f16815f = gVar;
        Boolean bool = Boolean.TRUE;
        this.f16813c = gVar;
        this.f16811a = bool;
        this.f16812b = false;
        this.d = i10;
        this.f16814e = bundle;
    }

    public abstract void a(k6.a aVar);

    public abstract boolean b();

    public final void c() {
        synchronized (this) {
            this.f16811a = null;
        }
    }

    public final void d() {
        c();
        synchronized (this.f16813c.G) {
            this.f16813c.G.remove(this);
        }
    }
}
