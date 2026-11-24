package defpackage;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;
public final class ek9 {
    public static final AtomicLong c = new AtomicLong(1);
    public final long a = c.getAndIncrement();
    public final long b = SystemClock.elapsedRealtime();

    public final void a(String str, Throwable th) {
        fa4.d(c() + str + ": " + th);
        fa4.g(th, true);
    }

    public final void b(String str) {
        fa4.b(c().concat(str));
    }

    public final String c() {
        return "RoundVideo[" + this.a + "] t+" + (SystemClock.elapsedRealtime() - this.b) + "ms [" + Thread.currentThread().getName() + "] ";
    }
}
