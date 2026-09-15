package c5;

import java.io.Serializable;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
public final class w implements ThreadFactory {
    public final int f3929a;
    public final Object f3930b;
    public final Serializable f3931c;

    public w(c cVar) {
        this.f3929a = 0;
        this.f3930b = Executors.defaultThreadFactory();
        this.f3931c = new AtomicInteger(1);
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        switch (this.f3929a) {
            case 0:
                Thread newThread = ((ThreadFactory) this.f3930b).newThread(runnable);
                int andIncrement = ((AtomicInteger) this.f3931c).getAndIncrement();
                newThread.setName("PlayBillingLibrary-" + andIncrement);
                return newThread;
            case 1:
                Thread newThread2 = ((ThreadFactory) this.f3930b).newThread(new l5.p(2, runnable));
                newThread2.setName((String) this.f3931c);
                return newThread2;
            default:
                Thread newThread3 = Executors.defaultThreadFactory().newThread(new w9.s(runnable));
                newThread3.setName(((String) this.f3930b) + ((AtomicLong) this.f3931c).getAndIncrement());
                return newThread3;
        }
    }

    public w(String str) {
        this.f3929a = 1;
        this.f3930b = Executors.defaultThreadFactory();
        this.f3931c = str;
    }

    public w(String str, AtomicLong atomicLong) {
        this.f3929a = 2;
        this.f3930b = str;
        this.f3931c = atomicLong;
    }
}
