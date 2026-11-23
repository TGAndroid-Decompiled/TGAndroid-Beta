package l3;

import f3.l;
import f3.n;
import f3.o;
import f3.p;
import f3.q;
import h2.x;
import h9.g0;
import h9.i0;
import h9.s1;
import java.util.List;
public final class b implements o {
    public final x f19701a = new x(4);
    public final x f19702b = new x(9);
    public final x f19703c = new x(11);
    public final x d = new x();
    public final c f19704e;
    public q f19705f;
    public int f19706g;
    public boolean h;
    public long f19707i;
    public int f19708j;
    public int f19709k;
    public int f19710l;
    public long f19711m;
    public boolean f19712n;
    public a f19713o;
    public e f19714p;

    public b() {
        ?? qVar = new com.google.android.gms.common.api.q(new n());
        qVar.f19715b = -9223372036854775807L;
        qVar.f19716c = new long[0];
        qVar.d = new long[0];
        this.f19704e = qVar;
        this.f19706g = 1;
    }

    @Override
    public final boolean b(p pVar) {
        x xVar = this.f19701a;
        l lVar = (l) pVar;
        lVar.k(xVar.f13828a, 0, 3, false);
        xVar.N(0);
        if (xVar.D() == 4607062) {
            lVar.k(xVar.f13828a, 0, 2, false);
            xVar.N(0);
            if ((xVar.H() & 250) == 0) {
                lVar.k(xVar.f13828a, 0, 4, false);
                xVar.N(0);
                int m10 = xVar.m();
                lVar.f11184f = 0;
                lVar.t(m10, false);
                lVar.k(xVar.f13828a, 0, 4, false);
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
        this.f19705f = qVar;
    }

    @Override
    public final void d(long j3, long j10) {
        if (j3 == 0) {
            this.f19706g = 1;
            this.h = false;
        } else {
            this.f19706g = 3;
        }
        this.f19708j = 0;
    }

    @Override
    public final List e() {
        g0 g0Var = i0.f13995b;
        return s1.f14058e;
    }

    @Override
    public final int f(f3.p r30, f3.s r31) {
        throw new UnsupportedOperationException("Method not decompiled: l3.b.f(f3.p, f3.s):int");
    }

    public final x g(p pVar) {
        int i7 = this.f19710l;
        x xVar = this.d;
        byte[] bArr = xVar.f13828a;
        if (i7 > bArr.length) {
            xVar.L(0, new byte[Math.max(bArr.length * 2, i7)]);
        } else {
            xVar.N(0);
        }
        xVar.M(this.f19710l);
        pVar.readFully(xVar.f13828a, 0, this.f19710l);
        return xVar;
    }

    @Override
    public final o a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
