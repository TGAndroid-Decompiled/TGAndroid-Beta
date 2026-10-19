package n6;

import android.os.Bundle;
public abstract class w {
    public Boolean f17249a;
    public boolean f17250b;
    public final g f17251c;
    public final int d;
    public final Bundle e;
    public final g f17252f;

    public w(g gVar, int i10, Bundle bundle) {
        this.f17252f = gVar;
        Boolean bool = Boolean.TRUE;
        this.f17251c = gVar;
        this.f17249a = bool;
        this.f17250b = false;
        this.d = i10;
        this.e = bundle;
    }

    public abstract void a(k6.a aVar);

    public abstract boolean b();

    public final void c() {
        synchronized (this) {
            this.f17249a = null;
        }
    }

    public final void d() {
        c();
        synchronized (this.f17251c.G) {
            this.f17251c.G.remove(this);
        }
    }
}
