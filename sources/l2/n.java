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
import org.telegram.ui.Components.ho0;
import u2.z0;
public final class n implements h0 {
    public final z0 f13851a;
    public final y f13852b = new y(17);
    public final l3.a f13853c = new l3.a();
    public long d = -9223372036854775807L;
    public final o e;

    public n(o oVar, y2.d dVar) {
        this.e = oVar;
        this.f13851a = new z0(dVar, null, null);
    }

    @Override
    public final int a(b2.k kVar, int i10, boolean z10) {
        return e(kVar, i10, z10);
    }

    @Override
    public final void b(s sVar) {
        this.f13851a.b(sVar);
    }

    @Override
    public final void c(long j3, int i10, int i11, int i12, g0 g0Var) {
        long i13;
        long j10;
        this.f13851a.c(j3, i10, i11, i12, g0Var);
        while (this.f13851a.x(false)) {
            l3.a aVar = this.f13853c;
            aVar.clear();
            if (this.f13851a.C(this.f13852b, aVar, 0, false) == -4) {
                aVar.c();
            } else {
                aVar = null;
            }
            if (aVar != null) {
                long j11 = aVar.e;
                p0 a2 = this.e.f13856c.a(aVar);
                if (a2 != null) {
                    n3.a aVar2 = (n3.a) a2.f3170a[0];
                    String str = aVar2.f14899a;
                    String str2 = aVar2.f14900b;
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
        z0 z0Var = this.f13851a;
        ho0 ho0Var = z0Var.f43464a;
        synchronized (z0Var) {
            int i14 = z0Var.f43479s;
            if (i14 == 0) {
                i13 = -1;
            } else {
                i13 = z0Var.i(i14);
            }
        }
        ho0Var.b(i13);
    }

    @Override
    public final void d(int i10, v vVar) {
        f(vVar, i10, 0);
    }

    @Override
    public final int e(b2.k kVar, int i10, boolean z10) {
        z0 z0Var = this.f13851a;
        z0Var.getClass();
        return z0Var.e(kVar, i10, z10);
    }

    @Override
    public final void f(v vVar, int i10, int i11) {
        z0 z0Var = this.f13851a;
        z0Var.getClass();
        z0Var.f(vVar, i10, 0);
    }
}
