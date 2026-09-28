package ki;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;
import org.telegram.messenger.FileLog;
public final class m {
    public static final AtomicLong f13787c = new AtomicLong(1);
    public final long f13788a = f13787c.getAndIncrement();
    public final long f13789b = SystemClock.elapsedRealtime();

    public final void a(String str, Exception exc) {
        FileLog.e(c() + str + ": " + exc);
        FileLog.e(exc);
    }

    public final void b(String str) {
        FileLog.d(c() + str);
    }

    public final String c() {
        return "RoundVideo[" + this.f13788a + "] t+" + (SystemClock.elapsedRealtime() - this.f13789b) + "ms [" + Thread.currentThread().getName() + "] ";
    }
}
