package i9;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
public final class u implements ThreadFactory {
    public final int f7424a;
    public final Object f7425b;
    public final Object f7426c;

    public u(String str) {
        this.f7424a = 1;
        this.f7426c = Executors.defaultThreadFactory();
        this.f7425b = str;
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        switch (this.f7424a) {
            case 0:
                Thread newThread = Executors.defaultThreadFactory().newThread(new t(runnable));
                newThread.setName(((String) this.f7425b) + ((AtomicLong) this.f7426c).getAndIncrement());
                return newThread;
            case 1:
                Thread newThread2 = ((ThreadFactory) this.f7426c).newThread(new d9.j(1, runnable));
                newThread2.setName((String) this.f7425b);
                return newThread2;
            default:
                Thread newThread3 = ((ThreadFactory) this.f7425b).newThread(runnable);
                int andIncrement = ((AtomicInteger) this.f7426c).getAndIncrement();
                newThread3.setName("PlayBillingLibrary-" + andIncrement);
                return newThread3;
        }
    }

    public u(p2.b bVar) {
        this.f7424a = 2;
        this.f7425b = Executors.defaultThreadFactory();
        this.f7426c = new AtomicInteger(1);
    }

    public u(String str, AtomicLong atomicLong) {
        this.f7424a = 0;
        this.f7425b = str;
        this.f7426c = atomicLong;
    }
}
