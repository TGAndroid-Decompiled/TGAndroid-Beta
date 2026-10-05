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
import org.telegram.ui.Components.bp0;
import u2.b1;
public final class o implements h0 {
    public final b1 f15311a;
    public final y f15312b = new y(17);
    public final l3.a f15313c = new l3.a();
    public long d = -9223372036854775807L;
    public final p f15314e;

    public o(p pVar, y2.d dVar) {
        this.f15314e = pVar;
        this.f15311a = new b1(dVar, null, null);
    }

    @Override
    public final int a(b2.k kVar, int i10, boolean z10) {
        return e(kVar, i10, z10);
    }

    @Override
    public final void b(s sVar) {
        this.f15311a.b(sVar);
    }

    @Override
    public final void c(long j3, int i10, int i11, int i12, g0 g0Var) {
        long i13;
        long j10;
        this.f15311a.c(j3, i10, i11, i12, g0Var);
        while (this.f15311a.x(false)) {
            l3.a aVar = this.f15313c;
            aVar.clear();
            if (this.f15311a.C(this.f15312b, aVar, 0, false) == -4) {
                aVar.d();
            } else {
                aVar = null;
            }
            if (aVar != null) {
                long j11 = aVar.f10981e;
                p0 a2 = this.f15314e.f15317c.a(aVar);
                if (a2 != null) {
                    n3.a aVar2 = (n3.a) a2.f3428a[0];
                    String str = aVar2.f16572a;
                    String str2 = aVar2.f16573b;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            j10 = d0.T(d0.p(aVar2.f16575e));
                        } catch (s0 unused) {
                            j10 = -9223372036854775807L;
                        }
                        if (j10 != -9223372036854775807L) {
                            n nVar = new n(j11, j10);
                            Handler handler = this.f15314e.d;
                            handler.sendMessage(handler.obtainMessage(1, nVar));
                        }
                    }
                }
            }
        }
        b1 b1Var = this.f15311a;
        bp0 bp0Var = b1Var.f47230a;
        synchronized (b1Var) {
            int i14 = b1Var.f47246s;
            if (i14 == 0) {
                i13 = -1;
            } else {
                i13 = b1Var.i(i14);
            }
        }
        bp0Var.b(i13);
    }

    @Override
    public final void d(int i10, v vVar) {
        f(vVar, i10, 0);
    }

    @Override
    public final int e(b2.k kVar, int i10, boolean z10) {
        b1 b1Var = this.f15311a;
        b1Var.getClass();
        return b1Var.e(kVar, i10, z10);
    }

    @Override
    public final void f(v vVar, int i10, int i11) {
        b1 b1Var = this.f15311a;
        b1Var.getClass();
        b1Var.f(vVar, i10, 0);
    }
}
