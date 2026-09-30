package k2;

import android.os.SystemClock;
public final class a0 {
    public Exception f13230a;
    public long f13231b = -9223372036854775807L;
    public long f13232c = -9223372036854775807L;

    public final void a(Exception exc) {
        boolean z10;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f13230a == null) {
            this.f13230a = exc;
        }
        if (this.f13231b == -9223372036854775807L) {
            synchronized (e0.f13249o0) {
                if (e0.f13251q0 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (!z10) {
                this.f13231b = 200 + elapsedRealtime;
            }
        }
        long j3 = this.f13231b;
        if (j3 != -9223372036854775807L && elapsedRealtime >= j3) {
            Exception exc2 = this.f13230a;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = this.f13230a;
            this.f13230a = null;
            this.f13231b = -9223372036854775807L;
            this.f13232c = -9223372036854775807L;
            throw exc3;
        }
        this.f13232c = elapsedRealtime + 50;
    }
}
