package m4;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.k0;
import com.google.android.exoplayer2.upstream.l0;
import com.google.android.exoplayer2.upstream.n0;
import com.google.android.exoplayer2.upstream.q0;
import com.google.android.exoplayer2.upstream.t0;
import j4.h0;
import java.io.IOException;
public final class d implements l0 {
    public final g f17290a;

    public d(g gVar) {
        this.f17290a = gVar;
    }

    public void a() {
        long j10;
        g gVar = this.f17290a;
        synchronized (d5.a.f4327i) {
            try {
                if (d5.a.f4328j) {
                    j10 = d5.a.f4329k;
                } else {
                    j10 = -9223372036854775807L;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        gVar.L = j10;
        gVar.u(true);
    }

    @Override
    public void e(n0 n0Var, long j10, long j11, boolean z10) {
        t0 t0Var = (t0) n0Var;
        long j12 = t0Var.f2606a;
        Uri uri = t0Var.d.f2653c;
        ?? obj = new Object();
        g gVar = this.f17290a;
        gVar.f17304n.getClass();
        gVar.f17307q.d(obj, t0Var.f2608c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override
    public k0 h(n0 n0Var, IOException iOException, int i9) {
        t0 t0Var = (t0) n0Var;
        g gVar = this.f17290a;
        h0 h0Var = gVar.f17307q;
        long j10 = t0Var.f2606a;
        Uri uri = t0Var.d.f2653c;
        h0Var.i(new Object(), t0Var.f2608c, iOException, true);
        gVar.f17304n.getClass();
        d5.a.p("DashMediaSource", "Failed to resolve time offset.", iOException);
        gVar.u(true);
        return q0.f2591e;
    }

    @Override
    public void m(n0 n0Var, long j10, long j11) {
        t0 t0Var = (t0) n0Var;
        g gVar = this.f17290a;
        long j12 = t0Var.f2606a;
        Uri uri = t0Var.d.f2653c;
        ?? obj = new Object();
        gVar.f17304n.getClass();
        gVar.f17307q.f(obj, t0Var.f2608c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        gVar.L = ((Long) t0Var.f2610f).longValue() - j10;
        gVar.u(true);
    }
}
