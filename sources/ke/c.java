package ke;

import be.j2;
import be.l;
import be.m;
import ge.t;
public final class c implements l, j2 {
    public final m f14229a;
    public final d f14230b;

    public c(d dVar, m mVar) {
        this.f14230b = dVar;
        this.f14229a = mVar;
    }

    @Override
    public final void a(t tVar, int i10) {
        this.f14229a.a(tVar, i10);
    }

    @Override
    public final a6.i d(td.l lVar, Object obj) {
        d dVar = this.f14230b;
        b bVar = new b(dVar, this, 1);
        a6.i F = this.f14229a.F(bVar, (id.i) obj);
        if (F != null) {
            d.f14231g.set(dVar, null);
        }
        return F;
    }

    @Override
    public final void f(Object obj) {
        this.f14229a.f(obj);
    }

    @Override
    public final kd.h getContext() {
        return this.f14229a.e;
    }

    @Override
    public final void resumeWith(Object obj) {
        this.f14229a.resumeWith(obj);
    }
}
