package a4;

import e2.t0;
import f3.o;
import f3.p;
import f3.q;
import h2.m0;
import h2.x;
import h9.g0;
import h9.i0;
import h9.t1;
import java.util.List;
public final class e implements o {
    public q f163a;
    public j f164b;
    public boolean f165c;

    @Override
    public final boolean b(p pVar) {
        try {
            return g(pVar);
        } catch (t0 unused) {
            return false;
        }
    }

    @Override
    public final void c(q qVar) {
        this.f163a = qVar;
    }

    @Override
    public final void d(long j3, long j10) {
        j jVar = this.f164b;
        if (jVar != null) {
            f fVar = jVar.f179a;
            g gVar = fVar.f166a;
            gVar.f170a = 0;
            gVar.f171b = 0L;
            gVar.f172c = 0;
            gVar.d = 0;
            gVar.f173e = 0;
            fVar.f167b.K(0);
            fVar.f168c = -1;
            fVar.f169e = false;
            if (j3 == 0) {
                jVar.d(!jVar.f188l);
            } else if (jVar.h != 0) {
                long j11 = (jVar.f185i * j10) / 1000000;
                jVar.f182e = j11;
                h hVar = jVar.d;
                String str = m0.f14114a;
                hVar.v0(j11);
                jVar.h = 2;
            }
        }
    }

    @Override
    public final List e() {
        g0 g0Var = i0.f14331b;
        return t1.f14399e;
    }

    @Override
    public final int f(f3.p r25, f3.s r26) {
        throw new UnsupportedOperationException("Method not decompiled: a4.e.f(f3.p, f3.s):int");
    }

    public final boolean g(p pVar) {
        boolean z9;
        g gVar = new g();
        if (gVar.a(pVar, true) && (gVar.f170a & 2) == 2) {
            int min = Math.min(gVar.f173e, 8);
            x xVar = new x(min);
            pVar.b(0, min, xVar.f14164a);
            xVar.N(0);
            if (xVar.a() >= 5 && xVar.A() == 127 && xVar.C() == 1179402563) {
                this.f164b = new j();
                return true;
            }
            xVar.N(0);
            try {
                z9 = f3.b.w(1, xVar, true);
            } catch (t0 unused) {
                z9 = false;
            }
            if (z9) {
                this.f164b = new j();
            } else {
                xVar.N(0);
                if (i.e(xVar, i.f176o)) {
                    this.f164b = new j();
                }
            }
            return true;
        }
        return false;
    }

    @Override
    public final o a() {
        return this;
    }

    @Override
    public final void release() {
    }
}
