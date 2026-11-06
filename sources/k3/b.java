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
import h9.t1;
import java.util.List;
import t3.h;
public final class b implements o {
    public q f17196e;
    public j0 f17197f;
    public q0 h;
    public u f17199i;
    public int f17200j;
    public int f17201k;
    public a f17202l;
    public int f17203m;
    public long f17204n;
    public final byte[] f17193a = new byte[42];
    public final x f17194b = new x(new byte[32768], 0);
    public final boolean f17195c = false;
    public final s d = new Object();
    public int f17198g = 0;

    @Override
    public final boolean b(p pVar) {
        q0 a10 = new y(0).a(pVar, h.f55284b, 0);
        if (a10 != null) {
            int length = a10.f10484a.length;
        }
        x xVar = new x(4);
        ((l) pVar).k(xVar.f14162a, 0, 4, false);
        if (xVar.C() != 1716281667) {
            return false;
        }
        return true;
    }

    @Override
    public final void c(q qVar) {
        this.f17196e = qVar;
        this.f17197f = qVar.O1(0, 1);
        qVar.U0();
    }

    @Override
    public final void d(long j3, long j10) {
        long j11 = 0;
        if (j3 == 0) {
            this.f17198g = 0;
        } else {
            a aVar = this.f17202l;
            if (aVar != null) {
                aVar.d(j10);
            }
        }
        if (j10 != 0) {
            j11 = -1;
        }
        this.f17204n = j11;
        this.f17203m = 0;
        this.f17194b.K(0);
    }

    @Override
    public final List e() {
        g0 g0Var = i0.f14329b;
        return t1.f14397e;
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
