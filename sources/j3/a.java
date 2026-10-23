package j3;

import ad.d;
import b2.t0;
import b2.v0;
import c3.q;
import c3.r;
import c3.s;
import c3.u;
import c3.v;
import e2.x;
import e9.l0;
import e9.n0;
import e9.x1;
import i2.o1;
import java.util.List;
import v7.k8;
import w3.l;
import z3.k;
public final class a implements q {
    public s f14017b;
    public r f14018c;
    public d d;
    public l e;
    public int f14020g;
    public long h;
    public int f14021i;
    public final x f14016a = new x(16);
    public long f14022j = -1;
    public int f14019f = 0;

    @Override
    public final boolean a(r rVar) {
        return k8.a((c3.l) rVar, true);
    }

    @Override
    public final void c(s sVar) {
        this.f14017b = sVar;
    }

    @Override
    public final void d(long j10, long j11) {
        if (j10 == 0) {
            this.f14019f = 0;
            this.f14021i = 0;
            this.f14022j = -1L;
            if (this.e != null) {
                this.e = null;
            }
        } else if (this.f14019f == 3) {
            l lVar = this.e;
            lVar.getClass();
            lVar.d(j10, j11);
        }
    }

    @Override
    public final List e() {
        l0 l0Var = n0.f8481b;
        return x1.e;
    }

    @Override
    public final int f(r rVar, u uVar) {
        while (true) {
            int i10 = this.f14019f;
            if (i10 != 0) {
                if (i10 != 1) {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            if (i10 == 4) {
                                return -1;
                            }
                            throw new IllegalStateException();
                        }
                        if (this.d == null || rVar != this.f14018c) {
                            this.f14018c = rVar;
                            this.d = new d(rVar, this.f14022j);
                        }
                        l lVar = this.e;
                        lVar.getClass();
                        int f7 = lVar.f(this.d, uVar);
                        if (f7 == 1) {
                            uVar.f4664a += this.f14022j;
                        }
                        return f7;
                    }
                    if (this.e == null) {
                        this.e = new l(k.D, 8);
                    }
                    d dVar = new d(rVar, this.f14022j);
                    this.d = dVar;
                    if (this.e.a(dVar)) {
                        l lVar2 = this.e;
                        long j10 = this.f14022j;
                        s sVar = this.f14017b;
                        sVar.getClass();
                        lVar2.c(new d(j10, sVar, 2));
                        this.f14019f = 3;
                    } else {
                        s sVar2 = this.f14017b;
                        sVar2.getClass();
                        sVar2.C();
                        this.f14017b.g0(new v(-9223372036854775807L));
                        this.f14019f = 4;
                    }
                } else {
                    rVar.r((int) (this.h - this.f14021i));
                    this.f14021i = 0;
                    this.f14019f = 0;
                }
            } else {
                int i11 = this.f14021i;
                x xVar = this.f14016a;
                if (i11 == 0) {
                    if (!rVar.d(xVar.f8298a, 0, 8, true)) {
                        s sVar3 = this.f14017b;
                        sVar3.getClass();
                        sVar3.C();
                        this.f14017b.g0(new v(-9223372036854775807L));
                        this.f14019f = 4;
                        return -1;
                    }
                    this.f14021i = 8;
                    xVar.N(0);
                    this.h = xVar.C();
                    this.f14020g = xVar.m();
                }
                if (this.h == 1) {
                    rVar.readFully(xVar.f8298a, 8, 8);
                    this.f14021i += 8;
                    this.h = xVar.G();
                }
                if (this.f14020g == 1836086884) {
                    long position = rVar.getPosition();
                    this.f14022j = position;
                    long j11 = this.f14021i;
                    l3.b bVar = new l3.b(0L, position - j11, -9223372036854775807L, position, this.h - j11);
                    s sVar4 = this.f14017b;
                    sVar4.getClass();
                    c3.l0 j02 = sVar4.j0(1024, 4);
                    b2.v vVar = new b2.v();
                    vVar.f4081q = v0.n("image/heic");
                    vVar.f4075k = new t0(bVar);
                    o1.v(vVar, j02);
                    this.f14019f = 2;
                } else {
                    this.f14019f = 1;
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
    public final q b() {
        return this;
    }
}
