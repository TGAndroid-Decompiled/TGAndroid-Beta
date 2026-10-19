package k2;

import android.os.SystemClock;
public final class s0 {
    public Exception f14793a;
    public long f14794b = -9223372036854775807L;
    public long f14795c = -9223372036854775807L;

    public final void a(Exception exc) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f14793a == null) {
            this.f14793a = exc;
        }
        if (this.f14794b == -9223372036854775807L && t0.f14799c0.get() <= 0) {
            this.f14794b = 200 + elapsedRealtime;
        }
        long j10 = this.f14794b;
        if (j10 != -9223372036854775807L && elapsedRealtime >= j10) {
            Exception exc2 = this.f14793a;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = this.f14793a;
            this.f14793a = null;
            this.f14794b = -9223372036854775807L;
            this.f14795c = -9223372036854775807L;
            throw exc3;
        }
        this.f14795c = elapsedRealtime + 50;
    }
}
