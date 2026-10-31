package n6;

import android.os.Bundle;
public abstract class w {
    public Boolean f13648a;
    public boolean f13649b;
    public final g f13650c;
    public final int d;
    public final Bundle e;
    public final g f13651f;

    public w(g gVar, int i10, Bundle bundle) {
        this.f13651f = gVar;
        Boolean bool = Boolean.TRUE;
        this.f13650c = gVar;
        this.f13648a = bool;
        this.f13649b = false;
        this.d = i10;
        this.e = bundle;
    }

    public abstract void a(k6.a aVar);

    public abstract boolean b();

    public final void c() {
        synchronized (this) {
            this.f13648a = null;
        }
    }

    public final void d() {
        c();
        synchronized (this.f13650c.G) {
            this.f13650c.G.remove(this);
        }
    }
}
