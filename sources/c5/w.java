package c5;

import java.io.Serializable;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
public final class w implements ThreadFactory {
    public final int f4467a;
    public final Object f4468b;
    public final Serializable f4469c;

    public w(c cVar) {
        this.f4467a = 0;
        this.f4468b = Executors.defaultThreadFactory();
        this.f4469c = new AtomicInteger(1);
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        switch (this.f4467a) {
            case 0:
                Thread newThread = ((ThreadFactory) this.f4468b).newThread(runnable);
                int andIncrement = ((AtomicInteger) this.f4469c).getAndIncrement();
                newThread.setName("PlayBillingLibrary-" + andIncrement);
                return newThread;
            case 1:
                Thread newThread2 = ((ThreadFactory) this.f4468b).newThread(new l5.o(2, runnable));
                newThread2.setName((String) this.f4469c);
                return newThread2;
            default:
                Thread newThread3 = Executors.defaultThreadFactory().newThread(new w9.s(runnable));
                newThread3.setName(((String) this.f4468b) + ((AtomicLong) this.f4469c).getAndIncrement());
                return newThread3;
        }
    }

    public w(String str) {
        this.f4467a = 1;
        this.f4468b = Executors.defaultThreadFactory();
        this.f4469c = str;
    }

    public w(String str, AtomicLong atomicLong) {
        this.f4467a = 2;
        this.f4468b = str;
        this.f4469c = atomicLong;
    }
}
