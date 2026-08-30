package a4;

import h5.d0;
import h5.w;
import j3.r1;
import k7.w6;
import r3.m;
public final class e implements r3.k {
    public m f61a;
    public j f62b;
    public boolean f63c;

    public final boolean a(r3.l lVar) {
        boolean z4;
        g gVar = new g();
        if (gVar.a(lVar, true) && (gVar.f67a & 2) == 2) {
            int min = Math.min(gVar.e, 8);
            w wVar = new w(min);
            lVar.c(0, min, wVar.f7000a);
            wVar.F(0);
            if (wVar.a() >= 5 && wVar.u() == 127 && wVar.v() == 1179402563) {
                this.f62b = new j();
                return true;
            }
            wVar.F(0);
            try {
                z4 = w6.c(1, wVar, true);
            } catch (r1 unused) {
                z4 = false;
            }
            if (z4) {
                this.f62b = new j();
            } else {
                wVar.F(0);
                if (i.e(wVar, i.f72o)) {
                    this.f62b = new j();
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public final void d(long j10, long j11) {
        j jVar = this.f62b;
        if (jVar != null) {
            f fVar = jVar.f75a;
            g gVar = fVar.f64a;
            gVar.f67a = 0;
            gVar.f68b = 0L;
            gVar.f69c = 0;
            gVar.d = 0;
            gVar.e = 0;
            fVar.f65b.C(0);
            fVar.f66c = -1;
            fVar.e = false;
            if (j10 == 0) {
                jVar.d(!jVar.f83l);
            } else if (jVar.h != 0) {
                long j12 = (jVar.f80i * j11) / 1000000;
                jVar.e = j12;
                h hVar = jVar.d;
                int i10 = d0.f6937a;
                hVar.v(j12);
                jVar.h = 2;
            }
        }
    }

    @Override
    public final void e(m mVar) {
        this.f61a = mVar;
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
