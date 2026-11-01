package n6;

import android.os.Bundle;
public abstract class w {
    public Boolean f13649a;
    public boolean f13650b;
    public final g f13651c;
    public final int d;
    public final Bundle e;
    public final g f13652f;

    public w(g gVar, int i10, Bundle bundle) {
        this.f13652f = gVar;
        Boolean bool = Boolean.TRUE;
        this.f13651c = gVar;
        this.f13649a = bool;
        this.f13650b = false;
        this.d = i10;
        this.e = bundle;
    }

    public abstract void a(k6.a aVar);

    public abstract boolean b();

    public final void c() {
        synchronized (this) {
            this.f13649a = null;
        }
    }

    public final void d() {
        c();
        synchronized (this.f13651c.G) {
            this.f13651c.G.remove(this);
        }
    }
}
