package n6;

import android.os.Bundle;
public abstract class w {
    public Boolean f15097a;
    public boolean f15098b;
    public final g f15099c;
    public final int d;
    public final Bundle e;
    public final g f15100f;

    public w(g gVar, int i10, Bundle bundle) {
        this.f15100f = gVar;
        Boolean bool = Boolean.TRUE;
        this.f15099c = gVar;
        this.f15097a = bool;
        this.f15098b = false;
        this.d = i10;
        this.e = bundle;
    }

    public abstract void a(k6.a aVar);

    public abstract boolean b();

    public final void c() {
        synchronized (this) {
            this.f15097a = null;
        }
    }

    public final void d() {
        c();
        synchronized (this.f15099c.G) {
            this.f15099c.G.remove(this);
        }
    }
}
