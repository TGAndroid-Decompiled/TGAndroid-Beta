package o2;

import android.os.Handler;
import e2.q0;
import e2.t0;
import e2.u;
import f3.h0;
import f3.i0;
import h2.l0;
import h2.x;
import org.telegram.ui.Components.sm0;
import x2.a1;
public final class o implements i0 {
    public final a1 f21303a;
    public final k8.a f21304b = new k8.a(1, false);
    public final o3.a f21305c = new o3.a();
    public long d = -9223372036854775807L;
    public final p f21306e;

    public o(p pVar, h6.m mVar) {
        this.f21306e = pVar;
        this.f21303a = new a1(mVar, null, null);
    }

    @Override
    public final void a(x xVar, int i7, int i10) {
        a1 a1Var = this.f21303a;
        a1Var.getClass();
        a1Var.a(xVar, i7, 0);
    }

    @Override
    public final void b(int i7, x xVar) {
        a(xVar, i7, 0);
    }

    @Override
    public final void c(long j3, int i7, int i10, int i11, h0 h0Var) {
        long j10;
        long j11;
        this.f21303a.c(j3, i7, i10, i11, h0Var);
        while (this.f21303a.A(false)) {
            o3.a aVar = this.f21305c;
            aVar.clear();
            if (this.f21303a.F(this.f21304b, aVar, 0, false) == -4) {
                aVar.c();
            } else {
                aVar = null;
            }
            if (aVar != null) {
                long j12 = aVar.f17733e;
                q0 a10 = this.f21306e.f21309c.a(aVar);
                if (a10 != null) {
                    q3.a aVar2 = (q3.a) a10.f10320a[0];
                    String str = aVar2.f55208a;
                    String str2 = aVar2.f55209b;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            j11 = l0.V(l0.r(aVar2.f55211e));
                        } catch (t0 unused) {
                            j11 = -9223372036854775807L;
                        }
                        if (j11 != -9223372036854775807L) {
                            n nVar = new n(j12, j11);
                            Handler handler = this.f21306e.d;
                            handler.sendMessage(handler.obtainMessage(1, nVar));
                        }
                    }
                }
            }
        }
        a1 a1Var = this.f21303a;
        sm0 sm0Var = a1Var.f59473a;
        synchronized (a1Var) {
            int i12 = a1Var.f59489s;
            if (i12 == 0) {
                j10 = -1;
            } else {
                j10 = a1Var.j(i12);
            }
        }
        sm0Var.b(j10);
    }

    @Override
    public final int e(e2.n nVar, int i7, boolean z10) {
        return f(nVar, i7, z10);
    }

    @Override
    public final int f(e2.n nVar, int i7, boolean z10) {
        a1 a1Var = this.f21303a;
        a1Var.getClass();
        return a1Var.f(nVar, i7, z10);
    }

    @Override
    public final void g(u uVar) {
        this.f21303a.g(uVar);
    }

    @Override
    public final void d(long j3) {
    }
}
