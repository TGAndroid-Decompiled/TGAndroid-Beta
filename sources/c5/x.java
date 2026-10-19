package c5;

import java.io.Serializable;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
public final class x implements ThreadFactory {
    public final int f4794a;
    public final Object f4795b;
    public final Serializable f4796c;

    public x(c cVar) {
        this.f4794a = 0;
        this.f4795b = Executors.defaultThreadFactory();
        this.f4796c = new AtomicInteger(1);
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        switch (this.f4794a) {
            case 0:
                Thread newThread = ((ThreadFactory) this.f4795b).newThread(runnable);
                int andIncrement = ((AtomicInteger) this.f4796c).getAndIncrement();
                newThread.setName("PlayBillingLibrary-" + andIncrement);
                return newThread;
            case 1:
                Thread newThread2 = ((ThreadFactory) this.f4795b).newThread(new l5.p(2, runnable));
                newThread2.setName((String) this.f4796c);
                return newThread2;
            default:
                Thread newThread3 = Executors.defaultThreadFactory().newThread(new x9.s(runnable));
                newThread3.setName(((String) this.f4795b) + ((AtomicLong) this.f4796c).getAndIncrement());
                return newThread3;
        }
    }

    public x(String str) {
        this.f4794a = 1;
        this.f4795b = Executors.defaultThreadFactory();
        this.f4796c = str;
    }

    public x(String str, AtomicLong atomicLong) {
        this.f4794a = 2;
        this.f4795b = str;
        this.f4796c = atomicLong;
    }
}
