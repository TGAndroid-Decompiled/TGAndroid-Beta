package h7;

import android.os.SystemClock;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Locale;

public class ga implements Closeable {

    public static final HashMap f8403f = new HashMap();

    public int f8404a;

    public long f8405b;

    public long f8406c;
    public long d = 2147483647L;

    public long f8407e = -2147483648L;

    public ga(String str) {
    }

    public void a() {
        this.f8405b = SystemClock.elapsedRealtimeNanos() / 1000;
    }

    public void b(long j10) {
        long jElapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
        long j11 = this.f8406c;
        if (j11 != 0 && jElapsedRealtimeNanos - j11 >= 1000000) {
            this.f8404a = 0;
            this.f8405b = 0L;
            this.d = 2147483647L;
            this.f8407e = -2147483648L;
        }
        this.f8406c = jElapsedRealtimeNanos;
        this.f8404a++;
        this.d = Math.min(this.d, j10);
        this.f8407e = Math.max(this.f8407e, j10);
        if (this.f8404a % 50 == 0) {
            Locale locale = Locale.US;
            oa.b();
        }
        if (this.f8404a % 500 == 0) {
            this.f8404a = 0;
            this.f8405b = 0L;
            this.d = 2147483647L;
            this.f8407e = -2147483648L;
        }
    }

    public void c(long j10) {
        b((SystemClock.elapsedRealtimeNanos() / 1000) - j10);
    }

    @Override
    public void close() {
        long j10 = this.f8405b;
        if (j10 == 0) {
            throw new IllegalStateException("Did you forget to call start()?");
        }
        c(j10);
    }
}
