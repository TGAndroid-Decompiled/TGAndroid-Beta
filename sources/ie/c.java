package ie;

import ee.t;
import ee.v;
import zd.i2;
import zd.l;
import zd.m;
public final class c implements l, i2 {
    public final m f10568a;
    public final d f10569b;

    public c(d dVar, m mVar) {
        this.f10569b = dVar;
        this.f10568a = mVar;
    }

    @Override
    public final void a(t tVar, int i10) {
        this.f10568a.a(tVar, i10);
    }

    @Override
    public final v b(rd.l lVar, Object obj) {
        d dVar = this.f10569b;
        b bVar = new b(dVar, this, 1);
        v F = this.f10568a.F(bVar, (gd.i) obj);
        if (F != null) {
            d.f10570g.set(dVar, null);
        }
        return F;
    }

    @Override
    public final void e(Object obj) {
        this.f10568a.e(obj);
    }

    @Override
    public final id.h getContext() {
        return this.f10568a.e;
    }

    @Override
    public final void resumeWith(Object obj) {
        this.f10568a.resumeWith(obj);
    }
}
