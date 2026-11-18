package ie;

import ee.r;
import ee.t;
import gd.k;
import rd.q;
import zd.c2;
import zd.l;
import zd.m;
public final class c implements l, c2 {
    public final m f16232a;
    public final d f16233b;

    public c(d dVar, m mVar) {
        this.f16233b = dVar;
        this.f16232a = mVar;
    }

    @Override
    public final void a(r rVar, int i7) {
        this.f16232a.a(rVar, i7);
    }

    @Override
    public final t d(Object obj, q qVar) {
        d dVar = this.f16233b;
        b bVar = new b(dVar, this);
        t F = this.f16232a.F((k) obj, bVar);
        if (F != null) {
            d.f16234g.set(dVar, null);
        }
        return F;
    }

    @Override
    public final void f(Object obj) {
        this.f16232a.f(obj);
    }

    @Override
    public final id.h getContext() {
        return this.f16232a.f61866e;
    }

    @Override
    public final void resumeWith(Object obj) {
        this.f16232a.resumeWith(obj);
    }
}
