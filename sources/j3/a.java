package j3;

import ad.d;
import b2.u0;
import b2.w;
import b2.w0;
import c3.i0;
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
import v7.k8;
import w3.l;
public final class a implements o {
    public q f12562b;
    public p f12563c;
    public d d;
    public l e;
    public int f12565g;
    public long h;
    public int f12566i;
    public final x f12561a = new x(16);
    public long f12567j = -1;
    public int f12564f = 0;

    @Override
    public final boolean a(p pVar) {
        return k8.a((c3.l) pVar, true);
    }

    @Override
    public final void c(q qVar) {
        this.f12562b = qVar;
    }

    @Override
    public final void d(long j10, long j11) {
        if (j10 == 0) {
            this.f12564f = 0;
            this.f12566i = 0;
            this.f12567j = -1L;
            if (this.e != null) {
                this.e = null;
            }
        } else if (this.f12564f == 3) {
            l lVar = this.e;
            lVar.getClass();
            lVar.d(j10, j11);
        }
    }

    @Override
    public final List e() {
        l0 l0Var = n0.f8595b;
        return x1.e;
    }

    @Override
    public final int f(p pVar, s sVar) {
        while (true) {
            int i10 = this.f12564f;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 == 4) {
                                return -1;
                            }
                            throw new IllegalStateException();
                        }
                        if (this.d == null || pVar != this.f12563c) {
                            this.f12563c = pVar;
                            this.d = new d(pVar, this.f12567j);
                        }
                        l lVar = this.e;
                        lVar.getClass();
                        int f7 = lVar.f(this.d, sVar);
                        if (f7 == 1) {
                            sVar.f4283a += this.f12567j;
                        }
                        return f7;
                    }
                    if (this.e == null) {
                        this.e = new l(z3.l.D, 8);
                    }
                    d dVar = new d(pVar, this.f12567j);
                    this.d = dVar;
                    if (this.e.a(dVar)) {
                        l lVar2 = this.e;
                        long j10 = this.f12567j;
                        q qVar = this.f12562b;
                        qVar.getClass();
                        lVar2.c(new d(j10, qVar, 2));
                        this.f12564f = 3;
                    } else {
                        q qVar2 = this.f12562b;
                        qVar2.getClass();
                        qVar2.D();
                        this.f12562b.K(new t(-9223372036854775807L));
                        this.f12564f = 4;
                    }
                } else {
                    pVar.r((int) (this.h - this.f12566i));
                    this.f12566i = 0;
                    this.f12564f = 0;
                }
            } else {
                int i11 = this.f12566i;
                x xVar = this.f12561a;
                if (i11 == 0) {
                    if (!pVar.d(xVar.f8414a, 0, 8, true)) {
                        q qVar3 = this.f12562b;
                        qVar3.getClass();
                        qVar3.D();
                        this.f12562b.K(new t(-9223372036854775807L));
                        this.f12564f = 4;
                        return -1;
                    }
                    this.f12566i = 8;
                    xVar.N(0);
                    this.h = xVar.C();
                    this.f12565g = xVar.m();
                }
                if (this.h == 1) {
                    pVar.readFully(xVar.f8414a, 8, 8);
                    this.f12566i += 8;
                    this.h = xVar.G();
                }
                if (this.f12565g == 1836086884) {
                    long position = pVar.getPosition();
                    this.f12567j = position;
                    long j11 = this.f12566i;
                    l3.b bVar = new l3.b(0L, position - j11, -9223372036854775807L, position, this.h - j11);
                    q qVar4 = this.f12562b;
                    qVar4.getClass();
                    i0 W = qVar4.W(1024, 4);
                    w wVar = new w();
                    wVar.f2469q = w0.n("image/heic");
                    wVar.f2463k = new u0(bVar);
                    i2.d.u(wVar, W);
                    this.f12564f = 2;
                } else {
                    this.f12564f = 1;
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
