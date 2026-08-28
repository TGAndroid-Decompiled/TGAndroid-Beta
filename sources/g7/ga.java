package g7;

import android.os.SystemClock;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Locale;
public class ga implements Closeable {
    public static final HashMap f7232f = new HashMap();
    public int f7233a;
    public long f7234b;
    public long f7235c;
    public long d = 2147483647L;
    public long f7236e = -2147483648L;

    public ga(String str) {
    }

    public void a() {
        this.f7234b = SystemClock.elapsedRealtimeNanos() / 1000;
    }

    public void b(long j10) {
        long elapsedRealtimeNanos = SystemClock.elapsedRealtimeNanos() / 1000;
        long j11 = this.f7235c;
        if (j11 != 0 && elapsedRealtimeNanos - j11 >= 1000000) {
            this.f7233a = 0;
            this.f7234b = 0L;
            this.d = 2147483647L;
            this.f7236e = -2147483648L;
        }
        this.f7235c = elapsedRealtimeNanos;
        this.f7233a++;
        this.d = Math.min(this.d, j10);
        this.f7236e = Math.max(this.f7236e, j10);
        if (this.f7233a % 50 == 0) {
            Locale locale = Locale.US;
            oa.b();
        }
        if (this.f7233a % 500 == 0) {
            this.f7233a = 0;
            this.f7234b = 0L;
            this.d = 2147483647L;
            this.f7236e = -2147483648L;
        }
    }

    public void c(long j10) {
        b((SystemClock.elapsedRealtimeNanos() / 1000) - j10);
    }

    @Override
    public void close() {
        long j10 = this.f7234b;
        if (j10 != 0) {
            c(j10);
            return;
        }
        throw new IllegalStateException("Did you forget to call start()?");
    }
}
