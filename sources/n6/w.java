package n6;

import android.os.Bundle;
public abstract class w {
    public Boolean f16756a;
    public boolean f16757b;
    public final g f16758c;
    public final int d;
    public final Bundle f16759e;
    public final g f16760f;

    public w(g gVar, int i10, Bundle bundle) {
        this.f16760f = gVar;
        Boolean bool = Boolean.TRUE;
        this.f16758c = gVar;
        this.f16756a = bool;
        this.f16757b = false;
        this.d = i10;
        this.f16759e = bundle;
    }

    public abstract void a(k6.a aVar);

    public abstract boolean b();

    public final void c() {
        synchronized (this) {
            this.f16756a = null;
        }
    }

    public final void d() {
        c();
        synchronized (this.f16758c.G) {
            this.f16758c.G.remove(this);
        }
    }
}
