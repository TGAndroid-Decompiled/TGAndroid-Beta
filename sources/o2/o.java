package o2;

import android.os.Handler;
import e2.q0;
import e2.t0;
import e2.u;
import f3.h0;
import f3.i0;
import h2.l0;
import h2.x;
import org.telegram.ui.Components.dn0;
import x2.c1;
public final class o implements i0 {
    public final c1 f21695a;
    public final k8.a f21696b = new k8.a(1, false);
    public final o3.a f21697c = new o3.a();
    public long d = -9223372036854775807L;
    public final p f21698e;

    public o(p pVar, h6.m mVar) {
        this.f21698e = pVar;
        this.f21695a = new c1(mVar, null, null);
    }

    @Override
    public final void a(x xVar, int i7, int i10) {
        c1 c1Var = this.f21695a;
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
        this.f21695a.c(j3, i7, i10, i11, h0Var);
        while (this.f21695a.A(false)) {
            o3.a aVar = this.f21697c;
            aVar.clear();
            if (this.f21695a.F(this.f21696b, aVar, 0, false) == -4) {
                aVar.c();
            } else {
                aVar = null;
            }
            if (aVar != null) {
                long j12 = aVar.f18159e;
                q0 a10 = this.f21698e.f21701c.a(aVar);
                if (a10 != null) {
                    q3.a aVar2 = (q3.a) a10.f10667a[0];
                    String str = aVar2.f55827a;
                    String str2 = aVar2.f55828b;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            j11 = l0.V(l0.r(aVar2.f55830e));
                        } catch (t0 unused) {
                            j11 = -9223372036854775807L;
                        }
                        if (j11 != -9223372036854775807L) {
                            n nVar = new n(j12, j11);
                            Handler handler = this.f21698e.d;
                            handler.sendMessage(handler.obtainMessage(1, nVar));
                        }
                    }
                }
            }
        }
        c1 c1Var = this.f21695a;
        dn0 dn0Var = c1Var.f60095a;
        synchronized (c1Var) {
            int i12 = c1Var.f60111s;
            if (i12 == 0) {
                j10 = -1;
            } else {
                j10 = c1Var.j(i12);
            }
        }
        dn0Var.b(j10);
    }

    @Override
    public final int e(e2.n nVar, int i7, boolean z10) {
        return f(nVar, i7, z10);
    }

    @Override
    public final int f(e2.n nVar, int i7, boolean z10) {
        c1 c1Var = this.f21695a;
        c1Var.getClass();
        return c1Var.f(nVar, i7, z10);
    }

    @Override
    public final void g(u uVar) {
        this.f21695a.g(uVar);
    }

    @Override
    public final void d(long j3) {
    }
}
