package l3;

import f3.l;
import f3.n;
import f3.o;
import f3.p;
import f3.q;
import h2.x;
import h9.g0;
import h9.i0;
import h9.t1;
import java.util.List;
public final class b implements o {
    public final x f19635a = new x(4);
    public final x f19636b = new x(9);
    public final x f19637c = new x(11);
    public final x d = new x();
    public final c f19638e;
    public q f19639f;
    public int f19640g;
    public boolean h;
    public long f19641i;
    public int f19642j;
    public int f19643k;
    public int f19644l;
    public long f19645m;
    public boolean f19646n;
    public a f19647o;
    public e f19648p;

    public b() {
        ?? qVar = new com.google.android.gms.common.api.q(new n());
        qVar.f19649b = -9223372036854775807L;
        qVar.f19650c = new long[0];
        qVar.d = new long[0];
        this.f19638e = qVar;
        this.f19640g = 1;
    }

    @Override
    public final boolean b(p pVar) {
        x xVar = this.f19635a;
        l lVar = (l) pVar;
        lVar.g(xVar.f13865a, 0, 3, false);
        xVar.N(0);
        if (xVar.D() == 4607062) {
            lVar.g(xVar.f13865a, 0, 2, false);
            xVar.N(0);
            if ((xVar.H() & 250) == 0) {
                lVar.g(xVar.f13865a, 0, 4, false);
                xVar.N(0);
                int m10 = xVar.m();
                lVar.f11218f = 0;
                lVar.x(m10, false);
                lVar.g(xVar.f13865a, 0, 4, false);
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
        this.f19639f = qVar;
    }

    @Override
    public final void d(long j3, long j10) {
        if (j3 == 0) {
            this.f19640g = 1;
            this.h = false;
        } else {
            this.f19640g = 3;
        }
        this.f19642j = 0;
    }

    @Override
    public final List e() {
        g0 g0Var = i0.f14035b;
        return t1.f14103e;
    }

    @Override
    public final int f(f3.p r30, f3.s r31) {
        throw new UnsupportedOperationException("Method not decompiled: l3.b.f(f3.p, f3.s):int");
    }

    public final x g(p pVar) {
        int i7 = this.f19644l;
        x xVar = this.d;
        byte[] bArr = xVar.f13865a;
        if (i7 > bArr.length) {
            xVar.L(0, new byte[Math.max(bArr.length * 2, i7)]);
        } else {
            xVar.N(0);
        }
        xVar.M(this.f19644l);
        pVar.readFully(xVar.f13865a, 0, this.f19644l);
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
