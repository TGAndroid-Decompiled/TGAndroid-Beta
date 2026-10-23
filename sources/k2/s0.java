package k2;

import android.os.SystemClock;
public final class s0 {
    public Exception f14836a;
    public long f14837b = -9223372036854775807L;
    public long f14838c = -9223372036854775807L;

    public final void a(Exception exc) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f14836a == null) {
            this.f14836a = exc;
        }
        if (this.f14837b == -9223372036854775807L && t0.f14842c0.get() <= 0) {
            this.f14837b = 200 + elapsedRealtime;
        }
        long j10 = this.f14837b;
        if (j10 != -9223372036854775807L && elapsedRealtime >= j10) {
            Exception exc2 = this.f14836a;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = this.f14836a;
            this.f14836a = null;
            this.f14837b = -9223372036854775807L;
            this.f14838c = -9223372036854775807L;
            throw exc3;
        }
        this.f14838c = elapsedRealtime + 50;
    }
}
