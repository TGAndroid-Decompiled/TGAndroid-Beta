package k2;

import android.os.SystemClock;
public final class b0 {
    public Exception f13233a;
    public long f13234b = -9223372036854775807L;
    public long f13235c = -9223372036854775807L;

    public final void a(Exception exc) {
        boolean z10;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f13233a == null) {
            this.f13233a = exc;
        }
        if (this.f13234b == -9223372036854775807L) {
            synchronized (f0.f13251o0) {
                if (f0.f13253q0 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (!z10) {
                this.f13234b = 200 + elapsedRealtime;
            }
        }
        long j3 = this.f13234b;
        if (j3 != -9223372036854775807L && elapsedRealtime >= j3) {
            Exception exc2 = this.f13233a;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = this.f13233a;
            this.f13233a = null;
            this.f13234b = -9223372036854775807L;
            this.f13235c = -9223372036854775807L;
            throw exc3;
        }
        this.f13235c = elapsedRealtime + 50;
    }
}
