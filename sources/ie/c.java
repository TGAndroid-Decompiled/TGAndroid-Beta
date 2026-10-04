package ie;

import ee.t;
import zd.i2;
import zd.l;
import zd.m;
public final class c implements l, i2 {
    public final m f12061a;
    public final d f12062b;

    public c(d dVar, m mVar) {
        this.f12062b = dVar;
        this.f12061a = mVar;
    }

    @Override
    public final void a(t tVar, int i10) {
        this.f12061a.a(tVar, i10);
    }

    @Override
    public final com.google.android.gms.internal.clearcut.e b(rd.l lVar, Object obj) {
        d dVar = this.f12062b;
        b bVar = new b(dVar, this, 1);
        com.google.android.gms.internal.clearcut.e F = this.f12061a.F(bVar, (gd.i) obj);
        if (F != null) {
            d.f12063g.set(dVar, null);
        }
        return F;
    }

    @Override
    public final void e(Object obj) {
        this.f12061a.e(obj);
    }

    @Override
    public final id.h getContext() {
        return this.f12061a.f53242e;
    }

    @Override
    public final void resumeWith(Object obj) {
        this.f12061a.resumeWith(obj);
    }
}
