package i3;

import b2.h;
import c3.l;
import c3.n;
import c3.o;
import c3.p;
import c3.q;
import e2.x;
import f9.g0;
import f9.i0;
import f9.s1;
import java.util.List;
public final class b implements o {
    public final x f13816a = new x(4);
    public final x f13817b = new x(9);
    public final x f13818c = new x(11);
    public final x d = new x();
    public final c e;
    public q f13819f;
    public int f13820g;
    public boolean h;
    public long f13821i;
    public int f13822j;
    public int f13823k;
    public int f13824l;
    public long f13825m;
    public boolean f13826n;
    public a f13827o;
    public e f13828p;

    public b() {
        ?? hVar = new h(new n());
        hVar.f13829b = -9223372036854775807L;
        hVar.f13830c = new long[0];
        hVar.d = new long[0];
        this.e = hVar;
        this.f13820g = 1;
    }

    @Override
    public final boolean a(p pVar) {
        x xVar = this.f13816a;
        l lVar = (l) pVar;
        lVar.h(xVar.f9732a, 0, 3, false);
        xVar.N(0);
        if (xVar.D() == 4607062) {
            lVar.h(xVar.f9732a, 0, 2, false);
            xVar.N(0);
            if ((xVar.H() & 250) == 0) {
                lVar.h(xVar.f9732a, 0, 4, false);
                xVar.N(0);
                int m10 = xVar.m();
                lVar.f6081f = 0;
                lVar.s(m10, false);
                lVar.h(xVar.f9732a, 0, 4, false);
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
        this.f13819f = qVar;
    }

    @Override
    public final void d(long j10, long j11) {
        if (j10 == 0) {
            this.f13820g = 1;
            this.h = false;
        } else {
            this.f13820g = 3;
        }
        this.f13822j = 0;
    }

    @Override
    public final List e() {
        g0 g0Var = i0.f10287b;
        return s1.e;
    }

    @Override
    public final int f(c3.p r30, c3.s r31) {
        throw new UnsupportedOperationException("Method not decompiled: i3.b.f(c3.p, c3.s):int");
    }

    public final x g(p pVar) {
        int i10 = this.f13824l;
        x xVar = this.d;
        byte[] bArr = xVar.f9732a;
        if (i10 > bArr.length) {
            xVar.L(0, new byte[Math.max(bArr.length * 2, i10)]);
        } else {
            xVar.N(0);
        }
        xVar.M(this.f13824l);
        pVar.readFully(xVar.f9732a, 0, this.f13824l);
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
