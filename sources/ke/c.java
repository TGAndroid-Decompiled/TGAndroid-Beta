package ke;

import be.j2;
import be.l;
import be.m;
import ge.t;
public final class c implements l, j2 {
    public final m f15026a;
    public final d f15027b;

    public c(d dVar, m mVar) {
        this.f15027b = dVar;
        this.f15026a = mVar;
    }

    @Override
    public final void a(t tVar, int i10) {
        this.f15026a.a(tVar, i10);
    }

    @Override
    public final com.google.android.gms.internal.clearcut.e d(td.l lVar, Object obj) {
        d dVar = this.f15027b;
        b bVar = new b(dVar, this, 1);
        com.google.android.gms.internal.clearcut.e F = this.f15026a.F(bVar, (id.i) obj);
        if (F != null) {
            d.f15028g.set(dVar, null);
        }
        return F;
    }

    @Override
    public final void f(Object obj) {
        this.f15026a.f(obj);
    }

    @Override
    public final kd.h getContext() {
        return this.f15026a.e;
    }

    @Override
    public final void resumeWith(Object obj) {
        this.f15026a.resumeWith(obj);
    }
}
