package n6;

import android.os.Bundle;
public abstract class w {
    public Boolean f15310a;
    public boolean f15311b;
    public final g f15312c;
    public final int d;
    public final Bundle e;
    public final g f15313f;

    public w(g gVar, int i10, Bundle bundle) {
        this.f15313f = gVar;
        Boolean bool = Boolean.TRUE;
        this.f15312c = gVar;
        this.f15310a = bool;
        this.f15311b = false;
        this.d = i10;
        this.e = bundle;
    }

    public abstract void a(k6.a aVar);

    public abstract boolean b();

    public final void c() {
        synchronized (this) {
            this.f15310a = null;
        }
    }

    public final void d() {
        c();
        synchronized (this.f15312c.G) {
            this.f15312c.G.remove(this);
        }
    }
}
