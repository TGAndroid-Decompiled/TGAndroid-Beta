package defpackage;

import java.util.Collection;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
public final class lg7 implements ExecutorService, AutoCloseable {
    public static final ThreadLocal b = new ThreadLocal();
    public final ThreadPoolExecutor a;

    public lg7() {
        ThreadFactory defaultThreadFactory = Executors.defaultThreadFactory();
        int availableProcessors = Runtime.getRuntime().availableProcessors();
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(availableProcessors, availableProcessors, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new wc3(defaultThreadFactory, (byte) 2));
        this.a = threadPoolExecutor;
        threadPoolExecutor.allowCoreThreadTimeOut(true);
    }

    @Override
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.a.awaitTermination(j, timeUnit);
    }

    @Override
    public final void close() {
        a3.e(this);
    }

    @Override
    public final void execute(Runnable runnable) {
        Deque deque = (Deque) b.get();
        if (deque != null && deque.size() <= 1) {
            deque.add(runnable);
            if (deque.size() <= 1) {
                do {
                    runnable.run();
                    deque.removeFirst();
                    runnable = (Runnable) deque.peekFirst();
                } while (runnable != null);
                return;
            }
            return;
        }
        this.a.execute(new ps9(runnable, (byte) 3));
    }

    @Override
    public final List invokeAll(Collection collection) {
        return this.a.invokeAll(collection);
    }

    @Override
    public final Object invokeAny(Collection collection) {
        return this.a.invokeAny(collection);
    }

    @Override
    public final boolean isShutdown() {
        return this.a.isShutdown();
    }

    @Override
    public final boolean isTerminated() {
        return this.a.isTerminated();
    }

    @Override
    public final void shutdown() {
        this.a.shutdown();
    }

    @Override
    public final List shutdownNow() {
        return this.a.shutdownNow();
    }

    @Override
    public final Future submit(Runnable runnable) {
        return this.a.submit(runnable);
    }

    public final String toString() {
        return this.a.toString();
    }

    @Override
    public final List invokeAll(Collection collection, long j, TimeUnit timeUnit) {
        return this.a.invokeAll(collection, j, timeUnit);
    }

    @Override
    public final Object invokeAny(Collection collection, long j, TimeUnit timeUnit) {
        return this.a.invokeAny(collection, j, timeUnit);
    }

    @Override
    public final Future submit(Runnable runnable, Object obj) {
        return this.a.submit(runnable, obj);
    }

    @Override
    public final Future submit(Callable callable) {
        return this.a.submit(callable);
    }
}
