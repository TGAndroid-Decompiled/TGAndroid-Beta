package li;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.messenger.f8;
public final class p {
    public static final AtomicLong f12222c = new AtomicLong(1);
    public final long f12223a = f12222c.getAndIncrement();
    public final long f12224b = SystemClock.elapsedRealtime();

    public final void a(String str, Throwable th2) {
        f8.d(c() + str + ": " + th2);
        f8.g(th2, true);
    }

    public final void b(String str) {
        f8.b(c() + str);
    }

    public final String c() {
        return "RoundVideo[" + this.f12223a + "] t+" + (SystemClock.elapsedRealtime() - this.f12224b) + "ms [" + Thread.currentThread().getName() + "] ";
    }
}
