package n6;

import android.os.Bundle;
public abstract class w {
    public Boolean f16751a;
    public boolean f16752b;
    public final g f16753c;
    public final int d;
    public final Bundle f16754e;
    public final g f16755f;

    public w(g gVar, int i10, Bundle bundle) {
        this.f16755f = gVar;
        Boolean bool = Boolean.TRUE;
        this.f16753c = gVar;
        this.f16751a = bool;
        this.f16752b = false;
        this.d = i10;
        this.f16754e = bundle;
    }

    public abstract void a(k6.a aVar);

    public abstract boolean b();

    public final void c() {
        synchronized (this) {
            this.f16751a = null;
        }
    }

    public final void d() {
        c();
        synchronized (this.f16753c.G) {
            this.f16753c.G.remove(this);
        }
    }
}
