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
    public j0 f11655f;
    public t0 h;
    public u f11657i;
    public int f11658j;
    public int f11659k;
    public a f11660l;
    public int f11661m;
    public long f11662n;
    public final byte[] f11652a = new byte[42];
    public final x f11653b = new x(new byte[32768], 0);
    public final boolean f11654c = false;
    public final s d = new Object();
    public int f11656g = 0;

    @Override
    public final boolean a(p pVar) {
        t0 b10 = new y(0).b(pVar, h.f44373b, 0);
        if (b10 != null) {
            int length = b10.f4007a.length;
        }
        x xVar = new x(4);
        ((l) pVar).j(xVar.f8291a, 0, 4, false);
        if (xVar.C() != 1716281667) {
            return false;
        }
        return true;
    }

    @Override
    public final void c(q qVar) {
        this.e = qVar;
        this.f11655f = qVar.j0(0, 1);
        qVar.H();
    }

    @Override
    public final void d(long j10, long j11) {
        long j12 = 0;
        if (j10 == 0) {
            this.f11656g = 0;
        } else {
            a aVar = this.f11660l;
            if (aVar != null) {
                aVar.d(j11);
            }
        }
        if (j11 != 0) {
            j12 = -1;
        }
        this.f11662n = j12;
        this.f11661m = 0;
        this.f11653b.K(0);
    }

    @Override
    public final List e() {
        l0 l0Var = n0.f8474b;
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
