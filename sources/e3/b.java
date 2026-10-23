package e3;

import a3.l;
import c3.q;
import c3.r;
import c3.s;
import e2.m0;
import e2.x;
import e9.l0;
import e9.n0;
import e9.x1;
import java.util.List;
import t7.u;
public final class b implements q {
    public final x f8306a;
    public final l f8307b;
    public final boolean f8308c;
    public final u d;
    public int e;
    public s f8309f;
    public c f8310g;
    public long h;
    public e[] f8311i;
    public long f8312j;
    public e f8313k;
    public int f8314l;
    public long f8315m;
    public long f8316n;
    public int f8317o;
    public boolean f8318p;

    public b(int i10, u uVar) {
        this.d = uVar;
        this.f8308c = (i10 & 1) == 0;
        this.f8306a = new x(12);
        this.f8307b = new Object();
        this.f8309f = new pb.a(4);
        this.f8311i = new e[0];
        this.f8315m = -1L;
        this.f8316n = -1L;
        this.f8314l = -1;
        this.h = -9223372036854775807L;
    }

    @Override
    public final boolean a(r rVar) {
        x xVar = this.f8306a;
        rVar.a(0, 12, xVar.f8298a);
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
    public final void c(s sVar) {
        this.e = 0;
        if (this.f8308c) {
            sVar = new c2.b(sVar, this.d);
        }
        this.f8309f = sVar;
        this.f8312j = -1L;
    }

    @Override
    public final void d(long j10, long j11) {
        e[] eVarArr;
        this.f8312j = -1L;
        this.f8313k = null;
        for (e eVar : this.f8311i) {
            if (eVar.f8333k == 0) {
                eVar.f8331i = 0;
            } else {
                eVar.f8331i = eVar.f8336n[m0.f(eVar.f8335m, j10, true)];
            }
        }
        if (j10 == 0) {
            if (this.f8311i.length == 0) {
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
        l0 l0Var = n0.f8481b;
        return x1.e;
    }

    @Override
    public final int f(c3.r r24, c3.u r25) {
        throw new UnsupportedOperationException("Method not decompiled: e3.b.f(c3.r, c3.u):int");
    }

    @Override
    public final q b() {
        return this;
    }

    @Override
    public final void release() {
    }
}
