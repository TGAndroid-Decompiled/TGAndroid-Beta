package k2;

import android.os.SystemClock;
public final class t0 {
    public Exception f16276a;
    public long f16277b = -9223372036854775807L;
    public long f16278c = -9223372036854775807L;

    public final void a(Exception exc) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f16276a == null) {
            this.f16276a = exc;
        }
        if (this.f16277b == -9223372036854775807L && u0.f16282c0.get() <= 0) {
            this.f16277b = 200 + elapsedRealtime;
        }
        long j10 = this.f16277b;
        if (j10 != -9223372036854775807L && elapsedRealtime >= j10) {
            Exception exc2 = this.f16276a;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = this.f16276a;
            this.f16276a = null;
            this.f16277b = -9223372036854775807L;
            this.f16278c = -9223372036854775807L;
            throw exc3;
        }
        this.f16278c = elapsedRealtime + 50;
    }
}
