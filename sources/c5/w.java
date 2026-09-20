package c5;

import java.io.Serializable;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
public final class w implements ThreadFactory {
    public final int f3935a;
    public final Object f3936b;
    public final Serializable f3937c;

    public w(c cVar) {
        this.f3935a = 0;
        this.f3936b = Executors.defaultThreadFactory();
        this.f3937c = new AtomicInteger(1);
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        switch (this.f3935a) {
            case 0:
                Thread newThread = ((ThreadFactory) this.f3936b).newThread(runnable);
                int andIncrement = ((AtomicInteger) this.f3937c).getAndIncrement();
                newThread.setName("PlayBillingLibrary-" + andIncrement);
                return newThread;
            case 1:
                Thread newThread2 = ((ThreadFactory) this.f3936b).newThread(new l5.o(2, runnable));
                newThread2.setName((String) this.f3937c);
                return newThread2;
            default:
                Thread newThread3 = Executors.defaultThreadFactory().newThread(new w9.s(runnable));
                newThread3.setName(((String) this.f3936b) + ((AtomicLong) this.f3937c).getAndIncrement());
                return newThread3;
        }
    }

    public w(String str) {
        this.f3935a = 1;
        this.f3936b = Executors.defaultThreadFactory();
        this.f3937c = str;
    }

    public w(String str, AtomicLong atomicLong) {
        this.f3935a = 2;
        this.f3936b = str;
        this.f3937c = atomicLong;
    }
}
