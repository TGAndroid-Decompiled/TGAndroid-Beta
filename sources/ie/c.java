package ie;

import ee.t;
import zd.i2;
import zd.l;
import zd.m;
public final class c implements l, i2 {
    public final m f11957a;
    public final d f11958b;

    public c(d dVar, m mVar) {
        this.f11958b = dVar;
        this.f11957a = mVar;
    }

    @Override
    public final void a(t tVar, int i10) {
        this.f11957a.a(tVar, i10);
    }

    @Override
    public final d9.f b(rd.l lVar, Object obj) {
        d dVar = this.f11958b;
        b bVar = new b(dVar, this, 1);
        d9.f F = this.f11957a.F(bVar, (gd.i) obj);
        if (F != null) {
            d.f11959g.set(dVar, null);
        }
        return F;
    }

    @Override
    public final void e(Object obj) {
        this.f11957a.e(obj);
    }

    @Override
    public final id.h getContext() {
        return this.f11957a.f51569e;
    }

    @Override
    public final void resumeWith(Object obj) {
        this.f11957a.resumeWith(obj);
    }
}
