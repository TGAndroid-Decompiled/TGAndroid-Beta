package n6;

import android.os.Bundle;
public abstract class x {
    public Boolean f16157a;
    public boolean f16158b;
    public final g f16159c;
    public final int d;
    public final Bundle e;
    public final g f16160f;

    public x(g gVar, int i10, Bundle bundle) {
        this.f16160f = gVar;
        Boolean bool = Boolean.TRUE;
        this.f16159c = gVar;
        this.f16157a = bool;
        this.f16158b = false;
        this.d = i10;
        this.e = bundle;
    }

    public abstract void a(k6.a aVar);

    public abstract boolean b();

    public final void c() {
        synchronized (this) {
            this.f16157a = null;
        }
    }

    public final void d() {
        c();
        synchronized (this.f16159c.G) {
            this.f16159c.G.remove(this);
        }
    }
}
