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
    public final v f10413a = new v(4);
    public final v f10414b = new v(9);
    public final v f10415c = new v(11);
    public final v d = new v();
    public final c e;
    public q f10416f;
    public int f10417g;
    public boolean h;
    public long f10418i;
    public int f10419j;
    public int f10420k;
    public int f10421l;
    public long f10422m;
    public boolean f10423n;
    public a f10424o;
    public e f10425p;

    public b() {
        ?? gVar = new g(new n());
        gVar.f10426b = -9223372036854775807L;
        gVar.f10427c = new long[0];
        gVar.d = new long[0];
        this.e = gVar;
        this.f10417g = 1;
    }

    public final v a(p pVar) {
        int i10 = this.f10421l;
        v vVar = this.d;
        byte[] bArr = vVar.f7234a;
        if (i10 > bArr.length) {
            vVar.H(0, new byte[Math.max(bArr.length * 2, i10)]);
        } else {
            vVar.J(0);
        }
        vVar.I(this.f10421l);
        pVar.readFully(vVar.f7234a, 0, this.f10421l);
        return vVar;
    }

    @Override
    public final boolean b(p pVar) {
        v vVar = this.f10413a;
        l lVar = (l) pVar;
        lVar.g(vVar.f7234a, 0, 3, false);
        vVar.J(0);
        if (vVar.A() == 4607062) {
            lVar.g(vVar.f7234a, 0, 2, false);
            vVar.J(0);
            if ((vVar.D() & 250) == 0) {
                lVar.g(vVar.f7234a, 0, 4, false);
                vVar.J(0);
                int j3 = vVar.j();
                lVar.f4205f = 0;
                lVar.s(j3, false);
                lVar.g(vVar.f7234a, 0, 4, false);
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
        this.f10416f = qVar;
    }

    @Override
    public final void h(long j3, long j10) {
        if (j3 == 0) {
            this.f10417g = 1;
            this.h = false;
        } else {
            this.f10417g = 3;
        }
        this.f10419j = 0;
    }

    @Override
    public final List i() {
        g0 g0Var = i0.f7384b;
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
