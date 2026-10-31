package ce;

import td.j2;
import td.l;
import td.m;
import yd.t;
public final class c implements l, j2 {
    public final m f4126a;
    public final d f4127b;

    public c(d dVar, m mVar) {
        this.f4127b = dVar;
        this.f4126a = mVar;
    }

    @Override
    public final void a(t tVar, int i10) {
        this.f4126a.a(tVar, i10);
    }

    @Override
    public final ea.a d(ld.l lVar, Object obj) {
        d dVar = this.f4127b;
        b bVar = new b(dVar, this, 1);
        ea.a F = this.f4126a.F(bVar, (ad.j) obj);
        if (F != null) {
            d.f4128g.set(dVar, null);
        }
        return F;
    }

    @Override
    public final void f(Object obj) {
        this.f4126a.f(obj);
    }

    @Override
    public final cd.h getContext() {
        return this.f4126a.e;
    }

    @Override
    public final void resumeWith(Object obj) {
        this.f4126a.resumeWith(obj);
    }
}
