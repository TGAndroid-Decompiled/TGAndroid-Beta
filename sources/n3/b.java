package n3;

import a8.ua;
import f3.l;
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
import z3.m;
public final class b implements o {
    public q f20370b;
    public int f20371c;
    public int d;
    public int f20372e;
    public o3.b f20374g;
    public p h;
    public ua f20375i;
    public m f20376j;
    public final x f20369a = new x(2);
    public long f20373f = -1;

    @Override
    public final boolean b(p pVar) {
        String v;
        l lVar = (l) pVar;
        x xVar = this.f20369a;
        xVar.K(2);
        lVar.k(xVar.f14164a, 0, 2, false);
        if (xVar.H() == 65496) {
            while (true) {
                xVar.K(2);
                lVar.k(xVar.f14164a, 0, 2, false);
                int H = xVar.H();
                this.d = H;
                if (H == 65498) {
                    break;
                }
                xVar.K(2);
                lVar.b(0, 2, xVar.f14164a);
                int H2 = xVar.H() - 2;
                if (H2 < 0) {
                    break;
                } else if (this.d != 65505) {
                    lVar.v(H2, false);
                } else {
                    xVar.K(H2);
                    lVar.k(xVar.f14164a, 0, H2, false);
                    if (Objects.equals(xVar.v(), "http://ns.adobe.com/xap/1.0/") && (v = xVar.v()) != null) {
                        for (int i7 = 0; i7 < 4; i7++) {
                            if (v.contains(d.f20380a[i7] + "=\"1\"")) {
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
        this.f20370b = qVar;
    }

    @Override
    public final void d(long j3, long j10) {
        if (j3 == 0) {
            this.f20371c = 0;
            this.f20376j = null;
        } else if (this.f20371c == 5) {
            m mVar = this.f20376j;
            mVar.getClass();
            mVar.d(j3, j10);
        }
    }

    @Override
    public final List e() {
        g0 g0Var = i0.f14331b;
        return t1.f14399e;
    }

    @Override
    public final int f(f3.p r26, f3.s r27) {
        throw new UnsupportedOperationException("Method not decompiled: n3.b.f(f3.p, f3.s):int");
    }

    public final void g() {
        q qVar = this.f20370b;
        qVar.getClass();
        qVar.U0();
        this.f20370b.f(new t(-9223372036854775807L));
        this.f20371c = 6;
    }

    @Override
    public final void release() {
        m mVar = this.f20376j;
        if (mVar != null) {
            mVar.getClass();
        }
    }

    @Override
    public final o a() {
        return this;
    }
}
