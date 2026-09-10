package k2;

import android.os.SystemClock;
public final class a0 {
    public Exception f12070a;
    public long f12071b = -9223372036854775807L;
    public long f12072c = -9223372036854775807L;

    public final void a(Exception exc) {
        boolean z10;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f12070a == null) {
            this.f12070a = exc;
        }
        if (this.f12071b == -9223372036854775807L) {
            synchronized (e0.f12089o0) {
                if (e0.f12091q0 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (!z10) {
                this.f12071b = 200 + elapsedRealtime;
            }
        }
        long j3 = this.f12071b;
        if (j3 != -9223372036854775807L && elapsedRealtime >= j3) {
            Exception exc2 = this.f12070a;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = this.f12070a;
            this.f12070a = null;
            this.f12071b = -9223372036854775807L;
            this.f12072c = -9223372036854775807L;
            throw exc3;
        }
        this.f12072c = elapsedRealtime + 50;
    }
}
