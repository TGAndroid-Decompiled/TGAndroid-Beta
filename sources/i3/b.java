package i3;

import b2.h;
import c3.l;
import c3.n;
import c3.o;
import c3.p;
import c3.q;
import e2.x;
import e9.l0;
import e9.n0;
import e9.x1;
import java.util.List;
public final class b implements o {
    public final x f8142a = new x(4);
    public final x f8143b = new x(9);
    public final x f8144c = new x(11);
    public final x d = new x();
    public final c e;
    public q f8145f;
    public int f8146g;
    public boolean h;
    public long f8147i;
    public int f8148j;
    public int f8149k;
    public int f8150l;
    public long f8151m;
    public boolean f8152n;
    public a f8153o;
    public e f8154p;

    public b() {
        ?? hVar = new h(new n());
        hVar.f8155b = -9223372036854775807L;
        hVar.f8156c = new long[0];
        hVar.d = new long[0];
        this.e = hVar;
        this.f8146g = 1;
    }

    @Override
    public final boolean a(p pVar) {
        x xVar = this.f8142a;
        l lVar = (l) pVar;
        lVar.j(xVar.f6207a, 0, 3, false);
        xVar.N(0);
        if (xVar.D() == 4607062) {
            lVar.j(xVar.f6207a, 0, 2, false);
            xVar.N(0);
            if ((xVar.H() & 250) == 0) {
                lVar.j(xVar.f6207a, 0, 4, false);
                xVar.N(0);
                int m10 = xVar.m();
                lVar.f3672f = 0;
                lVar.r(m10, false);
                lVar.j(xVar.f6207a, 0, 4, false);
                xVar.N(0);
                if (xVar.m() == 0) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override
    public final void c(q qVar) {
        this.f8145f = qVar;
    }

    @Override
    public final void d(long j10, long j11) {
        if (j10 == 0) {
            this.f8146g = 1;
            this.h = false;
        } else {
            this.f8146g = 3;
        }
        this.f8148j = 0;
    }

    @Override
    public final List e() {
        l0 l0Var = n0.f6390b;
        return x1.e;
    }

    @Override
    public final int f(c3.p r30, c3.s r31) {
        throw new UnsupportedOperationException("Method not decompiled: i3.b.f(c3.p, c3.s):int");
    }

    public final x g(p pVar) {
        int i10 = this.f8150l;
        x xVar = this.d;
        byte[] bArr = xVar.f6207a;
        if (i10 > bArr.length) {
            xVar.L(0, new byte[Math.max(bArr.length * 2, i10)]);
        } else {
            xVar.N(0);
        }
        xVar.M(this.f8150l);
        pVar.readFully(xVar.f6207a, 0, this.f8150l);
        return xVar;
    }

    @Override
    public final o b() {
        return this;
    }

    @Override
    public final void release() {
    }
}
