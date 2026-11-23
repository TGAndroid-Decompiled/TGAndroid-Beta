package k3;

import e2.q0;
import f3.j0;
import f3.l;
import f3.o;
import f3.p;
import f3.q;
import f3.s;
import f3.u;
import f3.y;
import h2.x;
import h9.g0;
import h9.i0;
import h9.s1;
import java.util.List;
import t3.h;
public final class b implements o {
    public q f18247e;
    public j0 f18248f;
    public q0 h;
    public u f18250i;
    public int f18251j;
    public int f18252k;
    public a f18253l;
    public int f18254m;
    public long f18255n;
    public final byte[] f18244a = new byte[42];
    public final x f18245b = new x(new byte[32768], 0);
    public final boolean f18246c = false;
    public final s d = new Object();
    public int f18249g = 0;

    @Override
    public final boolean b(p pVar) {
        q0 a10 = new y(0).a(pVar, h.f57693b, 0);
        if (a10 != null) {
            int length = a10.f10628a.length;
        }
        x xVar = new x(4);
        ((l) pVar).k(xVar.f13828a, 0, 4, false);
        if (xVar.C() != 1716281667) {
            return false;
        }
        return true;
    }

    @Override
    public final void c(q qVar) {
        this.f18247e = qVar;
        this.f18248f = qVar.d2(0, 1);
        qVar.Z0();
    }

    @Override
    public final void d(long j3, long j10) {
        long j11 = 0;
        if (j3 == 0) {
            this.f18249g = 0;
        } else {
            a aVar = this.f18253l;
            if (aVar != null) {
                aVar.d(j10);
            }
        }
        if (j10 != 0) {
            j11 = -1;
        }
        this.f18255n = j11;
        this.f18254m = 0;
        this.f18245b.K(0);
    }

    @Override
    public final List e() {
        g0 g0Var = i0.f13995b;
        return s1.f14058e;
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
