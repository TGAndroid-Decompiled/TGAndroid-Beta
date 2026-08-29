package g9;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
public final class w implements ThreadFactory {
    public final int f7227a;
    public final Object f7228b;
    public final Object f7229c;

    public w(String str) {
        this.f7227a = 1;
        this.f7229c = Executors.defaultThreadFactory();
        this.f7228b = str;
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        switch (this.f7227a) {
            case 0:
                Thread newThread = Executors.defaultThreadFactory().newThread(new v(runnable));
                newThread.setName(((String) this.f7228b) + ((AtomicLong) this.f7229c).getAndIncrement());
                return newThread;
            case 1:
                Thread newThread2 = ((ThreadFactory) this.f7229c).newThread(new b9.k(1, runnable));
                newThread2.setName((String) this.f7228b);
                return newThread2;
            default:
                Thread newThread3 = ((ThreadFactory) this.f7228b).newThread(runnable);
                int andIncrement = ((AtomicInteger) this.f7229c).getAndIncrement();
                newThread3.setName("PlayBillingLibrary-" + andIncrement);
                return newThread3;
        }
    }

    public w(p2.b bVar) {
        this.f7227a = 2;
        this.f7228b = Executors.defaultThreadFactory();
        this.f7229c = new AtomicInteger(1);
    }

    public w(String str, AtomicLong atomicLong) {
        this.f7227a = 0;
        this.f7228b = str;
        this.f7229c = atomicLong;
    }
}
