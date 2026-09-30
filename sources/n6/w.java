package n6;

import android.os.Bundle;
public abstract class w {
    public Boolean f15341a;
    public boolean f15342b;
    public final g f15343c;
    public final int d;
    public final Bundle e;
    public final g f15344f;

    public w(g gVar, int i10, Bundle bundle) {
        this.f15344f = gVar;
        Boolean bool = Boolean.TRUE;
        this.f15343c = gVar;
        this.f15341a = bool;
        this.f15342b = false;
        this.d = i10;
        this.e = bundle;
    }

    public abstract void a(k6.a aVar);

    public abstract boolean b();

    public final void c() {
        synchronized (this) {
            this.f15341a = null;
        }
    }

    public final void d() {
        c();
        synchronized (this.f15343c.G) {
            this.f15343c.G.remove(this);
        }
    }
}
