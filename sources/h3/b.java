package h3;

import b2.u0;
import b6.i;
import c3.j0;
import c3.l;
import c3.o;
import c3.p;
import c3.q;
import c3.s;
import c3.u;
import e2.x;
import f9.g0;
import f9.i0;
import f9.s1;
import java.util.List;
import q3.h;
public final class b implements o {
    public q e;
    public j0 f12591f;
    public u0 h;
    public u f12593i;
    public int f12594j;
    public int f12595k;
    public a f12596l;
    public int f12597m;
    public long f12598n;
    public final byte[] f12588a = new byte[42];
    public final x f12589b = new x(new byte[32768], 0);
    public final boolean f12590c = false;
    public final s d = new Object();
    public int f12592g = 0;

    @Override
    public final boolean a(p pVar) {
        u0 c02 = new i(8).c0(pVar, h.f46941b, 0);
        if (c02 != null) {
            int length = c02.f3465a.length;
        }
        x xVar = new x(4);
        ((l) pVar).h(xVar.f9732a, 0, 4, false);
        if (xVar.C() != 1716281667) {
            return false;
        }
        return true;
    }

    @Override
    public final void c(q qVar) {
        this.e = qVar;
        this.f12591f = qVar.F1(0, 1);
        qVar.Q0();
    }

    @Override
    public final void d(long j10, long j11) {
        long j12 = 0;
        if (j10 == 0) {
            this.f12592g = 0;
        } else {
            a aVar = this.f12596l;
            if (aVar != null) {
                aVar.d(j11);
            }
        }
        if (j11 != 0) {
            j12 = -1;
        }
        this.f12598n = j12;
        this.f12597m = 0;
        this.f12589b.K(0);
    }

    @Override
    public final List e() {
        g0 g0Var = i0.f10287b;
        return s1.e;
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
