package l2;

import android.os.Handler;
import android.support.v4.media.session.a0;
import b2.u0;
import b2.w0;
import b2.x;
import c3.j0;
import c3.k0;
import e2.l0;
import org.telegram.ui.Components.pn0;
import u2.c1;
public final class o implements k0 {
    public final c1 f11628a;
    public final hf.b f11629b = new hf.b(23, false);
    public final l3.a f11630c = new l3.a();
    public long d = -9223372036854775807L;
    public final p e;

    public o(p pVar, a0 a0Var) {
        this.e = pVar;
        this.f11628a = new c1(a0Var, null, null);
    }

    @Override
    public final int a(b2.p pVar, int i10, boolean z10) {
        return f(pVar, i10, z10);
    }

    @Override
    public final void b(x xVar) {
        this.f11628a.b(xVar);
    }

    @Override
    public final void c(long j10, int i10, int i11, int i12, j0 j0Var) {
        long j11;
        long j12;
        this.f11628a.c(j10, i10, i11, i12, j0Var);
        while (this.f11628a.A(false)) {
            l3.a aVar = this.f11630c;
            aVar.clear();
            if (this.f11628a.F(this.f11629b, aVar, 0, false) == -4) {
                aVar.d();
            } else {
                aVar = null;
            }
            if (aVar != null) {
                long j13 = aVar.e;
                u0 a2 = this.e.f11633c.a(aVar);
                if (a2 != null) {
                    n3.a aVar2 = (n3.a) a2.f2302a[0];
                    String str = aVar2.f13487a;
                    String str2 = aVar2.f13488b;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            j12 = l0.V(l0.r(aVar2.e));
                        } catch (w0 unused) {
                            j12 = -9223372036854775807L;
                        }
                        if (j12 != -9223372036854775807L) {
                            n nVar = new n(j13, j12);
                            Handler handler = this.e.d;
                            handler.sendMessage(handler.obtainMessage(1, nVar));
                        }
                    }
                }
            }
        }
        c1 c1Var = this.f11628a;
        pn0 pn0Var = c1Var.f49840a;
        synchronized (c1Var) {
            int i13 = c1Var.f49855s;
            if (i13 == 0) {
                j11 = -1;
            } else {
                j11 = c1Var.j(i13);
            }
        }
        pn0Var.b(j11);
    }

    @Override
    public final void d(int i10, e2.x xVar) {
        g(xVar, i10, 0);
    }

    @Override
    public final int f(b2.p pVar, int i10, boolean z10) {
        c1 c1Var = this.f11628a;
        c1Var.getClass();
        return c1Var.f(pVar, i10, z10);
    }

    @Override
    public final void g(e2.x xVar, int i10, int i11) {
        c1 c1Var = this.f11628a;
        c1Var.getClass();
        c1Var.g(xVar, i10, 0);
    }

    @Override
    public final void e(long j10) {
    }
}
