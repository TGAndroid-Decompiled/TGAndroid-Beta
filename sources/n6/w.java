package n6;

import android.os.Bundle;
public abstract class w {
    public Boolean f16635a;
    public boolean f16636b;
    public final g f16637c;
    public final int d;
    public final Bundle f16638e;
    public final g f16639f;

    public w(g gVar, int i10, Bundle bundle) {
        this.f16639f = gVar;
        Boolean bool = Boolean.TRUE;
        this.f16637c = gVar;
        this.f16635a = bool;
        this.f16636b = false;
        this.d = i10;
        this.f16638e = bundle;
    }

    public abstract void a(k6.a aVar);

    public abstract boolean b();

    public final void c() {
        synchronized (this) {
            this.f16635a = null;
        }
    }

    public final void d() {
        c();
        synchronized (this.f16637c.G) {
            this.f16637c.G.remove(this);
        }
    }
}
