package m3;

import b8.ig;
import e3.l;
import e3.o;
import e3.p;
import e3.q;
import e3.t;
import g2.y;
import g9.g0;
import g9.i0;
import g9.s1;
import j$.util.Objects;
import java.util.List;
import y3.m;
public final class b implements o {
    public q f19053b;
    public int f19054c;
    public int d;
    public int f19055e;
    public n3.b f19057g;
    public p h;
    public ig f19058i;
    public m f19059j;
    public final y f19052a = new y(2);
    public long f19056f = -1;

    @Override
    public final boolean b(p pVar) {
        String v;
        l lVar = (l) pVar;
        y yVar = this.f19052a;
        yVar.K(2);
        lVar.h(yVar.f11923a, 0, 2, false);
        if (yVar.H() == 65496) {
            while (true) {
                yVar.K(2);
                lVar.h(yVar.f11923a, 0, 2, false);
                int H = yVar.H();
                this.d = H;
                if (H == 65498) {
                    break;
                }
                yVar.K(2);
                lVar.c(0, 2, yVar.f11923a);
                int H2 = yVar.H() - 2;
                if (H2 < 0) {
                    break;
                } else if (this.d != 65505) {
                    lVar.w(H2, false);
                } else {
                    yVar.K(H2);
                    lVar.h(yVar.f11923a, 0, H2, false);
                    if (Objects.equals(yVar.v(), "http://ns.adobe.com/xap/1.0/") && (v = yVar.v()) != null) {
                        for (int i3 = 0; i3 < 4; i3++) {
                            if (v.contains(d.f19063a[i3] + "=\"1\"")) {
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
        this.f19053b = qVar;
    }

    @Override
    public final void d(long j10, long j11) {
        if (j10 == 0) {
            this.f19054c = 0;
            this.f19059j = null;
        } else if (this.f19054c == 5) {
            m mVar = this.f19059j;
            mVar.getClass();
            mVar.d(j10, j11);
        }
    }

    @Override
    public final List e() {
        g0 g0Var = i0.f12083b;
        return s1.f12146e;
    }

    @Override
    public final int f(e3.p r26, e3.s r27) {
        throw new UnsupportedOperationException("Method not decompiled: m3.b.f(e3.p, e3.s):int");
    }

    public final void g() {
        q qVar = this.f19053b;
        qVar.getClass();
        qVar.L();
        this.f19053b.f(new t(-9223372036854775807L));
        this.f19054c = 6;
    }

    @Override
    public final void release() {
        m mVar = this.f19059j;
        if (mVar != null) {
            mVar.getClass();
        }
    }

    @Override
    public final o a() {
        return this;
    }
}
