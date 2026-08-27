package ne;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import org.telegram.messenger.FileLog;

public final class a extends ThreadPoolExecutor implements AutoCloseable {

    public final c f18516a;

    public a(c cVar, PriorityBlockingQueue priorityBlockingQueue) {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        this.f18516a = cVar;
        super(1, 1, 60L, timeUnit, priorityBlockingQueue);
    }

    @Override
    public final void beforeExecute(Thread thread, Runnable runnable) {
        CountDownLatch countDownLatch = this.f18516a.f18520b;
        if (countDownLatch != null) {
            try {
                countDownLatch.await();
            } catch (InterruptedException e9) {
                FileLog.e(e9);
            }
        }
    }

    @Override
    public final void close() {
        a9.b.h(this);
    }
}
