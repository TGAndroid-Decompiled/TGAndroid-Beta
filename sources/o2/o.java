package o2;

import android.os.Handler;
import e2.q0;
import e2.t0;
import e2.u;
import f3.h0;
import f3.i0;
import h2.l0;
import h2.x;
import org.telegram.ui.Components.an0;
import x2.c1;
public final class o implements i0 {
    public final c1 f21670a;
    public final k8.a f21671b = new k8.a(1, false);
    public final o3.a f21672c = new o3.a();
    public long d = -9223372036854775807L;
    public final p f21673e;

    public o(p pVar, h6.m mVar) {
        this.f21673e = pVar;
        this.f21670a = new c1(mVar, null, null);
    }

    @Override
    public final void a(x xVar, int i7, int i10) {
        c1 c1Var = this.f21670a;
        c1Var.getClass();
        c1Var.a(xVar, i7, 0);
    }

    @Override
    public final void b(int i7, x xVar) {
        a(xVar, i7, 0);
    }

    @Override
    public final void c(long j3, int i7, int i10, int i11, h0 h0Var) {
        long j10;
        long j11;
        this.f21670a.c(j3, i7, i10, i11, h0Var);
        while (this.f21670a.A(false)) {
            o3.a aVar = this.f21672c;
            aVar.clear();
            if (this.f21670a.F(this.f21671b, aVar, 0, false) == -4) {
                aVar.c();
            } else {
                aVar = null;
            }
            if (aVar != null) {
                long j12 = aVar.f18128e;
                q0 a10 = this.f21673e.f21676c.a(aVar);
                if (a10 != null) {
                    q3.a aVar2 = (q3.a) a10.f10638a[0];
                    String str = aVar2.f55782a;
                    String str2 = aVar2.f55783b;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            j11 = l0.V(l0.r(aVar2.f55785e));
                        } catch (t0 unused) {
                            j11 = -9223372036854775807L;
                        }
                        if (j11 != -9223372036854775807L) {
                            n nVar = new n(j12, j11);
                            Handler handler = this.f21673e.d;
                            handler.sendMessage(handler.obtainMessage(1, nVar));
                        }
                    }
                }
            }
        }
        c1 c1Var = this.f21670a;
        an0 an0Var = c1Var.f60049a;
        synchronized (c1Var) {
            int i12 = c1Var.f60065s;
            if (i12 == 0) {
                j10 = -1;
            } else {
                j10 = c1Var.j(i12);
            }
        }
        an0Var.b(j10);
    }

    @Override
    public final int e(e2.n nVar, int i7, boolean z10) {
        return f(nVar, i7, z10);
    }

    @Override
    public final int f(e2.n nVar, int i7, boolean z10) {
        c1 c1Var = this.f21670a;
        c1Var.getClass();
        return c1Var.f(nVar, i7, z10);
    }

    @Override
    public final void g(u uVar) {
        this.f21670a.g(uVar);
    }

    @Override
    public final void d(long j3) {
    }
}
