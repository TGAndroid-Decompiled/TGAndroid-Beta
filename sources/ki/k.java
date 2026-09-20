package ki;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.messenger.FileLog;
public final class k {
    public static final AtomicLong f13759c = new AtomicLong(1);
    public final long f13760a = f13759c.getAndIncrement();
    public final long f13761b = SystemClock.elapsedRealtime();

    public final void a(String str, Exception exc) {
        FileLog.e(c() + str + ": " + exc);
        FileLog.e(exc);
    }

    public final void b(String str) {
        FileLog.d(c() + str);
    }

    public final String c() {
        return "RoundVideo[" + this.f13760a + "] t+" + (SystemClock.elapsedRealtime() - this.f13761b) + "ms [" + Thread.currentThread().getName() + "] ";
    }
}
