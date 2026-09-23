package k2;

import android.os.SystemClock;
public final class a0 {
    public Exception f13215a;
    public long f13216b = -9223372036854775807L;
    public long f13217c = -9223372036854775807L;

    public final void a(Exception exc) {
        boolean z10;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f13215a == null) {
            this.f13215a = exc;
        }
        if (this.f13216b == -9223372036854775807L) {
            synchronized (f0.f13239o0) {
                if (f0.f13241q0 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (!z10) {
                this.f13216b = 200 + elapsedRealtime;
            }
        }
        long j3 = this.f13216b;
        if (j3 != -9223372036854775807L && elapsedRealtime >= j3) {
            Exception exc2 = this.f13215a;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = this.f13215a;
            this.f13215a = null;
            this.f13216b = -9223372036854775807L;
            this.f13217c = -9223372036854775807L;
            throw exc3;
        }
        this.f13217c = elapsedRealtime + 50;
    }
}
