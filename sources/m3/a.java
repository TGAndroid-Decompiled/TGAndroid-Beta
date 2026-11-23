package m3;

import a8.va;
import c4.k;
import c8.o9;
import e2.q0;
import e2.s0;
import f3.j0;
import f3.o;
import f3.p;
import f3.q;
import f3.s;
import f3.t;
import h2.x;
import h9.g0;
import h9.i0;
import h9.s1;
import java.util.List;
import p5.c;
import z3.l;
public final class a implements o {
    public q f20615b;
    public p f20616c;
    public va d;
    public l f20617e;
    public int f20619g;
    public long h;
    public int f20620i;
    public final x f20614a = new x(16);
    public long f20621j = -1;
    public int f20618f = 0;

    @Override
    public final boolean b(p pVar) {
        return o9.a((f3.l) pVar, true);
    }

    @Override
    public final void c(q qVar) {
        this.f20615b = qVar;
    }

    @Override
    public final void d(long j3, long j10) {
        if (j3 == 0) {
            this.f20618f = 0;
            this.f20620i = 0;
            this.f20621j = -1L;
            if (this.f20617e != null) {
                this.f20617e = null;
            }
        } else if (this.f20618f == 3) {
            l lVar = this.f20617e;
            lVar.getClass();
            lVar.d(j3, j10);
        }
    }

    @Override
    public final List e() {
        g0 g0Var = i0.f13995b;
        return s1.f14058e;
    }

    @Override
    public final int f(p pVar, s sVar) {
        while (true) {
            int i7 = this.f20618f;
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            if (i7 == 4) {
                                return -1;
                            }
                            throw new IllegalStateException();
                        }
                        if (this.d == null || pVar != this.f20616c) {
                            this.f20616c = pVar;
                            this.d = new va(pVar, this.f20621j);
                        }
                        l lVar = this.f20617e;
                        lVar.getClass();
                        int f10 = lVar.f(this.d, sVar);
                        if (f10 == 1) {
                            sVar.f11195a += this.f20621j;
                        }
                        return f10;
                    }
                    if (this.f20617e == null) {
                        this.f20617e = new l(k.f4387i, 8);
                    }
                    va vaVar = new va(pVar, this.f20621j);
                    this.d = vaVar;
                    if (this.f20617e.b(vaVar)) {
                        l lVar2 = this.f20617e;
                        long j3 = this.f20621j;
                        q qVar = this.f20615b;
                        qVar.getClass();
                        lVar2.c(new va(j3, qVar, 3));
                        this.f20618f = 3;
                    } else {
                        q qVar2 = this.f20615b;
                        qVar2.getClass();
                        qVar2.Z0();
                        this.f20615b.h(new t(-9223372036854775807L));
                        this.f20618f = 4;
                    }
                } else {
                    pVar.q((int) (this.h - this.f20620i));
                    this.f20620i = 0;
                    this.f20618f = 0;
                }
            } else {
                int i10 = this.f20620i;
                x xVar = this.f20614a;
                if (i10 == 0) {
                    if (!pVar.d(xVar.f13828a, 0, 8, true)) {
                        q qVar3 = this.f20615b;
                        qVar3.getClass();
                        qVar3.Z0();
                        this.f20615b.h(new t(-9223372036854775807L));
                        this.f20618f = 4;
                        return -1;
                    }
                    this.f20620i = 8;
                    xVar.N(0);
                    this.h = xVar.C();
                    this.f20619g = xVar.m();
                }
                if (this.h == 1) {
                    pVar.readFully(xVar.f13828a, 8, 8);
                    this.f20620i += 8;
                    this.h = xVar.G();
                }
                if (this.f20619g == 1836086884) {
                    long position = pVar.getPosition();
                    this.f20621j = position;
                    long j10 = this.f20620i;
                    o3.b bVar = new o3.b(0L, position - j10, -9223372036854775807L, position, this.h - j10);
                    q qVar4 = this.f20615b;
                    qVar4.getClass();
                    j0 d2 = qVar4.d2(1024, 4);
                    e2.t tVar = new e2.t();
                    tVar.f10706q = s0.n("image/heic");
                    tVar.f10700k = new q0(bVar);
                    c.r(tVar, d2);
                    this.f20618f = 2;
                } else {
                    this.f20618f = 1;
                }
            }
        }
    }

    @Override
    public final void release() {
        l lVar = this.f20617e;
        if (lVar != null) {
            lVar.getClass();
            this.f20617e = null;
        }
    }

    @Override
    public final o a() {
        return this;
    }
}
