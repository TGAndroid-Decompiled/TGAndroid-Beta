package o6;

import android.os.Bundle;
public abstract class w {
    public Boolean f19190a;
    public boolean f19191b;
    public final g f19192c;
    public final int d;
    public final Bundle e;
    public final g f19193f;

    public w(g gVar, int i10, Bundle bundle) {
        this.f19193f = gVar;
        Boolean bool = Boolean.TRUE;
        this.f19192c = gVar;
        this.f19190a = bool;
        this.f19191b = false;
        this.d = i10;
        this.e = bundle;
    }

    public abstract void a(l6.a aVar);

    public abstract boolean b();

    public final void c() {
        synchronized (this) {
            this.f19190a = null;
        }
    }

    public final void d() {
        c();
        synchronized (this.f19192c.G) {
            this.f19192c.G.remove(this);
        }
    }
}
