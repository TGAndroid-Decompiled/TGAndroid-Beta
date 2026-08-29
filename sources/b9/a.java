package b9;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
public final class a implements ThreadFactory {
    public static final ThreadFactory f1990e = Executors.defaultThreadFactory();
    public final AtomicLong f1991a = new AtomicLong();
    public final String f1992b;
    public final int f1993c;
    public final StrictMode.ThreadPolicy d;

    public a(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        this.f1992b = str;
        this.f1993c = i10;
        this.d = threadPolicy;
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread newThread = f1990e.newThread(new a1.e(9, this, runnable));
        Locale locale = Locale.ROOT;
        long andIncrement = this.f1991a.getAndIncrement();
        newThread.setName(this.f1992b + " Thread #" + andIncrement);
        return newThread;
    }
}
