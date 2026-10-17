package k2;

import android.os.SystemClock;
public final class s0 {
    public Exception f14788a;
    public long f14789b = -9223372036854775807L;
    public long f14790c = -9223372036854775807L;

    public final void a(Exception exc) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f14788a == null) {
            this.f14788a = exc;
        }
        if (this.f14789b == -9223372036854775807L && t0.f14794c0.get() <= 0) {
            this.f14789b = 200 + elapsedRealtime;
        }
        long j10 = this.f14789b;
        if (j10 != -9223372036854775807L && elapsedRealtime >= j10) {
            Exception exc2 = this.f14788a;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = this.f14788a;
            this.f14788a = null;
            this.f14789b = -9223372036854775807L;
            this.f14790c = -9223372036854775807L;
            throw exc3;
        }
        this.f14790c = elapsedRealtime + 50;
    }
}
