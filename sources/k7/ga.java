package k7;

import android.os.SystemClock;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Locale;
public class ga implements Closeable {
    public static final HashMap f9843f = new HashMap();
    public int f9844a;
    public long f9845b;
    public long f9846c;
    public long d = 2147483647L;
    public long e = -2147483648L;

    public ga(String str) {
    }

    public void a() {
        this.f9845b = SystemClock.elapsedRealtimeNanos() / 1000;
    }

    public void b(long j10) {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
        long j11 = this.f9846c;
        if (j11 != 0 && elapsedRealtimeNanos - j11 >= 1000000) {
            this.f9844a = 0;
            this.f9845b = 0L;
            this.d = 2147483647L;
            this.e = -2147483648L;
        }
        this.f9846c = elapsedRealtimeNanos;
        this.f9844a++;
        this.d = Math.min(this.d, j10);
        this.e = Math.max(this.e, j10);
        if (this.f9844a % 50 == 0) {
            Locale locale = Locale.US;
            oa.b();
        }
        if (this.f9844a % 500 == 0) {
            this.f9844a = 0;
            this.f9845b = 0L;
            this.d = 2147483647L;
            this.e = -2147483648L;
        }
    }

    public void c(long j10) {
        b((SystemClock.elapsedRealtimeNanos() / 1000) - j10);
    }

    @Override
    public void close() {
        long j10 = this.f9845b;
        if (j10 != 0) {
            c(j10);
            return;
        }
        throw new IllegalStateException("Did you forget to call start()?");
    }
}
