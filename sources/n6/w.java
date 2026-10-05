package n6;

import android.os.Bundle;
public abstract class w {
    public Boolean f16761a;
    public boolean f16762b;
    public final g f16763c;
    public final int d;
    public final Bundle f16764e;
    public final g f16765f;

    public w(g gVar, int i10, Bundle bundle) {
        this.f16765f = gVar;
        Boolean bool = Boolean.TRUE;
        this.f16763c = gVar;
        this.f16761a = bool;
        this.f16762b = false;
        this.d = i10;
        this.f16764e = bundle;
    }

    public abstract void a(k6.a aVar);

    public abstract boolean b();

    public final void c() {
        synchronized (this) {
            this.f16761a = null;
        }
    }

    public final void d() {
        c();
        synchronized (this.f16763c.G) {
            this.f16763c.G.remove(this);
        }
    }
}
