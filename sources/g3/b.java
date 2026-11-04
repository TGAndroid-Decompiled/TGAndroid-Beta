package g3;

import b4.n;
import e3.o;
import e3.p;
import e3.q;
import g2.n0;
import g2.y;
import g9.g0;
import g9.i0;
import g9.s1;
import java.util.List;
public final class b implements o {
    public final y f11929a;
    public final a7.d f11930b;
    public final boolean f11931c;
    public final mb.b d;
    public int f11932e;
    public q f11933f;
    public c f11934g;
    public long h;
    public e[] f11935i;
    public long f11936j;
    public e f11937k;
    public int f11938l;
    public long f11939m;
    public long f11940n;
    public int f11941o;
    public boolean f11942p;

    public b(int i3, mb.b bVar) {
        this.d = bVar;
        this.f11931c = (i3 & 1) == 0;
        this.f11929a = new y(12);
        this.f11930b = new Object();
        this.f11933f = new mb.b(6);
        this.f11935i = new e[0];
        this.f11939m = -1L;
        this.f11940n = -1L;
        this.f11938l = -1;
        this.h = -9223372036854775807L;
    }

    @Override
    public final boolean b(p pVar) {
        y yVar = this.f11929a;
        pVar.c(0, 12, yVar.f11923a);
        yVar.N(0);
        if (yVar.o() != 1179011410) {
            return false;
        }
        yVar.O(4);
        if (yVar.o() != 541677121) {
            return false;
        }
        return true;
    }

    @Override
    public final void c(q qVar) {
        this.f11932e = 0;
        if (this.f11931c) {
            qVar = new n(qVar, this.d);
        }
        this.f11933f = qVar;
        this.f11936j = -1L;
    }

    @Override
    public final void d(long j10, long j11) {
        e[] eVarArr;
        this.f11936j = -1L;
        this.f11937k = null;
        for (e eVar : this.f11935i) {
            if (eVar.f11959k == 0) {
                eVar.f11957i = 0;
            } else {
                eVar.f11957i = eVar.f11962n[n0.f(eVar.f11961m, j10, true)];
            }
        }
        if (j10 == 0) {
            if (this.f11935i.length == 0) {
                this.f11932e = 0;
                return;
            } else {
                this.f11932e = 3;
                return;
            }
        }
        this.f11932e = 6;
    }

    @Override
    public final List e() {
        g0 g0Var = i0.f12083b;
        return s1.f12146e;
    }

    @Override
    public final int f(e3.p r24, e3.s r25) {
        throw new UnsupportedOperationException("Method not decompiled: g3.b.f(e3.p, e3.s):int");
    }

    @Override
    public final o a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
