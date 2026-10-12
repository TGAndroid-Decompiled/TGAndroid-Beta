package l2;

import android.os.Handler;
import b2.u0;
import b2.x;
import b2.x0;
import c3.h0;
import c3.i0;
import e2.m0;
import org.telegram.ui.Components.ip0;
import u2.c1;
public final class o implements i0 {
    public final c1 f14544a;
    public final qf.b f14545b = new qf.b(24);
    public final l3.a f14546c = new l3.a();
    public long d = -9223372036854775807L;
    public final p e;

    public o(p pVar, androidx.biometric.e eVar) {
        this.e = pVar;
        this.f14544a = new c1(eVar, null, null);
    }

    @Override
    public final int a(b2.p pVar, int i10, boolean z10) {
        return f(pVar, i10, z10);
    }

    @Override
    public final void b(x xVar) {
        this.f14544a.b(xVar);
    }

    @Override
    public final void c(long j10, int i10, int i11, int i12, h0 h0Var) {
        long j11;
        long j12;
        this.f14544a.c(j10, i10, i11, i12, h0Var);
        while (this.f14544a.A(false)) {
            l3.a aVar = this.f14546c;
            aVar.clear();
            if (this.f14544a.F(this.f14545b, aVar, 0, false) == -4) {
                aVar.e();
            } else {
                aVar = null;
            }
            if (aVar != null) {
                long j13 = aVar.e;
                u0 a2 = this.e.f14549c.a(aVar);
                if (a2 != null) {
                    n3.a aVar2 = (n3.a) a2.f2398a[0];
                    String str = aVar2.f15987a;
                    String str2 = aVar2.f15988b;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            j12 = m0.V(m0.r(aVar2.e));
                        } catch (x0 unused) {
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
        c1 c1Var = this.f14544a;
        ip0 ip0Var = c1Var.f45882a;
        synchronized (c1Var) {
            int i13 = c1Var.f45897s;
            if (i13 == 0) {
                j11 = -1;
            } else {
                j11 = c1Var.j(i13);
            }
        }
        ip0Var.b(j11);
    }

    @Override
    public final void d(int i10, e2.x xVar) {
        g(xVar, i10, 0);
    }

    @Override
    public final int f(b2.p pVar, int i10, boolean z10) {
        c1 c1Var = this.f14544a;
        c1Var.getClass();
        return c1Var.f(pVar, i10, z10);
    }

    @Override
    public final void g(e2.x xVar, int i10, int i11) {
        c1 c1Var = this.f14544a;
        c1Var.getClass();
        c1Var.g(xVar, i10, 0);
    }

    @Override
    public final void e(long j10) {
    }
}
