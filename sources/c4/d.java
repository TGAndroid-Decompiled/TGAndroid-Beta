package c4;

import j7.j0;
import r3.k;
import r3.l;
import r3.m;
import r3.v;
public final class d implements k {
    public m f2067a;
    public v f2068b;
    public int f2069c;
    public long d;
    public b e;
    public int f2070f;
    public long f2071g;

    @Override
    public final void d(long j10, long j11) {
        int i10;
        if (j10 == 0) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        this.f2069c = i10;
        b bVar = this.e;
        if (bVar != null) {
            bVar.a(j11);
        }
    }

    @Override
    public final void e(m mVar) {
        this.f2067a = mVar;
        this.f2068b = mVar.c2(0, 1);
        mVar.f1();
    }

    @Override
    public final int h(r3.l r21, org.telegram.ui.Components.jb r22) {
        throw new UnsupportedOperationException("Method not decompiled: c4.d.h(r3.l, org.telegram.ui.Components.jb):int");
    }

    @Override
    public final boolean i(l lVar) {
        return j0.a(lVar);
    }

    @Override
    public final void release() {
    }
}
