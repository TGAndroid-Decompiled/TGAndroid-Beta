package k3;

import c3.o;
import c3.p;
import c3.q;
import c3.t;
import e2.x;
import e9.l0;
import e9.n0;
import e9.x1;
import j$.util.Objects;
import java.util.List;
import w3.l;
public final class b implements o {
    public q f14868b;
    public int f14869c;
    public int d;
    public int e;
    public l3.b f14871g;
    public p h;
    public ad.d f14872i;
    public l f14873j;
    public final x f14867a = new x(2);
    public long f14870f = -1;

    @Override
    public final boolean a(p pVar) {
        String v;
        c3.l lVar = (c3.l) pVar;
        x xVar = this.f14867a;
        xVar.K(2);
        lVar.j(xVar.f8291a, 0, 2, false);
        if (xVar.H() == 65496) {
            while (true) {
                xVar.K(2);
                lVar.j(xVar.f8291a, 0, 2, false);
                int H = xVar.H();
                this.d = H;
                if (H == 65498) {
                    break;
                }
                xVar.K(2);
                lVar.b(0, 2, xVar.f8291a);
                int H2 = xVar.H() - 2;
                if (H2 < 0) {
                    break;
                } else if (this.d != 65505) {
                    lVar.v(H2, false);
                } else {
                    xVar.K(H2);
                    lVar.j(xVar.f8291a, 0, H2, false);
                    if (Objects.equals(xVar.v(), "http://ns.adobe.com/xap/1.0/") && (v = xVar.v()) != null) {
                        for (int i10 = 0; i10 < 4; i10++) {
                            if (v.contains(d.f14877a[i10] + "=\"1\"")) {
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
        this.f14868b = qVar;
    }

    @Override
    public final void d(long j10, long j11) {
        if (j10 == 0) {
            this.f14869c = 0;
            this.f14873j = null;
        } else if (this.f14869c == 5) {
            l lVar = this.f14873j;
            lVar.getClass();
            lVar.d(j10, j11);
        }
    }

    @Override
    public final List e() {
        l0 l0Var = n0.f8474b;
        return x1.e;
    }

    @Override
    public final int f(c3.p r26, c3.s r27) {
        throw new UnsupportedOperationException("Method not decompiled: k3.b.f(c3.p, c3.s):int");
    }

    public final void g() {
        q qVar = this.f14868b;
        qVar.getClass();
        qVar.H();
        this.f14868b.g0(new t(-9223372036854775807L));
        this.f14869c = 6;
    }

    @Override
    public final void release() {
        l lVar = this.f14873j;
        if (lVar != null) {
            lVar.getClass();
        }
    }

    @Override
    public final o b() {
        return this;
    }
}
