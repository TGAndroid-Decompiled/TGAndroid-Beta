package c5;

import java.io.Serializable;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
public final class x implements ThreadFactory {
    public final int f4792a;
    public final Object f4793b;
    public final Serializable f4794c;

    public x(c cVar) {
        this.f4792a = 0;
        this.f4793b = Executors.defaultThreadFactory();
        this.f4794c = new AtomicInteger(1);
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        switch (this.f4792a) {
            case 0:
                Thread newThread = ((ThreadFactory) this.f4793b).newThread(runnable);
                int andIncrement = ((AtomicInteger) this.f4794c).getAndIncrement();
                newThread.setName("PlayBillingLibrary-" + andIncrement);
                return newThread;
            case 1:
                Thread newThread2 = ((ThreadFactory) this.f4793b).newThread(new l5.p(2, runnable));
                newThread2.setName((String) this.f4794c);
                return newThread2;
            default:
                Thread newThread3 = Executors.defaultThreadFactory().newThread(new x9.s(runnable));
                newThread3.setName(((String) this.f4793b) + ((AtomicLong) this.f4794c).getAndIncrement());
                return newThread3;
        }
    }

    public x(String str) {
        this.f4792a = 1;
        this.f4793b = Executors.defaultThreadFactory();
        this.f4794c = str;
    }

    public x(String str, AtomicLong atomicLong) {
        this.f4792a = 2;
        this.f4793b = str;
        this.f4794c = atomicLong;
    }
}
