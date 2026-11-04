package m2;

import android.os.SystemClock;
import java.io.Serializable;
public final class r0 {
    public long f18973a = -9223372036854775807L;
    public long f18974b = -9223372036854775807L;
    public Serializable f18975c;

    public void a(Exception exc) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.f18975c) == null) {
            this.f18975c = exc;
        }
        if (this.f18973a == -9223372036854775807L && s0.f18979c0.get() <= 0) {
            this.f18973a = 200 + elapsedRealtime;
        }
        long j10 = this.f18973a;
        if (j10 != -9223372036854775807L && elapsedRealtime >= j10) {
            Exception exc2 = (Exception) this.f18975c;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = (Exception) this.f18975c;
            this.f18975c = null;
            this.f18973a = -9223372036854775807L;
            this.f18974b = -9223372036854775807L;
            throw exc3;
        }
        this.f18974b = elapsedRealtime + 50;
    }
}
