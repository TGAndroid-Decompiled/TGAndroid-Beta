package ki;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.messenger.FileLog;
public final class m {
    public static final AtomicLong f14985c = new AtomicLong(1);
    public final long f14986a = f14985c.getAndIncrement();
    public final long f14987b = SystemClock.elapsedRealtime();

    public final void a(String str, Exception exc) {
        FileLog.e(c() + str + ": " + exc);
        FileLog.e(exc);
    }

    public final void b(String str) {
        FileLog.d(c() + str);
    }

    public final String c() {
        return "RoundVideo[" + this.f14986a + "] t+" + (SystemClock.elapsedRealtime() - this.f14987b) + "ms [" + Thread.currentThread().getName() + "] ";
    }
}
