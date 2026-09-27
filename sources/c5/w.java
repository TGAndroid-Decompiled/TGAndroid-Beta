package c5;

import java.io.Serializable;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
public final class w implements ThreadFactory {
    public final int f3928a;
    public final Object f3929b;
    public final Serializable f3930c;

    public w(c cVar) {
        this.f3928a = 0;
        this.f3929b = Executors.defaultThreadFactory();
        this.f3930c = new AtomicInteger(1);
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        switch (this.f3928a) {
            case 0:
                Thread newThread = ((ThreadFactory) this.f3929b).newThread(runnable);
                int andIncrement = ((AtomicInteger) this.f3930c).getAndIncrement();
                newThread.setName("PlayBillingLibrary-" + andIncrement);
                return newThread;
            case 1:
                Thread newThread2 = ((ThreadFactory) this.f3929b).newThread(new l5.o(2, runnable));
                newThread2.setName((String) this.f3930c);
                return newThread2;
            default:
                Thread newThread3 = Executors.defaultThreadFactory().newThread(new w9.t(runnable));
                newThread3.setName(((String) this.f3929b) + ((AtomicLong) this.f3930c).getAndIncrement());
                return newThread3;
        }
    }

    public w(String str) {
        this.f3928a = 1;
        this.f3929b = Executors.defaultThreadFactory();
        this.f3930c = str;
    }

    public w(String str, AtomicLong atomicLong) {
        this.f3928a = 2;
        this.f3929b = str;
        this.f3930c = atomicLong;
    }
}
