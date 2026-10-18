package l2;

import android.os.Handler;
import b2.t0;
import b2.w;
import b2.w0;
import c3.i0;
import c3.j0;
import e2.m0;
import e2.x;
import org.telegram.ui.Components.ep0;
import u2.b1;
public final class o implements j0 {
    public final b1 f15885a;
    public final qf.b f15886b = new qf.b(22);
    public final l3.a f15887c = new l3.a();
    public long d = -9223372036854775807L;
    public final p e;

    public o(p pVar, androidx.biometric.e eVar) {
        this.e = pVar;
        this.f15885a = new b1(eVar, null, null);
    }

    @Override
    public final int a(b2.o oVar, int i10, boolean z10) {
        return f(oVar, i10, z10);
    }

    @Override
    public final void b(w wVar) {
        this.f15885a.b(wVar);
    }

    @Override
    public final void c(long j10, int i10, int i11, int i12, i0 i0Var) {
        long j11;
        long j12;
        this.f15885a.c(j10, i10, i11, i12, i0Var);
        while (this.f15885a.A(false)) {
            l3.a aVar = this.f15887c;
            aVar.clear();
            if (this.f15885a.F(this.f15886b, aVar, 0, false) == -4) {
                aVar.f();
            } else {
                aVar = null;
            }
            if (aVar != null) {
                long j13 = aVar.e;
                t0 a2 = this.e.f15890c.a(aVar);
                if (a2 != null) {
                    n3.a aVar2 = (n3.a) a2.f4011a[0];
                    String str = aVar2.f17084a;
                    String str2 = aVar2.f17085b;
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
        b1 b1Var = this.f15885a;
        ep0 ep0Var = b1Var.f47309a;
        synchronized (b1Var) {
            int i13 = b1Var.f47324s;
            if (i13 == 0) {
                j11 = -1;
            } else {
                j11 = b1Var.j(i13);
            }
        }
        ep0Var.b(j11);
    }

    @Override
    public final void d(int i10, x xVar) {
        g(xVar, i10, 0);
    }

    @Override
    public final int f(b2.o oVar, int i10, boolean z10) {
        b1 b1Var = this.f15885a;
        b1Var.getClass();
        return b1Var.f(oVar, i10, z10);
    }

    @Override
    public final void g(x xVar, int i10, int i11) {
        b1 b1Var = this.f15885a;
        b1Var.getClass();
        b1Var.g(xVar, i10, 0);
    }

    @Override
    public final void e(long j10) {
    }
}
