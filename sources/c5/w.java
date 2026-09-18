package c5;

import java.io.Serializable;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
public final class w implements ThreadFactory {
    public final int f3934a;
    public final Object f3935b;
    public final Serializable f3936c;

    public w(c cVar) {
        this.f3934a = 0;
        this.f3935b = Executors.defaultThreadFactory();
        this.f3936c = new AtomicInteger(1);
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        switch (this.f3934a) {
            case 0:
                Thread newThread = ((ThreadFactory) this.f3935b).newThread(runnable);
                int andIncrement = ((AtomicInteger) this.f3936c).getAndIncrement();
                newThread.setName("PlayBillingLibrary-" + andIncrement);
                return newThread;
            case 1:
                Thread newThread2 = ((ThreadFactory) this.f3935b).newThread(new l5.o(2, runnable));
                newThread2.setName((String) this.f3936c);
                return newThread2;
            default:
                Thread newThread3 = Executors.defaultThreadFactory().newThread(new w9.s(runnable));
                newThread3.setName(((String) this.f3935b) + ((AtomicLong) this.f3936c).getAndIncrement());
                return newThread3;
        }
    }

    public w(String str) {
        this.f3934a = 1;
        this.f3935b = Executors.defaultThreadFactory();
        this.f3936c = str;
    }

    public w(String str, AtomicLong atomicLong) {
        this.f3934a = 2;
        this.f3935b = str;
        this.f3936c = atomicLong;
    }
}
