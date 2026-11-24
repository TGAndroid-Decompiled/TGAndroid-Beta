package defpackage;

import java.util.List;
import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;
import java.util.concurrent.TimeUnit;
public class ncf extends AbstractExecutorService implements AutoCloseable, ExecutorService {
    public final ExecutorService a;

    public ncf(ExecutorService executorService) {
        executorService.getClass();
        this.a = executorService;
    }

    @Override
    public final boolean awaitTermination(long j, TimeUnit timeUnit) {
        return this.a.awaitTermination(j, timeUnit);
    }

    public void close() {
        z2.i(this);
    }

    @Override
    public final void execute(Runnable runnable) {
        this.a.execute(runnable);
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
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return new edf(Executors.callable(runnable, obj));
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
        return (t56) super.submit(runnable);
    }

    public final String toString() {
        String obj = super.toString();
        String valueOf = String.valueOf(this.a);
        return obj + "[" + valueOf + "]";
    }

    @Override
    public final Future submit(Runnable runnable, Object obj) {
        return (t56) super.submit(runnable, obj);
    }

    @Override
    public final Future submit(Callable callable) {
        return (t56) super.submit(callable);
    }

    @Override
    public final RunnableFuture newTaskFor(Callable callable) {
        return new edf(callable);
    }
}
