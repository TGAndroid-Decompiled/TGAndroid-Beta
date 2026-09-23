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
    public final v f10919a = new v(4);
    public final v f10920b = new v(9);
    public final v f10921c = new v(11);
    public final v d = new v();
    public final c e;
    public q f10922f;
    public int f10923g;
    public boolean h;
    public long f10924i;
    public int f10925j;
    public int f10926k;
    public int f10927l;
    public long f10928m;
    public boolean f10929n;
    public a f10930o;
    public e f10931p;

    public b() {
        ?? gVar = new g(new n());
        gVar.f10932b = -9223372036854775807L;
        gVar.f10933c = new long[0];
        gVar.d = new long[0];
        this.e = gVar;
        this.f10923g = 1;
    }

    @Override
    public final boolean a(p pVar) {
        v vVar = this.f10919a;
        l lVar = (l) pVar;
        lVar.h(vVar.f7917a, 0, 3, false);
        vVar.J(0);
        if (vVar.A() == 4607062) {
            lVar.h(vVar.f7917a, 0, 2, false);
            vVar.J(0);
            if ((vVar.D() & 250) == 0) {
                lVar.h(vVar.f7917a, 0, 4, false);
                vVar.J(0);
                int j3 = vVar.j();
                lVar.f3783f = 0;
                lVar.s(j3, false);
                lVar.h(vVar.f7917a, 0, 4, false);
                vVar.J(0);
                if (vVar.j() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final v b(p pVar) {
        int i10 = this.f10927l;
        v vVar = this.d;
        byte[] bArr = vVar.f7917a;
        if (i10 > bArr.length) {
            vVar.H(0, new byte[Math.max(bArr.length * 2, i10)]);
        } else {
            vVar.J(0);
        }
        vVar.I(this.f10927l);
        pVar.readFully(vVar.f7917a, 0, this.f10927l);
        return vVar;
    }

    @Override
    public final void g(q qVar) {
        this.f10922f = qVar;
    }

    @Override
    public final void h(long j3, long j10) {
        if (j3 == 0) {
            this.f10923g = 1;
            this.h = false;
        } else {
            this.f10923g = 3;
        }
        this.f10925j = 0;
    }

    @Override
    public final List i() {
        g0 g0Var = i0.f8067b;
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
