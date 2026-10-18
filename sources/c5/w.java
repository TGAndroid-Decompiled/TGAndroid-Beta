package c5;

import java.io.Serializable;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
public final class w implements ThreadFactory {
    public final int f4793a;
    public final Object f4794b;
    public final Serializable f4795c;

    public w(c cVar) {
        this.f4793a = 0;
        this.f4794b = Executors.defaultThreadFactory();
        this.f4795c = new AtomicInteger(1);
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        switch (this.f4793a) {
            case 0:
                Thread newThread = ((ThreadFactory) this.f4794b).newThread(runnable);
                int andIncrement = ((AtomicInteger) this.f4795c).getAndIncrement();
                newThread.setName("PlayBillingLibrary-" + andIncrement);
                return newThread;
            case 1:
                Thread newThread2 = ((ThreadFactory) this.f4794b).newThread(new l5.p(2, runnable));
                newThread2.setName((String) this.f4795c);
                return newThread2;
            default:
                Thread newThread3 = Executors.defaultThreadFactory().newThread(new x9.s(runnable));
                newThread3.setName(((String) this.f4794b) + ((AtomicLong) this.f4795c).getAndIncrement());
                return newThread3;
        }
    }

    public w(String str) {
        this.f4793a = 1;
        this.f4794b = Executors.defaultThreadFactory();
        this.f4795c = str;
    }

    public w(String str, AtomicLong atomicLong) {
        this.f4793a = 2;
        this.f4794b = str;
        this.f4795c = atomicLong;
    }
}
