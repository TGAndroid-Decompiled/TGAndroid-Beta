package k2;

import android.os.SystemClock;
public final class s0 {
    public Exception f14795a;
    public long f14796b = -9223372036854775807L;
    public long f14797c = -9223372036854775807L;

    public final void a(Exception exc) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f14795a == null) {
            this.f14795a = exc;
        }
        if (this.f14796b == -9223372036854775807L && t0.f14801c0.get() <= 0) {
            this.f14796b = 200 + elapsedRealtime;
        }
        long j10 = this.f14796b;
        if (j10 != -9223372036854775807L && elapsedRealtime >= j10) {
            Exception exc2 = this.f14795a;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = this.f14795a;
            this.f14795a = null;
            this.f14796b = -9223372036854775807L;
            this.f14797c = -9223372036854775807L;
            throw exc3;
        }
        this.f14797c = elapsedRealtime + 50;
    }
}
