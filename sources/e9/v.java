package e9;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
public final class v implements ThreadFactory {
    public final int f5070a;
    public final Object f5071b;
    public final Object f5072c;

    public v(String str) {
        this.f5070a = 1;
        this.f5072c = Executors.defaultThreadFactory();
        this.f5071b = str;
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        switch (this.f5070a) {
            case 0:
                Thread newThread = Executors.defaultThreadFactory().newThread(new u(runnable));
                newThread.setName(((String) this.f5071b) + ((AtomicLong) this.f5072c).getAndIncrement());
                return newThread;
            case 1:
                Thread newThread2 = ((ThreadFactory) this.f5072c).newThread(new f6.c(0, runnable));
                newThread2.setName((String) this.f5071b);
                return newThread2;
            default:
                Thread newThread3 = ((ThreadFactory) this.f5071b).newThread(runnable);
                int andIncrement = ((AtomicInteger) this.f5072c).getAndIncrement();
                newThread3.setName("PlayBillingLibrary-" + andIncrement);
                return newThread3;
        }
    }

    public v(n2.b bVar) {
        this.f5070a = 2;
        this.f5071b = Executors.defaultThreadFactory();
        this.f5072c = new AtomicInteger(1);
    }

    public v(String str, AtomicLong atomicLong) {
        this.f5070a = 0;
        this.f5071b = str;
        this.f5072c = atomicLong;
    }
}
