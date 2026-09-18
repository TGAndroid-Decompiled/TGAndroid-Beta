package n6;

import android.os.Bundle;
public abstract class w {
    public Boolean f15282a;
    public boolean f15283b;
    public final g f15284c;
    public final int d;
    public final Bundle e;
    public final g f15285f;

    public w(g gVar, int i10, Bundle bundle) {
        this.f15285f = gVar;
        Boolean bool = Boolean.TRUE;
        this.f15284c = gVar;
        this.f15282a = bool;
        this.f15283b = false;
        this.d = i10;
        this.e = bundle;
    }

    public abstract void a(k6.a aVar);

    public abstract boolean b();

    public final void c() {
        synchronized (this) {
            this.f15282a = null;
        }
    }

    public final void d() {
        c();
        synchronized (this.f15284c.G) {
            this.f15284c.G.remove(this);
        }
    }
}
