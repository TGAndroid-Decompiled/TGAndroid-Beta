package ki;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;
public final class b {
    public static final AtomicLong d = new AtomicLong(1);
    public final long f11389a = d.getAndIncrement();
    public final long f11390b = SystemClock.elapsedRealtime();
    public final h f11391c;

    public b(h hVar) {
        this.f11391c = hVar;
    }

    public final void a(String str, Throwable th2) {
        this.f11391c.b("AudioRecorder[" + this.f11389a + "] t+" + (SystemClock.elapsedRealtime() - this.f11390b) + "ms [" + Thread.currentThread().getName() + "] " + str, th2);
    }

    public final void b(String str) {
        this.f11391c.u("AudioRecorder[" + this.f11389a + "] t+" + (SystemClock.elapsedRealtime() - this.f11390b) + "ms [" + Thread.currentThread().getName() + "] " + str);
    }
}
