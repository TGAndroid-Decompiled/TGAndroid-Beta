package h3;

import b2.u0;
import c3.i0;
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
import k6.h;
public final class b implements o {
    public q e;
    public i0 f10347f;
    public u0 h;
    public u f10349i;
    public int f10350j;
    public int f10351k;
    public a f10352l;
    public int f10353m;
    public long f10354n;
    public final byte[] f10344a = new byte[42];
    public final x f10345b = new x(new byte[32768], 0);
    public final boolean f10346c = false;
    public final s d = new Object();
    public int f10348g = 0;

    @Override
    public final boolean a(p pVar) {
        u0 r10 = new h(10).r(pVar, q3.h.f43281b, 0);
        if (r10 != null) {
            int length = r10.f2398a.length;
        }
        x xVar = new x(4);
        ((l) pVar).j(xVar.f8411a, 0, 4, false);
        if (xVar.C() != 1716281667) {
            return false;
        }
        return true;
    }

    @Override
    public final void c(q qVar) {
        this.e = qVar;
        this.f10347f = qVar.a0(0, 1);
        qVar.D();
    }

    @Override
    public final void d(long j10, long j11) {
        long j12 = 0;
        if (j10 == 0) {
            this.f10348g = 0;
        } else {
            a aVar = this.f10352l;
            if (aVar != null) {
                aVar.d(j11);
            }
        }
        if (j11 != 0) {
            j12 = -1;
        }
        this.f10354n = j12;
        this.f10353m = 0;
        this.f10345b.K(0);
    }

    @Override
    public final List e() {
        l0 l0Var = n0.f8592b;
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
