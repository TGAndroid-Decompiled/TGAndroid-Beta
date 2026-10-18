package n6;

import android.os.Bundle;
public abstract class w {
    public Boolean f17245a;
    public boolean f17246b;
    public final g f17247c;
    public final int d;
    public final Bundle e;
    public final g f17248f;

    public w(g gVar, int i10, Bundle bundle) {
        this.f17248f = gVar;
        Boolean bool = Boolean.TRUE;
        this.f17247c = gVar;
        this.f17245a = bool;
        this.f17246b = false;
        this.d = i10;
        this.e = bundle;
    }

    public abstract void a(k6.a aVar);

    public abstract boolean b();

    public final void c() {
        synchronized (this) {
            this.f17245a = null;
        }
    }

    public final void d() {
        c();
        synchronized (this.f17247c.G) {
            this.f17247c.G.remove(this);
        }
    }
}
