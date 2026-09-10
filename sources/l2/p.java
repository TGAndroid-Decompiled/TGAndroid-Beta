package l2;

import android.os.Handler;
import b2.p0;
import b2.s;
import b2.s0;
import c3.g0;
import c3.h0;
import e2.d0;
import e2.v;
import org.telegram.ui.Components.qo0;
import u2.c1;
public final class p implements h0 {
    public final c1 f12761a;
    public final of.b f12762b = new of.b(17);
    public final l3.a f12763c = new l3.a();
    public long d = -9223372036854775807L;
    public final q e;

    public p(q qVar, y2.d dVar) {
        this.e = qVar;
        this.f12761a = new c1(dVar, null, null);
    }

    @Override
    public final int a(b2.k kVar, int i10, boolean z10) {
        return e(kVar, i10, z10);
    }

    @Override
    public final void b(s sVar) {
        this.f12761a.b(sVar);
    }

    @Override
    public final void c(long j3, int i10, int i11, int i12, g0 g0Var) {
        long i13;
        long j10;
        this.f12761a.c(j3, i10, i11, i12, g0Var);
        while (this.f12761a.x(false)) {
            l3.a aVar = this.f12763c;
            aVar.clear();
            if (this.f12761a.C(this.f12762b, aVar, 0, false) == -4) {
                aVar.c();
            } else {
                aVar = null;
            }
            if (aVar != null) {
                long j11 = aVar.e;
                p0 a2 = this.e.f12766c.a(aVar);
                if (a2 != null) {
                    n3.a aVar2 = (n3.a) a2.f1871a[0];
                    String str = aVar2.f13754a;
                    String str2 = aVar2.f13755b;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            j10 = d0.T(d0.p(aVar2.e));
                        } catch (s0 unused) {
                            j10 = -9223372036854775807L;
                        }
                        if (j10 != -9223372036854775807L) {
                            o oVar = new o(j11, j10);
                            Handler handler = this.e.d;
                            handler.sendMessage(handler.obtainMessage(1, oVar));
                        }
                    }
                }
            }
        }
        c1 c1Var = this.f12761a;
        qo0 qo0Var = c1Var.f42287a;
        synchronized (c1Var) {
            int i14 = c1Var.f42302s;
            if (i14 == 0) {
                i13 = -1;
            } else {
                i13 = c1Var.i(i14);
            }
        }
        qo0Var.b(i13);
    }

    @Override
    public final void d(int i10, v vVar) {
        f(vVar, i10, 0);
    }

    @Override
    public final int e(b2.k kVar, int i10, boolean z10) {
        c1 c1Var = this.f12761a;
        c1Var.getClass();
        return c1Var.e(kVar, i10, z10);
    }

    @Override
    public final void f(v vVar, int i10, int i11) {
        c1 c1Var = this.f12761a;
        c1Var.getClass();
        c1Var.f(vVar, i10, 0);
    }
}
