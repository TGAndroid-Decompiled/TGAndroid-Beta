package h3;

import b2.t0;
import c3.j0;
import c3.l;
import c3.o;
import c3.p;
import c3.q;
import c3.s;
import c3.u;
import c3.y;
import e2.x;
import e9.l0;
import e9.n0;
import e9.x1;
import java.util.List;
import q3.h;
public final class b implements o {
    public q e;
    public j0 f11656f;
    public t0 h;
    public u f11658i;
    public int f11659j;
    public int f11660k;
    public a f11661l;
    public int f11662m;
    public long f11663n;
    public final byte[] f11653a = new byte[42];
    public final x f11654b = new x(new byte[32768], 0);
    public final boolean f11655c = false;
    public final s d = new Object();
    public int f11657g = 0;

    @Override
    public final boolean a(p pVar) {
        t0 b10 = new y(0).b(pVar, h.f44392b, 0);
        if (b10 != null) {
            int length = b10.f4010a.length;
        }
        x xVar = new x(4);
        ((l) pVar).j(xVar.f8293a, 0, 4, false);
        if (xVar.C() != 1716281667) {
            return false;
        }
        return true;
    }

    @Override
    public final void c(q qVar) {
        this.e = qVar;
        this.f11656f = qVar.j0(0, 1);
        qVar.H();
    }

    @Override
    public final void d(long j10, long j11) {
        long j12 = 0;
        if (j10 == 0) {
            this.f11657g = 0;
        } else {
            a aVar = this.f11661l;
            if (aVar != null) {
                aVar.d(j11);
            }
        }
        if (j11 != 0) {
            j12 = -1;
        }
        this.f11663n = j12;
        this.f11662m = 0;
        this.f11654b.K(0);
    }

    @Override
    public final List e() {
        l0 l0Var = n0.f8476b;
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
