package j3;

import ad.d;
import b2.t0;
import b2.v;
import b2.v0;
import c3.j0;
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
import z3.k;
public final class a implements o {
    public q f13967b;
    public p f13968c;
    public d d;
    public l e;
    public int f13970g;
    public long h;
    public int f13971i;
    public final x f13966a = new x(16);
    public long f13972j = -1;
    public int f13969f = 0;

    @Override
    public final boolean a(p pVar) {
        return k8.a((c3.l) pVar, true);
    }

    @Override
    public final void c(q qVar) {
        this.f13967b = qVar;
    }

    @Override
    public final void d(long j10, long j11) {
        if (j10 == 0) {
            this.f13969f = 0;
            this.f13971i = 0;
            this.f13972j = -1L;
            if (this.e != null) {
                this.e = null;
            }
        } else if (this.f13969f == 3) {
            l lVar = this.e;
            lVar.getClass();
            lVar.d(j10, j11);
        }
    }

    @Override
    public final List e() {
        l0 l0Var = n0.f8476b;
        return x1.e;
    }

    @Override
    public final int f(p pVar, s sVar) {
        while (true) {
            int i10 = this.f13969f;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 == 4) {
                                return -1;
                            }
                            throw new IllegalStateException();
                        }
                        if (this.d == null || pVar != this.f13968c) {
                            this.f13968c = pVar;
                            this.d = new d(pVar, this.f13972j);
                        }
                        l lVar = this.e;
                        lVar.getClass();
                        int f7 = lVar.f(this.d, sVar);
                        if (f7 == 1) {
                            sVar.f4658a += this.f13972j;
                        }
                        return f7;
                    }
                    if (this.e == null) {
                        this.e = new l(k.D, 8);
                    }
                    d dVar = new d(pVar, this.f13972j);
                    this.d = dVar;
                    if (this.e.a(dVar)) {
                        l lVar2 = this.e;
                        long j10 = this.f13972j;
                        q qVar = this.f13967b;
                        qVar.getClass();
                        lVar2.c(new d(j10, qVar, 2));
                        this.f13969f = 3;
                    } else {
                        q qVar2 = this.f13967b;
                        qVar2.getClass();
                        qVar2.H();
                        this.f13967b.g0(new t(-9223372036854775807L));
                        this.f13969f = 4;
                    }
                } else {
                    pVar.r((int) (this.h - this.f13971i));
                    this.f13971i = 0;
                    this.f13969f = 0;
                }
            } else {
                int i11 = this.f13971i;
                x xVar = this.f13966a;
                if (i11 == 0) {
                    if (!pVar.c(xVar.f8293a, 0, 8, true)) {
                        q qVar3 = this.f13967b;
                        qVar3.getClass();
                        qVar3.H();
                        this.f13967b.g0(new t(-9223372036854775807L));
                        this.f13969f = 4;
                        return -1;
                    }
                    this.f13971i = 8;
                    xVar.N(0);
                    this.h = xVar.C();
                    this.f13970g = xVar.m();
                }
                if (this.h == 1) {
                    pVar.readFully(xVar.f8293a, 8, 8);
                    this.f13971i += 8;
                    this.h = xVar.G();
                }
                if (this.f13970g == 1836086884) {
                    long position = pVar.getPosition();
                    this.f13972j = position;
                    long j11 = this.f13971i;
                    l3.b bVar = new l3.b(0L, position - j11, -9223372036854775807L, position, this.h - j11);
                    q qVar4 = this.f13967b;
                    qVar4.getClass();
                    j0 j02 = qVar4.j0(1024, 4);
                    v vVar = new v();
                    vVar.f4077q = v0.n("image/heic");
                    vVar.f4071k = new t0(bVar);
                    i0.a.u(vVar, j02);
                    this.f13969f = 2;
                } else {
                    this.f13969f = 1;
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
