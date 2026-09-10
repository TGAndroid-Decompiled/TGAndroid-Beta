package c5;

import java.io.Serializable;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
public final class w implements ThreadFactory {
    public final int f4348a;
    public final Object f4349b;
    public final Serializable f4350c;

    public w(c cVar) {
        this.f4348a = 0;
        this.f4349b = Executors.defaultThreadFactory();
        this.f4350c = new AtomicInteger(1);
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        switch (this.f4348a) {
            case 0:
                Thread newThread = ((ThreadFactory) this.f4349b).newThread(runnable);
                int andIncrement = ((AtomicInteger) this.f4350c).getAndIncrement();
                newThread.setName("PlayBillingLibrary-" + andIncrement);
                return newThread;
            case 1:
                Thread newThread2 = ((ThreadFactory) this.f4349b).newThread(new l5.o(2, runnable));
                newThread2.setName((String) this.f4350c);
                return newThread2;
            default:
                Thread newThread3 = Executors.defaultThreadFactory().newThread(new w9.s(runnable));
                newThread3.setName(((String) this.f4349b) + ((AtomicLong) this.f4350c).getAndIncrement());
                return newThread3;
        }
    }

    public w(String str) {
        this.f4348a = 1;
        this.f4349b = Executors.defaultThreadFactory();
        this.f4350c = str;
    }

    public w(String str, AtomicLong atomicLong) {
        this.f4348a = 2;
        this.f4349b = str;
        this.f4350c = atomicLong;
    }
}
