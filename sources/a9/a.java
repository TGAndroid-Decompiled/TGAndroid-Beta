package a9;

import android.os.StrictMode;
import java.util.Locale;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicLong;

public final class a implements ThreadFactory {

    public static final ThreadFactory f156e = Executors.defaultThreadFactory();

    public final AtomicLong f157a = new AtomicLong();

    public final String f158b;

    public final int f159c;
    public final StrictMode.ThreadPolicy d;

    public a(String str, int i10, StrictMode.ThreadPolicy threadPolicy) {
        this.f158b = str;
        this.f159c = i10;
        this.d = threadPolicy;
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread threadNewThread = f156e.newThread(new a1.e(2, this, runnable));
        Locale locale = Locale.ROOT;
        threadNewThread.setName(this.f158b + " Thread #" + this.f157a.getAndIncrement());
        return threadNewThread;
    }
}
