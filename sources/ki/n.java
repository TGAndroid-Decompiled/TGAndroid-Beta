package ki;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.messenger.FileLog;
public final class n {
    public static final AtomicLong f15058c = new AtomicLong(1);
    public final long f15059a = f15058c.getAndIncrement();
    public final long f15060b = SystemClock.elapsedRealtime();

    public final void a(String str, Exception exc) {
        FileLog.e(c() + str + ": " + exc);
        FileLog.e(exc);
    }

    public final void b(String str) {
        FileLog.d(c() + str);
    }

    public final String c() {
        return "RoundVideo[" + this.f15059a + "] t+" + (SystemClock.elapsedRealtime() - this.f15060b) + "ms [" + Thread.currentThread().getName() + "] ";
    }
}
