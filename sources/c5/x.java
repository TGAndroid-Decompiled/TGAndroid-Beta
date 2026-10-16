package c5;

import java.io.Serializable;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
public final class x implements ThreadFactory {
    public final int f4424a;
    public final Object f4425b;
    public final Serializable f4426c;

    public x(c cVar) {
        this.f4424a = 0;
        this.f4425b = Executors.defaultThreadFactory();
        this.f4426c = new AtomicInteger(1);
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        switch (this.f4424a) {
            case 0:
                Thread newThread = ((ThreadFactory) this.f4425b).newThread(runnable);
                int andIncrement = ((AtomicInteger) this.f4426c).getAndIncrement();
                newThread.setName("PlayBillingLibrary-" + andIncrement);
                return newThread;
            case 1:
                Thread newThread2 = ((ThreadFactory) this.f4425b).newThread(new l5.o(2, runnable));
                newThread2.setName((String) this.f4426c);
                return newThread2;
            default:
                Thread newThread3 = Executors.defaultThreadFactory().newThread(new x9.t(runnable));
                newThread3.setName(((String) this.f4425b) + ((AtomicLong) this.f4426c).getAndIncrement());
                return newThread3;
        }
    }

    public x(String str) {
        this.f4424a = 1;
        this.f4425b = Executors.defaultThreadFactory();
        this.f4426c = str;
    }

    public x(String str, AtomicLong atomicLong) {
        this.f4424a = 2;
        this.f4425b = str;
        this.f4426c = atomicLong;
    }
}
