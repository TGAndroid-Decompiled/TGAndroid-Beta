package n6;

import android.os.Bundle;
public abstract class w {
    public Boolean f17242a;
    public boolean f17243b;
    public final g f17244c;
    public final int d;
    public final Bundle e;
    public final g f17245f;

    public w(g gVar, int i10, Bundle bundle) {
        this.f17245f = gVar;
        Boolean bool = Boolean.TRUE;
        this.f17244c = gVar;
        this.f17242a = bool;
        this.f17243b = false;
        this.d = i10;
        this.e = bundle;
    }

    public abstract void a(k6.a aVar);

    public abstract boolean b();

    public final void c() {
        synchronized (this) {
            this.f17242a = null;
        }
    }

    public final void d() {
        c();
        synchronized (this.f17244c.G) {
            this.f17244c.G.remove(this);
        }
    }
}
