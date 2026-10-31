package e3;

import a3.l;
import c3.o;
import c3.p;
import c3.q;
import e2.l0;
import e2.x;
import e9.n0;
import e9.x1;
import java.util.List;
import t7.u;
public final class b implements o {
    public final x f6215a;
    public final l f6216b;
    public final boolean f6217c;
    public final u d;
    public int e;
    public q f6218f;
    public c f6219g;
    public long h;
    public e[] f6220i;
    public long f6221j;
    public e f6222k;
    public int f6223l;
    public long f6224m;
    public long f6225n;
    public int f6226o;
    public boolean f6227p;

    public b(int i10, u uVar) {
        this.d = uVar;
        this.f6217c = (i10 & 1) == 0;
        this.f6215a = new x(12);
        this.f6216b = new Object();
        this.f6218f = new kb.a(4);
        this.f6220i = new e[0];
        this.f6224m = -1L;
        this.f6225n = -1L;
        this.f6223l = -1;
        this.h = -9223372036854775807L;
    }

    @Override
    public final boolean a(p pVar) {
        x xVar = this.f6215a;
        pVar.b(0, 12, xVar.f6207a);
        xVar.N(0);
        if (xVar.o() != 1179011410) {
            return false;
        }
        xVar.O(4);
        if (xVar.o() != 541677121) {
            return false;
        }
        return true;
    }

    @Override
    public final void c(q qVar) {
        this.e = 0;
        if (this.f6217c) {
            qVar = new ac.a(qVar, this.d);
        }
        this.f6218f = qVar;
        this.f6221j = -1L;
    }

    @Override
    public final void d(long j10, long j11) {
        e[] eVarArr;
        this.f6221j = -1L;
        this.f6222k = null;
        for (e eVar : this.f6220i) {
            if (eVar.f6242k == 0) {
                eVar.f6240i = 0;
            } else {
                eVar.f6240i = eVar.f6245n[l0.f(eVar.f6244m, j10, true)];
            }
        }
        if (j10 == 0) {
            if (this.f6220i.length == 0) {
                this.e = 0;
                return;
            } else {
                this.e = 3;
                return;
            }
        }
        this.e = 6;
    }

    @Override
    public final List e() {
        e9.l0 l0Var = n0.f6390b;
        return x1.e;
    }

    @Override
    public final int f(c3.p r24, c3.s r25) {
        throw new UnsupportedOperationException("Method not decompiled: e3.b.f(c3.p, c3.s):int");
    }

    @Override
    public final o b() {
        return this;
    }

    @Override
    public final void release() {
    }
}
