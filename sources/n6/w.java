package n6;

import android.os.Bundle;
public abstract class w {
    public Boolean f15107a;
    public boolean f15108b;
    public final g f15109c;
    public final int d;
    public final Bundle e;
    public final g f15110f;

    public w(g gVar, int i10, Bundle bundle) {
        this.f15110f = gVar;
        Boolean bool = Boolean.TRUE;
        this.f15109c = gVar;
        this.f15107a = bool;
        this.f15108b = false;
        this.d = i10;
        this.e = bundle;
    }

    public abstract void a(k6.a aVar);

    public abstract boolean b();

    public final void c() {
        synchronized (this) {
            this.f15107a = null;
        }
    }

    public final void d() {
        c();
        synchronized (this.f15109c.G) {
            this.f15109c.G.remove(this);
        }
    }
}
