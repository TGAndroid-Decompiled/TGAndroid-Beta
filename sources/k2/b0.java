package k2;

import android.os.SystemClock;
public final class b0 {
    public Exception f13229a;
    public long f13230b = -9223372036854775807L;
    public long f13231c = -9223372036854775807L;

    public final void a(Exception exc) {
        boolean z10;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f13229a == null) {
            this.f13229a = exc;
        }
        if (this.f13230b == -9223372036854775807L) {
            synchronized (g0.f13253o0) {
                if (g0.f13255q0 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (!z10) {
                this.f13230b = 200 + elapsedRealtime;
            }
        }
        long j3 = this.f13230b;
        if (j3 != -9223372036854775807L && elapsedRealtime >= j3) {
            Exception exc2 = this.f13229a;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = this.f13229a;
            this.f13229a = null;
            this.f13230b = -9223372036854775807L;
            this.f13231c = -9223372036854775807L;
            throw exc3;
        }
        this.f13231c = elapsedRealtime + 50;
    }
}
