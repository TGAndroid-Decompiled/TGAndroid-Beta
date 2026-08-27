package m4;

import android.os.Handler;
import com.google.android.exoplayer2.upstream.r;
import d5.g0;
import d5.z;
import h3.t0;
import h3.t1;
import h3.u0;
import j4.a1;
import j4.v0;
import m3.v;
import m3.w;

public final class n implements w {

    public final a1 f17716a;

    public final u0 f17717b = new u0();

    public final z3.e f17718c = new z3.e();
    public long d = -9223372036854775807L;

    public final o f17719e;

    public n(o oVar, r rVar) {
        this.f17719e = oVar;
        this.f17716a = new a1(rVar, null, null);
    }

    @Override
    public final void a(int i10, z zVar) {
        i0.a.a(this, zVar, i10);
    }

    @Override
    public final int b(com.google.android.exoplayer2.upstream.j jVar, int i10, boolean z10) {
        a1 a1Var = this.f17716a;
        a1Var.getClass();
        return a1Var.C(jVar, i10, z10);
    }

    @Override
    public final void c(t0 t0Var) {
        this.f17716a.c(t0Var);
    }

    @Override
    public final void d(int i10, z zVar) {
        a1 a1Var = this.f17716a;
        a1Var.getClass();
        a1Var.d(i10, zVar);
    }

    @Override
    public final void e(long j10, int i10, int i11, int i12, v vVar) {
        long jG;
        long jK;
        this.f17716a.e(j10, i10, i11, i12, vVar);
        while (this.f17716a.u(false)) {
            z3.e eVar = this.f17718c;
            eVar.clear();
            if (this.f17716a.z(this.f17717b, eVar, 0, false) == -4) {
                eVar.d();
            } else {
                eVar = null;
            }
            if (eVar != null) {
                long j11 = eVar.d;
                z3.c cVarA = this.f17719e.f17722c.a(eVar);
                if (cVarA != null) {
                    b4.a aVar = (b4.a) cVarA.f50188a[0];
                    String str = aVar.f1910a;
                    String str2 = aVar.f1911b;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            jK = g0.K(g0.l(aVar.f1913e));
                        } catch (t1 unused) {
                            jK = -9223372036854775807L;
                        }
                        if (jK != -9223372036854775807L) {
                            m mVar = new m(j11, jK);
                            Handler handler = this.f17719e.d;
                            handler.sendMessage(handler.obtainMessage(1, mVar));
                        }
                    }
                }
            }
        }
        a1 a1Var = this.f17716a;
        v0 v0Var = a1Var.f12507a;
        synchronized (a1Var) {
            int i13 = a1Var.f12523s;
            jG = i13 == 0 ? -1L : a1Var.g(i13);
        }
        v0Var.b(jG);
    }
}
