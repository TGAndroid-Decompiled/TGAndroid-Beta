package i3;

import b2.g;
import c3.l;
import c3.n;
import c3.o;
import c3.p;
import c3.q;
import e2.v;
import e9.a1;
import e9.g0;
import e9.i0;
import java.util.List;
public final class b implements o {
    public final v f10922a = new v(4);
    public final v f10923b = new v(9);
    public final v f10924c = new v(11);
    public final v d = new v();
    public final c e;
    public q f10925f;
    public int f10926g;
    public boolean h;
    public long f10927i;
    public int f10928j;
    public int f10929k;
    public int f10930l;
    public long f10931m;
    public boolean f10932n;
    public a f10933o;
    public e f10934p;

    public b() {
        ?? gVar = new g(new n());
        gVar.f10935b = -9223372036854775807L;
        gVar.f10936c = new long[0];
        gVar.d = new long[0];
        this.e = gVar;
        this.f10926g = 1;
    }

    @Override
    public final boolean a(p pVar) {
        v vVar = this.f10922a;
        l lVar = (l) pVar;
        lVar.h(vVar.f7918a, 0, 3, false);
        vVar.J(0);
        if (vVar.A() == 4607062) {
            lVar.h(vVar.f7918a, 0, 2, false);
            vVar.J(0);
            if ((vVar.D() & 250) == 0) {
                lVar.h(vVar.f7918a, 0, 4, false);
                vVar.J(0);
                int j3 = vVar.j();
                lVar.f3785f = 0;
                lVar.t(j3, false);
                lVar.h(vVar.f7918a, 0, 4, false);
                vVar.J(0);
                if (vVar.j() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final v b(p pVar) {
        int i10 = this.f10930l;
        v vVar = this.d;
        byte[] bArr = vVar.f7918a;
        if (i10 > bArr.length) {
            vVar.H(0, new byte[Math.max(bArr.length * 2, i10)]);
        } else {
            vVar.J(0);
        }
        vVar.I(this.f10930l);
        pVar.readFully(vVar.f7918a, 0, this.f10930l);
        return vVar;
    }

    @Override
    public final void g(q qVar) {
        this.f10925f = qVar;
    }

    @Override
    public final void h(long j3, long j10) {
        if (j3 == 0) {
            this.f10926g = 1;
            this.h = false;
        } else {
            this.f10926g = 3;
        }
        this.f10928j = 0;
    }

    @Override
    public final List i() {
        g0 g0Var = i0.f8068b;
        return a1.e;
    }

    @Override
    public final int m(c3.p r29, c3.s r30) {
        throw new UnsupportedOperationException("Method not decompiled: i3.b.m(c3.p, c3.s):int");
    }

    @Override
    public final o c() {
        return this;
    }

    @Override
    public final void release() {
    }
}
