package n6;

import android.os.Bundle;
public abstract class x {
    public Boolean f16478a;
    public boolean f16479b;
    public final g f16480c;
    public final int d;
    public final Bundle f16481e;
    public final g f16482f;

    public x(g gVar, int i10, Bundle bundle) {
        this.f16482f = gVar;
        Boolean bool = Boolean.TRUE;
        this.f16480c = gVar;
        this.f16478a = bool;
        this.f16479b = false;
        this.d = i10;
        this.f16481e = bundle;
    }

    public abstract void a(k6.a aVar);

    public abstract boolean b();

    public final void c() {
        synchronized (this) {
            this.f16478a = null;
        }
    }

    public final void d() {
        c();
        synchronized (this.f16480c.G) {
            this.f16480c.G.remove(this);
        }
    }
}
