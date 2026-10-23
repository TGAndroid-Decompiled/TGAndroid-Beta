package l2;

import android.os.Handler;
import b2.t0;
import b2.w;
import b2.w0;
import c3.k0;
import c3.l0;
import e2.m0;
import e2.x;
import org.telegram.ui.Components.jp0;
import u2.e1;
public final class o implements l0 {
    public final e1 f15947a;
    public final qf.b f15948b = new qf.b(22);
    public final l3.a f15949c = new l3.a();
    public long d = -9223372036854775807L;
    public final p e;

    public o(p pVar, androidx.biometric.e eVar) {
        this.e = pVar;
        this.f15947a = new e1(eVar, null, null);
    }

    @Override
    public final int a(b2.o oVar, int i10, boolean z10) {
        return f(oVar, i10, z10);
    }

    @Override
    public final void b(w wVar) {
        this.f15947a.b(wVar);
    }

    @Override
    public final void c(long j10, int i10, int i11, int i12, k0 k0Var) {
        long j11;
        long j12;
        this.f15947a.c(j10, i10, i11, i12, k0Var);
        while (this.f15947a.A(false)) {
            l3.a aVar = this.f15949c;
            aVar.clear();
            if (this.f15947a.F(this.f15948b, aVar, 0, false) == -4) {
                aVar.c();
            } else {
                aVar = null;
            }
            if (aVar != null) {
                long j13 = aVar.e;
                t0 a2 = this.e.f15952c.a(aVar);
                if (a2 != null) {
                    n3.a aVar2 = (n3.a) a2.f4014a[0];
                    String str = aVar2.f17144a;
                    String str2 = aVar2.f17145b;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            j12 = m0.V(m0.r(aVar2.e));
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
        e1 e1Var = this.f15947a;
        jp0 jp0Var = e1Var.f47737a;
        synchronized (e1Var) {
            int i13 = e1Var.f47752s;
            if (i13 == 0) {
                j11 = -1;
            } else {
                j11 = e1Var.j(i13);
            }
        }
        jp0Var.b(j11);
    }

    @Override
    public final void d(int i10, x xVar) {
        g(xVar, i10, 0);
    }

    @Override
    public final int f(b2.o oVar, int i10, boolean z10) {
        e1 e1Var = this.f15947a;
        e1Var.getClass();
        return e1Var.f(oVar, i10, z10);
    }

    @Override
    public final void g(x xVar, int i10, int i11) {
        e1 e1Var = this.f15947a;
        e1Var.getClass();
        e1Var.g(xVar, i10, 0);
    }

    @Override
    public final void e(long j10) {
    }
}
