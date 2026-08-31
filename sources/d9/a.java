package d9;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;
public final class a implements ThreadFactory {
    public static final ThreadFactory f4345e = Executors.defaultThreadFactory();
    public final AtomicLong f4346a = new AtomicLong();
    public final String f4347b;
    public final int f4348c;
    public final StrictMode.ThreadPolicy d;

    public a(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        this.f4347b = str;
        this.f4348c = i10;
        this.d = threadPolicy;
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread newThread = f4345e.newThread(new a1.e(13, this, runnable));
        Locale locale = Locale.ROOT;
        long andIncrement = this.f4346a.getAndIncrement();
        newThread.setName(this.f4347b + " Thread #" + andIncrement);
        return newThread;
    }
}
