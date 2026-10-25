package l2;

import a8.h0;
import android.os.Handler;
import b2.p;
import b2.u0;
import b2.x;
import b2.x0;
import c3.i0;
import c3.j0;
import e2.n0;
import n4.s;
import org.telegram.ui.Components.op0;
import u2.c1;
public final class n implements j0 {
    public final c1 f16848a;
    public final s f16849b = new s(24, false);
    public final l3.a f16850c = new l3.a();
    public long d = -9223372036854775807L;
    public final o e;

    public n(o oVar, h0 h0Var) {
        this.e = oVar;
        this.f16848a = new c1(h0Var, null, null);
    }

    @Override
    public final int a(p pVar, int i10, boolean z10) {
        return f(pVar, i10, z10);
    }

    @Override
    public final void b(x xVar) {
        this.f16848a.b(xVar);
    }

    @Override
    public final void c(long j10, int i10, int i11, int i12, i0 i0Var) {
        long j11;
        long j12;
        this.f16848a.c(j10, i10, i11, i12, i0Var);
        while (this.f16848a.A(false)) {
            l3.a aVar = this.f16850c;
            aVar.clear();
            if (this.f16848a.F(this.f16849b, aVar, 0, false) == -4) {
                aVar.d();
            } else {
                aVar = null;
            }
            if (aVar != null) {
                long j13 = aVar.e;
                u0 a2 = this.e.f16853c.a(aVar);
                if (a2 != null) {
                    n3.a aVar2 = (n3.a) a2.f3465a[0];
                    String str = aVar2.f18649a;
                    String str2 = aVar2.f18650b;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            j12 = n0.V(n0.r(aVar2.e));
                        } catch (x0 unused) {
                            j12 = -9223372036854775807L;
                        }
                        if (j12 != -9223372036854775807L) {
                            m mVar = new m(j13, j12);
                            Handler handler = this.e.d;
                            handler.sendMessage(handler.obtainMessage(1, mVar));
                        }
                    }
                }
            }
        }
        c1 c1Var = this.f16848a;
        op0 op0Var = c1Var.f49259a;
        synchronized (c1Var) {
            int i13 = c1Var.f49274s;
            if (i13 == 0) {
                j11 = -1;
            } else {
                j11 = c1Var.j(i13);
            }
        }
        op0Var.b(j11);
    }

    @Override
    public final void d(int i10, e2.x xVar) {
        g(xVar, i10, 0);
    }

    @Override
    public final int f(p pVar, int i10, boolean z10) {
        c1 c1Var = this.f16848a;
        c1Var.getClass();
        return c1Var.f(pVar, i10, z10);
    }

    @Override
    public final void g(e2.x xVar, int i10, int i11) {
        c1 c1Var = this.f16848a;
        c1Var.getClass();
        c1Var.g(xVar, i10, 0);
    }

    @Override
    public final void e(long j10) {
    }
}
