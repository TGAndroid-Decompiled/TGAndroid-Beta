package k3;

import e2.q0;
import f3.i0;
import f3.l;
import f3.o;
import f3.p;
import f3.q;
import f3.s;
import f3.u;
import h2.x;
import h9.g0;
import h9.t1;
import java.util.List;
import ob.c;
import t3.h;
public final class b implements o {
    public q f18182e;
    public i0 f18183f;
    public q0 h;
    public u f18185i;
    public int f18186j;
    public int f18187k;
    public a f18188l;
    public int f18189m;
    public long f18190n;
    public final byte[] f18179a = new byte[42];
    public final x f18180b = new x(new byte[32768], 0);
    public final boolean f18181c = false;
    public final s d = new Object();
    public int f18184g = 0;

    @Override
    public final boolean b(p pVar) {
        q0 M = new c(19).M(pVar, h.f57614b, 0);
        if (M != null) {
            int length = M.f10667a.length;
        }
        x xVar = new x(4);
        ((l) pVar).g(xVar.f13865a, 0, 4, false);
        if (xVar.C() != 1716281667) {
            return false;
        }
        return true;
    }

    @Override
    public final void c(q qVar) {
        this.f18182e = qVar;
        this.f18183f = qVar.d2(0, 1);
        qVar.d1();
    }

    @Override
    public final void d(long j3, long j10) {
        long j11 = 0;
        if (j3 == 0) {
            this.f18184g = 0;
        } else {
            a aVar = this.f18188l;
            if (aVar != null) {
                aVar.d(j10);
            }
        }
        if (j10 != 0) {
            j11 = -1;
        }
        this.f18190n = j11;
        this.f18189m = 0;
        this.f18180b.K(0);
    }

    @Override
    public final List e() {
        g0 g0Var = h9.i0.f14035b;
        return t1.f14103e;
    }

    @Override
    public final int f(f3.p r32, f3.s r33) {
        throw new UnsupportedOperationException("Method not decompiled: k3.b.f(f3.p, f3.s):int");
    }

    @Override
    public final o a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
