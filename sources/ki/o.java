package ki;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.messenger.FileLog;
public final class o {
    public static final AtomicLong f15073c = new AtomicLong(1);
    public final long f15074a = f15073c.getAndIncrement();
    public final long f15075b = SystemClock.elapsedRealtime();

    public final void a(String str, Exception exc) {
        FileLog.e(c() + str + ": " + exc);
        FileLog.e(exc);
    }

    public final void b(String str) {
        FileLog.d(c() + str);
    }

    public final String c() {
        return "RoundVideo[" + this.f15074a + "] t+" + (SystemClock.elapsedRealtime() - this.f15075b) + "ms [" + Thread.currentThread().getName() + "] ";
    }
}
