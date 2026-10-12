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
    public final x f11255a = new x(4);
    public final x f11256b = new x(9);
    public final x f11257c = new x(11);
    public final x d = new x();
    public final c e;
    public q f11258f;
    public int f11259g;
    public boolean h;
    public long f11260i;
    public int f11261j;
    public int f11262k;
    public int f11263l;
    public long f11264m;
    public boolean f11265n;
    public a f11266o;
    public e f11267p;

    public b() {
        ?? hVar = new h(new n());
        hVar.f11268b = -9223372036854775807L;
        hVar.f11269c = new long[0];
        hVar.d = new long[0];
        this.e = hVar;
        this.f11259g = 1;
    }

    @Override
    public final boolean a(p pVar) {
        x xVar = this.f11255a;
        l lVar = (l) pVar;
        lVar.j(xVar.f8411a, 0, 3, false);
        xVar.N(0);
        if (xVar.D() == 4607062) {
            lVar.j(xVar.f8411a, 0, 2, false);
            xVar.N(0);
            if ((xVar.H() & 250) == 0) {
                lVar.j(xVar.f8411a, 0, 4, false);
                xVar.N(0);
                int m10 = xVar.m();
                lVar.f4270f = 0;
                lVar.v(m10, false);
                lVar.j(xVar.f8411a, 0, 4, false);
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
        this.f11258f = qVar;
    }

    @Override
    public final void d(long j10, long j11) {
        if (j10 == 0) {
            this.f11259g = 1;
            this.h = false;
        } else {
            this.f11259g = 3;
        }
        this.f11261j = 0;
    }

    @Override
    public final List e() {
        l0 l0Var = n0.f8592b;
        return x1.e;
    }

    @Override
    public final int f(c3.p r30, c3.s r31) {
        throw new UnsupportedOperationException("Method not decompiled: i3.b.f(c3.p, c3.s):int");
    }

    public final x g(p pVar) {
        int i10 = this.f11263l;
        x xVar = this.d;
        byte[] bArr = xVar.f8411a;
        if (i10 > bArr.length) {
            xVar.L(0, new byte[Math.max(bArr.length * 2, i10)]);
        } else {
            xVar.N(0);
        }
        xVar.M(this.f11263l);
        pVar.readFully(xVar.f8411a, 0, this.f11263l);
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
