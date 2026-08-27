package f9;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;

public final class v implements ThreadFactory {

    public final int f6002a;

    public final Object f6003b;

    public final Object f6004c;

    public v(String str) {
        this.f6002a = 1;
        this.f6004c = Executors.defaultThreadFactory();
        this.f6003b = str;
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        switch (this.f6002a) {
            case 0:
                Thread threadNewThread = Executors.defaultThreadFactory().newThread(new u(runnable));
                threadNewThread.setName(((String) this.f6003b) + ((AtomicLong) this.f6004c).getAndIncrement());
                return threadNewThread;
            case 1:
                Thread threadNewThread2 = ((ThreadFactory) this.f6004c).newThread(new a9.n(1, runnable));
                threadNewThread2.setName((String) this.f6003b);
                return threadNewThread2;
            default:
                AtomicInteger atomicInteger = (AtomicInteger) this.f6004c;
                Thread threadNewThread3 = ((ThreadFactory) this.f6003b).newThread(runnable);
                threadNewThread3.setName("PlayBillingLibrary-" + atomicInteger.getAndIncrement());
                return threadNewThread3;
        }
    }

    public v(n2.b bVar) {
        this.f6002a = 2;
        this.f6003b = Executors.defaultThreadFactory();
        this.f6004c = new AtomicInteger(1);
    }

    public v(String str, AtomicLong atomicLong) {
        this.f6002a = 0;
        this.f6003b = str;
        this.f6004c = atomicLong;
    }
}
