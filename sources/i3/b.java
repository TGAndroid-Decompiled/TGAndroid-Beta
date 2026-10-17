package i3;

import ai.c1;
import c3.l;
import c3.n;
import c3.o;
import c3.p;
import c3.q;
import e2.x;
import e9.l0;
import e9.n0;
import e9.x1;
import java.util.List;
public final class b implements o {
    public final x f12648a = new x(4);
    public final x f12649b = new x(9);
    public final x f12650c = new x(11);
    public final x d = new x();
    public final c e;
    public q f12651f;
    public int f12652g;
    public boolean h;
    public long f12653i;
    public int f12654j;
    public int f12655k;
    public int f12656l;
    public long f12657m;
    public boolean f12658n;
    public a f12659o;
    public e f12660p;

    public b() {
        ?? c1Var = new c1(new n());
        c1Var.f12661b = -9223372036854775807L;
        c1Var.f12662c = new long[0];
        c1Var.d = new long[0];
        this.e = c1Var;
        this.f12652g = 1;
    }

    @Override
    public final boolean a(p pVar) {
        x xVar = this.f12648a;
        l lVar = (l) pVar;
        lVar.j(xVar.f8293a, 0, 3, false);
        xVar.N(0);
        if (xVar.D() == 4607062) {
            lVar.j(xVar.f8293a, 0, 2, false);
            xVar.N(0);
            if ((xVar.H() & 250) == 0) {
                lVar.j(xVar.f8293a, 0, 4, false);
                xVar.N(0);
                int m10 = xVar.m();
                lVar.f4648f = 0;
                lVar.v(m10, false);
                lVar.j(xVar.f8293a, 0, 4, false);
                xVar.N(0);
                if (xVar.m() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void c(q qVar) {
        this.f12651f = qVar;
    }

    @Override
    public final void d(long j10, long j11) {
        if (j10 == 0) {
            this.f12652g = 1;
            this.h = false;
        } else {
            this.f12652g = 3;
        }
        this.f12654j = 0;
    }

    @Override
    public final List e() {
        l0 l0Var = n0.f8476b;
        return x1.e;
    }

    @Override
    public final int f(c3.p r30, c3.s r31) {
        throw new UnsupportedOperationException("Method not decompiled: i3.b.f(c3.p, c3.s):int");
    }

    public final x g(p pVar) {
        int i10 = this.f12656l;
        x xVar = this.d;
        byte[] bArr = xVar.f8293a;
        if (i10 > bArr.length) {
            xVar.L(0, new byte[Math.max(bArr.length * 2, i10)]);
        } else {
            xVar.N(0);
        }
        xVar.M(this.f12656l);
        pVar.readFully(xVar.f8293a, 0, this.f12656l);
        return xVar;
    }

    @Override
    public final o b() {
        return this;
    }

    @Override
    public final void release() {
    }
}
