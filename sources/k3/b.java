package k3;

import d6.i;
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
import h9.s1;
import java.util.List;
import t3.h;
public final class b implements o {
    public q f17756e;
    public i0 f17757f;
    public q0 h;
    public u f17759i;
    public int f17760j;
    public int f17761k;
    public a f17762l;
    public int f17763m;
    public long f17764n;
    public final byte[] f17753a = new byte[42];
    public final x f17754b = new x(new byte[32768], 0);
    public final boolean f17755c = false;
    public final s d = new Object();
    public int f17758g = 0;

    @Override
    public final boolean b(p pVar) {
        q0 U = new i().U(pVar, h.f56995b, 0);
        if (U != null) {
            int length = U.f10320a.length;
        }
        x xVar = new x(4);
        ((l) pVar).h(xVar.f13521a, 0, 4, false);
        if (xVar.C() != 1716281667) {
            return false;
        }
        return true;
    }

    @Override
    public final void c(q qVar) {
        this.f17756e = qVar;
        this.f17757f = qVar.d2(0, 1);
        qVar.d1();
    }

    @Override
    public final void d(long j3, long j10) {
        long j11 = 0;
        if (j3 == 0) {
            this.f17758g = 0;
        } else {
            a aVar = this.f17762l;
            if (aVar != null) {
                aVar.d(j10);
            }
        }
        if (j10 != 0) {
            j11 = -1;
        }
        this.f17764n = j11;
        this.f17763m = 0;
        this.f17754b.K(0);
    }

    @Override
    public final List e() {
        g0 g0Var = h9.i0.f13686b;
        return s1.f13749e;
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
