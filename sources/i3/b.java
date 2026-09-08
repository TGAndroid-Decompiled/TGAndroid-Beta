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
    public final v f11817a = new v(4);
    public final v f11818b = new v(9);
    public final v f11819c = new v(11);
    public final v d = new v();
    public final c f11820e;
    public q f11821f;
    public int f11822g;
    public boolean h;
    public long f11823i;
    public int f11824j;
    public int f11825k;
    public int f11826l;
    public long f11827m;
    public boolean f11828n;
    public a f11829o;
    public e f11830p;

    public b() {
        ?? gVar = new g(new n());
        gVar.f11831b = -9223372036854775807L;
        gVar.f11832c = new long[0];
        gVar.d = new long[0];
        this.f11820e = gVar;
        this.f11822g = 1;
    }

    public final v a(p pVar) {
        int i10 = this.f11826l;
        v vVar = this.d;
        byte[] bArr = vVar.f8817a;
        if (i10 > bArr.length) {
            vVar.H(0, new byte[Math.max(bArr.length * 2, i10)]);
        } else {
            vVar.J(0);
        }
        vVar.I(this.f11826l);
        pVar.readFully(vVar.f8817a, 0, this.f11826l);
        return vVar;
    }

    @Override
    public final boolean b(p pVar) {
        v vVar = this.f11817a;
        l lVar = (l) pVar;
        lVar.j(vVar.f8817a, 0, 3, false);
        vVar.J(0);
        if (vVar.A() == 4607062) {
            lVar.j(vVar.f8817a, 0, 2, false);
            vVar.J(0);
            if ((vVar.D() & 250) == 0) {
                lVar.j(vVar.f8817a, 0, 4, false);
                vVar.J(0);
                int j3 = vVar.j();
                lVar.f4313f = 0;
                lVar.v(j3, false);
                lVar.j(vVar.f8817a, 0, 4, false);
                vVar.J(0);
                if (vVar.j() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void g(q qVar) {
        this.f11821f = qVar;
    }

    @Override
    public final void h(long j3, long j10) {
        if (j3 == 0) {
            this.f11822g = 1;
            this.h = false;
        } else {
            this.f11822g = 3;
        }
        this.f11824j = 0;
    }

    @Override
    public final List i() {
        g0 g0Var = i0.f8985b;
        return a1.f8948e;
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
