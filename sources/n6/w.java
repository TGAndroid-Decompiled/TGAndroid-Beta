package n6;

import android.os.Bundle;
public abstract class w {
    public Boolean f15866a;
    public boolean f15867b;
    public final g f15868c;
    public final int d;
    public final Bundle e;
    public final g f15869f;

    public w(g gVar, int i10, Bundle bundle) {
        this.f15869f = gVar;
        Boolean bool = Boolean.TRUE;
        this.f15868c = gVar;
        this.f15866a = bool;
        this.f15867b = false;
        this.d = i10;
        this.e = bundle;
    }

    public abstract void a(k6.a aVar);

    public abstract boolean b();

    public final void c() {
        synchronized (this) {
            this.f15866a = null;
        }
    }

    public final void d() {
        c();
        synchronized (this.f15868c.G) {
            this.f15868c.G.remove(this);
        }
    }
}
