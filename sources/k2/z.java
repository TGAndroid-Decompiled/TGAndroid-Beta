package k2;

import android.os.SystemClock;
public final class z {
    public Exception f14580a;
    public long f14581b = -9223372036854775807L;
    public long f14582c = -9223372036854775807L;

    public final void a(Exception exc) {
        boolean z10;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f14580a == null) {
            this.f14580a = exc;
        }
        if (this.f14581b == -9223372036854775807L) {
            synchronized (d0.f14418n0) {
                if (d0.f14420p0 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (!z10) {
                this.f14581b = 200 + elapsedRealtime;
            }
        }
        long j3 = this.f14581b;
        if (j3 != -9223372036854775807L && elapsedRealtime >= j3) {
            Exception exc2 = this.f14580a;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = this.f14580a;
            this.f14580a = null;
            this.f14581b = -9223372036854775807L;
            this.f14582c = -9223372036854775807L;
            throw exc3;
        }
        this.f14582c = elapsedRealtime + 50;
    }
}
