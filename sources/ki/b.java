package ki;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;
public final class b {
    public static final AtomicLong d = new AtomicLong(1);
    public final long f11390a = d.getAndIncrement();
    public final long f11391b = SystemClock.elapsedRealtime();
    public final h f11392c;

    public b(h hVar) {
        this.f11392c = hVar;
    }

    public final void a(String str, Throwable th2) {
        this.f11392c.b("AudioRecorder[" + this.f11390a + "] t+" + (SystemClock.elapsedRealtime() - this.f11391b) + "ms [" + Thread.currentThread().getName() + "] " + str, th2);
    }

    public final void b(String str) {
        this.f11392c.u("AudioRecorder[" + this.f11390a + "] t+" + (SystemClock.elapsedRealtime() - this.f11391b) + "ms [" + Thread.currentThread().getName() + "] " + str);
    }
}
