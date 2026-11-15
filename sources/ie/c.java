package ie;

import aa.b0;
import ee.r;
import gd.k;
import rd.q;
import zd.c2;
import zd.l;
import zd.m;
public final class c implements l, c2 {
    public final m f15916a;
    public final d f15917b;

    public c(d dVar, m mVar) {
        this.f15917b = dVar;
        this.f15916a = mVar;
    }

    @Override
    public final void a(r rVar, int i7) {
        this.f15916a.a(rVar, i7);
    }

    @Override
    public final b0 d(Object obj, q qVar) {
        d dVar = this.f15917b;
        b bVar = new b(dVar, this);
        b0 F = this.f15916a.F((k) obj, bVar);
        if (F != null) {
            d.f15918g.set(dVar, null);
        }
        return F;
    }

    @Override
    public final void f(Object obj) {
        this.f15916a.f(obj);
    }

    @Override
    public final id.h getContext() {
        return this.f15916a.f61302e;
    }

    @Override
    public final void resumeWith(Object obj) {
        this.f15916a.resumeWith(obj);
    }
}
