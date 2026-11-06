package o2;

import android.os.Handler;
import e2.q0;
import e2.t0;
import e2.u;
import f3.i0;
import f3.j0;
import h2.m0;
import h2.x;
import org.telegram.ui.Components.om0;
import x2.b1;
public final class o implements j0 {
    public final b1 f20779a;
    public final wf.b f20780b = new wf.b(27, false);
    public final o3.a f20781c = new o3.a();
    public long d = -9223372036854775807L;
    public final p f20782e;

    public o(p pVar, h6.m mVar) {
        this.f20782e = pVar;
        this.f20779a = new b1(mVar, null, null);
    }

    @Override
    public final void a(x xVar, int i7, int i10) {
        b1 b1Var = this.f20779a;
        b1Var.getClass();
        b1Var.a(xVar, i7, 0);
    }

    @Override
    public final void b(int i7, x xVar) {
        a(xVar, i7, 0);
    }

    @Override
    public final void c(long j3, int i7, int i10, int i11, i0 i0Var) {
        long j10;
        long j11;
        this.f20779a.c(j3, i7, i10, i11, i0Var);
        while (this.f20779a.A(false)) {
            o3.a aVar = this.f20781c;
            aVar.clear();
            if (this.f20779a.F(this.f20780b, aVar, 0, false) == -4) {
                aVar.c();
            } else {
                aVar = null;
            }
            if (aVar != null) {
                long j12 = aVar.f17173e;
                q0 a10 = this.f20782e.f20785c.a(aVar);
                if (a10 != null) {
                    q3.a aVar2 = (q3.a) a10.f10484a[0];
                    String str = aVar2.f53642a;
                    String str2 = aVar2.f53643b;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            j11 = m0.V(m0.r(aVar2.f53645e));
                        } catch (t0 unused) {
                            j11 = -9223372036854775807L;
                        }
                        if (j11 != -9223372036854775807L) {
                            n nVar = new n(j12, j11);
                            Handler handler = this.f20782e.d;
                            handler.sendMessage(handler.obtainMessage(1, nVar));
                        }
                    }
                }
            }
        }
        b1 b1Var = this.f20779a;
        om0 om0Var = b1Var.f58160a;
        synchronized (b1Var) {
            int i12 = b1Var.f58176s;
            if (i12 == 0) {
                j10 = -1;
            } else {
                j10 = b1Var.j(i12);
            }
        }
        om0Var.b(j10);
    }

    @Override
    public final int e(e2.n nVar, int i7, boolean z9) {
        return f(nVar, i7, z9);
    }

    @Override
    public final int f(e2.n nVar, int i7, boolean z9) {
        b1 b1Var = this.f20779a;
        b1Var.getClass();
        return b1Var.f(nVar, i7, z9);
    }

    @Override
    public final void g(u uVar) {
        this.f20779a.g(uVar);
    }

    @Override
    public final void d(long j3) {
    }
}
