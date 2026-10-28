package j3;

import a8.ad;
import a8.lg;
import b2.u0;
import b2.w;
import b2.w0;
import c3.j0;
import c3.o;
import c3.p;
import c3.q;
import c3.s;
import c3.t;
import e2.x;
import f9.g0;
import f9.i0;
import f9.s1;
import java.util.List;
import w3.l;
import z3.k;
public final class a implements o {
    public q f15229b;
    public p f15230c;
    public lg d;
    public l e;
    public int f15232g;
    public long h;
    public int f15233i;
    public final x f15228a = new x(16);
    public long f15234j = -1;
    public int f15231f = 0;

    @Override
    public final boolean a(p pVar) {
        return ad.a((c3.l) pVar, true);
    }

    @Override
    public final void c(q qVar) {
        this.f15229b = qVar;
    }

    @Override
    public final void d(long j10, long j11) {
        if (j10 == 0) {
            this.f15231f = 0;
            this.f15233i = 0;
            this.f15234j = -1L;
            if (this.e != null) {
                this.e = null;
            }
        } else if (this.f15231f == 3) {
            l lVar = this.e;
            lVar.getClass();
            lVar.d(j10, j11);
        }
    }

    @Override
    public final List e() {
        g0 g0Var = i0.f10286b;
        return s1.e;
    }

    @Override
    public final int f(p pVar, s sVar) {
        while (true) {
            int i10 = this.f15231f;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 == 4) {
                                return -1;
                            }
                            throw new IllegalStateException();
                        }
                        if (this.d == null || pVar != this.f15230c) {
                            this.f15230c = pVar;
                            this.d = new lg(pVar, this.f15234j);
                        }
                        l lVar = this.e;
                        lVar.getClass();
                        int f7 = lVar.f(this.d, sVar);
                        if (f7 == 1) {
                            sVar.f6092a += this.f15234j;
                        }
                        return f7;
                    }
                    if (this.e == null) {
                        this.e = new l(k.D, 8);
                    }
                    lg lgVar = new lg(pVar, this.f15234j);
                    this.d = lgVar;
                    if (this.e.a(lgVar)) {
                        l lVar2 = this.e;
                        long j10 = this.f15234j;
                        q qVar = this.f15229b;
                        qVar.getClass();
                        lVar2.c(new lg(j10, qVar, 3));
                        this.f15231f = 3;
                    } else {
                        q qVar2 = this.f15229b;
                        qVar2.getClass();
                        qVar2.Q0();
                        this.f15229b.D1(new t(-9223372036854775807L));
                        this.f15231f = 4;
                    }
                } else {
                    pVar.r((int) (this.h - this.f15233i));
                    this.f15233i = 0;
                    this.f15231f = 0;
                }
            } else {
                int i11 = this.f15233i;
                x xVar = this.f15228a;
                if (i11 == 0) {
                    if (!pVar.c(xVar.f9731a, 0, 8, true)) {
                        q qVar3 = this.f15229b;
                        qVar3.getClass();
                        qVar3.Q0();
                        this.f15229b.D1(new t(-9223372036854775807L));
                        this.f15231f = 4;
                        return -1;
                    }
                    this.f15233i = 8;
                    xVar.N(0);
                    this.h = xVar.C();
                    this.f15232g = xVar.m();
                }
                if (this.h == 1) {
                    pVar.readFully(xVar.f9731a, 8, 8);
                    this.f15233i += 8;
                    this.h = xVar.G();
                }
                if (this.f15232g == 1836086884) {
                    long position = pVar.getPosition();
                    this.f15234j = position;
                    long j11 = this.f15233i;
                    l3.b bVar = new l3.b(0L, position - j11, -9223372036854775807L, position, this.h - j11);
                    q qVar4 = this.f15229b;
                    qVar4.getClass();
                    j0 F1 = qVar4.F1(1024, 4);
                    w wVar = new w();
                    wVar.f3532q = w0.n("image/heic");
                    wVar.f3526k = new u0(bVar);
                    ic.a.u(wVar, F1);
                    this.f15231f = 2;
                } else {
                    this.f15231f = 1;
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
