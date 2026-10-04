package k2;

import android.os.SystemClock;
public final class b0 {
    public Exception f14378a;
    public long f14379b = -9223372036854775807L;
    public long f14380c = -9223372036854775807L;

    public final void a(Exception exc) {
        boolean z10;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f14378a == null) {
            this.f14378a = exc;
        }
        if (this.f14379b == -9223372036854775807L) {
            synchronized (f0.f14396o0) {
                if (f0.f14398q0 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (!z10) {
                this.f14379b = 200 + elapsedRealtime;
            }
        }
        long j3 = this.f14379b;
        if (j3 != -9223372036854775807L && elapsedRealtime >= j3) {
            Exception exc2 = this.f14378a;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = this.f14378a;
            this.f14378a = null;
            this.f14379b = -9223372036854775807L;
            this.f14380c = -9223372036854775807L;
            throw exc3;
        }
        this.f14380c = elapsedRealtime + 50;
    }
}
