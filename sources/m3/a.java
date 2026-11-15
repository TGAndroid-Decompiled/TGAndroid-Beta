package m3;

import a8.va;
import c4.k;
import c8.l9;
import e2.q0;
import e2.s0;
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
import z3.l;
public final class a implements o {
    public q f20161b;
    public p f20162c;
    public va d;
    public l f20163e;
    public int f20165g;
    public long h;
    public int f20166i;
    public final x f20160a = new x(16);
    public long f20167j = -1;
    public int f20164f = 0;

    @Override
    public final boolean b(p pVar) {
        return l9.a((f3.l) pVar, true);
    }

    @Override
    public final void c(q qVar) {
        this.f20161b = qVar;
    }

    @Override
    public final void d(long j3, long j10) {
        if (j3 == 0) {
            this.f20164f = 0;
            this.f20166i = 0;
            this.f20167j = -1L;
            if (this.f20163e != null) {
                this.f20163e = null;
            }
        } else if (this.f20164f == 3) {
            l lVar = this.f20163e;
            lVar.getClass();
            lVar.d(j3, j10);
        }
    }

    @Override
    public final List e() {
        g0 g0Var = i0.f13686b;
        return s1.f13749e;
    }

    @Override
    public final int f(p pVar, s sVar) {
        while (true) {
            int i7 = this.f20164f;
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            if (i7 == 4) {
                                return -1;
                            }
                            throw new IllegalStateException();
                        }
                        if (this.d == null || pVar != this.f20162c) {
                            this.f20162c = pVar;
                            this.d = new va(pVar, this.f20167j);
                        }
                        l lVar = this.f20163e;
                        lVar.getClass();
                        int f10 = lVar.f(this.d, sVar);
                        if (f10 == 1) {
                            sVar.f10877a += this.f20167j;
                        }
                        return f10;
                    }
                    if (this.f20163e == null) {
                        this.f20163e = new l(k.f4111i, 8);
                    }
                    va vaVar = new va(pVar, this.f20167j);
                    this.d = vaVar;
                    if (this.f20163e.b(vaVar)) {
                        l lVar2 = this.f20163e;
                        long j3 = this.f20167j;
                        q qVar = this.f20161b;
                        qVar.getClass();
                        lVar2.c(new va(j3, qVar, 3));
                        this.f20164f = 3;
                    } else {
                        q qVar2 = this.f20161b;
                        qVar2.getClass();
                        qVar2.d1();
                        this.f20161b.f(new t(-9223372036854775807L));
                        this.f20164f = 4;
                    }
                } else {
                    pVar.m((int) (this.h - this.f20166i));
                    this.f20166i = 0;
                    this.f20164f = 0;
                }
            } else {
                int i10 = this.f20166i;
                x xVar = this.f20160a;
                if (i10 == 0) {
                    if (!pVar.d(xVar.f13521a, 0, 8, true)) {
                        q qVar3 = this.f20161b;
                        qVar3.getClass();
                        qVar3.d1();
                        this.f20161b.f(new t(-9223372036854775807L));
                        this.f20164f = 4;
                        return -1;
                    }
                    this.f20166i = 8;
                    xVar.N(0);
                    this.h = xVar.C();
                    this.f20165g = xVar.m();
                }
                if (this.h == 1) {
                    pVar.readFully(xVar.f13521a, 8, 8);
                    this.f20166i += 8;
                    this.h = xVar.G();
                }
                if (this.f20165g == 1836086884) {
                    long position = pVar.getPosition();
                    this.f20167j = position;
                    long j10 = this.f20166i;
                    o3.b bVar = new o3.b(0L, position - j10, -9223372036854775807L, position, this.h - j10);
                    q qVar4 = this.f20161b;
                    qVar4.getClass();
                    f3.i0 d2 = qVar4.d2(1024, 4);
                    e2.t tVar = new e2.t();
                    tVar.f10398q = s0.n("image/heic");
                    tVar.f10392k = new q0(bVar);
                    r.b.s(tVar, d2);
                    this.f20164f = 2;
                } else {
                    this.f20164f = 1;
                }
            }
        }
    }

    @Override
    public final void release() {
        l lVar = this.f20163e;
        if (lVar != null) {
            lVar.getClass();
            this.f20163e = null;
        }
    }

    @Override
    public final o a() {
        return this;
    }
}
