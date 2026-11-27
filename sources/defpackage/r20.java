package defpackage;

import android.os.SystemClock;
import java.util.concurrent.atomic.AtomicLong;
public final class r20 {
    public static final AtomicLong d = new AtomicLong(1);
    public final long a = d.getAndIncrement();
    public final long b = SystemClock.elapsedRealtime();
    public final e30 c;

    public r20(e30 e30Var) {
        this.c = e30Var;
    }

    public final void a(String str, Throwable th) {
        this.c.t("AudioRecorder[" + this.a + "] t+" + (SystemClock.elapsedRealtime() - this.b) + "ms [" + Thread.currentThread().getName() + "] " + str, th);
    }

    public final void b(String str) {
        this.c.c("AudioRecorder[" + this.a + "] t+" + (SystemClock.elapsedRealtime() - this.b) + "ms [" + Thread.currentThread().getName() + "] " + str);
    }
}
