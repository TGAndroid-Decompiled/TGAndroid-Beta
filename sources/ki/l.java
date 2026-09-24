package ki;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.messenger.FileLog;
public final class l {
    public static final AtomicLong f13781c = new AtomicLong(1);
    public final long f13782a = f13781c.getAndIncrement();
    public final long f13783b = SystemClock.elapsedRealtime();

    public final void a(String str, Exception exc) {
        FileLog.e(c() + str + ": " + exc);
        FileLog.e(exc);
    }

    public final void b(String str) {
        FileLog.d(c() + str);
    }

    public final String c() {
        return "RoundVideo[" + this.f13782a + "] t+" + (SystemClock.elapsedRealtime() - this.f13783b) + "ms [" + Thread.currentThread().getName() + "] ";
    }
}
