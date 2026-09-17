package k2;

import android.os.SystemClock;
public final class z {
    public Exception f14692a;
    public long f14693b = -9223372036854775807L;
    public long f14694c = -9223372036854775807L;

    public final void a(Exception exc) {
        boolean z10;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f14692a == null) {
            this.f14692a = exc;
        }
        if (this.f14693b == -9223372036854775807L) {
            synchronized (d0.f14528o0) {
                if (d0.f14530q0 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (!z10) {
                this.f14693b = 200 + elapsedRealtime;
            }
        }
        long j3 = this.f14693b;
        if (j3 != -9223372036854775807L && elapsedRealtime >= j3) {
            Exception exc2 = this.f14692a;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = this.f14692a;
            this.f14692a = null;
            this.f14693b = -9223372036854775807L;
            this.f14694c = -9223372036854775807L;
            throw exc3;
        }
        this.f14694c = elapsedRealtime + 50;
    }
}
