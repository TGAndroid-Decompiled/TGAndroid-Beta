package ki;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.messenger.FileLog;
public final class j {
    public static final AtomicLong f13749c = new AtomicLong(1);
    public final long f13750a = f13749c.getAndIncrement();
    public final long f13751b = SystemClock.elapsedRealtime();

    public final void a(String str, Exception exc) {
        FileLog.e(c() + str + ": " + exc);
        FileLog.e(exc);
    }

    public final void b(String str) {
        FileLog.d(c() + str);
    }

    public final String c() {
        return "RoundVideo[" + this.f13750a + "] t+" + (SystemClock.elapsedRealtime() - this.f13751b) + "ms [" + Thread.currentThread().getName() + "] ";
    }
}
