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
    public final v f11946a = new v(4);
    public final v f11947b = new v(9);
    public final v f11948c = new v(11);
    public final v d = new v();
    public final c f11949e;
    public q f11950f;
    public int f11951g;
    public boolean h;
    public long f11952i;
    public int f11953j;
    public int f11954k;
    public int f11955l;
    public long f11956m;
    public boolean f11957n;
    public a f11958o;
    public e f11959p;

    public b() {
        ?? gVar = new g(new n());
        gVar.f11960b = -9223372036854775807L;
        gVar.f11961c = new long[0];
        gVar.d = new long[0];
        this.f11949e = gVar;
        this.f11951g = 1;
    }

    @Override
    public final boolean a(p pVar) {
        v vVar = this.f11946a;
        l lVar = (l) pVar;
        lVar.h(vVar.f8584a, 0, 3, false);
        vVar.J(0);
        if (vVar.A() == 4607062) {
            lVar.h(vVar.f8584a, 0, 2, false);
            vVar.J(0);
            if ((vVar.D() & 250) == 0) {
                lVar.h(vVar.f8584a, 0, 4, false);
                vVar.J(0);
                int j3 = vVar.j();
                lVar.f4142f = 0;
                lVar.v(j3, false);
                lVar.h(vVar.f8584a, 0, 4, false);
                vVar.J(0);
                if (vVar.j() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public final v b(p pVar) {
        int i10 = this.f11955l;
        v vVar = this.d;
        byte[] bArr = vVar.f8584a;
        if (i10 > bArr.length) {
            vVar.H(0, new byte[Math.max(bArr.length * 2, i10)]);
        } else {
            vVar.J(0);
        }
        vVar.I(this.f11955l);
        pVar.readFully(vVar.f8584a, 0, this.f11955l);
        return vVar;
    }

    @Override
    public final void g(q qVar) {
        this.f11950f = qVar;
    }

    @Override
    public final void h(long j3, long j10) {
        if (j3 == 0) {
            this.f11951g = 1;
            this.h = false;
        } else {
            this.f11951g = 3;
        }
        this.f11953j = 0;
    }

    @Override
    public final List i() {
        g0 g0Var = i0.f8752b;
        return a1.f8715e;
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
