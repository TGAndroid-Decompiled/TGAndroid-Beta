package k3;

import c3.q;
import c3.r;
import c3.s;
import c3.v;
import e2.x;
import e9.l0;
import e9.n0;
import e9.x1;
import j$.util.Objects;
import java.util.List;
import w3.l;
public final class b implements q {
    public s f14914b;
    public int f14915c;
    public int d;
    public int e;
    public l3.b f14917g;
    public r h;
    public ad.d f14918i;
    public l f14919j;
    public final x f14913a = new x(2);
    public long f14916f = -1;

    @Override
    public final boolean a(r rVar) {
        String v;
        c3.l lVar = (c3.l) rVar;
        x xVar = this.f14913a;
        xVar.K(2);
        lVar.j(xVar.f8298a, 0, 2, false);
        if (xVar.H() == 65496) {
            while (true) {
                xVar.K(2);
                lVar.j(xVar.f8298a, 0, 2, false);
                int H = xVar.H();
                this.d = H;
                if (H == 65498) {
                    break;
                }
                xVar.K(2);
                lVar.a(0, 2, xVar.f8298a);
                int H2 = xVar.H() - 2;
                if (H2 < 0) {
                    break;
                } else if (this.d != 65505) {
                    lVar.u(H2, false);
                } else {
                    xVar.K(H2);
                    lVar.j(xVar.f8298a, 0, H2, false);
                    if (Objects.equals(xVar.v(), "http://ns.adobe.com/xap/1.0/") && (v = xVar.v()) != null) {
                        for (int i10 = 0; i10 < 4; i10++) {
                            if (v.contains(d.f14923a[i10] + "=\"1\"")) {
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
    public final void c(s sVar) {
        this.f14914b = sVar;
    }

    @Override
    public final void d(long j10, long j11) {
        if (j10 == 0) {
            this.f14915c = 0;
            this.f14919j = null;
        } else if (this.f14915c == 5) {
            l lVar = this.f14919j;
            lVar.getClass();
            lVar.d(j10, j11);
        }
    }

    @Override
    public final List e() {
        l0 l0Var = n0.f8481b;
        return x1.e;
    }

    @Override
    public final int f(c3.r r26, c3.u r27) {
        throw new UnsupportedOperationException("Method not decompiled: k3.b.f(c3.r, c3.u):int");
    }

    public final void g() {
        s sVar = this.f14914b;
        sVar.getClass();
        sVar.C();
        this.f14914b.g0(new v(-9223372036854775807L));
        this.f14915c = 6;
    }

    @Override
    public final void release() {
        l lVar = this.f14919j;
        if (lVar != null) {
            lVar.getClass();
        }
    }

    @Override
    public final q b() {
        return this;
    }
}
