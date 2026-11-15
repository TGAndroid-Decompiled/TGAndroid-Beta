package aa;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
public final class y implements ThreadFactory {
    public final int f884a;
    public final Number f885b;

    public y() {
        this.f884a = 1;
        this.f885b = new AtomicInteger(0);
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        switch (this.f884a) {
            case 0:
                Thread newThread = Executors.defaultThreadFactory().newThread(new x(runnable));
                newThread.setName("awaitEvenIfOnMainThread task continuation executor" + ((AtomicLong) this.f885b).getAndIncrement());
                return newThread;
            default:
                Thread thread = new Thread(runnable);
                thread.setName("arch_disk_io_" + ((AtomicInteger) this.f885b).getAndIncrement());
                return thread;
        }
    }

    public y(AtomicLong atomicLong) {
        this.f884a = 0;
        this.f885b = atomicLong;
    }
}
