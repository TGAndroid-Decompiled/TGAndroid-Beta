package ke;

import be.j2;
import be.l;
import be.m;
import ge.t;
public final class c implements l, j2 {
    public final m f15033a;
    public final d f15034b;

    public c(d dVar, m mVar) {
        this.f15034b = dVar;
        this.f15033a = mVar;
    }

    @Override
    public final void a(t tVar, int i10) {
        this.f15033a.a(tVar, i10);
    }

    @Override
    public final com.google.android.gms.internal.clearcut.e d(td.l lVar, Object obj) {
        d dVar = this.f15034b;
        b bVar = new b(dVar, this, 1);
        com.google.android.gms.internal.clearcut.e F = this.f15033a.F(bVar, (id.i) obj);
        if (F != null) {
            d.f15035g.set(dVar, null);
        }
        return F;
    }

    @Override
    public final void f(Object obj) {
        this.f15033a.f(obj);
    }

    @Override
    public final kd.h getContext() {
        return this.f15033a.e;
    }

    @Override
    public final void resumeWith(Object obj) {
        this.f15033a.resumeWith(obj);
    }
}
