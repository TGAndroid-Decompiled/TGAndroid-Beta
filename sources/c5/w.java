package c5;

import java.io.Serializable;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
public final class w implements ThreadFactory {
    public final int f4247a;
    public final Object f4248b;
    public final Serializable f4249c;

    public w(c cVar) {
        this.f4247a = 0;
        this.f4248b = Executors.defaultThreadFactory();
        this.f4249c = new AtomicInteger(1);
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        switch (this.f4247a) {
            case 0:
                Thread newThread = ((ThreadFactory) this.f4248b).newThread(runnable);
                int andIncrement = ((AtomicInteger) this.f4249c).getAndIncrement();
                newThread.setName("PlayBillingLibrary-" + andIncrement);
                return newThread;
            case 1:
                Thread newThread2 = ((ThreadFactory) this.f4248b).newThread(new l5.p(2, runnable));
                newThread2.setName((String) this.f4249c);
                return newThread2;
            default:
                Thread newThread3 = Executors.defaultThreadFactory().newThread(new w9.t(runnable));
                newThread3.setName(((String) this.f4248b) + ((AtomicLong) this.f4249c).getAndIncrement());
                return newThread3;
        }
    }

    public w(String str) {
        this.f4247a = 1;
        this.f4248b = Executors.defaultThreadFactory();
        this.f4249c = str;
    }

    public w(String str, AtomicLong atomicLong) {
        this.f4247a = 2;
        this.f4248b = str;
        this.f4249c = atomicLong;
    }
}
