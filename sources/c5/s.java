package c5;

import java.io.Serializable;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
public final class s implements ThreadFactory {
    public final int f3813a;
    public final Object f3814b;
    public final Serializable f3815c;

    public s(b bVar) {
        this.f3813a = 0;
        this.f3814b = Executors.defaultThreadFactory();
        this.f3815c = new AtomicInteger(1);
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        switch (this.f3813a) {
            case 0:
                Thread newThread = ((ThreadFactory) this.f3814b).newThread(runnable);
                int andIncrement = ((AtomicInteger) this.f3815c).getAndIncrement();
                newThread.setName("PlayBillingLibrary-" + andIncrement);
                return newThread;
            case 1:
                Thread newThread2 = ((ThreadFactory) this.f3814b).newThread(new l5.o(2, runnable));
                newThread2.setName((String) this.f3815c);
                return newThread2;
            default:
                Thread newThread3 = Executors.defaultThreadFactory().newThread(new x9.t(runnable));
                newThread3.setName(((String) this.f3814b) + ((AtomicLong) this.f3815c).getAndIncrement());
                return newThread3;
        }
    }

    public s(String str) {
        this.f3813a = 1;
        this.f3814b = Executors.defaultThreadFactory();
        this.f3815c = str;
    }

    public s(String str, AtomicLong atomicLong) {
        this.f3813a = 2;
        this.f3814b = str;
        this.f3815c = atomicLong;
    }
}
