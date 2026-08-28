package o3;

import d5.f0;
import d5.y;
import m3.k;
import m3.l;
import m3.m;
public final class b implements k {
    public int f18813c;
    public c f18814e;
    public long h;
    public e f18817i;
    public int f18821m;
    public boolean f18822n;
    public final y f18811a = new y(12);
    public final a8.b f18812b = new Object();
    public m d = new ya.b(14);
    public e[] f18816g = new e[0];
    public long f18819k = -1;
    public long f18820l = -1;
    public int f18818j = -1;
    public long f18815f = -9223372036854775807L;

    @Override
    public final int b(m3.l r23, m3.n r24) {
        throw new UnsupportedOperationException("Method not decompiled: o3.b.b(m3.l, m3.n):int");
    }

    @Override
    public final void c(m mVar) {
        this.f18813c = 0;
        this.d = mVar;
        this.h = -1L;
    }

    @Override
    public final boolean f(l lVar) {
        y yVar = this.f18811a;
        lVar.c(0, 12, yVar.f4410a);
        yVar.C(0);
        if (yVar.g() == 1179011410) {
            yVar.D(4);
            if (yVar.g() == 541677121) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void g(long j10, long j11) {
        e[] eVarArr;
        this.h = -1L;
        this.f18817i = null;
        for (e eVar : this.f18816g) {
            if (eVar.f18837j == 0) {
                eVar.h = 0;
            } else {
                eVar.h = eVar.f18839l[f0.e(eVar.f18838k, j10, true)];
            }
        }
        if (j10 == 0) {
            if (this.f18816g.length == 0) {
                this.f18813c = 0;
                return;
            } else {
                this.f18813c = 3;
                return;
            }
        }
        this.f18813c = 6;
    }

    @Override
    public final void release() {
    }
}
