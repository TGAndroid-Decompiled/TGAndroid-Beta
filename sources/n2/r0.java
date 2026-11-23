package n2;

import android.os.SystemClock;
import java.io.Serializable;
public final class r0 {
    public long f21304a = -9223372036854775807L;
    public long f21305b = -9223372036854775807L;
    public Serializable f21306c;

    public void a(Exception exc) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.f21306c) == null) {
            this.f21306c = exc;
        }
        if (this.f21304a == -9223372036854775807L && s0.f21307c0.get() <= 0) {
            this.f21304a = 200 + elapsedRealtime;
        }
        long j3 = this.f21304a;
        if (j3 != -9223372036854775807L && elapsedRealtime >= j3) {
            Exception exc2 = (Exception) this.f21306c;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = (Exception) this.f21306c;
            this.f21306c = null;
            this.f21304a = -9223372036854775807L;
            this.f21305b = -9223372036854775807L;
            throw exc3;
        }
        this.f21305b = elapsedRealtime + 50;
    }
}
