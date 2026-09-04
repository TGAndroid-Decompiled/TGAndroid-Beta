package n6;

import android.os.Bundle;
public abstract class w {
    public Boolean f16608a;
    public boolean f16609b;
    public final g f16610c;
    public final int d;
    public final Bundle f16611e;
    public final g f16612f;

    public w(g gVar, int i10, Bundle bundle) {
        this.f16612f = gVar;
        Boolean bool = Boolean.TRUE;
        this.f16610c = gVar;
        this.f16608a = bool;
        this.f16609b = false;
        this.d = i10;
        this.f16611e = bundle;
    }

    public abstract void a(k6.a aVar);

    public abstract boolean b();

    public final void c() {
        synchronized (this) {
            this.f16608a = null;
        }
    }

    public final void d() {
        c();
        synchronized (this.f16610c.G) {
            this.f16610c.G.remove(this);
        }
    }
}
