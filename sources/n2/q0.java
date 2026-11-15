package n2;

import android.os.SystemClock;
import java.io.Serializable;
public final class q0 {
    public long f20843a = -9223372036854775807L;
    public long f20844b = -9223372036854775807L;
    public Serializable f20845c;

    public void a(Exception exc) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.f20845c) == null) {
            this.f20845c = exc;
        }
        if (this.f20843a == -9223372036854775807L && r0.f20849c0.get() <= 0) {
            this.f20843a = 200 + elapsedRealtime;
        }
        long j3 = this.f20843a;
        if (j3 != -9223372036854775807L && elapsedRealtime >= j3) {
            Exception exc2 = (Exception) this.f20845c;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = (Exception) this.f20845c;
            this.f20845c = null;
            this.f20843a = -9223372036854775807L;
            this.f20844b = -9223372036854775807L;
            throw exc3;
        }
        this.f20844b = elapsedRealtime + 50;
    }
}
