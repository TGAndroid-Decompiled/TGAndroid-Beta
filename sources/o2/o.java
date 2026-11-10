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
import x2.a1;
public final class o implements j0 {
    public final a1 f20787a;
    public final wf.b f20788b = new wf.b(27, false);
    public final o3.a f20789c = new o3.a();
    public long d = -9223372036854775807L;
    public final p f20790e;

    public o(p pVar, h6.m mVar) {
        this.f20790e = pVar;
        this.f20787a = new a1(mVar, null, null);
    }

    @Override
    public final void a(x xVar, int i7, int i10) {
        a1 a1Var = this.f20787a;
        a1Var.getClass();
        a1Var.a(xVar, i7, 0);
    }

    @Override
    public final void b(int i7, x xVar) {
        a(xVar, i7, 0);
    }

    @Override
    public final void c(long j3, int i7, int i10, int i11, i0 i0Var) {
        long j10;
        long j11;
        this.f20787a.c(j3, i7, i10, i11, i0Var);
        while (this.f20787a.A(false)) {
            o3.a aVar = this.f20789c;
            aVar.clear();
            if (this.f20787a.F(this.f20788b, aVar, 0, false) == -4) {
                aVar.c();
            } else {
                aVar = null;
            }
            if (aVar != null) {
                long j12 = aVar.f17176e;
                q0 a10 = this.f20790e.f20793c.a(aVar);
                if (a10 != null) {
                    q3.a aVar2 = (q3.a) a10.f10489a[0];
                    String str = aVar2.f53771a;
                    String str2 = aVar2.f53772b;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            j11 = m0.V(m0.r(aVar2.f53774e));
                        } catch (t0 unused) {
                            j11 = -9223372036854775807L;
                        }
                        if (j11 != -9223372036854775807L) {
                            n nVar = new n(j12, j11);
                            Handler handler = this.f20790e.d;
                            handler.sendMessage(handler.obtainMessage(1, nVar));
                        }
                    }
                }
            }
        }
        a1 a1Var = this.f20787a;
        om0 om0Var = a1Var.f58292a;
        synchronized (a1Var) {
            int i12 = a1Var.f58308s;
            if (i12 == 0) {
                j10 = -1;
            } else {
                j10 = a1Var.j(i12);
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
        a1 a1Var = this.f20787a;
        a1Var.getClass();
        return a1Var.f(nVar, i7, z9);
    }

    @Override
    public final void g(u uVar) {
        this.f20787a.g(uVar);
    }

    @Override
    public final void d(long j3) {
    }
}
