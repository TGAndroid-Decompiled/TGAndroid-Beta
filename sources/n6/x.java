package n6;

import android.os.Bundle;
public abstract class x {
    public Boolean f16729a;
    public boolean f16730b;
    public final g f16731c;
    public final int d;
    public final Bundle f16732e;
    public final g f16733f;

    public x(g gVar, int i10, Bundle bundle) {
        this.f16733f = gVar;
        Boolean bool = Boolean.TRUE;
        this.f16731c = gVar;
        this.f16729a = bool;
        this.f16730b = false;
        this.d = i10;
        this.f16732e = bundle;
    }

    public abstract void a(k6.a aVar);

    public abstract boolean b();

    public final void c() {
        synchronized (this) {
            this.f16729a = null;
        }
    }

    public final void d() {
        c();
        synchronized (this.f16731c.G) {
            this.f16731c.G.remove(this);
        }
    }
}
