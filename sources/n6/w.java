package n6;

import android.os.Bundle;
public abstract class w {
    public Boolean f15320a;
    public boolean f15321b;
    public final g f15322c;
    public final int d;
    public final Bundle e;
    public final g f15323f;

    public w(g gVar, int i10, Bundle bundle) {
        this.f15323f = gVar;
        Boolean bool = Boolean.TRUE;
        this.f15322c = gVar;
        this.f15320a = bool;
        this.f15321b = false;
        this.d = i10;
        this.e = bundle;
    }

    public abstract void a(k6.a aVar);

    public abstract boolean b();

    public final void c() {
        synchronized (this) {
            this.f15320a = null;
        }
    }

    public final void d() {
        c();
        synchronized (this.f15322c.G) {
            this.f15322c.G.remove(this);
        }
    }
}
