package n6;

import android.os.Bundle;
public abstract class w {
    public Boolean f15095a;
    public boolean f15096b;
    public final g f15097c;
    public final int d;
    public final Bundle e;
    public final g f15098f;

    public w(g gVar, int i10, Bundle bundle) {
        this.f15098f = gVar;
        Boolean bool = Boolean.TRUE;
        this.f15097c = gVar;
        this.f15095a = bool;
        this.f15096b = false;
        this.d = i10;
        this.e = bundle;
    }

    public abstract void a(k6.a aVar);

    public abstract boolean b();

    public final void c() {
        synchronized (this) {
            this.f15095a = null;
        }
    }

    public final void d() {
        c();
        synchronized (this.f15097c.G) {
            this.f15097c.G.remove(this);
        }
    }
}
