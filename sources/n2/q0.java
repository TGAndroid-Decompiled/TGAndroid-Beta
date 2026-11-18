package n2;

import android.os.SystemClock;
import java.io.Serializable;
public final class q0 {
    public long f21204a = -9223372036854775807L;
    public long f21205b = -9223372036854775807L;
    public Serializable f21206c;

    public void a(Exception exc) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.f21206c) == null) {
            this.f21206c = exc;
        }
        if (this.f21204a == -9223372036854775807L && r0.f21210c0.get() <= 0) {
            this.f21204a = 200 + elapsedRealtime;
        }
        long j3 = this.f21204a;
        if (j3 != -9223372036854775807L && elapsedRealtime >= j3) {
            Exception exc2 = (Exception) this.f21206c;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = (Exception) this.f21206c;
            this.f21206c = null;
            this.f21204a = -9223372036854775807L;
            this.f21205b = -9223372036854775807L;
            throw exc3;
        }
        this.f21205b = elapsedRealtime + 50;
    }
}
