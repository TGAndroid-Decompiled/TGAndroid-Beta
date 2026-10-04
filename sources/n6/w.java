package n6;

import android.os.Bundle;
public abstract class w {
    public Boolean f16752a;
    public boolean f16753b;
    public final g f16754c;
    public final int d;
    public final Bundle f16755e;
    public final g f16756f;

    public w(g gVar, int i10, Bundle bundle) {
        this.f16756f = gVar;
        Boolean bool = Boolean.TRUE;
        this.f16754c = gVar;
        this.f16752a = bool;
        this.f16753b = false;
        this.d = i10;
        this.f16755e = bundle;
    }

    public abstract void a(k6.a aVar);

    public abstract boolean b();

    public final void c() {
        synchronized (this) {
            this.f16752a = null;
        }
    }

    public final void d() {
        c();
        synchronized (this.f16754c.G) {
            this.f16754c.G.remove(this);
        }
    }
}
