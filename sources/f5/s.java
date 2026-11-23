package f5;

import java.io.Serializable;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
public final class s implements ThreadFactory {
    public final int f11308a;
    public final ThreadFactory f11309b;
    public final Serializable f11310c;

    public s(b bVar) {
        this.f11308a = 0;
        this.f11309b = Executors.defaultThreadFactory();
        this.f11310c = new AtomicInteger(1);
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        switch (this.f11308a) {
            case 0:
                Thread newThread = this.f11309b.newThread(runnable);
                int andIncrement = ((AtomicInteger) this.f11310c).getAndIncrement();
                newThread.setName("PlayBillingLibrary-" + andIncrement);
                return newThread;
            default:
                Thread newThread2 = this.f11309b.newThread(new o5.p(2, runnable));
                newThread2.setName((String) this.f11310c);
                return newThread2;
        }
    }

    public s(String str) {
        this.f11308a = 1;
        this.f11309b = Executors.defaultThreadFactory();
        this.f11310c = str;
    }
}
