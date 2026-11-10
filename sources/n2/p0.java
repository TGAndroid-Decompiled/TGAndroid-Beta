package n2;

import android.os.SystemClock;
import java.io.Serializable;
public final class p0 {
    public long f20270a = -9223372036854775807L;
    public long f20271b = -9223372036854775807L;
    public Serializable f20272c;

    public void a(Exception exc) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.f20272c) == null) {
            this.f20272c = exc;
        }
        if (this.f20270a == -9223372036854775807L && q0.f20276c0.get() <= 0) {
            this.f20270a = 200 + elapsedRealtime;
        }
        long j3 = this.f20270a;
        if (j3 != -9223372036854775807L && elapsedRealtime >= j3) {
            Exception exc2 = (Exception) this.f20272c;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = (Exception) this.f20272c;
            this.f20272c = null;
            this.f20270a = -9223372036854775807L;
            this.f20271b = -9223372036854775807L;
            throw exc3;
        }
        this.f20271b = elapsedRealtime + 50;
    }
}
