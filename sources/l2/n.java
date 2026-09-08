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
import u2.a1;
public final class n implements h0 {
    public final a1 f15274a;
    public final y f15275b = new y(17, false);
    public final l3.a f15276c = new l3.a();
    public long d = -9223372036854775807L;
    public final o f15277e;

    public n(o oVar, y2.d dVar) {
        this.f15277e = oVar;
        this.f15274a = new a1(dVar, null, null);
    }

    @Override
    public final int a(b2.k kVar, int i10, boolean z10) {
        return e(kVar, i10, z10);
    }

    @Override
    public final void b(s sVar) {
        this.f15274a.b(sVar);
    }

    @Override
    public final void c(long j3, int i10, int i11, int i12, g0 g0Var) {
        long i13;
        long j10;
        this.f15274a.c(j3, i10, i11, i12, g0Var);
        while (this.f15274a.x(false)) {
            l3.a aVar = this.f15276c;
            aVar.clear();
            if (this.f15274a.C(this.f15275b, aVar, 0, false) == -4) {
                aVar.c();
            } else {
                aVar = null;
            }
            if (aVar != null) {
                long j11 = aVar.f10877e;
                p0 a2 = this.f15277e.f15280c.a(aVar);
                if (a2 != null) {
                    n3.a aVar2 = (n3.a) a2.f2261a[0];
                    String str = aVar2.f16446a;
                    String str2 = aVar2.f16447b;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            j10 = d0.T(d0.p(aVar2.f16449e));
                        } catch (s0 unused) {
                            j10 = -9223372036854775807L;
                        }
                        if (j10 != -9223372036854775807L) {
                            m mVar = new m(j11, j10);
                            Handler handler = this.f15277e.d;
                            handler.sendMessage(handler.obtainMessage(1, mVar));
                        }
                    }
                }
            }
        }
        a1 a1Var = this.f15274a;
        ho0 ho0Var = a1Var.f46646a;
        synchronized (a1Var) {
            int i14 = a1Var.f46662s;
            if (i14 == 0) {
                i13 = -1;
            } else {
                i13 = a1Var.i(i14);
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
        a1 a1Var = this.f15274a;
        a1Var.getClass();
        return a1Var.e(kVar, i10, z10);
    }

    @Override
    public final void f(v vVar, int i10, int i11) {
        a1 a1Var = this.f15274a;
        a1Var.getClass();
        a1Var.f(vVar, i10, 0);
    }
}
