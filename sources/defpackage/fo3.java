package defpackage;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
public final class fo3 extends ThreadPoolExecutor implements AutoCloseable {
    public final yv2 a;

    public fo3(yv2 yv2Var, PriorityBlockingQueue priorityBlockingQueue) {
        super(1, 1, 60L, TimeUnit.SECONDS, priorityBlockingQueue);
        this.a = yv2Var;
    }

    @Override
    public final void beforeExecute(Thread thread, Runnable runnable) {
        CountDownLatch countDownLatch = (CountDownLatch) this.a.c;
        if (countDownLatch != null) {
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                fa4.g(e, true);
            }
        }
    }

    @Override
    public final void close() {
        z2.d(this);
    }
}
