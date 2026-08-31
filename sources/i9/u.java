package i9;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
public final class u implements ThreadFactory {
    public final int f8012a;
    public final Object f8013b;
    public final Object f8014c;

    public u(String str) {
        this.f8012a = 1;
        this.f8014c = Executors.defaultThreadFactory();
        this.f8013b = str;
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        switch (this.f8012a) {
            case 0:
                Thread newThread = Executors.defaultThreadFactory().newThread(new t(runnable));
                newThread.setName(((String) this.f8013b) + ((AtomicLong) this.f8014c).getAndIncrement());
                return newThread;
            case 1:
                Thread newThread2 = ((ThreadFactory) this.f8014c).newThread(new d9.j(1, runnable));
                newThread2.setName((String) this.f8013b);
                return newThread2;
            default:
                Thread newThread3 = ((ThreadFactory) this.f8013b).newThread(runnable);
                int andIncrement = ((AtomicInteger) this.f8014c).getAndIncrement();
                newThread3.setName("PlayBillingLibrary-" + andIncrement);
                return newThread3;
        }
    }

    public u(p2.b bVar) {
        this.f8012a = 2;
        this.f8013b = Executors.defaultThreadFactory();
        this.f8014c = new AtomicInteger(1);
    }

    public u(String str, AtomicLong atomicLong) {
        this.f8012a = 0;
        this.f8013b = str;
        this.f8014c = atomicLong;
    }
}
