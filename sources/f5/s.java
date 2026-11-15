package f5;

import java.io.Serializable;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
public final class s implements ThreadFactory {
    public final int f11009a;
    public final ThreadFactory f11010b;
    public final Serializable f11011c;

    public s(b bVar) {
        this.f11009a = 0;
        this.f11010b = Executors.defaultThreadFactory();
        this.f11011c = new AtomicInteger(1);
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        switch (this.f11009a) {
            case 0:
                Thread newThread = this.f11010b.newThread(runnable);
                int andIncrement = ((AtomicInteger) this.f11011c).getAndIncrement();
                newThread.setName("PlayBillingLibrary-" + andIncrement);
                return newThread;
            default:
                Thread newThread2 = this.f11010b.newThread(new o5.p(2, runnable));
                newThread2.setName((String) this.f11011c);
                return newThread2;
        }
    }

    public s(String str) {
        this.f11009a = 1;
        this.f11010b = Executors.defaultThreadFactory();
        this.f11011c = str;
    }
}
