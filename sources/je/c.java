package je;

import ae.k2;
import ae.l;
import ae.m;
import fe.t;
public final class c implements l, k2 {
    public final m f14131a;
    public final d f14132b;

    public c(d dVar, m mVar) {
        this.f14132b = dVar;
        this.f14131a = mVar;
    }

    @Override
    public final da.a a(sd.l lVar, Object obj) {
        d dVar = this.f14132b;
        b bVar = new b(dVar, this, 1);
        da.a F = this.f14131a.F(bVar, (hd.i) obj);
        if (F != null) {
            d.f14133g.set(dVar, null);
        }
        return F;
    }

    @Override
    public final void b(t tVar, int i10) {
        this.f14131a.b(tVar, i10);
    }

    @Override
    public final void e(Object obj) {
        this.f14131a.e(obj);
    }

    @Override
    public final jd.h getContext() {
        return this.f14131a.f474e;
    }

    @Override
    public final void resumeWith(Object obj) {
        this.f14131a.resumeWith(obj);
    }
}
