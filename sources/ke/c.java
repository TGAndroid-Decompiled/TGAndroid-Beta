package ke;

import be.j2;
import be.l;
import be.m;
import ge.t;
public final class c implements l, j2 {
    public final m f15032a;
    public final d f15033b;

    public c(d dVar, m mVar) {
        this.f15033b = dVar;
        this.f15032a = mVar;
    }

    @Override
    public final void a(t tVar, int i10) {
        this.f15032a.a(tVar, i10);
    }

    @Override
    public final com.google.android.gms.internal.clearcut.e d(td.l lVar, Object obj) {
        d dVar = this.f15033b;
        b bVar = new b(dVar, this, 1);
        com.google.android.gms.internal.clearcut.e F = this.f15032a.F(bVar, (id.i) obj);
        if (F != null) {
            d.f15034g.set(dVar, null);
        }
        return F;
    }

    @Override
    public final void f(Object obj) {
        this.f15032a.f(obj);
    }

    @Override
    public final kd.h getContext() {
        return this.f15032a.e;
    }

    @Override
    public final void resumeWith(Object obj) {
        this.f15032a.resumeWith(obj);
    }
}
