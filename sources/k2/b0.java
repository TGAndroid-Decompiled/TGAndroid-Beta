package k2;

import android.os.SystemClock;
public final class b0 {
    public Exception f14377a;
    public long f14378b = -9223372036854775807L;
    public long f14379c = -9223372036854775807L;

    public final void a(Exception exc) {
        boolean z10;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f14377a == null) {
            this.f14377a = exc;
        }
        if (this.f14378b == -9223372036854775807L) {
            synchronized (f0.f14395o0) {
                if (f0.f14397q0 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (!z10) {
                this.f14378b = 200 + elapsedRealtime;
            }
        }
        long j3 = this.f14378b;
        if (j3 != -9223372036854775807L && elapsedRealtime >= j3) {
            Exception exc2 = this.f14377a;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = this.f14377a;
            this.f14377a = null;
            this.f14378b = -9223372036854775807L;
            this.f14379c = -9223372036854775807L;
            throw exc3;
        }
        this.f14379c = elapsedRealtime + 50;
    }
}
