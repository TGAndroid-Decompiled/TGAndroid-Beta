package d9;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
public final class a implements ThreadFactory {
    public static final ThreadFactory e = Executors.defaultThreadFactory();
    public final AtomicLong f4269a = new AtomicLong();
    public final String f4270b;
    public final int f4271c;
    public final StrictMode.ThreadPolicy d;

    public a(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        this.f4270b = str;
        this.f4271c = i10;
        this.d = threadPolicy;
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread newThread = e.newThread(new a1.e(15, this, runnable));
        Locale locale = Locale.ROOT;
        long andIncrement = this.f4269a.getAndIncrement();
        newThread.setName(this.f4270b + " Thread #" + andIncrement);
        return newThread;
    }
}
