package ie;

import ee.r;
import gd.k;
import rd.q;
import zd.c2;
import zd.l;
import zd.m;
public final class c implements l, c2 {
    public final m f15459a;
    public final d f15460b;

    public c(d dVar, m mVar) {
        this.f15460b = dVar;
        this.f15459a = mVar;
    }

    @Override
    public final void a(r rVar, int i7) {
        this.f15459a.a(rVar, i7);
    }

    @Override
    public final com.google.android.gms.internal.clearcut.e d(Object obj, q qVar) {
        d dVar = this.f15460b;
        b bVar = new b(dVar, this);
        com.google.android.gms.internal.clearcut.e F = this.f15459a.F((k) obj, bVar);
        if (F != null) {
            d.f15461g.set(dVar, null);
        }
        return F;
    }

    @Override
    public final void f(Object obj) {
        this.f15459a.f(obj);
    }

    @Override
    public final id.h getContext() {
        return this.f15459a.f60103e;
    }

    @Override
    public final void resumeWith(Object obj) {
        this.f15459a.resumeWith(obj);
    }
}
