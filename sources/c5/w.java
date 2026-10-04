package c5;

import java.io.Serializable;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
public final class w implements ThreadFactory {
    public final int f4246a;
    public final Object f4247b;
    public final Serializable f4248c;

    public w(c cVar) {
        this.f4246a = 0;
        this.f4247b = Executors.defaultThreadFactory();
        this.f4248c = new AtomicInteger(1);
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        switch (this.f4246a) {
            case 0:
                Thread newThread = ((ThreadFactory) this.f4247b).newThread(runnable);
                int andIncrement = ((AtomicInteger) this.f4248c).getAndIncrement();
                newThread.setName("PlayBillingLibrary-" + andIncrement);
                return newThread;
            case 1:
                Thread newThread2 = ((ThreadFactory) this.f4247b).newThread(new l5.p(2, runnable));
                newThread2.setName((String) this.f4248c);
                return newThread2;
            default:
                Thread newThread3 = Executors.defaultThreadFactory().newThread(new w9.t(runnable));
                newThread3.setName(((String) this.f4247b) + ((AtomicLong) this.f4248c).getAndIncrement());
                return newThread3;
        }
    }

    public w(String str) {
        this.f4246a = 1;
        this.f4247b = Executors.defaultThreadFactory();
        this.f4248c = str;
    }

    public w(String str, AtomicLong atomicLong) {
        this.f4246a = 2;
        this.f4247b = str;
        this.f4248c = atomicLong;
    }
}
