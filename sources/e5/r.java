package e5;

import java.io.Serializable;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
public final class r implements ThreadFactory {
    public final int f9624a;
    public final ThreadFactory f9625b;
    public final Serializable f9626c;

    public r(b bVar) {
        this.f9624a = 0;
        this.f9625b = Executors.defaultThreadFactory();
        this.f9626c = new AtomicInteger(1);
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        switch (this.f9624a) {
            case 0:
                Thread newThread = this.f9625b.newThread(runnable);
                int andIncrement = ((AtomicInteger) this.f9626c).getAndIncrement();
                newThread.setName("PlayBillingLibrary-" + andIncrement);
                return newThread;
            default:
                Thread newThread2 = this.f9625b.newThread(new n5.o(2, runnable));
                newThread2.setName((String) this.f9626c);
                return newThread2;
        }
    }

    public r(String str) {
        this.f9624a = 1;
        this.f9625b = Executors.defaultThreadFactory();
        this.f9626c = str;
    }
}
