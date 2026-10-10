package l2;

import android.os.Handler;
import b2.p0;
import b2.s;
import b2.s0;
import c3.g0;
import c3.h0;
import e2.d0;
import e2.v;
import n4.x;
import org.telegram.ui.Components.np0;
import u2.a1;
public final class o implements h0 {
    public final a1 f15379a;
    public final x f15380b = new x(19, false);
    public final l3.a f15381c = new l3.a();
    public long d = -9223372036854775807L;
    public final p f15382e;

    public o(p pVar, y2.d dVar) {
        this.f15382e = pVar;
        this.f15379a = new a1(dVar, null, null);
    }

    @Override
    public final int a(b2.k kVar, int i10, boolean z10) {
        return e(kVar, i10, z10);
    }

    @Override
    public final void b(s sVar) {
        this.f15379a.b(sVar);
    }

    @Override
    public final void c(long j3, int i10, int i11, int i12, g0 g0Var) {
        long i13;
        long j10;
        this.f15379a.c(j3, i10, i11, i12, g0Var);
        while (this.f15379a.x(false)) {
            l3.a aVar = this.f15381c;
            aVar.clear();
            if (this.f15379a.C(this.f15380b, aVar, 0, false) == -4) {
                aVar.c();
            } else {
                aVar = null;
            }
            if (aVar != null) {
                long j11 = aVar.f10986e;
                p0 a2 = this.f15382e.f15385c.a(aVar);
                if (a2 != null) {
                    n3.a aVar2 = (n3.a) a2.f3507a[0];
                    String str = aVar2.f16541a;
                    String str2 = aVar2.f16542b;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            j10 = d0.S(d0.p(aVar2.f16544e));
                        } catch (s0 unused) {
                            j10 = -9223372036854775807L;
                        }
                        if (j10 != -9223372036854775807L) {
                            n nVar = new n(j11, j10);
                            Handler handler = this.f15382e.d;
                            handler.sendMessage(handler.obtainMessage(1, nVar));
                        }
                    }
                }
            }
        }
        a1 a1Var = this.f15379a;
        np0 np0Var = a1Var.f48567a;
        synchronized (a1Var) {
            int i14 = a1Var.f48583s;
            if (i14 == 0) {
                i13 = -1;
            } else {
                i13 = a1Var.i(i14);
            }
        }
        np0Var.b(i13);
    }

    @Override
    public final void d(int i10, v vVar) {
        f(vVar, i10, 0);
    }

    @Override
    public final int e(b2.k kVar, int i10, boolean z10) {
        a1 a1Var = this.f15379a;
        a1Var.getClass();
        return a1Var.e(kVar, i10, z10);
    }

    @Override
    public final void f(v vVar, int i10, int i11) {
        a1 a1Var = this.f15379a;
        a1Var.getClass();
        a1Var.f(vVar, i10, 0);
    }
}
