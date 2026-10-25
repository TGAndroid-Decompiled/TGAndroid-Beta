package k3;

import a8.lg;
import c3.o;
import c3.p;
import c3.q;
import c3.t;
import e2.x;
import f9.g0;
import f9.i0;
import f9.s1;
import j$.util.Objects;
import java.util.List;
import w3.l;
public final class b implements o {
    public q f16349b;
    public int f16350c;
    public int d;
    public int e;
    public l3.b f16352g;
    public p h;
    public lg f16353i;
    public l f16354j;
    public final x f16348a = new x(2);
    public long f16351f = -1;

    @Override
    public final boolean a(p pVar) {
        String v;
        c3.l lVar = (c3.l) pVar;
        x xVar = this.f16348a;
        xVar.K(2);
        lVar.h(xVar.f9732a, 0, 2, false);
        if (xVar.H() == 65496) {
            while (true) {
                xVar.K(2);
                lVar.h(xVar.f9732a, 0, 2, false);
                int H = xVar.H();
                this.d = H;
                if (H == 65498) {
                    break;
                }
                xVar.K(2);
                lVar.b(0, 2, xVar.f9732a);
                int H2 = xVar.H() - 2;
                if (H2 < 0) {
                    break;
                } else if (this.d != 65505) {
                    lVar.s(H2, false);
                } else {
                    xVar.K(H2);
                    lVar.h(xVar.f9732a, 0, H2, false);
                    if (Objects.equals(xVar.v(), "http://ns.adobe.com/xap/1.0/") && (v = xVar.v()) != null) {
                        for (int i10 = 0; i10 < 4; i10++) {
                            if (v.contains(d.f16358a[i10] + "=\"1\"")) {
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
        this.f16349b = qVar;
    }

    @Override
    public final void d(long j10, long j11) {
        if (j10 == 0) {
            this.f16350c = 0;
            this.f16354j = null;
        } else if (this.f16350c == 5) {
            l lVar = this.f16354j;
            lVar.getClass();
            lVar.d(j10, j11);
        }
    }

    @Override
    public final List e() {
        g0 g0Var = i0.f10287b;
        return s1.e;
    }

    @Override
    public final int f(c3.p r26, c3.s r27) {
        throw new UnsupportedOperationException("Method not decompiled: k3.b.f(c3.p, c3.s):int");
    }

    public final void g() {
        q qVar = this.f16349b;
        qVar.getClass();
        qVar.Q0();
        this.f16349b.D1(new t(-9223372036854775807L));
        this.f16350c = 6;
    }

    @Override
    public final void release() {
        l lVar = this.f16354j;
        if (lVar != null) {
            lVar.getClass();
        }
    }

    @Override
    public final o b() {
        return this;
    }
}
