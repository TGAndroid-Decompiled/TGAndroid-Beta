package le;

import ce.j2;
import ce.l;
import ce.m;
import he.t;
import he.v;
public final class c implements l, j2 {
    public final m f16991a;
    public final d f16992b;

    public c(d dVar, m mVar) {
        this.f16992b = dVar;
        this.f16991a = mVar;
    }

    @Override
    public final void a(t tVar, int i10) {
        this.f16991a.a(tVar, i10);
    }

    @Override
    public final v d(ud.l lVar, Object obj) {
        d dVar = this.f16992b;
        b bVar = new b(dVar, this, 1);
        v F = this.f16991a.F(bVar, (jd.i) obj);
        if (F != null) {
            d.f16993g.set(dVar, null);
        }
        return F;
    }

    @Override
    public final void f(Object obj) {
        this.f16991a.f(obj);
    }

    @Override
    public final ld.h getContext() {
        return this.f16991a.e;
    }

    @Override
    public final void resumeWith(Object obj) {
        this.f16991a.resumeWith(obj);
    }
}
