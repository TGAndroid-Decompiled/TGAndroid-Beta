package h3;

import a6.i;
import b2.u0;
import c3.k0;
import c3.l;
import c3.o;
import c3.p;
import c3.q;
import c3.s;
import c3.u;
import e2.x;
import e9.l0;
import e9.n0;
import e9.x1;
import java.util.List;
public final class b implements o {
    public q e;
    public k0 f7608f;
    public u0 h;
    public u f7610i;
    public int f7611j;
    public int f7612k;
    public a f7613l;
    public int f7614m;
    public long f7615n;
    public final byte[] f7605a = new byte[42];
    public final x f7606b = new x(new byte[32768], 0);
    public final boolean f7607c = false;
    public final s d = new Object();
    public int f7609g = 0;

    @Override
    public final boolean a(p pVar) {
        u0 m0 = new i(12).m0(pVar, q3.i.f45440b, 0);
        if (m0 != null) {
            int length = m0.f2302a.length;
        }
        x xVar = new x(4);
        ((l) pVar).j(xVar.f6207a, 0, 4, false);
        if (xVar.C() != 1716281667) {
            return false;
        }
        return true;
    }

    @Override
    public final void c(q qVar) {
        this.e = qVar;
        this.f7608f = qVar.I1(0, 1);
        qVar.Q0();
    }

    @Override
    public final void d(long j10, long j11) {
        long j12 = 0;
        if (j10 == 0) {
            this.f7609g = 0;
        } else {
            a aVar = this.f7613l;
            if (aVar != null) {
                aVar.d(j11);
            }
        }
        if (j11 != 0) {
            j12 = -1;
        }
        this.f7615n = j12;
        this.f7614m = 0;
        this.f7606b.K(0);
    }

    @Override
    public final List e() {
        l0 l0Var = n0.f6390b;
        return x1.e;
    }

    @Override
    public final int f(c3.p r32, c3.s r33) {
        throw new UnsupportedOperationException("Method not decompiled: h3.b.f(c3.p, c3.s):int");
    }

    @Override
    public final o b() {
        return this;
    }

    @Override
    public final void release() {
    }
}
