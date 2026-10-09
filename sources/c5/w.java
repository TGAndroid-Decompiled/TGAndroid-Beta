package c5;

import java.io.Serializable;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
public final class w implements ThreadFactory {
    public final int f4297a;
    public final Object f4298b;
    public final Serializable f4299c;

    public w(c cVar) {
        this.f4297a = 0;
        this.f4298b = Executors.defaultThreadFactory();
        this.f4299c = new AtomicInteger(1);
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        switch (this.f4297a) {
            case 0:
                Thread newThread = ((ThreadFactory) this.f4298b).newThread(runnable);
                int andIncrement = ((AtomicInteger) this.f4299c).getAndIncrement();
                newThread.setName("PlayBillingLibrary-" + andIncrement);
                return newThread;
            case 1:
                Thread newThread2 = ((ThreadFactory) this.f4298b).newThread(new l5.o(2, runnable));
                newThread2.setName((String) this.f4299c);
                return newThread2;
            default:
                Thread newThread3 = Executors.defaultThreadFactory().newThread(new w9.s(runnable));
                newThread3.setName(((String) this.f4298b) + ((AtomicLong) this.f4299c).getAndIncrement());
                return newThread3;
        }
    }

    public w(String str) {
        this.f4297a = 1;
        this.f4298b = Executors.defaultThreadFactory();
        this.f4299c = str;
    }

    public w(String str, AtomicLong atomicLong) {
        this.f4297a = 2;
        this.f4298b = str;
        this.f4299c = atomicLong;
    }
}
