package ki;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.messenger.FileLog;
public final class n {
    public static final AtomicLong f15055c = new AtomicLong(1);
    public final long f15056a = f15055c.getAndIncrement();
    public final long f15057b = SystemClock.elapsedRealtime();

    public final void a(String str, Exception exc) {
        FileLog.e(c() + str + ": " + exc);
        FileLog.e(exc);
    }

    public final void b(String str) {
        FileLog.d(c() + str);
    }

    public final String c() {
        return "RoundVideo[" + this.f15056a + "] t+" + (SystemClock.elapsedRealtime() - this.f15057b) + "ms [" + Thread.currentThread().getName() + "] ";
    }
}
