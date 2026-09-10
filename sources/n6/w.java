package n6;

import android.os.Bundle;
public abstract class w {
    public Boolean f13927a;
    public boolean f13928b;
    public final g f13929c;
    public final int d;
    public final Bundle e;
    public final g f13930f;

    public w(g gVar, int i10, Bundle bundle) {
        this.f13930f = gVar;
        Boolean bool = Boolean.TRUE;
        this.f13929c = gVar;
        this.f13927a = bool;
        this.f13928b = false;
        this.d = i10;
        this.e = bundle;
    }

    public abstract void a(k6.a aVar);

    public abstract boolean b();

    public final void c() {
        synchronized (this) {
            this.f13927a = null;
        }
    }

    public final void d() {
        c();
        synchronized (this.f13929c.G) {
            this.f13929c.G.remove(this);
        }
    }
}
