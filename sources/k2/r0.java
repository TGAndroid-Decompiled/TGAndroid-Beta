package k2;

import android.os.SystemClock;
public final class r0 {
    public Exception f13986a;
    public long f13987b = -9223372036854775807L;
    public long f13988c = -9223372036854775807L;

    public final void a(Exception exc) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f13986a == null) {
            this.f13986a = exc;
        }
        if (this.f13987b == -9223372036854775807L && s0.f13992c0.get() <= 0) {
            this.f13987b = 200 + elapsedRealtime;
        }
        long j10 = this.f13987b;
        if (j10 != -9223372036854775807L && elapsedRealtime >= j10) {
            Exception exc2 = this.f13986a;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = this.f13986a;
            this.f13986a = null;
            this.f13987b = -9223372036854775807L;
            this.f13988c = -9223372036854775807L;
            throw exc3;
        }
        this.f13988c = elapsedRealtime + 50;
    }
}
