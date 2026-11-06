package f5;

import java.io.Serializable;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
public final class r implements ThreadFactory {
    public final int f11181a;
    public final ThreadFactory f11182b;
    public final Serializable f11183c;

    public r(b bVar) {
        this.f11181a = 0;
        this.f11182b = Executors.defaultThreadFactory();
        this.f11183c = new AtomicInteger(1);
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        switch (this.f11181a) {
            case 0:
                Thread newThread = this.f11182b.newThread(runnable);
                int andIncrement = ((AtomicInteger) this.f11183c).getAndIncrement();
                newThread.setName("PlayBillingLibrary-" + andIncrement);
                return newThread;
            default:
                Thread newThread2 = this.f11182b.newThread(new o5.o(2, runnable));
                newThread2.setName((String) this.f11183c);
                return newThread2;
        }
    }

    public r(String str) {
        this.f11181a = 1;
        this.f11182b = Executors.defaultThreadFactory();
        this.f11183c = str;
    }
}
