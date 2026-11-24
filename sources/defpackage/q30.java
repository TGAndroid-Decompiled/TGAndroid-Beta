package defpackage;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;
public final class q30 {
    public static final AtomicLong d = new AtomicLong(1);
    public final long a = d.getAndIncrement();
    public final long b = SystemClock.elapsedRealtime();
    public final d40 c;

    public q30(d40 d40Var) {
        this.c = d40Var;
    }

    public final void a(String str, Throwable th) {
        this.c.s("AudioRecorder[" + this.a + "] t+" + (SystemClock.elapsedRealtime() - this.b) + "ms [" + Thread.currentThread().getName() + "] " + str, th);
    }

    public final void b(String str) {
        this.c.d("AudioRecorder[" + this.a + "] t+" + (SystemClock.elapsedRealtime() - this.b) + "ms [" + Thread.currentThread().getName() + "] " + str);
    }
}
