package ie;

import ee.r;
import gd.k;
import rd.q;
import zd.c2;
import zd.l;
import zd.m;
public final class c implements l, c2 {
    public final m f15456a;
    public final d f15457b;

    public c(d dVar, m mVar) {
        this.f15457b = dVar;
        this.f15456a = mVar;
    }

    @Override
    public final void a(r rVar, int i7) {
        this.f15456a.a(rVar, i7);
    }

    @Override
    public final com.google.android.gms.internal.clearcut.e d(Object obj, q qVar) {
        d dVar = this.f15457b;
        b bVar = new b(dVar, this);
        com.google.android.gms.internal.clearcut.e F = this.f15456a.F((k) obj, bVar);
        if (F != null) {
            d.f15458g.set(dVar, null);
        }
        return F;
    }

    @Override
    public final void f(Object obj) {
        this.f15456a.f(obj);
    }

    @Override
    public final id.h getContext() {
        return this.f15456a.f59994e;
    }

    @Override
    public final void resumeWith(Object obj) {
        this.f15456a.resumeWith(obj);
    }
}
