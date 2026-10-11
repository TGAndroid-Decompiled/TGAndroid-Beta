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
    public final v f11945a = new v(4);
    public final v f11946b = new v(9);
    public final v f11947c = new v(11);
    public final v d = new v();
    public final c f11948e;
    public q f11949f;
    public int f11950g;
    public boolean h;
    public long f11951i;
    public int f11952j;
    public int f11953k;
    public int f11954l;
    public long f11955m;
    public boolean f11956n;
    public a f11957o;
    public e f11958p;

    public b() {
        ?? gVar = new g(new n());
        gVar.f11959b = -9223372036854775807L;
        gVar.f11960c = new long[0];
        gVar.d = new long[0];
        this.f11948e = gVar;
        this.f11950g = 1;
    }

    @Override
    public final boolean a(p pVar) {
        v vVar = this.f11945a;
        l lVar = (l) pVar;
        lVar.i(vVar.f8583a, 0, 3, false);
        vVar.J(0);
        if (vVar.A() == 4607062) {
            lVar.i(vVar.f8583a, 0, 2, false);
            vVar.J(0);
            if ((vVar.D() & 250) == 0) {
                lVar.i(vVar.f8583a, 0, 4, false);
                vVar.J(0);
                int j3 = vVar.j();
                lVar.f4142f = 0;
                lVar.v(j3, false);
                lVar.i(vVar.f8583a, 0, 4, false);
                vVar.J(0);
                if (vVar.j() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final v b(p pVar) {
        int i10 = this.f11954l;
        v vVar = this.d;
        byte[] bArr = vVar.f8583a;
        if (i10 > bArr.length) {
            vVar.H(0, new byte[Math.max(bArr.length * 2, i10)]);
        } else {
            vVar.J(0);
        }
        vVar.I(this.f11954l);
        pVar.readFully(vVar.f8583a, 0, this.f11954l);
        return vVar;
    }

    @Override
    public final void g(q qVar) {
        this.f11949f = qVar;
    }

    @Override
    public final void h(long j3, long j10) {
        if (j3 == 0) {
            this.f11950g = 1;
            this.h = false;
        } else {
            this.f11950g = 3;
        }
        this.f11952j = 0;
    }

    @Override
    public final List i() {
        g0 g0Var = i0.f8751b;
        return a1.f8714e;
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
