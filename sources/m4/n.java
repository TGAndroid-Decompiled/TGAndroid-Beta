package m4;

import android.os.Handler;
import com.google.android.exoplayer2.upstream.r;
import d5.f0;
import d5.y;
import h3.t0;
import h3.t1;
import h3.u0;
import j3.r0;
import j4.a1;
import j4.w0;
import m3.v;
import m3.w;
public final class n implements w {
    public final a1 f17340a;
    public final u0 f17341b = new Object();
    public final z3.e f17342c = new z3.e();
    public long d = -9223372036854775807L;
    public final o f17343e;

    public n(o oVar, r rVar) {
        this.f17343e = oVar;
        this.f17340a = new a1(rVar, null, null);
    }

    @Override
    public final void a(int i9, y yVar) {
        r0.a(this, yVar, i9);
    }

    @Override
    public final int b(com.google.android.exoplayer2.upstream.j jVar, int i9, boolean z10) {
        a1 a1Var = this.f17340a;
        a1Var.getClass();
        return a1Var.C(jVar, i9, z10);
    }

    @Override
    public final void c(t0 t0Var) {
        this.f17340a.c(t0Var);
    }

    @Override
    public final void d(int i9, y yVar) {
        a1 a1Var = this.f17340a;
        a1Var.getClass();
        a1Var.d(i9, yVar);
    }

    @Override
    public final void e(long j10, int i9, int i10, int i11, v vVar) {
        long g10;
        long j11;
        this.f17340a.e(j10, i9, i10, i11, vVar);
        while (this.f17340a.u(false)) {
            z3.e eVar = this.f17342c;
            eVar.clear();
            if (this.f17340a.z(this.f17341b, eVar, 0, false) == -4) {
                eVar.d();
            } else {
                eVar = null;
            }
            if (eVar != null) {
                long j12 = eVar.d;
                z3.c a2 = this.f17343e.f17346c.a(eVar);
                if (a2 != null) {
                    b4.a aVar = (b4.a) a2.f50288a[0];
                    String str = aVar.f1418a;
                    String str2 = aVar.f1419b;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            j11 = f0.K(f0.l(aVar.f1421e));
                        } catch (t1 unused) {
                            j11 = -9223372036854775807L;
                        }
                        if (j11 != -9223372036854775807L) {
                            m mVar = new m(j12, j11);
                            Handler handler = this.f17343e.d;
                            handler.sendMessage(handler.obtainMessage(1, mVar));
                        }
                    }
                }
            }
        }
        a1 a1Var = this.f17340a;
        w0 w0Var = a1Var.f13403a;
        synchronized (a1Var) {
            int i12 = a1Var.f13419s;
            if (i12 == 0) {
                g10 = -1;
            } else {
                g10 = a1Var.g(i12);
            }
        }
        w0Var.b(g10);
    }
}
