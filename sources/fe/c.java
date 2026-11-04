package fe;

import be.r;
import be.t;
import dd.k;
import od.q;
import wd.c2;
import wd.l;
import wd.m;
public final class c implements l, c2 {
    public final m f11570a;
    public final d f11571b;

    public c(d dVar, m mVar) {
        this.f11571b = dVar;
        this.f11570a = mVar;
    }

    @Override
    public final void a(r rVar, int i3) {
        this.f11570a.a(rVar, i3);
    }

    @Override
    public final void e(Object obj) {
        this.f11570a.e(obj);
    }

    @Override
    public final t f(Object obj, q qVar) {
        d dVar = this.f11571b;
        b bVar = new b(dVar, this);
        t F = this.f11570a.F((k) obj, bVar);
        if (F != null) {
            d.f11572g.set(dVar, null);
        }
        return F;
    }

    @Override
    public final fd.h getContext() {
        return this.f11570a.f57513e;
    }

    @Override
    public final void resumeWith(Object obj) {
        this.f11570a.resumeWith(obj);
    }
}
