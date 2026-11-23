package f5;

import java.io.Serializable;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
public final class s implements ThreadFactory {
    public final int f11309a;
    public final ThreadFactory f11310b;
    public final Serializable f11311c;

    public s(b bVar) {
        this.f11309a = 0;
        this.f11310b = Executors.defaultThreadFactory();
        this.f11311c = new AtomicInteger(1);
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        switch (this.f11309a) {
            case 0:
                Thread newThread = this.f11310b.newThread(runnable);
                int andIncrement = ((AtomicInteger) this.f11311c).getAndIncrement();
                newThread.setName("PlayBillingLibrary-" + andIncrement);
                return newThread;
            default:
                Thread newThread2 = this.f11310b.newThread(new o5.o(2, runnable));
                newThread2.setName((String) this.f11311c);
                return newThread2;
        }
    }

    public s(String str) {
        this.f11309a = 1;
        this.f11310b = Executors.defaultThreadFactory();
        this.f11311c = str;
    }
}
