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
import org.telegram.ui.Components.uo0;
import u2.a1;
public final class n implements h0 {
    public final a1 f14087a;
    public final y f14088b = new y(17);
    public final l3.a f14089c = new l3.a();
    public long d = -9223372036854775807L;
    public final o e;

    public n(o oVar, y2.d dVar) {
        this.e = oVar;
        this.f14087a = new a1(dVar, null, null);
    }

    @Override
    public final int a(b2.k kVar, int i10, boolean z10) {
        return e(kVar, i10, z10);
    }

    @Override
    public final void b(s sVar) {
        this.f14087a.b(sVar);
    }

    @Override
    public final void c(long j3, int i10, int i11, int i12, g0 g0Var) {
        long i13;
        long j10;
        this.f14087a.c(j3, i10, i11, i12, g0Var);
        while (this.f14087a.x(false)) {
            l3.a aVar = this.f14089c;
            aVar.clear();
            if (this.f14087a.C(this.f14088b, aVar, 0, false) == -4) {
                aVar.c();
            } else {
                aVar = null;
            }
            if (aVar != null) {
                long j11 = aVar.e;
                p0 a2 = this.e.f14092c.a(aVar);
                if (a2 != null) {
                    n3.a aVar2 = (n3.a) a2.f3170a[0];
                    String str = aVar2.f15152a;
                    String str2 = aVar2.f15153b;
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
        a1 a1Var = this.f14087a;
        uo0 uo0Var = a1Var.f43596a;
        synchronized (a1Var) {
            int i14 = a1Var.f43611s;
            if (i14 == 0) {
                i13 = -1;
            } else {
                i13 = a1Var.i(i14);
            }
        }
        uo0Var.b(i13);
    }

    @Override
    public final void d(int i10, v vVar) {
        f(vVar, i10, 0);
    }

    @Override
    public final int e(b2.k kVar, int i10, boolean z10) {
        a1 a1Var = this.f14087a;
        a1Var.getClass();
        return a1Var.e(kVar, i10, z10);
    }

    @Override
    public final void f(v vVar, int i10, int i11) {
        a1 a1Var = this.f14087a;
        a1Var.getClass();
        a1Var.f(vVar, i10, 0);
    }
}
