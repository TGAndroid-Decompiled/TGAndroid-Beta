package n2;

import android.os.SystemClock;
import java.io.Serializable;
public final class q0 {
    public long f21235a = -9223372036854775807L;
    public long f21236b = -9223372036854775807L;
    public Serializable f21237c;

    public void a(Exception exc) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.f21237c) == null) {
            this.f21237c = exc;
        }
        if (this.f21235a == -9223372036854775807L && r0.f21241c0.get() <= 0) {
            this.f21235a = 200 + elapsedRealtime;
        }
        long j3 = this.f21235a;
        if (j3 != -9223372036854775807L && elapsedRealtime >= j3) {
            Exception exc2 = (Exception) this.f21237c;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = (Exception) this.f21237c;
            this.f21237c = null;
            this.f21235a = -9223372036854775807L;
            this.f21236b = -9223372036854775807L;
            throw exc3;
        }
        this.f21236b = elapsedRealtime + 50;
    }
}
