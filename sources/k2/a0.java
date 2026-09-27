package k2;

import android.os.SystemClock;
public final class a0 {
    public Exception f13218a;
    public long f13219b = -9223372036854775807L;
    public long f13220c = -9223372036854775807L;

    public final void a(Exception exc) {
        boolean z10;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f13218a == null) {
            this.f13218a = exc;
        }
        if (this.f13219b == -9223372036854775807L) {
            synchronized (e0.f13237o0) {
                if (e0.f13239q0 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (!z10) {
                this.f13219b = 200 + elapsedRealtime;
            }
        }
        long j3 = this.f13219b;
        if (j3 != -9223372036854775807L && elapsedRealtime >= j3) {
            Exception exc2 = this.f13218a;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = this.f13218a;
            this.f13218a = null;
            this.f13219b = -9223372036854775807L;
            this.f13220c = -9223372036854775807L;
            throw exc3;
        }
        this.f13220c = elapsedRealtime + 50;
    }
}
