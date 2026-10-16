package k2;

import android.os.SystemClock;
public final class r0 {
    public Exception f13989a;
    public long f13990b = -9223372036854775807L;
    public long f13991c = -9223372036854775807L;

    public final void a(Exception exc) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f13989a == null) {
            this.f13989a = exc;
        }
        if (this.f13990b == -9223372036854775807L && s0.f13995c0.get() <= 0) {
            this.f13990b = 200 + elapsedRealtime;
        }
        long j10 = this.f13990b;
        if (j10 != -9223372036854775807L && elapsedRealtime >= j10) {
            Exception exc2 = this.f13989a;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = this.f13989a;
            this.f13989a = null;
            this.f13990b = -9223372036854775807L;
            this.f13991c = -9223372036854775807L;
            throw exc3;
        }
        this.f13991c = elapsedRealtime + 50;
    }
}
