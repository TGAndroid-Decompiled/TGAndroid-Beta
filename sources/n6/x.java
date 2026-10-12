package n6;

import android.os.Bundle;
public abstract class x {
    public Boolean f16479a;
    public boolean f16480b;
    public final g f16481c;
    public final int d;
    public final Bundle f16482e;
    public final g f16483f;

    public x(g gVar, int i10, Bundle bundle) {
        this.f16483f = gVar;
        Boolean bool = Boolean.TRUE;
        this.f16481c = gVar;
        this.f16479a = bool;
        this.f16480b = false;
        this.d = i10;
        this.f16482e = bundle;
    }

    public abstract void a(k6.a aVar);

    public abstract boolean b();

    public final void c() {
        synchronized (this) {
            this.f16479a = null;
        }
    }

    public final void d() {
        c();
        synchronized (this.f16481c.G) {
            this.f16481c.G.remove(this);
        }
    }
}
