package n6;

import android.os.Bundle;
public abstract class x {
    public Boolean f16775a;
    public boolean f16776b;
    public final g f16777c;
    public final int d;
    public final Bundle f16778e;
    public final g f16779f;

    public x(g gVar, int i10, Bundle bundle) {
        this.f16779f = gVar;
        Boolean bool = Boolean.TRUE;
        this.f16777c = gVar;
        this.f16775a = bool;
        this.f16776b = false;
        this.d = i10;
        this.f16778e = bundle;
    }

    public abstract void a(k6.a aVar);

    public abstract boolean b();

    public final void c() {
        synchronized (this) {
            this.f16775a = null;
        }
    }

    public final void d() {
        c();
        synchronized (this.f16777c.G) {
            this.f16777c.G.remove(this);
        }
    }
}
