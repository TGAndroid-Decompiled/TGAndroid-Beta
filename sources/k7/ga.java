package k7;

import android.os.SystemClock;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Locale;
public class ga implements Closeable {
    public static final HashMap f10589f = new HashMap();
    public int f10590a;
    public long f10591b;
    public long f10592c;
    public long d = 2147483647L;
    public long f10593e = -2147483648L;

    public ga(String str) {
    }

    public void a() {
        this.f10591b = SystemClock.elapsedRealtimeNanos() / 1000;
    }

    public void b(long j10) {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
        long j11 = this.f10592c;
        if (j11 != 0 && elapsedRealtimeNanos - j11 >= 1000000) {
            this.f10590a = 0;
            this.f10591b = 0L;
            this.d = 2147483647L;
            this.f10593e = -2147483648L;
        }
        this.f10592c = elapsedRealtimeNanos;
        this.f10590a++;
        this.d = Math.min(this.d, j10);
        this.f10593e = Math.max(this.f10593e, j10);
        if (this.f10590a % 50 == 0) {
            Locale locale = Locale.US;
            oa.b();
        }
        if (this.f10590a % 500 == 0) {
            this.f10590a = 0;
            this.f10591b = 0L;
            this.d = 2147483647L;
            this.f10593e = -2147483648L;
        }
    }

    public void c(long j10) {
        b((SystemClock.elapsedRealtimeNanos() / 1000) - j10);
    }

    @Override
    public void close() {
        long j10 = this.f10591b;
        if (j10 != 0) {
            c(j10);
            return;
        }
        throw new IllegalStateException("Did you forget to call start()?");
    }
}
