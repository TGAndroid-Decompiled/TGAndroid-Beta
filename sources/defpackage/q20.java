package defpackage;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;
public final class q20 {
    public static final AtomicLong d = new AtomicLong(1);
    public final long a = d.getAndIncrement();
    public final long b = SystemClock.elapsedRealtime();
    public final d30 c;

    public q20(d30 d30Var) {
        this.c = d30Var;
    }

    public final void a(String str, Throwable th) {
        this.c.o("AudioRecorder[" + this.a + "] t+" + (SystemClock.elapsedRealtime() - this.b) + "ms [" + Thread.currentThread().getName() + "] " + str, th);
    }

    public final void b(String str) {
        this.c.d("AudioRecorder[" + this.a + "] t+" + (SystemClock.elapsedRealtime() - this.b) + "ms [" + Thread.currentThread().getName() + "] " + str);
    }
}
