package k2;

import android.os.SystemClock;
public final class z {
    public Exception f14718a;
    public long f14719b = -9223372036854775807L;
    public long f14720c = -9223372036854775807L;

    public final void a(Exception exc) {
        boolean z10;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f14718a == null) {
            this.f14718a = exc;
        }
        if (this.f14719b == -9223372036854775807L) {
            synchronized (d0.f14554o0) {
                if (d0.f14556q0 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (!z10) {
                this.f14719b = 200 + elapsedRealtime;
            }
        }
        long j3 = this.f14719b;
        if (j3 != -9223372036854775807L && elapsedRealtime >= j3) {
            Exception exc2 = this.f14718a;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = this.f14718a;
            this.f14718a = null;
            this.f14719b = -9223372036854775807L;
            this.f14720c = -9223372036854775807L;
            throw exc3;
        }
        this.f14720c = elapsedRealtime + 50;
    }
}
