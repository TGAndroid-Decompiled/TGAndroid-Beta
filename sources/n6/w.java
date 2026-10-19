package n6;

import android.os.Bundle;
public abstract class w {
    public Boolean f17247a;
    public boolean f17248b;
    public final g f17249c;
    public final int d;
    public final Bundle e;
    public final g f17250f;

    public w(g gVar, int i10, Bundle bundle) {
        this.f17250f = gVar;
        Boolean bool = Boolean.TRUE;
        this.f17249c = gVar;
        this.f17247a = bool;
        this.f17248b = false;
        this.d = i10;
        this.e = bundle;
    }

    public abstract void a(k6.a aVar);

    public abstract boolean b();

    public final void c() {
        synchronized (this) {
            this.f17247a = null;
        }
    }

    public final void d() {
        c();
        synchronized (this.f17249c.G) {
            this.f17249c.G.remove(this);
        }
    }
}
