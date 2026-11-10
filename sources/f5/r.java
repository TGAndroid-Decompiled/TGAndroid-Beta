package f5;

import java.io.Serializable;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
public final class r implements ThreadFactory {
    public final int f11186a;
    public final ThreadFactory f11187b;
    public final Serializable f11188c;

    public r(b bVar) {
        this.f11186a = 0;
        this.f11187b = Executors.defaultThreadFactory();
        this.f11188c = new AtomicInteger(1);
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        switch (this.f11186a) {
            case 0:
                Thread newThread = this.f11187b.newThread(runnable);
                int andIncrement = ((AtomicInteger) this.f11188c).getAndIncrement();
                newThread.setName("PlayBillingLibrary-" + andIncrement);
                return newThread;
            default:
                Thread newThread2 = this.f11187b.newThread(new o5.o(2, runnable));
                newThread2.setName((String) this.f11188c);
                return newThread2;
        }
    }

    public r(String str) {
        this.f11186a = 1;
        this.f11187b = Executors.defaultThreadFactory();
        this.f11188c = str;
    }
}
