package k7;

import android.os.SystemClock;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Locale;
public class ga implements Closeable {
    public static final HashMap f9863f = new HashMap();
    public int f9864a;
    public long f9865b;
    public long f9866c;
    public long d = 2147483647L;
    public long e = -2147483648L;

    public ga(String str) {
    }

    public void a() {
        this.f9865b = SystemClock.elapsedRealtimeNanos() / 1000;
    }

    public void b(long j10) {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
        long j11 = this.f9866c;
        if (j11 != 0 && elapsedRealtimeNanos - j11 >= 1000000) {
            this.f9864a = 0;
            this.f9865b = 0L;
            this.d = 2147483647L;
            this.e = -2147483648L;
        }
        this.f9866c = elapsedRealtimeNanos;
        this.f9864a++;
        this.d = Math.min(this.d, j10);
        this.e = Math.max(this.e, j10);
        if (this.f9864a % 50 == 0) {
            Locale locale = Locale.US;
            oa.b();
        }
        if (this.f9864a % 500 == 0) {
            this.f9864a = 0;
            this.f9865b = 0L;
            this.d = 2147483647L;
            this.e = -2147483648L;
        }
    }

    public void c(long j10) {
        b((SystemClock.elapsedRealtimeNanos() / 1000) - j10);
    }

    @Override
    public void close() {
        long j10 = this.f9865b;
        if (j10 != 0) {
            c(j10);
            return;
        }
        throw new IllegalStateException("Did you forget to call start()?");
    }
}
