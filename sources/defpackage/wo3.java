package defpackage;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
public final class wo3 extends ThreadPoolExecutor implements AutoCloseable {
    public final sw2 a;

    public wo3(sw2 sw2Var, PriorityBlockingQueue priorityBlockingQueue) {
        super(1, 1, 60L, TimeUnit.SECONDS, priorityBlockingQueue);
        this.a = sw2Var;
    }

    @Override
    public final void beforeExecute(Thread thread, Runnable runnable) {
        CountDownLatch countDownLatch = (CountDownLatch) this.a.c;
        if (countDownLatch != null) {
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                cc4.g(e, true);
            }
        }
    }

    @Override
    public final void close() {
        a3.d(this);
    }
}
