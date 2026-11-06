package aa;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
public final class z implements ThreadFactory {
    public final int f887a;
    public final Number f888b;

    public z() {
        this.f887a = 1;
        this.f888b = new AtomicInteger(0);
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        switch (this.f887a) {
            case 0:
                Thread newThread = Executors.defaultThreadFactory().newThread(new y(runnable));
                newThread.setName("awaitEvenIfOnMainThread task continuation executor" + ((AtomicLong) this.f888b).getAndIncrement());
                return newThread;
            default:
                Thread thread = new Thread(runnable);
                thread.setName("arch_disk_io_" + ((AtomicInteger) this.f888b).getAndIncrement());
                return thread;
        }
    }

    public z(AtomicLong atomicLong) {
        this.f887a = 0;
        this.f888b = atomicLong;
    }
}
