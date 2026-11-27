package defpackage;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
public final class q53 implements ThreadFactory {
    public static final ThreadFactory e = Executors.defaultThreadFactory();
    public final AtomicLong a = new AtomicLong();
    public final String b;
    public final byte c;
    public final StrictMode.ThreadPolicy d;

    public q53(String str, int i, StrictMode.ThreadPolicy threadPolicy) {
        this.b = str;
        this.c = i;
        this.d = threadPolicy;
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread newThread = e.newThread(new bv2(this, runnable, (byte) 24));
        Locale locale = Locale.ROOT;
        long andIncrement = this.a.getAndIncrement();
        newThread.setName(this.b + " Thread #" + andIncrement);
        return newThread;
    }
}
