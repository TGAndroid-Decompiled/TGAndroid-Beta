package ki;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.messenger.FileLog;
public final class k {
    public static final AtomicLong f13769c = new AtomicLong(1);
    public final long f13770a = f13769c.getAndIncrement();
    public final long f13771b = SystemClock.elapsedRealtime();

    public final void a(String str, Exception exc) {
        FileLog.e(c() + str + ": " + exc);
        FileLog.e(exc);
    }

    public final void b(String str) {
        FileLog.d(c() + str);
    }

    public final String c() {
        return "RoundVideo[" + this.f13770a + "] t+" + (SystemClock.elapsedRealtime() - this.f13771b) + "ms [" + Thread.currentThread().getName() + "] ";
    }
}
