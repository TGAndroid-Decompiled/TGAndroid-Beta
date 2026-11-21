package n2;

import android.os.SystemClock;
import java.io.Serializable;
public final class q0 {
    public long f21232a = -9223372036854775807L;
    public long f21233b = -9223372036854775807L;
    public Serializable f21234c;

    public void a(Exception exc) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.f21234c) == null) {
            this.f21234c = exc;
        }
        if (this.f21232a == -9223372036854775807L && r0.f21238c0.get() <= 0) {
            this.f21232a = 200 + elapsedRealtime;
        }
        long j3 = this.f21232a;
        if (j3 != -9223372036854775807L && elapsedRealtime >= j3) {
            Exception exc2 = (Exception) this.f21234c;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = (Exception) this.f21234c;
            this.f21234c = null;
            this.f21232a = -9223372036854775807L;
            this.f21233b = -9223372036854775807L;
            throw exc3;
        }
        this.f21233b = elapsedRealtime + 50;
    }
}
