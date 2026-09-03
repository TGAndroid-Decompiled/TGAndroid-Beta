package b6;

import android.os.Bundle;
public abstract class x {
    public Boolean f1668a;
    public boolean f1669b;
    public final g f1670c;
    public final int d;
    public final Bundle e;
    public final g f1671f;

    public x(g gVar, int i10, Bundle bundle) {
        this.f1671f = gVar;
        Boolean bool = Boolean.TRUE;
        this.f1670c = gVar;
        this.f1668a = bool;
        this.f1669b = false;
        this.d = i10;
        this.e = bundle;
    }

    public abstract void a(y5.a aVar);

    public abstract boolean b();

    public final void c() {
        synchronized (this) {
            this.f1668a = null;
        }
    }

    public final void d() {
        c();
        synchronized (this.f1670c.D) {
            this.f1670c.D.remove(this);
        }
    }
}
