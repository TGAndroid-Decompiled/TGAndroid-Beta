package l3;

import bi.b1;
import f3.l;
import f3.n;
import f3.o;
import f3.p;
import f3.q;
import h2.x;
import h9.g0;
import h9.i0;
import h9.t1;
import java.util.List;
public final class b implements o {
    public final x f18110a = new x(4);
    public final x f18111b = new x(9);
    public final x f18112c = new x(11);
    public final x d = new x();
    public final c f18113e;
    public q f18114f;
    public int f18115g;
    public boolean h;
    public long f18116i;
    public int f18117j;
    public int f18118k;
    public int f18119l;
    public long f18120m;
    public boolean f18121n;
    public a f18122o;
    public e f18123p;

    public b() {
        ?? b1Var = new b1(new n());
        b1Var.f18124b = -9223372036854775807L;
        b1Var.f18125c = new long[0];
        b1Var.d = new long[0];
        this.f18113e = b1Var;
        this.f18115g = 1;
    }

    @Override
    public final boolean b(p pVar) {
        x xVar = this.f18110a;
        l lVar = (l) pVar;
        lVar.k(xVar.f14164a, 0, 3, false);
        xVar.N(0);
        if (xVar.D() == 4607062) {
            lVar.k(xVar.f14164a, 0, 2, false);
            xVar.N(0);
            if ((xVar.H() & 250) == 0) {
                lVar.k(xVar.f14164a, 0, 4, false);
                xVar.N(0);
                int m10 = xVar.m();
                lVar.f11064f = 0;
                lVar.v(m10, false);
                lVar.k(xVar.f14164a, 0, 4, false);
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
        this.f18114f = qVar;
    }

    @Override
    public final void d(long j3, long j10) {
        if (j3 == 0) {
            this.f18115g = 1;
            this.h = false;
        } else {
            this.f18115g = 3;
        }
        this.f18117j = 0;
    }

    @Override
    public final List e() {
        g0 g0Var = i0.f14331b;
        return t1.f14399e;
    }

    @Override
    public final int f(f3.p r30, f3.s r31) {
        throw new UnsupportedOperationException("Method not decompiled: l3.b.f(f3.p, f3.s):int");
    }

    public final x g(p pVar) {
        int i7 = this.f18119l;
        x xVar = this.d;
        byte[] bArr = xVar.f14164a;
        if (i7 > bArr.length) {
            xVar.L(0, new byte[Math.max(bArr.length * 2, i7)]);
        } else {
            xVar.N(0);
        }
        xVar.M(this.f18119l);
        pVar.readFully(xVar.f14164a, 0, this.f18119l);
        return xVar;
    }

    @Override
    public final o a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
