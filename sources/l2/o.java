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
import org.telegram.ui.Components.sp0;
import u2.z0;
public final class o implements h0 {
    public final z0 f15124a;
    public final y f15125b = new y(19, false);
    public final l3.a f15126c = new l3.a();
    public long d = -9223372036854775807L;
    public final p f15127e;

    public o(p pVar, y2.d dVar) {
        this.f15127e = pVar;
        this.f15124a = new z0(dVar, null, null);
    }

    @Override
    public final int a(b2.k kVar, int i10, boolean z10) {
        return e(kVar, i10, z10);
    }

    @Override
    public final void b(s sVar) {
        this.f15124a.b(sVar);
    }

    @Override
    public final void c(long j3, int i10, int i11, int i12, g0 g0Var) {
        long i13;
        long j10;
        this.f15124a.c(j3, i10, i11, i12, g0Var);
        while (this.f15124a.x(false)) {
            l3.a aVar = this.f15126c;
            aVar.clear();
            if (this.f15124a.C(this.f15125b, aVar, 0, false) == -4) {
                aVar.c();
            } else {
                aVar = null;
            }
            if (aVar != null) {
                long j11 = aVar.f10984e;
                p0 a2 = this.f15127e.f15130c.a(aVar);
                if (a2 != null) {
                    n3.a aVar2 = (n3.a) a2.f3505a[0];
                    String str = aVar2.f16286a;
                    String str2 = aVar2.f16287b;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            j10 = d0.S(d0.p(aVar2.f16289e));
                        } catch (s0 unused) {
                            j10 = -9223372036854775807L;
                        }
                        if (j10 != -9223372036854775807L) {
                            n nVar = new n(j11, j10);
                            Handler handler = this.f15127e.d;
                            handler.sendMessage(handler.obtainMessage(1, nVar));
                        }
                    }
                }
            }
        }
        z0 z0Var = this.f15124a;
        sp0 sp0Var = z0Var.f48979a;
        synchronized (z0Var) {
            int i14 = z0Var.f48995s;
            if (i14 == 0) {
                i13 = -1;
            } else {
                i13 = z0Var.i(i14);
            }
        }
        sp0Var.b(i13);
    }

    @Override
    public final void d(int i10, v vVar) {
        f(vVar, i10, 0);
    }

    @Override
    public final int e(b2.k kVar, int i10, boolean z10) {
        z0 z0Var = this.f15124a;
        z0Var.getClass();
        return z0Var.e(kVar, i10, z10);
    }

    @Override
    public final void f(v vVar, int i10, int i11) {
        z0 z0Var = this.f15124a;
        z0Var.getClass();
        z0Var.f(vVar, i10, 0);
    }
}
