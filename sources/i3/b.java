package i3;

import ai.c1;
import c3.l;
import c3.p;
import c3.q;
import c3.r;
import c3.s;
import e2.x;
import e9.l0;
import e9.n0;
import e9.x1;
import java.util.List;
public final class b implements q {
    public final x f12676a = new x(4);
    public final x f12677b = new x(9);
    public final x f12678c = new x(11);
    public final x d = new x();
    public final c e;
    public s f12679f;
    public int f12680g;
    public boolean h;
    public long f12681i;
    public int f12682j;
    public int f12683k;
    public int f12684l;
    public long f12685m;
    public boolean f12686n;
    public a f12687o;
    public e f12688p;

    public b() {
        ?? c1Var = new c1(new p());
        c1Var.f12689b = -9223372036854775807L;
        c1Var.f12690c = new long[0];
        c1Var.d = new long[0];
        this.e = c1Var;
        this.f12680g = 1;
    }

    @Override
    public final boolean a(r rVar) {
        x xVar = this.f12676a;
        l lVar = (l) rVar;
        lVar.j(xVar.f8298a, 0, 3, false);
        xVar.N(0);
        if (xVar.D() == 4607062) {
            lVar.j(xVar.f8298a, 0, 2, false);
            xVar.N(0);
            if ((xVar.H() & 250) == 0) {
                lVar.j(xVar.f8298a, 0, 4, false);
                xVar.N(0);
                int m10 = xVar.m();
                lVar.f4648f = 0;
                lVar.u(m10, false);
                lVar.j(xVar.f8298a, 0, 4, false);
                xVar.N(0);
                if (xVar.m() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void c(s sVar) {
        this.f12679f = sVar;
    }

    @Override
    public final void d(long j10, long j11) {
        if (j10 == 0) {
            this.f12680g = 1;
            this.h = false;
        } else {
            this.f12680g = 3;
        }
        this.f12682j = 0;
    }

    @Override
    public final List e() {
        l0 l0Var = n0.f8481b;
        return x1.e;
    }

    @Override
    public final int f(c3.r r30, c3.u r31) {
        throw new UnsupportedOperationException("Method not decompiled: i3.b.f(c3.r, c3.u):int");
    }

    public final x g(r rVar) {
        int i10 = this.f12684l;
        x xVar = this.d;
        byte[] bArr = xVar.f8298a;
        if (i10 > bArr.length) {
            xVar.L(0, new byte[Math.max(bArr.length * 2, i10)]);
        } else {
            xVar.N(0);
        }
        xVar.M(this.f12684l);
        rVar.readFully(xVar.f8298a, 0, this.f12684l);
        return xVar;
    }

    @Override
    public final q b() {
        return this;
    }

    @Override
    public final void release() {
    }
}
