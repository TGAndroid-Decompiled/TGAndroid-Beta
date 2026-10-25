package d5;

import java.io.Serializable;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
public final class v implements ThreadFactory {
    public final int f8015a;
    public final Object f8016b;
    public final Serializable f8017c;

    public v(c cVar) {
        this.f8015a = 0;
        this.f8016b = Executors.defaultThreadFactory();
        this.f8017c = new AtomicInteger(1);
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        switch (this.f8015a) {
            case 0:
                Thread newThread = ((ThreadFactory) this.f8016b).newThread(runnable);
                int andIncrement = ((AtomicInteger) this.f8017c).getAndIncrement();
                newThread.setName("PlayBillingLibrary-" + andIncrement);
                return newThread;
            case 1:
                Thread newThread2 = ((ThreadFactory) this.f8016b).newThread(new m5.p(2, runnable));
                newThread2.setName((String) this.f8017c);
                return newThread2;
            default:
                Thread newThread3 = Executors.defaultThreadFactory().newThread(new y9.t(runnable));
                newThread3.setName(((String) this.f8016b) + ((AtomicLong) this.f8017c).getAndIncrement());
                return newThread3;
        }
    }

    public v(String str) {
        this.f8015a = 1;
        this.f8016b = Executors.defaultThreadFactory();
        this.f8017c = str;
    }

    public v(String str, AtomicLong atomicLong) {
        this.f8015a = 2;
        this.f8016b = str;
        this.f8017c = atomicLong;
    }
}
