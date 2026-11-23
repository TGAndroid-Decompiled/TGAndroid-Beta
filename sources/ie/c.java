package ie;

import ee.r;
import ee.t;
import gd.k;
import rd.q;
import zd.c2;
import zd.l;
import zd.m;
public final class c implements l, c2 {
    public final m f16223a;
    public final d f16224b;

    public c(d dVar, m mVar) {
        this.f16224b = dVar;
        this.f16223a = mVar;
    }

    @Override
    public final void a(r rVar, int i7) {
        this.f16223a.a(rVar, i7);
    }

    @Override
    public final t d(Object obj, q qVar) {
        d dVar = this.f16224b;
        b bVar = new b(dVar, this);
        t F = this.f16223a.F((k) obj, bVar);
        if (F != null) {
            d.f16225g.set(dVar, null);
        }
        return F;
    }

    @Override
    public final void f(Object obj) {
        this.f16223a.f(obj);
    }

    @Override
    public final id.h getContext() {
        return this.f16223a.f61877e;
    }

    @Override
    public final void resumeWith(Object obj) {
        this.f16223a.resumeWith(obj);
    }
}
