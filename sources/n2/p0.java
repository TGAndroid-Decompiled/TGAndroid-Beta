package n2;

import android.os.SystemClock;
import java.io.Serializable;
public final class p0 {
    public long f20265a = -9223372036854775807L;
    public long f20266b = -9223372036854775807L;
    public Serializable f20267c;

    public void a(Exception exc) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.f20267c) == null) {
            this.f20267c = exc;
        }
        if (this.f20265a == -9223372036854775807L && q0.f20271c0.get() <= 0) {
            this.f20265a = 200 + elapsedRealtime;
        }
        long j3 = this.f20265a;
        if (j3 != -9223372036854775807L && elapsedRealtime >= j3) {
            Exception exc2 = (Exception) this.f20267c;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = (Exception) this.f20267c;
            this.f20267c = null;
            this.f20265a = -9223372036854775807L;
            this.f20266b = -9223372036854775807L;
            throw exc3;
        }
        this.f20266b = elapsedRealtime + 50;
    }
}
