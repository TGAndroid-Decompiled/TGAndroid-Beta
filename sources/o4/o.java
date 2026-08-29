package o4;

import android.os.Handler;
import com.google.android.exoplayer2.upstream.r;
import f5.d0;
import j3.t0;
import j3.t1;
import j3.u0;
import j7.l1;
import l4.b1;
import l4.w0;
import o3.v;
import o3.w;
public final class o implements w {
    public final b1 f19201a;
    public final u0 f19202b = new Object();
    public final b4.e f19203c = new b4.e();
    public long d = -9223372036854775807L;
    public final p f19204e;

    public o(p pVar, r rVar) {
        this.f19204e = pVar;
        this.f19201a = new b1(rVar, null, null);
    }

    @Override
    public final int a(com.google.android.exoplayer2.upstream.j jVar, int i10, boolean z10) {
        b1 b1Var = this.f19201a;
        b1Var.getClass();
        return b1Var.C(jVar, i10, z10);
    }

    @Override
    public final void b(t0 t0Var) {
        this.f19201a.b(t0Var);
    }

    @Override
    public final void c(long j10, int i10, int i11, int i12, v vVar) {
        long g10;
        long j11;
        this.f19201a.c(j10, i10, i11, i12, vVar);
        while (this.f19201a.u(false)) {
            b4.e eVar = this.f19203c;
            eVar.clear();
            if (this.f19201a.z(this.f19202b, eVar, 0, false) == -4) {
                eVar.c();
            } else {
                eVar = null;
            }
            if (eVar != null) {
                long j12 = eVar.d;
                b4.c a2 = this.f19204e.f19207c.a(eVar);
                if (a2 != null) {
                    d4.a aVar = (d4.a) a2.f1919a[0];
                    String str = aVar.f5302a;
                    String str2 = aVar.f5303b;
                    if ("urn:mpeg:dash:event:2012".equals(str) && ("1".equals(str2) || "2".equals(str2) || "3".equals(str2))) {
                        try {
                            j11 = d0.K(d0.l(aVar.f5305e));
                        } catch (t1 unused) {
                            j11 = -9223372036854775807L;
                        }
                        if (j11 != -9223372036854775807L) {
                            n nVar = new n(j12, j11);
                            Handler handler = this.f19204e.d;
                            handler.sendMessage(handler.obtainMessage(1, nVar));
                        }
                    }
                }
            }
        }
        b1 b1Var = this.f19201a;
        w0 w0Var = b1Var.f14266a;
        synchronized (b1Var) {
            int i13 = b1Var.f14282s;
            if (i13 == 0) {
                g10 = -1;
            } else {
                g10 = b1Var.g(i13);
            }
        }
        w0Var.b(g10);
    }

    @Override
    public final void d(int i10, f5.w wVar) {
        b1 b1Var = this.f19201a;
        b1Var.getClass();
        b1Var.d(i10, wVar);
    }

    @Override
    public final void e(int i10, f5.w wVar) {
        l1.a(this, wVar, i10);
    }
}
