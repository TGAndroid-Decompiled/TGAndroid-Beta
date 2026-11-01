package n;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
public final class b implements ThreadFactory {
    public final AtomicInteger f13396a = new AtomicInteger(0);

    @Override
    public final Thread newThread(Runnable runnable) {
        Thread thread = new Thread(runnable);
        thread.setName("arch_disk_io_" + this.f13396a.getAndIncrement());
        return thread;
    }
}
