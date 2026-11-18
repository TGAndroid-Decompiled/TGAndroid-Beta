package aa;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
public final class y implements ThreadFactory {
    public final int f883a;
    public final Number f884b;

    public y() {
        this.f883a = 1;
        this.f884b = new AtomicInteger(0);
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        switch (this.f883a) {
            case 0:
                Thread newThread = Executors.defaultThreadFactory().newThread(new x(runnable));
                newThread.setName("awaitEvenIfOnMainThread task continuation executor" + ((AtomicLong) this.f884b).getAndIncrement());
                return newThread;
            default:
                Thread thread = new Thread(runnable);
                thread.setName("arch_disk_io_" + ((AtomicInteger) this.f884b).getAndIncrement());
                return thread;
        }
    }

    public y(AtomicLong atomicLong) {
        this.f883a = 0;
        this.f884b = atomicLong;
    }
}
