package n2;

import android.os.SystemClock;
import java.io.Serializable;
public final class p0 {
    public long f20262a = -9223372036854775807L;
    public long f20263b = -9223372036854775807L;
    public Serializable f20264c;

    public void a(Exception exc) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.f20264c) == null) {
            this.f20264c = exc;
        }
        if (this.f20262a == -9223372036854775807L && q0.f20268c0.get() <= 0) {
            this.f20262a = 200 + elapsedRealtime;
        }
        long j3 = this.f20262a;
        if (j3 != -9223372036854775807L && elapsedRealtime >= j3) {
            Exception exc2 = (Exception) this.f20264c;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = (Exception) this.f20264c;
            this.f20264c = null;
            this.f20262a = -9223372036854775807L;
            this.f20263b = -9223372036854775807L;
            throw exc3;
        }
        this.f20263b = elapsedRealtime + 50;
    }
}
