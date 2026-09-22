package k2;

import android.os.SystemClock;
public final class b0 {
    public Exception f13231a;
    public long f13232b = -9223372036854775807L;
    public long f13233c = -9223372036854775807L;

    public final void a(Exception exc) {
        boolean z10;
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (this.f13231a == null) {
            this.f13231a = exc;
        }
        if (this.f13232b == -9223372036854775807L) {
            synchronized (g0.f13255o0) {
                if (g0.f13257q0 > 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
            }
            if (!z10) {
                this.f13232b = 200 + elapsedRealtime;
            }
        }
        long j3 = this.f13232b;
        if (j3 != -9223372036854775807L && elapsedRealtime >= j3) {
            Exception exc2 = this.f13231a;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = this.f13231a;
            this.f13231a = null;
            this.f13232b = -9223372036854775807L;
            this.f13233c = -9223372036854775807L;
            throw exc3;
        }
        this.f13233c = elapsedRealtime + 50;
    }
}
