package i7;

import android.os.SystemClock;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Locale;
public class ga implements Closeable {
    public static final HashMap f8377f = new HashMap();
    public int f8378a;
    public long f8379b;
    public long f8380c;
    public long d = 2147483647L;
    public long f8381e = -2147483648L;

    public ga(String str) {
    }

    public void a() {
        this.f8379b = SystemClock.elapsedRealtimeNanos() / 1000;
    }

    public void b(long j10) {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
        long j11 = this.f8380c;
        if (j11 != 0 && elapsedRealtimeNanos - j11 >= 1000000) {
            this.f8378a = 0;
            this.f8379b = 0L;
            this.d = 2147483647L;
            this.f8381e = -2147483648L;
        }
        this.f8380c = elapsedRealtimeNanos;
        this.f8378a++;
        this.d = Math.min(this.d, j10);
        this.f8381e = Math.max(this.f8381e, j10);
        if (this.f8378a % 50 == 0) {
            Locale locale = Locale.US;
            oa.b();
        }
        if (this.f8378a % 500 == 0) {
            this.f8378a = 0;
            this.f8379b = 0L;
            this.d = 2147483647L;
            this.f8381e = -2147483648L;
        }
    }

    public void c(long j10) {
        b((SystemClock.elapsedRealtimeNanos() / 1000) - j10);
    }

    @Override
    public void close() {
        long j10 = this.f8379b;
        if (j10 != 0) {
            c(j10);
            return;
        }
        throw new IllegalStateException("Did you forget to call start()?");
    }
}
