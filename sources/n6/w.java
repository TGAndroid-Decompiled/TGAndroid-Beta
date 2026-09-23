package n6;

import android.os.Bundle;
public abstract class w {
    public Boolean f15072a;
    public boolean f15073b;
    public final g f15074c;
    public final int d;
    public final Bundle e;
    public final g f15075f;

    public w(g gVar, int i10, Bundle bundle) {
        this.f15075f = gVar;
        Boolean bool = Boolean.TRUE;
        this.f15074c = gVar;
        this.f15072a = bool;
        this.f15073b = false;
        this.d = i10;
        this.e = bundle;
    }

    public abstract void a(k6.a aVar);

    public abstract boolean b();

    public final void c() {
        synchronized (this) {
            this.f15072a = null;
        }
    }

    public final void d() {
        c();
        synchronized (this.f15074c.G) {
            this.f15074c.G.remove(this);
        }
    }
}
