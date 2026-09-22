package c5;

import java.io.Serializable;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
public final class w implements ThreadFactory {
    public final int f3931a;
    public final Object f3932b;
    public final Serializable f3933c;

    public w(c cVar) {
        this.f3931a = 0;
        this.f3932b = Executors.defaultThreadFactory();
        this.f3933c = new AtomicInteger(1);
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        switch (this.f3931a) {
            case 0:
                Thread newThread = ((ThreadFactory) this.f3932b).newThread(runnable);
                int andIncrement = ((AtomicInteger) this.f3933c).getAndIncrement();
                newThread.setName("PlayBillingLibrary-" + andIncrement);
                return newThread;
            case 1:
                Thread newThread2 = ((ThreadFactory) this.f3932b).newThread(new l5.p(2, runnable));
                newThread2.setName((String) this.f3933c);
                return newThread2;
            default:
                Thread newThread3 = Executors.defaultThreadFactory().newThread(new w9.s(runnable));
                newThread3.setName(((String) this.f3932b) + ((AtomicLong) this.f3933c).getAndIncrement());
                return newThread3;
        }
    }

    public w(String str) {
        this.f3931a = 1;
        this.f3932b = Executors.defaultThreadFactory();
        this.f3933c = str;
    }

    public w(String str, AtomicLong atomicLong) {
        this.f3931a = 2;
        this.f3932b = str;
        this.f3933c = atomicLong;
    }
}
