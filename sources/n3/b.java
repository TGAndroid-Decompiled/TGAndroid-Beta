package n3;

import a8.va;
import f3.o;
import f3.p;
import f3.q;
import f3.t;
import h2.x;
import h9.g0;
import h9.i0;
import h9.t1;
import j$.util.Objects;
import java.util.List;
import z3.l;
public final class b implements o {
    public q f21326b;
    public int f21327c;
    public int d;
    public int f21328e;
    public o3.b f21330g;
    public p h;
    public va f21331i;
    public l f21332j;
    public final x f21325a = new x(2);
    public long f21329f = -1;

    @Override
    public final boolean b(p pVar) {
        String v;
        f3.l lVar = (f3.l) pVar;
        x xVar = this.f21325a;
        xVar.K(2);
        lVar.g(xVar.f13865a, 0, 2, false);
        if (xVar.H() == 65496) {
            while (true) {
                xVar.K(2);
                lVar.g(xVar.f13865a, 0, 2, false);
                int H = xVar.H();
                this.d = H;
                if (H == 65498) {
                    break;
                }
                xVar.K(2);
                lVar.b(0, 2, xVar.f13865a);
                int H2 = xVar.H() - 2;
                if (H2 < 0) {
                    break;
                } else if (this.d != 65505) {
                    lVar.x(H2, false);
                } else {
                    xVar.K(H2);
                    lVar.g(xVar.f13865a, 0, H2, false);
                    if (Objects.equals(xVar.v(), "http://ns.adobe.com/xap/1.0/") && (v = xVar.v()) != null) {
                        for (int i7 = 0; i7 < 4; i7++) {
                            if (v.contains(d.f21336a[i7] + "=\"1\"")) {
                                return true;
                            }
                        }
                        continue;
                    }
                }
            }
        }
        return false;
    }

    @Override
    public final void c(q qVar) {
        this.f21326b = qVar;
    }

    @Override
    public final void d(long j3, long j10) {
        if (j3 == 0) {
            this.f21327c = 0;
            this.f21332j = null;
        } else if (this.f21327c == 5) {
            l lVar = this.f21332j;
            lVar.getClass();
            lVar.d(j3, j10);
        }
    }

    @Override
    public final List e() {
        g0 g0Var = i0.f14035b;
        return t1.f14103e;
    }

    @Override
    public final int f(f3.p r26, f3.s r27) {
        throw new UnsupportedOperationException("Method not decompiled: n3.b.f(f3.p, f3.s):int");
    }

    public final void g() {
        q qVar = this.f21326b;
        qVar.getClass();
        qVar.d1();
        this.f21326b.j(new t(-9223372036854775807L));
        this.f21327c = 6;
    }

    @Override
    public final void release() {
        l lVar = this.f21332j;
        if (lVar != null) {
            lVar.getClass();
        }
    }

    @Override
    public final o a() {
        return this;
    }
}
