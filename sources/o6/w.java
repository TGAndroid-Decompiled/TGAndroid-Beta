package o6;

import android.os.Bundle;
public abstract class w {
    public Boolean f19189a;
    public boolean f19190b;
    public final g f19191c;
    public final int d;
    public final Bundle e;
    public final g f19192f;

    public w(g gVar, int i10, Bundle bundle) {
        this.f19192f = gVar;
        Boolean bool = Boolean.TRUE;
        this.f19191c = gVar;
        this.f19189a = bool;
        this.f19190b = false;
        this.d = i10;
        this.e = bundle;
    }

    public abstract void a(l6.a aVar);

    public abstract boolean b();

    public final void c() {
        synchronized (this) {
            this.f19189a = null;
        }
    }

    public final void d() {
        c();
        synchronized (this.f19191c.G) {
            this.f19191c.G.remove(this);
        }
    }
}
