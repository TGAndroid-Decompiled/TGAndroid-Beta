package n6;

import android.os.Bundle;
public abstract class w {
    public Boolean f15360a;
    public boolean f15361b;
    public final g f15362c;
    public final int d;
    public final Bundle e;
    public final g f15363f;

    public w(g gVar, int i10, Bundle bundle) {
        this.f15363f = gVar;
        Boolean bool = Boolean.TRUE;
        this.f15362c = gVar;
        this.f15360a = bool;
        this.f15361b = false;
        this.d = i10;
        this.e = bundle;
    }

    public abstract void a(k6.a aVar);

    public abstract boolean b();

    public final void c() {
        synchronized (this) {
            this.f15360a = null;
        }
    }

    public final void d() {
        c();
        synchronized (this.f15362c.G) {
            this.f15362c.G.remove(this);
        }
    }
}
