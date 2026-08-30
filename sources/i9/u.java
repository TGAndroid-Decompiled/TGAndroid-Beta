package i9;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
public final class u implements ThreadFactory {
    public final int f7442a;
    public final Object f7443b;
    public final Object f7444c;

    public u(String str) {
        this.f7442a = 1;
        this.f7444c = Executors.defaultThreadFactory();
        this.f7443b = str;
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        switch (this.f7442a) {
            case 0:
                Thread newThread = Executors.defaultThreadFactory().newThread(new t(runnable));
                newThread.setName(((String) this.f7443b) + ((AtomicLong) this.f7444c).getAndIncrement());
                return newThread;
            case 1:
                Thread newThread2 = ((ThreadFactory) this.f7444c).newThread(new d9.j(1, runnable));
                newThread2.setName((String) this.f7443b);
                return newThread2;
            default:
                Thread newThread3 = ((ThreadFactory) this.f7443b).newThread(runnable);
                int andIncrement = ((AtomicInteger) this.f7444c).getAndIncrement();
                newThread3.setName("PlayBillingLibrary-" + andIncrement);
                return newThread3;
        }
    }

    public u(p2.b bVar) {
        this.f7442a = 2;
        this.f7443b = Executors.defaultThreadFactory();
        this.f7444c = new AtomicInteger(1);
    }

    public u(String str, AtomicLong atomicLong) {
        this.f7442a = 0;
        this.f7443b = str;
        this.f7444c = atomicLong;
    }
}
