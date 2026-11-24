package defpackage;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
public final class pp3 extends ThreadPoolExecutor implements AutoCloseable {
    public final ix2 a;

    public pp3(ix2 ix2Var, PriorityBlockingQueue priorityBlockingQueue) {
        super(1, 1, 60L, TimeUnit.SECONDS, priorityBlockingQueue);
        this.a = ix2Var;
    }

    @Override
    public final void beforeExecute(Thread thread, Runnable runnable) {
        CountDownLatch countDownLatch = (CountDownLatch) this.a.c;
        if (countDownLatch != null) {
            try {
                countDownLatch.await();
            } catch (InterruptedException e) {
                fc4.g(e, true);
            }
        }
    }

    @Override
    public final void close() {
        z2.d(this);
    }
}
