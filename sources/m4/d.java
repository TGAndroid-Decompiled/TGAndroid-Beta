package m4;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.k0;
import com.google.android.exoplayer2.upstream.l0;
import com.google.android.exoplayer2.upstream.n0;
import com.google.android.exoplayer2.upstream.q0;
import com.google.android.exoplayer2.upstream.t0;
import j4.g0;
import j4.p;
import java.io.IOException;

public final class d implements l0 {

    public final g f17666a;

    public d(g gVar) {
        this.f17666a = gVar;
    }

    public void a() {
        long j10;
        g gVar = this.f17666a;
        synchronized (d5.a.f4769i) {
            try {
                j10 = d5.a.f4770j ? d5.a.f4771k : -9223372036854775807L;
            } catch (Throwable th) {
                throw th;
            }
        }
        gVar.L = j10;
        gVar.u(true);
    }

    @Override
    public void d(n0 n0Var, long j10, long j11, boolean z10) {
        t0 t0Var = (t0) n0Var;
        long j12 = t0Var.f3043a;
        Uri uri = t0Var.d.f3090c;
        p pVar = new p();
        g gVar = this.f17666a;
        gVar.f17680n.getClass();
        gVar.f17683q.d(pVar, t0Var.f3045c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override
    public k0 h(n0 n0Var, IOException iOException, int i10) {
        t0 t0Var = (t0) n0Var;
        g gVar = this.f17666a;
        g0 g0Var = gVar.f17683q;
        long j10 = t0Var.f3043a;
        Uri uri = t0Var.d.f3090c;
        g0Var.i(new p(), t0Var.f3045c, iOException, true);
        gVar.f17680n.getClass();
        d5.a.p("DashMediaSource", "Failed to resolve time offset.", iOException);
        gVar.u(true);
        return q0.f3028e;
    }

    @Override
    public void l(n0 n0Var, long j10, long j11) {
        t0 t0Var = (t0) n0Var;
        g gVar = this.f17666a;
        long j12 = t0Var.f3043a;
        Uri uri = t0Var.d.f3090c;
        p pVar = new p();
        gVar.f17680n.getClass();
        gVar.f17683q.f(pVar, t0Var.f3045c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        gVar.L = ((Long) t0Var.f3047f).longValue() - j10;
        gVar.u(true);
    }
}
