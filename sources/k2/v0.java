package k2;

import android.os.SystemClock;
import java.io.Serializable;
public final class v0 {
    public long f10780a = -9223372036854775807L;
    public long f10781b = -9223372036854775807L;
    public Serializable f10782c;

    public void a(Exception exc) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.f10782c) == null) {
            this.f10782c = exc;
        }
        if (this.f10780a == -9223372036854775807L && w0.f10783c0.get() <= 0) {
            this.f10780a = 200 + elapsedRealtime;
        }
        long j10 = this.f10780a;
        if (j10 != -9223372036854775807L && elapsedRealtime >= j10) {
            Exception exc2 = (Exception) this.f10782c;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = (Exception) this.f10782c;
            this.f10782c = null;
            this.f10780a = -9223372036854775807L;
            this.f10781b = -9223372036854775807L;
            throw exc3;
        }
        this.f10781b = elapsedRealtime + 50;
    }
}
