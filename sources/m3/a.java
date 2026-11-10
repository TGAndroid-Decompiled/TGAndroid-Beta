package m3;

import a8.ua;
import c4.k;
import c8.m9;
import e2.q0;
import e2.s0;
import f3.j0;
import f3.l;
import f3.o;
import f3.p;
import f3.q;
import f3.s;
import f3.t;
import h2.x;
import h9.g0;
import h9.i0;
import h9.t1;
import java.util.List;
import org.telegram.ui.Cells.f1;
import z3.m;
public final class a implements o {
    public q f19570b;
    public p f19571c;
    public ua d;
    public m f19572e;
    public int f19574g;
    public long h;
    public int f19575i;
    public final x f19569a = new x(16);
    public long f19576j = -1;
    public int f19573f = 0;

    @Override
    public final boolean b(p pVar) {
        return m9.a((l) pVar, true);
    }

    @Override
    public final void c(q qVar) {
        this.f19570b = qVar;
    }

    @Override
    public final void d(long j3, long j10) {
        if (j3 == 0) {
            this.f19573f = 0;
            this.f19575i = 0;
            this.f19576j = -1L;
            if (this.f19572e != null) {
                this.f19572e = null;
            }
        } else if (this.f19573f == 3) {
            m mVar = this.f19572e;
            mVar.getClass();
            mVar.d(j3, j10);
        }
    }

    @Override
    public final List e() {
        g0 g0Var = i0.f14331b;
        return t1.f14399e;
    }

    @Override
    public final int f(p pVar, s sVar) {
        while (true) {
            int i7 = this.f19573f;
            if (i7 != 0) {
                if (i7 != 1) {
                    if (i7 != 2) {
                        if (i7 != 3) {
                            if (i7 == 4) {
                                return -1;
                            }
                            throw new IllegalStateException();
                        }
                        if (this.d == null || pVar != this.f19571c) {
                            this.f19571c = pVar;
                            this.d = new ua(pVar, this.f19576j);
                        }
                        m mVar = this.f19572e;
                        mVar.getClass();
                        int f10 = mVar.f(this.d, sVar);
                        if (f10 == 1) {
                            sVar.f11075a += this.f19576j;
                        }
                        return f10;
                    }
                    if (this.f19572e == null) {
                        this.f19572e = new m(k.f5292i, 8);
                    }
                    ua uaVar = new ua(pVar, this.f19576j);
                    this.d = uaVar;
                    if (this.f19572e.b(uaVar)) {
                        m mVar2 = this.f19572e;
                        long j3 = this.f19576j;
                        q qVar = this.f19570b;
                        qVar.getClass();
                        mVar2.c(new ua(j3, qVar, 3));
                        this.f19573f = 3;
                    } else {
                        q qVar2 = this.f19570b;
                        qVar2.getClass();
                        qVar2.U0();
                        this.f19570b.f(new t(-9223372036854775807L));
                        this.f19573f = 4;
                    }
                } else {
                    pVar.s((int) (this.h - this.f19575i));
                    this.f19575i = 0;
                    this.f19573f = 0;
                }
            } else {
                int i10 = this.f19575i;
                x xVar = this.f19569a;
                if (i10 == 0) {
                    if (!pVar.c(xVar.f14164a, 0, 8, true)) {
                        q qVar3 = this.f19570b;
                        qVar3.getClass();
                        qVar3.U0();
                        this.f19570b.f(new t(-9223372036854775807L));
                        this.f19573f = 4;
                        return -1;
                    }
                    this.f19575i = 8;
                    xVar.N(0);
                    this.h = xVar.C();
                    this.f19574g = xVar.m();
                }
                if (this.h == 1) {
                    pVar.readFully(xVar.f14164a, 8, 8);
                    this.f19575i += 8;
                    this.h = xVar.G();
                }
                if (this.f19574g == 1836086884) {
                    long position = pVar.getPosition();
                    this.f19576j = position;
                    long j10 = this.f19575i;
                    o3.b bVar = new o3.b(0L, position - j10, -9223372036854775807L, position, this.h - j10);
                    q qVar4 = this.f19570b;
                    qVar4.getClass();
                    j0 O1 = qVar4.O1(1024, 4);
                    e2.t tVar = new e2.t();
                    tVar.f10567q = s0.n("image/heic");
                    tVar.f10561k = new q0(bVar);
                    f1.s(tVar, O1);
                    this.f19573f = 2;
                } else {
                    this.f19573f = 1;
                }
            }
        }
    }

    @Override
    public final void release() {
        m mVar = this.f19572e;
        if (mVar != null) {
            mVar.getClass();
            this.f19572e = null;
        }
    }

    @Override
    public final o a() {
        return this;
    }
}
