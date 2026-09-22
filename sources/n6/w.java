package n6;

import android.os.Bundle;
public abstract class w {
    public Boolean f15333a;
    public boolean f15334b;
    public final g f15335c;
    public final int d;
    public final Bundle e;
    public final g f15336f;

    public w(g gVar, int i10, Bundle bundle) {
        this.f15336f = gVar;
        Boolean bool = Boolean.TRUE;
        this.f15335c = gVar;
        this.f15333a = bool;
        this.f15334b = false;
        this.d = i10;
        this.e = bundle;
    }

    public abstract void a(k6.a aVar);

    public abstract boolean b();

    public final void c() {
        synchronized (this) {
            this.f15333a = null;
        }
    }

    public final void d() {
        c();
        synchronized (this.f15335c.G) {
            this.f15335c.G.remove(this);
        }
    }
}
