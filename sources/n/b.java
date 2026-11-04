package n;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import z9.t;
public final class b implements ThreadFactory {
    public final int f20101a;
    public final Number f20102b;

    public b() {
        this.f20101a = 0;
        this.f20102b = new AtomicInteger(0);
    }

    @Override
    public final Thread newThread(Runnable runnable) {
        switch (this.f20101a) {
            case 0:
                Thread thread = new Thread(runnable);
                thread.setName("arch_disk_io_" + ((AtomicInteger) this.f20102b).getAndIncrement());
                return thread;
            default:
                Thread newThread = Executors.defaultThreadFactory().newThread(new t(runnable));
                newThread.setName("awaitEvenIfOnMainThread task continuation executor" + ((AtomicLong) this.f20102b).getAndIncrement());
                return newThread;
        }
    }

    public b(AtomicLong atomicLong) {
        this.f20101a = 1;
        this.f20102b = atomicLong;
    }
}
