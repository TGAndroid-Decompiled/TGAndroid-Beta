package n2;

import android.os.SystemClock;
import java.io.Serializable;
public final class q0 {
    public long f21201a = -9223372036854775807L;
    public long f21202b = -9223372036854775807L;
    public Serializable f21203c;

    public void a(Exception exc) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.f21203c) == null) {
            this.f21203c = exc;
        }
        if (this.f21201a == -9223372036854775807L && r0.f21207c0.get() <= 0) {
            this.f21201a = 200 + elapsedRealtime;
        }
        long j3 = this.f21201a;
        if (j3 != -9223372036854775807L && elapsedRealtime >= j3) {
            Exception exc2 = (Exception) this.f21203c;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = (Exception) this.f21203c;
            this.f21203c = null;
            this.f21201a = -9223372036854775807L;
            this.f21202b = -9223372036854775807L;
            throw exc3;
        }
        this.f21202b = elapsedRealtime + 50;
    }
}
