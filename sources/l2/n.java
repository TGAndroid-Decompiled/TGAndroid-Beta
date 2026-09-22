package l2;

import android.os.Handler;
import b2.p0;
import b2.s;
import b2.s0;
import c3.g0;
import c3.h0;
import e2.d0;
import e2.v;
import n4.y;
import org.telegram.ui.Components.wo0;
import u2.b1;
public final class n implements h0 {
    public final b1 f14075a;
    public final y f14076b = new Object();
    public final l3.a f14077c = new l3.a();
    public long d = -9223372036854775807L;
    public final o e;

    public n(o oVar, y2.d dVar) {
        this.e = oVar;
        this.f14075a = new b1(dVar, null, null);
    }

    @Override
    public final int a(b2.k kVar, int i10, boolean z10) {
        return e(kVar, i10, z10);
    }

    @Override
    public final void b(s sVar) {
        this.f14075a.b(sVar);
    }

    @Override
    public final void c(long j3, int i10, int i11, int i12, g0 g0Var) {
        long i13;
        long j10;
        this.f14075a.c(j3, i10, i11, i12, g0Var);
        while (this.f14075a.x(false)) {
            l3.a aVar = this.f14077c;
            aVar.clear();
            if (this.f14075a.C(this.f14076b, aVar, 0, false) == -4) {
                aVar.e();
            } else {
                aVar = null;
            }
            if (aVar != null) {
                long j11 = aVar.e;
                p0 a2 = this.e.f14080c.a(aVar);
                if (a2 != null) {
                    n3.a aVar2 = (n3.a) a2.f3177a[0];
                    String str = aVar2.f15161a;
                    String str2 = aVar2.f15162b;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            j10 = d0.T(d0.p(aVar2.e));
                        } catch (s0 unused) {
                            j10 = -9223372036854775807L;
                        }
                        if (j10 != -9223372036854775807L) {
                            m mVar = new m(j11, j10);
                            Handler handler = this.e.d;
                            handler.sendMessage(handler.obtainMessage(1, mVar));
                        }
                    }
                }
            }
        }
        b1 b1Var = this.f14075a;
        wo0 wo0Var = b1Var.f43637a;
        synchronized (b1Var) {
            int i14 = b1Var.f43652s;
            if (i14 == 0) {
                i13 = -1;
            } else {
                i13 = b1Var.i(i14);
            }
        }
        wo0Var.b(i13);
    }

    @Override
    public final void d(int i10, v vVar) {
        f(vVar, i10, 0);
    }

    @Override
    public final int e(b2.k kVar, int i10, boolean z10) {
        b1 b1Var = this.f14075a;
        b1Var.getClass();
        return b1Var.e(kVar, i10, z10);
    }

    @Override
    public final void f(v vVar, int i10, int i11) {
        b1 b1Var = this.f14075a;
        b1Var.getClass();
        b1Var.f(vVar, i10, 0);
    }
}
