package ie;

import ee.t;
import ee.v;
import zd.i2;
import zd.l;
import zd.m;
public final class c implements l, i2 {
    public final m f11087a;
    public final d f11088b;

    public c(d dVar, m mVar) {
        this.f11088b = dVar;
        this.f11087a = mVar;
    }

    @Override
    public final void a(t tVar, int i10) {
        this.f11087a.a(tVar, i10);
    }

    @Override
    public final v b(rd.l lVar, Object obj) {
        d dVar = this.f11088b;
        b bVar = new b(dVar, this, 1);
        v F = this.f11087a.F(bVar, (gd.i) obj);
        if (F != null) {
            d.f11089g.set(dVar, null);
        }
        return F;
    }

    @Override
    public final void e(Object obj) {
        this.f11087a.e(obj);
    }

    @Override
    public final id.h getContext() {
        return this.f11087a.e;
    }

    @Override
    public final void resumeWith(Object obj) {
        this.f11087a.resumeWith(obj);
    }
}
