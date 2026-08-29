package o4;

import android.net.Uri;
import com.google.android.exoplayer2.upstream.k0;
import com.google.android.exoplayer2.upstream.l0;
import com.google.android.exoplayer2.upstream.n0;
import com.google.android.exoplayer2.upstream.q0;
import com.google.android.exoplayer2.upstream.t0;
import java.io.IOException;
import l4.g0;
public final class d implements l0 {
    public final h f19149a;

    public d(h hVar) {
        this.f19149a = hVar;
    }

    public void a() {
        long j10;
        h hVar = this.f19149a;
        synchronized (f5.a.f6564i) {
            try {
                if (f5.a.f6565j) {
                    j10 = f5.a.f6566k;
                } else {
                    j10 = -9223372036854775807L;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        hVar.L = j10;
        hVar.u(true);
    }

    @Override
    public void g(n0 n0Var, long j10, long j11, boolean z10) {
        t0 t0Var = (t0) n0Var;
        long j12 = t0Var.f3620a;
        Uri uri = t0Var.d.f3667c;
        ?? obj = new Object();
        h hVar = this.f19149a;
        hVar.f19165n.getClass();
        hVar.f19168q.d(obj, t0Var.f3622c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
    }

    @Override
    public k0 j(n0 n0Var, IOException iOException, int i10) {
        t0 t0Var = (t0) n0Var;
        h hVar = this.f19149a;
        g0 g0Var = hVar.f19168q;
        long j10 = t0Var.f3620a;
        Uri uri = t0Var.d.f3667c;
        g0Var.i(new Object(), t0Var.f3622c, iOException, true);
        hVar.f19165n.getClass();
        f5.a.p("DashMediaSource", "Failed to resolve time offset.", iOException);
        hVar.u(true);
        return q0.f3605e;
    }

    @Override
    public void m(n0 n0Var, long j10, long j11) {
        t0 t0Var = (t0) n0Var;
        h hVar = this.f19149a;
        long j12 = t0Var.f3620a;
        Uri uri = t0Var.d.f3667c;
        ?? obj = new Object();
        hVar.f19165n.getClass();
        hVar.f19168q.f(obj, t0Var.f3622c, -1, null, 0, null, -9223372036854775807L, -9223372036854775807L);
        hVar.L = ((Long) t0Var.f3624f).longValue() - j10;
        hVar.u(true);
    }
}
