package k2;

import android.os.SystemClock;
public final class z {
    public Exception f14582a;
    public long f14583b = -9223372036854775807L;
    public long f14584c = -9223372036854775807L;

    public final void a(Exception exc) {
        boolean z10;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f14582a == null) {
            this.f14582a = exc;
        }
        if (this.f14583b == -9223372036854775807L) {
            synchronized (d0.f14420n0) {
                if (d0.f14422p0 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (!z10) {
                this.f14583b = 200 + elapsedRealtime;
            }
        }
        long j3 = this.f14583b;
        if (j3 != -9223372036854775807L && elapsedRealtime >= j3) {
            Exception exc2 = this.f14582a;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = this.f14582a;
            this.f14582a = null;
            this.f14583b = -9223372036854775807L;
            this.f14584c = -9223372036854775807L;
            throw exc3;
        }
        this.f14584c = elapsedRealtime + 50;
    }
}
