package ke;

import be.j2;
import be.l;
import be.m;
import ge.t;
public final class c implements l, j2 {
    public final m f14231a;
    public final d f14232b;

    public c(d dVar, m mVar) {
        this.f14232b = dVar;
        this.f14231a = mVar;
    }

    @Override
    public final void a(t tVar, int i10) {
        this.f14231a.a(tVar, i10);
    }

    @Override
    public final a6.i d(td.l lVar, Object obj) {
        d dVar = this.f14232b;
        b bVar = new b(dVar, this, 1);
        a6.i F = this.f14231a.F(bVar, (id.i) obj);
        if (F != null) {
            d.f14233g.set(dVar, null);
        }
        return F;
    }

    @Override
    public final void f(Object obj) {
        this.f14231a.f(obj);
    }

    @Override
    public final kd.h getContext() {
        return this.f14231a.e;
    }

    @Override
    public final void resumeWith(Object obj) {
        this.f14231a.resumeWith(obj);
    }
}
