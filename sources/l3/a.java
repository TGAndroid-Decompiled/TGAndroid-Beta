package l3;

import b4.k;
import b8.ig;
import b8.sd;
import d2.s0;
import d2.u;
import d2.u0;
import e3.l;
import e3.o;
import e3.p;
import e3.q;
import e3.s;
import e3.t;
import g2.y;
import g9.g0;
import g9.i0;
import g9.s1;
import java.util.List;
import org.telegram.ui.Cells.f1;
import y3.m;
public final class a implements o {
    public q f17731b;
    public p f17732c;
    public ig d;
    public m f17733e;
    public int f17735g;
    public long h;
    public int f17736i;
    public final y f17730a = new y(16);
    public long f17737j = -1;
    public int f17734f = 0;

    @Override
    public final boolean b(p pVar) {
        return sd.a((l) pVar, true);
    }

    @Override
    public final void c(q qVar) {
        this.f17731b = qVar;
    }

    @Override
    public final void d(long j10, long j11) {
        if (j10 == 0) {
            this.f17734f = 0;
            this.f17736i = 0;
            this.f17737j = -1L;
            if (this.f17733e != null) {
                this.f17733e = null;
            }
        } else if (this.f17734f == 3) {
            m mVar = this.f17733e;
            mVar.getClass();
            mVar.d(j10, j11);
        }
    }

    @Override
    public final List e() {
        g0 g0Var = i0.f12083b;
        return s1.f12146e;
    }

    @Override
    public final int f(p pVar, s sVar) {
        while (true) {
            int i3 = this.f17734f;
            if (i3 != 0) {
                if (i3 != 1) {
                    if (i3 != 2) {
                        if (i3 != 3) {
                            if (i3 == 4) {
                                return -1;
                            }
                            throw new IllegalStateException();
                        }
                        if (this.d == null || pVar != this.f17732c) {
                            this.f17732c = pVar;
                            this.d = new ig(pVar, this.f17737j);
                        }
                        m mVar = this.f17733e;
                        mVar.getClass();
                        int f10 = mVar.f(this.d, sVar);
                        if (f10 == 1) {
                            sVar.f9506a += this.f17737j;
                        }
                        return f10;
                    }
                    if (this.f17733e == null) {
                        this.f17733e = new m(k.f2372g, 8);
                    }
                    ig igVar = new ig(pVar, this.f17737j);
                    this.d = igVar;
                    if (this.f17733e.b(igVar)) {
                        m mVar2 = this.f17733e;
                        long j10 = this.f17737j;
                        q qVar = this.f17731b;
                        qVar.getClass();
                        mVar2.c(new ig(j10, qVar, 2));
                        this.f17734f = 3;
                    } else {
                        q qVar2 = this.f17731b;
                        qVar2.getClass();
                        qVar2.L();
                        this.f17731b.f(new t(-9223372036854775807L));
                        this.f17734f = 4;
                    }
                } else {
                    pVar.u((int) (this.h - this.f17736i));
                    this.f17736i = 0;
                    this.f17734f = 0;
                }
            } else {
                int i10 = this.f17736i;
                y yVar = this.f17730a;
                if (i10 == 0) {
                    if (!pVar.d(yVar.f11923a, 0, 8, true)) {
                        q qVar3 = this.f17731b;
                        qVar3.getClass();
                        qVar3.L();
                        this.f17731b.f(new t(-9223372036854775807L));
                        this.f17734f = 4;
                        return -1;
                    }
                    this.f17736i = 8;
                    yVar.N(0);
                    this.h = yVar.C();
                    this.f17735g = yVar.m();
                }
                if (this.h == 1) {
                    pVar.readFully(yVar.f11923a, 8, 8);
                    this.f17736i += 8;
                    this.h = yVar.G();
                }
                if (this.f17735g == 1836086884) {
                    long position = pVar.getPosition();
                    this.f17737j = position;
                    long j11 = this.f17736i;
                    n3.b bVar = new n3.b(0L, position - j11, -9223372036854775807L, position, this.h - j11);
                    q qVar4 = this.f17731b;
                    qVar4.getClass();
                    e3.i0 i02 = qVar4.i0(1024, 4);
                    u uVar = new u();
                    uVar.f8430q = u0.n("image/heic");
                    uVar.f8424k = new s0(bVar);
                    f1.w(uVar, i02);
                    this.f17734f = 2;
                } else {
                    this.f17734f = 1;
                }
            }
        }
    }

    @Override
    public final void release() {
        m mVar = this.f17733e;
        if (mVar != null) {
            mVar.getClass();
            this.f17733e = null;
        }
    }

    @Override
    public final o a() {
        return this;
    }
}
