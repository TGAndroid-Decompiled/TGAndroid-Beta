package j3;

import b2.u0;
import b2.v0;
import b2.w;
import c3.g0;
import c3.k0;
import c3.o;
import c3.p;
import c3.q;
import c3.s;
import c3.t;
import e2.x;
import e9.l0;
import e9.n0;
import e9.x1;
import java.util.List;
import v7.j8;
import w3.l;
import z3.k;
public final class a implements o {
    public q f9384b;
    public p f9385c;
    public g0 d;
    public l e;
    public int f9387g;
    public long h;
    public int f9388i;
    public final x f9383a = new x(16);
    public long f9389j = -1;
    public int f9386f = 0;

    @Override
    public final boolean a(p pVar) {
        return j8.a((c3.l) pVar, true);
    }

    @Override
    public final void c(q qVar) {
        this.f9384b = qVar;
    }

    @Override
    public final void d(long j10, long j11) {
        if (j10 == 0) {
            this.f9386f = 0;
            this.f9388i = 0;
            this.f9389j = -1L;
            if (this.e != null) {
                this.e = null;
            }
        } else if (this.f9386f == 3) {
            l lVar = this.e;
            lVar.getClass();
            lVar.d(j10, j11);
        }
    }

    @Override
    public final List e() {
        l0 l0Var = n0.f6390b;
        return x1.e;
    }

    @Override
    public final int f(p pVar, s sVar) {
        while (true) {
            int i10 = this.f9386f;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 == 4) {
                                return -1;
                            }
                            throw new IllegalStateException();
                        }
                        if (this.d == null || pVar != this.f9385c) {
                            this.f9385c = pVar;
                            this.d = new g0(pVar, this.f9389j);
                        }
                        l lVar = this.e;
                        lVar.getClass();
                        int f7 = lVar.f(this.d, sVar);
                        if (f7 == 1) {
                            sVar.f3687a += this.f9389j;
                        }
                        return f7;
                    }
                    if (this.e == null) {
                        this.e = new l(k.C, 8);
                    }
                    g0 g0Var = new g0(pVar, this.f9389j);
                    this.d = g0Var;
                    if (this.e.a(g0Var)) {
                        l lVar2 = this.e;
                        long j10 = this.f9389j;
                        q qVar = this.f9384b;
                        qVar.getClass();
                        lVar2.c(new g0(j10, qVar, 1));
                        this.f9386f = 3;
                    } else {
                        q qVar2 = this.f9384b;
                        qVar2.getClass();
                        qVar2.Q0();
                        this.f9384b.G1(new t(-9223372036854775807L));
                        this.f9386f = 4;
                    }
                } else {
                    pVar.q((int) (this.h - this.f9388i));
                    this.f9388i = 0;
                    this.f9386f = 0;
                }
            } else {
                int i11 = this.f9388i;
                x xVar = this.f9383a;
                if (i11 == 0) {
                    if (!pVar.d(xVar.f6207a, 0, 8, true)) {
                        q qVar3 = this.f9384b;
                        qVar3.getClass();
                        qVar3.Q0();
                        this.f9384b.G1(new t(-9223372036854775807L));
                        this.f9386f = 4;
                        return -1;
                    }
                    this.f9388i = 8;
                    xVar.N(0);
                    this.h = xVar.C();
                    this.f9387g = xVar.m();
                }
                if (this.h == 1) {
                    pVar.readFully(xVar.f6207a, 8, 8);
                    this.f9388i += 8;
                    this.h = xVar.G();
                }
                if (this.f9387g == 1836086884) {
                    long position = pVar.getPosition();
                    this.f9389j = position;
                    long j11 = this.f9388i;
                    l3.b bVar = new l3.b(0L, position - j11, -9223372036854775807L, position, this.h - j11);
                    q qVar4 = this.f9384b;
                    qVar4.getClass();
                    k0 I1 = qVar4.I1(1024, 4);
                    w wVar = new w();
                    wVar.f2369q = v0.n("image/heic");
                    wVar.f2363k = new u0(bVar);
                    i0.a.r(wVar, I1);
                    this.f9386f = 2;
                } else {
                    this.f9386f = 1;
                }
            }
        }
    }

    @Override
    public final void release() {
        l lVar = this.e;
        if (lVar != null) {
            lVar.getClass();
            this.e = null;
        }
    }

    @Override
    public final o b() {
        return this;
    }
}
