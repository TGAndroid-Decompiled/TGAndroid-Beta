package k2;

import android.os.SystemClock;
import java.io.Serializable;
public final class t0 {
    public long f16275a = -9223372036854775807L;
    public long f16276b = -9223372036854775807L;
    public Serializable f16277c;

    public void a(Exception exc) {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        if (((Exception) this.f16277c) == null) {
            this.f16277c = exc;
        }
        if (this.f16275a == -9223372036854775807L && u0.f16281c0.get() <= 0) {
            this.f16275a = 200 + elapsedRealtime;
        }
        long j10 = this.f16275a;
        if (j10 != -9223372036854775807L && elapsedRealtime >= j10) {
            Exception exc2 = (Exception) this.f16277c;
            if (exc2 != exc) {
                exc2.addSuppressed(exc);
            }
            Exception exc3 = (Exception) this.f16277c;
            this.f16277c = null;
            this.f16275a = -9223372036854775807L;
            this.f16276b = -9223372036854775807L;
            throw exc3;
        }
        this.f16276b = elapsedRealtime + 50;
    }
}
