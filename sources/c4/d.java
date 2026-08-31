package c4;

import j7.k0;
import r3.k;
import r3.l;
import r3.m;
import r3.v;
public final class d implements k {
    public m f2247a;
    public v f2248b;
    public int f2249c;
    public long d;
    public b f2250e;
    public int f2251f;
    public long f2252g;

    @Override
    public final void d(long j10, long j11) {
        int i10;
        if (j10 == 0) {
            i10 = 0;
        } else {
            i10 = 4;
        }
        this.f2249c = i10;
        b bVar = this.f2250e;
        if (bVar != null) {
            bVar.a(j11);
        }
    }

    @Override
    public final void e(m mVar) {
        this.f2247a = mVar;
        this.f2248b = mVar.i2(0, 1);
        mVar.i1();
    }

    @Override
    public final int h(r3.l r21, org.telegram.ui.Components.jb r22) {
        throw new UnsupportedOperationException("Method not decompiled: c4.d.h(r3.l, org.telegram.ui.Components.jb):int");
    }

    @Override
    public final boolean i(l lVar) {
        return k0.a(lVar);
    }

    @Override
    public final void release() {
    }
}
