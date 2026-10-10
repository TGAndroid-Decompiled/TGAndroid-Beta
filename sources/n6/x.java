package n6;

import android.os.Bundle;
public abstract class x {
    public Boolean f16733a;
    public boolean f16734b;
    public final g f16735c;
    public final int d;
    public final Bundle f16736e;
    public final g f16737f;

    public x(g gVar, int i10, Bundle bundle) {
        this.f16737f = gVar;
        Boolean bool = Boolean.TRUE;
        this.f16735c = gVar;
        this.f16733a = bool;
        this.f16734b = false;
        this.d = i10;
        this.f16736e = bundle;
    }

    public abstract void a(k6.a aVar);

    public abstract boolean b();

    public final void c() {
        synchronized (this) {
            this.f16733a = null;
        }
    }

    public final void d() {
        c();
        synchronized (this.f16735c.G) {
            this.f16735c.G.remove(this);
        }
    }
}
