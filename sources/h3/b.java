package h3;

import a4.l;
import b2.u0;
import c3.i0;
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
import q3.h;
public final class b implements o {
    public q e;
    public i0 f10351f;
    public u0 h;
    public u f10353i;
    public int f10354j;
    public int f10355k;
    public a f10356l;
    public int f10357m;
    public long f10358n;
    public final byte[] f10348a = new byte[42];
    public final x f10349b = new x(new byte[32768], 0);
    public final boolean f10350c = false;
    public final s d = new Object();
    public int f10352g = 0;

    @Override
    public final boolean a(p pVar) {
        u0 P = new l(9).P(pVar, h.f43024b, 0);
        if (P != null) {
            int length = P.f2402a.length;
        }
        x xVar = new x(4);
        ((c3.l) pVar).j(xVar.f8414a, 0, 4, false);
        if (xVar.C() != 1716281667) {
            return false;
        }
        return true;
    }

    @Override
    public final void c(q qVar) {
        this.e = qVar;
        this.f10351f = qVar.W(0, 1);
        qVar.D();
    }

    @Override
    public final void d(long j10, long j11) {
        long j12 = 0;
        if (j10 == 0) {
            this.f10352g = 0;
        } else {
            a aVar = this.f10356l;
            if (aVar != null) {
                aVar.d(j11);
            }
        }
        if (j11 != 0) {
            j12 = -1;
        }
        this.f10358n = j12;
        this.f10357m = 0;
        this.f10349b.K(0);
    }

    @Override
    public final List e() {
        l0 l0Var = n0.f8595b;
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
