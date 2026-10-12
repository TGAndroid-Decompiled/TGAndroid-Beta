package e3;

import a3.l;
import c3.o;
import c3.p;
import c3.q;
import e2.m0;
import e2.x;
import e9.l0;
import e9.n0;
import e9.x1;
import java.util.List;
import t7.u;
public final class b implements o {
    public final x f8419a;
    public final l f8420b;
    public final boolean f8421c;
    public final u d;
    public int e;
    public q f8422f;
    public c f8423g;
    public long h;
    public e[] f8424i;
    public long f8425j;
    public e f8426k;
    public int f8427l;
    public long f8428m;
    public long f8429n;
    public int f8430o;
    public boolean f8431p;

    public b(int i10, u uVar) {
        this.d = uVar;
        this.f8421c = (i10 & 1) == 0;
        this.f8419a = new x(12);
        this.f8420b = new Object();
        this.f8422f = new pb.a(4);
        this.f8424i = new e[0];
        this.f8428m = -1L;
        this.f8429n = -1L;
        this.f8427l = -1;
        this.h = -9223372036854775807L;
    }

    @Override
    public final boolean a(p pVar) {
        x xVar = this.f8419a;
        pVar.a(0, 12, xVar.f8411a);
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
        if (this.f8421c) {
            qVar = new c2.b(qVar, this.d);
        }
        this.f8422f = qVar;
        this.f8425j = -1L;
    }

    @Override
    public final void d(long j10, long j11) {
        e[] eVarArr;
        this.f8425j = -1L;
        this.f8426k = null;
        for (e eVar : this.f8424i) {
            if (eVar.f8446k == 0) {
                eVar.f8444i = 0;
            } else {
                eVar.f8444i = eVar.f8449n[m0.f(eVar.f8448m, j10, true)];
            }
        }
        if (j10 == 0) {
            if (this.f8424i.length == 0) {
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
        l0 l0Var = n0.f8592b;
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
