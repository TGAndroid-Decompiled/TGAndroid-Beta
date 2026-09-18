package k2;

import android.os.SystemClock;
public final class b0 {
    public Exception f13232a;
    public long f13233b = -9223372036854775807L;
    public long f13234c = -9223372036854775807L;

    public final void a(Exception exc) {
        boolean z10;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f13232a == null) {
            this.f13232a = exc;
        }
        if (this.f13233b == -9223372036854775807L) {
            synchronized (g0.f13256o0) {
                if (g0.f13258q0 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (!z10) {
                this.f13233b = 200 + elapsedRealtime;
            }
        }
        long j3 = this.f13233b;
        if (j3 != -9223372036854775807L && elapsedRealtime >= j3) {
            Exception exc2 = this.f13232a;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = this.f13232a;
            this.f13232a = null;
            this.f13233b = -9223372036854775807L;
            this.f13234c = -9223372036854775807L;
            throw exc3;
        }
        this.f13234c = elapsedRealtime + 50;
    }
}
