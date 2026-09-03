package a4;

import h5.d0;
import h5.w;
import j3.r1;
import k7.x6;
import r3.m;
public final class e implements r3.k {
    public m f60a;
    public j f61b;
    public boolean f62c;

    public final boolean a(r3.l lVar) {
        boolean z4;
        g gVar = new g();
        if (gVar.a(lVar, true) && (gVar.f66a & 2) == 2) {
            int min = Math.min(gVar.e, 8);
            w wVar = new w(min);
            lVar.b(0, min, wVar.f6987a);
            wVar.F(0);
            if (wVar.a() >= 5 && wVar.u() == 127 && wVar.v() == 1179402563) {
                this.f61b = new j();
                return true;
            }
            wVar.F(0);
            try {
                z4 = x6.c(1, wVar, true);
            } catch (r1 unused) {
                z4 = false;
            }
            if (z4) {
                this.f61b = new j();
            } else {
                wVar.F(0);
                if (i.e(wVar, i.f71o)) {
                    this.f61b = new j();
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public final void d(long j10, long j11) {
        j jVar = this.f61b;
        if (jVar != null) {
            f fVar = jVar.f74a;
            g gVar = fVar.f63a;
            gVar.f66a = 0;
            gVar.f67b = 0L;
            gVar.f68c = 0;
            gVar.d = 0;
            gVar.e = 0;
            fVar.f64b.C(0);
            fVar.f65c = -1;
            fVar.e = false;
            if (j10 == 0) {
                jVar.d(!jVar.f82l);
            } else if (jVar.h != 0) {
                long j12 = (jVar.f79i * j11) / 1000000;
                jVar.e = j12;
                h hVar = jVar.d;
                int i10 = d0.f6924a;
                hVar.p(j12);
                jVar.h = 2;
            }
        }
    }

    @Override
    public final void e(m mVar) {
        this.f60a = mVar;
    }

    @Override
    public final int h(r3.l r21, org.telegram.ui.Components.jb r22) {
        throw new UnsupportedOperationException("Method not decompiled: a4.e.h(r3.l, org.telegram.ui.Components.jb):int");
    }

    @Override
    public final boolean i(r3.l lVar) {
        try {
            return a(lVar);
        } catch (r1 unused) {
            return false;
        }
    }

    @Override
    public final void release() {
    }
}
