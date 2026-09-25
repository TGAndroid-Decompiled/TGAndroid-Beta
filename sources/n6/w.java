package n6;

import android.os.Bundle;
public abstract class w {
    public Boolean f15325a;
    public boolean f15326b;
    public final g f15327c;
    public final int d;
    public final Bundle e;
    public final g f15328f;

    public w(g gVar, int i10, Bundle bundle) {
        this.f15328f = gVar;
        Boolean bool = Boolean.TRUE;
        this.f15327c = gVar;
        this.f15325a = bool;
        this.f15326b = false;
        this.d = i10;
        this.e = bundle;
    }

    public abstract void a(k6.a aVar);

    public abstract boolean b();

    public final void c() {
        synchronized (this) {
            this.f15325a = null;
        }
    }

    public final void d() {
        c();
        synchronized (this.f15327c.G) {
            this.f15327c.G.remove(this);
        }
    }
}
