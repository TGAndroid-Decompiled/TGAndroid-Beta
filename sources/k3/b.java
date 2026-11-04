package k3;

import ci.u0;
import e3.l;
import e3.n;
import e3.o;
import e3.p;
import e3.q;
import g2.y;
import g9.g0;
import g9.i0;
import g9.s1;
import java.util.List;
public final class b implements o {
    public final y f16806a = new y(4);
    public final y f16807b = new y(9);
    public final y f16808c = new y(11);
    public final y d = new y();
    public final c f16809e;
    public q f16810f;
    public int f16811g;
    public boolean h;
    public long f16812i;
    public int f16813j;
    public int f16814k;
    public int f16815l;
    public long f16816m;
    public boolean f16817n;
    public a f16818o;
    public e f16819p;

    public b() {
        ?? u0Var = new u0(new n());
        u0Var.f16820b = -9223372036854775807L;
        u0Var.f16821c = new long[0];
        u0Var.d = new long[0];
        this.f16809e = u0Var;
        this.f16811g = 1;
    }

    @Override
    public final boolean b(p pVar) {
        y yVar = this.f16806a;
        l lVar = (l) pVar;
        lVar.h(yVar.f11923a, 0, 3, false);
        yVar.N(0);
        if (yVar.D() == 4607062) {
            lVar.h(yVar.f11923a, 0, 2, false);
            yVar.N(0);
            if ((yVar.H() & 250) == 0) {
                lVar.h(yVar.f11923a, 0, 4, false);
                yVar.N(0);
                int m10 = yVar.m();
                lVar.f9496f = 0;
                lVar.w(m10, false);
                lVar.h(yVar.f11923a, 0, 4, false);
                yVar.N(0);
                if (yVar.m() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void c(q qVar) {
        this.f16810f = qVar;
    }

    @Override
    public final void d(long j10, long j11) {
        if (j10 == 0) {
            this.f16811g = 1;
            this.h = false;
        } else {
            this.f16811g = 3;
        }
        this.f16813j = 0;
    }

    @Override
    public final List e() {
        g0 g0Var = i0.f12083b;
        return s1.f12146e;
    }

    @Override
    public final int f(e3.p r30, e3.s r31) {
        throw new UnsupportedOperationException("Method not decompiled: k3.b.f(e3.p, e3.s):int");
    }

    public final y g(p pVar) {
        int i3 = this.f16815l;
        y yVar = this.d;
        byte[] bArr = yVar.f11923a;
        if (i3 > bArr.length) {
            yVar.L(0, new byte[Math.max(bArr.length * 2, i3)]);
        } else {
            yVar.N(0);
        }
        yVar.M(this.f16815l);
        pVar.readFully(yVar.f11923a, 0, this.f16815l);
        return yVar;
    }

    @Override
    public final o a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
