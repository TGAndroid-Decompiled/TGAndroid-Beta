package c5;

import java.io.Serializable;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
public final class w implements ThreadFactory {
    public final int f4440a;
    public final Object f4441b;
    public final Serializable f4442c;

    public w(c cVar) {
        this.f4440a = 0;
        this.f4441b = Executors.defaultThreadFactory();
        this.f4442c = new AtomicInteger(1);
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        switch (this.f4440a) {
            case 0:
                Thread newThread = ((ThreadFactory) this.f4441b).newThread(runnable);
                int andIncrement = ((AtomicInteger) this.f4442c).getAndIncrement();
                newThread.setName("PlayBillingLibrary-" + andIncrement);
                return newThread;
            case 1:
                Thread newThread2 = ((ThreadFactory) this.f4441b).newThread(new l5.o(2, runnable));
                newThread2.setName((String) this.f4442c);
                return newThread2;
            default:
                Thread newThread3 = Executors.defaultThreadFactory().newThread(new w9.s(runnable));
                newThread3.setName(((String) this.f4441b) + ((AtomicLong) this.f4442c).getAndIncrement());
                return newThread3;
        }
    }

    public w(String str) {
        this.f4440a = 1;
        this.f4441b = Executors.defaultThreadFactory();
        this.f4442c = str;
    }

    public w(String str, AtomicLong atomicLong) {
        this.f4440a = 2;
        this.f4441b = str;
        this.f4442c = atomicLong;
    }
}
