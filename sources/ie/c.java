package ie;

import ee.t;
import ee.v;
import zd.i2;
import zd.l;
import zd.m;
public final class c implements l, i2 {
    public final m f11084a;
    public final d f11085b;

    public c(d dVar, m mVar) {
        this.f11085b = dVar;
        this.f11084a = mVar;
    }

    @Override
    public final void a(t tVar, int i10) {
        this.f11084a.a(tVar, i10);
    }

    @Override
    public final v b(rd.l lVar, Object obj) {
        d dVar = this.f11085b;
        b bVar = new b(dVar, this, 1);
        v F = this.f11084a.F(bVar, (gd.i) obj);
        if (F != null) {
            d.f11086g.set(dVar, null);
        }
        return F;
    }

    @Override
    public final void e(Object obj) {
        this.f11084a.e(obj);
    }

    @Override
    public final id.h getContext() {
        return this.f11084a.e;
    }

    @Override
    public final void resumeWith(Object obj) {
        this.f11084a.resumeWith(obj);
    }
}
